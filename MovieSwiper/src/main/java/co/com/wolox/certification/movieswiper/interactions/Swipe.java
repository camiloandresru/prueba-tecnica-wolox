package co.com.wolox.certification.movieswiper.interactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;


public class Swipe implements Interaction {

    private static final String SCROLL_UP = "scrollUp";
    private static final String SWIPE_LEFT = "swipeLeft";
    private final String swipeType;
    private Target target = null;

    public Swipe(String swipeType) {
        this.swipeType = swipeType;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        int x0 = 0;
        int y0 = 0;
        int x1 = 0;
        int y1 = 0;

        WebDriver webDriver = getProxiedDriver();
        TouchAction<?> touchAction = new TouchAction<>((AppiumDriver<?>) webDriver);

        if (target == null) {

            Dimension size = webDriver.manage().window().getSize();
            x0 = (int) (size.getWidth() * 0.5);
            y0 = (int) (size.getHeight() * 0.5);
            x1 = x0;
            y1 = y0;

            switch (swipeType) {
                case SCROLL_UP:
                    y0 = (int) (y0 * 2 * 0.8);
                    y1 = (int) (y1 * 2 * 0.2);
                    break;
                case SWIPE_LEFT:
                    x0 = (int) (x0 * 2 * 0.8);
                    x1 = (int) (x1 * 2 * 0.2);
                    break;
            }
        } else {

            Point point = target.resolveFor(actor).getLocation();
            Dimension dimension = target.resolveFor(actor).getSize();

            switch (swipeType) {
                case SCROLL_UP:
                    x0 = point.x + dimension.width / 2;
                    x1 = x0;
                    y0 = point.y + (int) (0.9 * dimension.height);
                    y1 = point.y + (int) (0.1 * dimension.height);
                    break;
                case SWIPE_LEFT:
                    x0 = point.x + (int) (0.9 * dimension.width);
                    x1 = point.x + (int) (0.1 * dimension.width);
                    y0 = point.y + dimension.height / 2;
                    y1 = y0;
                    break;
            }
        }

        touchAction.longPress(PointOption.point(x0, y0))
                .moveTo(PointOption.point(x1, y1))
                .release()
                .perform();
    }

    public static Swipe scrollUp() {
        return new Swipe(SCROLL_UP);
    }

    public static Swipe left() {
        return new Swipe(SWIPE_LEFT);
    }

    public Swipe intoElement(Target target) {
        this.target = target;
        return this;
    }
}
