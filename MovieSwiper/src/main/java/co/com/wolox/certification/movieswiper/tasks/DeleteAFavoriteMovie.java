package co.com.wolox.certification.movieswiper.tasks;

import co.com.wolox.certification.movieswiper.interactions.Swipe;
import co.com.wolox.certification.movieswiper.userinterfaces.BrowsePage;
import co.com.wolox.certification.movieswiper.userinterfaces.LibraryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteAFavoriteMovie implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Swipe.fromPoint(0.010,0.015).toPoint(0.030, 0.015),
                Click.on(BrowsePage.FAVORITE_BUTTON_SELECTED),
                Click.on(LibraryPage.LIBRARY_OPTION),
                Ensure.that(LibraryPage.NO_MOVIES_MESSAGE).isDisplayed()
        );
    }

    public static DeleteAFavoriteMovie inHisLibrary(){
        return instrumented(DeleteAFavoriteMovie.class);
    }
}
