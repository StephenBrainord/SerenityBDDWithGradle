package tests.bdd.SerenitySteps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import tests.bdd.pages.GoogleSearchResultsPage;

import java.io.IOException;

public class GoogleSearchResultsPageSteps {

    private GoogleSearchResultsPage googleSearchResultsPage = new GoogleSearchResultsPage();

    @Step
    public void googleSearchResultsShouldMatch(String keyword) throws IOException {
        Assert.assertTrue(googleSearchResultsPage.verifySearchTitle(keyword));
    }
}
