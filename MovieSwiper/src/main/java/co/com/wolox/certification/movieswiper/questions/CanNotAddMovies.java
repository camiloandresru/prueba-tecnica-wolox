package co.com.wolox.certification.movieswiper.questions;

import co.com.wolox.certification.movieswiper.userinterfaces.LibraryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CanNotAddMovies implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if(LibraryPage.AUTHENTICATED_MESSAGE.resolveFor(actor).getText().equals("Only for authenticated users")){
            return true;
        }
        return false;
    }

    public static CanNotAddMovies inTheLibrary(){
        return new CanNotAddMovies();
    }
}
