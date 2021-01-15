package co.com.wolox.certification.movieswiper.tasks;

import co.com.wolox.certification.movieswiper.interactions.Swipe;
import co.com.wolox.certification.movieswiper.interactions.WaitTime;
import co.com.wolox.certification.movieswiper.userinterfaces.ExplorePage;
import co.com.wolox.certification.movieswiper.userinterfaces.LibraryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SwipeUpAMovie implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ExplorePage.EXPLORE_OPTION)
        );
        for (int i =1; i<=generateFlag(10); i++){
            actor.attemptsTo(
                    Swipe.left(),
                    WaitTime.inSeconds(1)
            );
        }
        actor.attemptsTo(
                Swipe.scrollUp(),
                Click.on(LibraryPage.LIBRARY_OPTION),
                Click.on(LibraryPage.MY_FAVORITE_BUTTON)
        );
    }

    public static int generateFlag(int limit){
        return (int) (Math.random()*limit+1);
    }

    public static SwipeUpAMovie fromExplorePage(){
        return instrumented(SwipeUpAMovie.class);
    }
}
