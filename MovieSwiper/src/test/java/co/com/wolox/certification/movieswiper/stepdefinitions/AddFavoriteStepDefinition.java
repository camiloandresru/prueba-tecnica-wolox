package co.com.wolox.certification.movieswiper.stepdefinitions;

import co.com.wolox.certification.movieswiper.exceptions.AddFavoriteException;
import co.com.wolox.certification.movieswiper.questions.CanNotAddMovies;
import co.com.wolox.certification.movieswiper.questions.WasAdded;
import co.com.wolox.certification.movieswiper.tasks.*;
import co.com.wolox.certification.movieswiper.userinterfaces.WelcomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.wolox.certification.movieswiper.exceptions.AddFavoriteException.VERIFY_ADD_MOVIE_EXCEPTION;
import static co.com.wolox.certification.movieswiper.exceptions.AddFavoriteException.VERIFY_GUEST_EXCEPTION;
import static org.hamcrest.Matchers.is;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.isDriverInstantiated;

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
        theActorInTheSpotlight().should(seeThat(WasAdded.inTheLibrary(), is(true)).orComplainWith(AddFavoriteException.class, VERIFY_ADD_MOVIE_EXCEPTION));
    }

    @When("^he adds a movie as favorite from explore page$")
    public void heAddsAMovieAsFavoriteFromExplorePage() {
        theActorInTheSpotlight().attemptsTo(SwipeUpAMovie.fromExplorePage());
    }

    @When("^he adds a remastered (.*) as favorite$")
    public void heAddsARemasteredMovieAsFavorite(String movie) {
        theActorInTheSpotlight().attemptsTo(AddRemastering.of(movie));
    }

    @When("^the guest try to adds a movie as favorite$")
    public void theGuestTryToAddsAMovieAsFavorite() {
        theActorCalled("guest").attemptsTo(
                Click.on(WelcomePage.CONTINUE_AS_GUEST),
                TryToAddFavoriteMovie.fromBrowsePage());
    }

    @Then("^he should see the warning message in the Library$")
    public void heShouldSeeTheWarningMessageInTheLibrary() {
        theActorInTheSpotlight().should(seeThat(CanNotAddMovies.inTheLibrary(), is(true)).orComplainWith(AddFavoriteException.class, VERIFY_GUEST_EXCEPTION));
    }

    @After
    public void terminate(){
        theActorInTheSpotlight().attemptsTo(Logout.session());
    }
}
