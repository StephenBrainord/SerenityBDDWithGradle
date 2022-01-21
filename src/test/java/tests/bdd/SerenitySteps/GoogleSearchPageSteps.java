package tests.bdd.SerenitySteps;

import net.thucydides.core.annotations.Step;
import tests.bdd.pages.GoogleSearchPage;

import java.io.IOException;

public class GoogleSearchPageSteps {

    private GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Step
    public void openGoogleSearch() {
        googleSearchPage.open();
    }

    @Step
    public void performGoogleSearchForKeyword(String keyword) throws IOException {
        googleSearchPage.enterKeywordInGoogleSearchBox(keyword);
        googleSearchPage.clickGoogleSearchButton();
    }
}
