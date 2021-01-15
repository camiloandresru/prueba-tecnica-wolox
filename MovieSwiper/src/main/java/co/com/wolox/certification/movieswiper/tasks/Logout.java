package co.com.wolox.certification.movieswiper.tasks;

import co.com.wolox.certification.movieswiper.userinterfaces.LibraryPage;
import co.com.wolox.certification.movieswiper.userinterfaces.SettingsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Logout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LibraryPage.LIBRARY_OPTION),
                Click.on(LibraryPage.SETTINGS_BUTTON),
                Click.on(SettingsPage.SIGN_OUT_BUTTON)
        );
    }

    public static Logout session(){
        return instrumented(Logout.class);
    }
}
