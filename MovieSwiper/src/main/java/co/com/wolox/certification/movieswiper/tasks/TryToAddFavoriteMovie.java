package co.com.wolox.certification.movieswiper.tasks;

import co.com.wolox.certification.movieswiper.interactions.Swipe;
import co.com.wolox.certification.movieswiper.userinterfaces.BrowsePage;
import co.com.wolox.certification.movieswiper.userinterfaces.LibraryPage;
import co.com.wolox.certification.movieswiper.utils.CommonFunctions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TryToAddFavoriteMovie implements Task {

    @Override
    @Step("{0} tries to add a favorite movie")
    public <T extends Actor> void performAs(T actor) {

        int flag = CommonFunctions.generateFlag(4);

        for (int i =1; i<= flag; i++){
            actor.attemptsTo(
                    Swipe.left().intoElement(BrowsePage.TRENDING_DAILY)
            );
        }
        actor.attemptsTo(
                Click.on(BrowsePage.CHOSE_MOVIE),
                Ensure.that(BrowsePage.FAVORITE_BUTTON_UNSELECTED).isNotDisplayed(),
                Click.on(LibraryPage.LIBRARY_OPTION)
        );

    }

    public static TryToAddFavoriteMovie fromBrowsePage(){
        return instrumented(TryToAddFavoriteMovie.class);
    }
}
