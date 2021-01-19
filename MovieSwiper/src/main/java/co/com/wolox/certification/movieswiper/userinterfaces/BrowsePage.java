package co.com.wolox.certification.movieswiper.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BrowsePage {

    public static final Target TRENDING_DAILY = Target.the("Trending Daily").located(
            By.xpath("\t\n" +
                    "//android.view.ViewGroup[@content-desc=\"Trending_Daily_section\"]/android.widget.HorizontalScrollView"));

    public static final Target CHOSE_MOVIE = Target.the("Chose movie in trending daily").located(
            By.xpath("//android.view.ViewGroup[@content-desc=\"Trending_Daily_section\"]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));

    public static final Target FAVORITE_BUTTON_UNSELECTED = Target.the("Favorite button unselected").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"favButtonUnselected\"]/android.widget.TextView[1]");

    public static final Target SEARCH_BAR = Target.the("Search bar").located(
            By.xpath("//android.widget.EditText[@content-desc=\"search\"]"));

    public static final Target NO_MOVIES_FOUND_MESSAGE = Target.the("No movies found message").located(
            By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView[2]"));

    public static final Target FAVORITE_BUTTON_SELECTED = Target.the("Favorite button selected").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"favButton\"]/android.widget.TextView[1]");
}
