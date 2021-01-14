package co.com.wolox.certification.movieswiper.stepdefinitions;

import co.com.wolox.certification.movieswiper.questions.NoMoviesMessage;
import co.com.wolox.certification.movieswiper.tasks.AddAFavoriteMovie;
import co.com.wolox.certification.movieswiper.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.isDriverInstantiated;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;

public class AddFavoriteStepDefinition {

    @Before
    public void start() {
        AppiumDriver<MobileElement> appiumDriver;
        if (isDriverInstantiated()) {
            appiumDriver = getProxiedDriver();
            appiumDriver.launchApp();
        }
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) is logged into the app$")
    public void thatUserIsLoggedIntoTheApp(String username) {
        theActorCalled(username).wasAbleTo(Login.withHis(username));
    }

    @When("^he adds a movie as favorite from browse page$")
    public void heAddsAMovieAsFavoriteFromBrowsePage() {
        theActorInTheSpotlight().attemptsTo(AddAFavoriteMovie.fromBrowsePage());
    }

    @Then("^he should see the movies in his library My Favorite$")
    public void heShouldSeeTheMoviesInHisLibraryMyFavorite() {
        theActorInTheSpotlight().should(seeThat(NoMoviesMessage.isNotVisible(),is(true)));
    }

}
