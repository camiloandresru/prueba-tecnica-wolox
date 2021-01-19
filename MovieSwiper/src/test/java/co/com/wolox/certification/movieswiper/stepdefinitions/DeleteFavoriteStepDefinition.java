package co.com.wolox.certification.movieswiper.stepdefinitions;

import co.com.wolox.certification.movieswiper.tasks.AddAFavoriteMovie;
import co.com.wolox.certification.movieswiper.tasks.DeleteAFavoriteMovie;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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

    }

}
