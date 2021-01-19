package co.com.wolox.certification.movieswiper.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/delete_favorite.feature",
        glue = "co.com.wolox.certification.movieswiper.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class DeleteFavorite {
}
