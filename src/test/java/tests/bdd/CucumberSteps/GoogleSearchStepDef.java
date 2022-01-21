package tests.bdd.CucumberSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import tests.bdd.SerenitySteps.GoogleSearchPageSteps;
import tests.bdd.SerenitySteps.GoogleSearchResultsPageSteps;

import java.io.IOException;

public class GoogleSearchStepDef {

    @Steps
    GoogleSearchPageSteps googleSearchPageSteps = new GoogleSearchPageSteps();
    GoogleSearchResultsPageSteps googleSearchResultsPageSteps = new GoogleSearchResultsPageSteps();

    @Given("I navigate to Google Search Page")
    public void i_navigate_to_google_search_page() {
        googleSearchPageSteps.openGoogleSearch();
    }

    @When("I enter search text {string} on search field and click on google search button")
    public void i_enter_search_text_on_search_field(String keyword) throws IOException {
        googleSearchPageSteps.performGoogleSearchForKeyword(keyword);
    }

    @Then("I verify google search results are related to {string} keyword")
    public void i_verify_google_search_results_are_related_to_keyword(String keyword) throws IOException {
        googleSearchResultsPageSteps.googleSearchResultsShouldMatch(keyword);
    }

}
