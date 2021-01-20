package co.com.wolox.certification.movieswiper.tasks;

import co.com.wolox.certification.movieswiper.interactions.Swipe;
import co.com.wolox.certification.movieswiper.userinterfaces.BrowsePage;
import co.com.wolox.certification.movieswiper.userinterfaces.LibraryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteAFavoriteMovie implements Task {

    @Override
    @Step("{0} deletes a favorite movie from his library")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Swipe.left().intoElement(LibraryPage.FAVORITE_DELETE),
                Click.on(BrowsePage.FAVORITE_BUTTON_SELECTED),
                Click.on(LibraryPage.LIBRARY_OPTION),
                Click.on(LibraryPage.MY_FAVORITE_BUTTON),
                Ensure.that(LibraryPage.NO_MOVIES_MESSAGE).isDisplayed()
        );
    }

    public static DeleteAFavoriteMovie inHisLibrary(){
        return instrumented(DeleteAFavoriteMovie.class);
    }
}
