package co.com.wolox.certification.movieswiper.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BrowsePage {

    public static final Target TRENDING_DAILY = Target.the("Trending Daily").located(
            By.xpath("\t\n" +
                    "//android.view.ViewGroup[@content-desc=\"Trending_Daily_section\"]/android.widget.HorizontalScrollView"));

    public static final Target CHOSE_MOVIE = Target.the("Chose movie in trending daily").located(
            By.xpath("//android.view.ViewGroup[@content-desc=\"Trending_Daily_section\"]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));

    public static final Target FAVORITE_BUTTON_UNSELECTED = Target.the("Favorite button unselected").located(
            By.id("com.azhavrid.movieswiperr:id/favButtonUnselected"));
}
