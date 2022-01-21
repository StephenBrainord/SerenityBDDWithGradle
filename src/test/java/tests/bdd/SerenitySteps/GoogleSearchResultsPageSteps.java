package tests.bdd.SerenitySteps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import tests.bdd.pages.GoogleSearchResultsPage;

public class GoogleSearchResultsPageSteps {

    private GoogleSearchResultsPage googleSearchResultsPage = new GoogleSearchResultsPage();

    @Step
    public void googleSearchResultsShouldMatch(String keyword) {
//        Assert.assertTrue("The Google Search Results do not match the keyword '" + "Cucumber" + "'.", googleSearchResultsPage.verifyFirstSearchResult("Cucumber"));
        Assert.assertTrue(googleSearchResultsPage.verifyFirstSearchResult(keyword));
    }
}