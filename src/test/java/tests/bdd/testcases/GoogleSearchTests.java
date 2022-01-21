package tests.bdd.testcases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import tests.bdd.SerenitySteps.GoogleSearchPageSteps;
import tests.bdd.SerenitySteps.GoogleSearchResultsPageSteps;

import java.io.IOException;

@RunWith(SerenityRunner.class)
public class GoogleSearchTests {

    @Steps
    GoogleSearchPageSteps googleSearchPageSteps = new GoogleSearchPageSteps();
    @Steps
    GoogleSearchResultsPageSteps googleSearchResultsPageSteps = new GoogleSearchResultsPageSteps();

    @Managed
    WebDriver driver;

    @Title("Performing Google Search!!!")
    @Test
    public void basicGoogleSearch() throws IOException {
        String keyword = "SerenityBDD";
        googleSearchPageSteps.openGoogleSearch();
        googleSearchPageSteps.performGoogleSearchForKeyword(keyword);
        googleSearchResultsPageSteps.googleSearchResultsShouldMatch(keyword);
    }

}
