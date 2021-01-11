package co.com.wolox.certification.movieswiper.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomePage {

    public static final Target LOGIN_OPTION = Target.the("Log in option").located(
            By.id("com.azhavrid.movieswiperr:id/8a0ac398-2065-43de-aa63-988fb6464d6f"));

    public static final Target CONTINUE_AS_GUEST = Target.the("Continue as guest").located(
            By.id("com.azhavrid.movieswiperr:id/965b8f04-d542-4bda-9019-0ac0541d4697"));
}
