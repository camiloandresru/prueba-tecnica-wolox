package co.com.wolox.certification.movieswiper.stepdefinitions;

import co.com.wolox.certification.movieswiper.exceptions.DeleteFavoriteException;
import co.com.wolox.certification.movieswiper.questions.WasDeleted;
import co.com.wolox.certification.movieswiper.tasks.AddAFavoriteMovie;
import co.com.wolox.certification.movieswiper.tasks.DeleteAFavoriteMovie;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.wolox.certification.movieswiper.exceptions.DeleteFavoriteException.VERIFY_DELETE_MOVIE_EXCEPTION;
import static org.hamcrest.Matchers.is;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DeleteFavoriteStepDefinition {

    @When("^he deletes a favorite movie in his library$")
    public void heDeletesAFavoriteMovieInHisLibrary() {
        theActorInTheSpotlight().attemptsTo(
                AddAFavoriteMovie.fromBrowsePage(),
                DeleteAFavoriteMovie.inHisLibrary()
        );
    }

    @Then("^he should not see the movie in his library My Favorite$")
    public void heShouldNotSeeTheMovieInHisLibraryMyFavorite() {
        theActorInTheSpotlight().should(seeThat(WasDeleted.inHisLibrary(), is(true)).orComplainWith(DeleteFavoriteException.class, VERIFY_DELETE_MOVIE_EXCEPTION));
    }

}
