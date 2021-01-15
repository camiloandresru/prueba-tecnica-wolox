package co.com.wolox.certification.movieswiper.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USERNAME = Target.the("Username field").locatedBy(
            "//android.widget.EditText[@content-desc=\"userInput\"]");

    public static final Target PASSWORD = Target.the("password field").locatedBy(
            "//android.widget.EditText[@content-desc=\"passwordInput\"]");

    public static final Target LOGIN_BUTTON = Target.the("Login button").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"logInButton\"]");
}
