package co.com.wolox.certification.movieswiper.questions;

import co.com.wolox.certification.movieswiper.userinterfaces.LibraryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NoMoviesMessage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LibraryPage.NO_MOVIES_MESSAGE.resolveFor(actor).isDisabled();
    }

    public static NoMoviesMessage isNotVisible(){
        return new NoMoviesMessage();
    }
}
