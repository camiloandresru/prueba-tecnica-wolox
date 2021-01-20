package co.com.wolox.certification.movieswiper.questions;

import co.com.wolox.certification.movieswiper.userinterfaces.LibraryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class WasDeleted implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if(LibraryPage.NO_MOVIES_MESSAGE.resolveFor(actor).getText().equals("No Movies")){
            return true;
        }
        return false;
    }

    public static WasDeleted inHisLibrary(){
        return new WasDeleted();
    }
}
