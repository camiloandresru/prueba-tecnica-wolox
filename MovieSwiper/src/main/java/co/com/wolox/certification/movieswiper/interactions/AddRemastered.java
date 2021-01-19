package co.com.wolox.certification.movieswiper.interactions;

import co.com.wolox.certification.movieswiper.userinterfaces.BrowsePage;
import co.com.wolox.certification.movieswiper.userinterfaces.LibraryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddRemastered implements Interaction {

    private String movie;

    public AddRemastered(String movie) {
        this.movie = movie;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Ensure.that(BrowsePage.NO_MOVIES_FOUND_MESSAGE).isNotDisplayed()
        );

        int moreRecent = 0;
        int iMoreRecent = 1;
        for (int i =1; i <= 7; i++){
            Target YEARS = Target.the("Movies found").located(By.xpath("(//android.view.ViewGroup[@content-desc=\""+movie+"\"])["+i+"]/android.widget.TextView[3]"));
            if (YEARS.resolveFor(actor).isPresent()){
                int year = Integer.parseInt(YEARS.resolveFor(actor).getText());
                if ( year > moreRecent) {
                    moreRecent = year;
                    iMoreRecent = i;
                }
            }
            continue;
        }
        Target REMASTERING_MORE_RECENT = Target.the("Remastering more recent").located(By.xpath("(//android.view.ViewGroup[@content-desc=\""+movie+"\"])["+iMoreRecent+"]/android.widget.TextView[3]"));
        actor.attemptsTo(
                Click.on(REMASTERING_MORE_RECENT),
                Ensure.that(BrowsePage.FAVORITE_BUTTON_UNSELECTED).isDisplayed(),
                Click.on(BrowsePage.FAVORITE_BUTTON_UNSELECTED),
                Click.on(LibraryPage.LIBRARY_OPTION),
                Click.on(LibraryPage.MY_FAVORITE_BUTTON)
        );

        Target REMASTERING_FAVORITE = Target.the("Remastered movie in library").located(By.xpath("//android.view.ViewGroup[@content-desc=\""+movie+"\"]"));
        actor.attemptsTo(
                Ensure.that(REMASTERING_FAVORITE).isDisplayed()
        );
    }

    public static AddRemastered movieOf(String movie){
        return Tasks.instrumented(AddRemastered.class, movie);
    }
}
