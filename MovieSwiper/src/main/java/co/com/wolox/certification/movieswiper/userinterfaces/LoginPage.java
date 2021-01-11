package co.com.wolox.certification.movieswiper.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USERNAME = Target.the("Username field").located(
            By.id("com.azhavrid.movieswiperr:id/891e35c2-6603-4880-9c3e-76d8cc35f776"));

    public static final Target PASSWORD = Target.the("password field").located(
            By.id("com.azhavrid.movieswiperr:id/"));

    public static final Target LOGIN_BUTTON = Target.the("Login button").located(
            By.id("com.azhavrid.movieswiperr:id/"));
}
