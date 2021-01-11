package co.com.wolox.certification.movieswiper.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/add_favorite.feature",
        glue = "package co.com.wolox.certification.movieswiper.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@RegisteredUser"
)

public class AddFavorite {
}
