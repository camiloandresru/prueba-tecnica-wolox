package co.com.wolox.certification.movieswiper.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomePage {

    public static final Target LOGIN_OPTION = Target.the("Log in option").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"logIn\"]");

    public static final Target CONTINUE_AS_GUEST = Target.the("Continue as guest").locatedBy(
            "\t\n" +
                    "//android.view.ViewGroup[@content-desc=\"continueAsGuest\"]/android.widget.TextView");
}
