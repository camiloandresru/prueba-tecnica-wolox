package co.com.wolox.certification.movieswiper.tasks;

import co.com.wolox.certification.movieswiper.interactions.AddRemastered;
import co.com.wolox.certification.movieswiper.userinterfaces.BrowsePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddRemastering implements Task {

    private final String movie;

    public AddRemastering(String movie) {
        this.movie = movie;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(movie).into(BrowsePage.SEARCH_BAR),
                AddRemastered.movieOf(movie)
        );
    }

    public static AddRemastering of(String movie){
        return instrumented(AddRemastering.class, movie);
    }

}
