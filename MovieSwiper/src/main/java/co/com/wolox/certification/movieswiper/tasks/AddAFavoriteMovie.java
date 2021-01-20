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

public class AddAFavoriteMovie implements Task {

    @Override
    @Step("{0} adds a favorite movie from the Trending Daily")
    public <T extends Actor> void performAs(T actor) {

        int flag = CommonFunctions.generateFlag(5);

        for (int i =1; i<= flag; i++){
            actor.attemptsTo(
                    Swipe.left().intoElement(BrowsePage.TRENDING_DAILY)
            );
        }
        actor.attemptsTo(
                Click.on(BrowsePage.CHOSE_MOVIE),
                Ensure.that(BrowsePage.FAVORITE_BUTTON_UNSELECTED).isDisplayed(),
                Click.on(BrowsePage.FAVORITE_BUTTON_UNSELECTED),
                Click.on(LibraryPage.LIBRARY_OPTION),
                Click.on(LibraryPage.MY_FAVORITE_BUTTON)
        );
    }

    public static AddAFavoriteMovie fromBrowsePage(){
        return instrumented(AddAFavoriteMovie.class);
    }
}
