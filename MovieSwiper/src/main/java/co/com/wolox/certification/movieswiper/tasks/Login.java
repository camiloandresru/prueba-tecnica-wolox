package co.com.wolox.certification.movieswiper.tasks;

import co.com.wolox.certification.movieswiper.userinterfaces.LoginPage;
import co.com.wolox.certification.movieswiper.userinterfaces.WelcomePage;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Login implements Task {

    private final String username;
    private final String password = "1234";

    protected Login(String username) {
        this.username = username;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WelcomePage.LOGIN_OPTION),
                Enter.theValue(username).into(LoginPage.USERNAME),
                Enter.theValue(password).into(LoginPage.PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    public static Login withHis(String username){
        return instrumented(Login.class, username);
    }
}
