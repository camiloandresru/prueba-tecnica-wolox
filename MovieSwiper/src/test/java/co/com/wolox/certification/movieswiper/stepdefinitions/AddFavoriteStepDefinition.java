package co.com.wolox.certification.movieswiper.stepdefinitions;

import co.com.wolox.certification.movieswiper.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddFavoriteStepDefinition {

    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) is logged into the app$")
    public void thatCamiloandresruIsLoggedIntoTheApp(String username) {
        theActorCalled(username).can(BrowseTheWeb.with(hisMobileDevice));
        theActorInTheSpotlight().wasAbleTo(Login.withHis(username));
    }


    @When("^he adds to Mulan as favorite$")
    public void heAddsToMulanAsFavorite() {

    }

    @Then("^he should see the movies in his library My Favorite$")
    public void heShouldSeeTheMoviesInHisLibraryMyFavorite() {

    }

}
