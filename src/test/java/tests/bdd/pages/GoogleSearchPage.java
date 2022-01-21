package tests.bdd.pages;


import base.BasePage;

import java.io.IOException;
import java.time.temporal.ChronoUnit;

//@DefaultUrl("http://www.google.com")
public class GoogleSearchPage extends BasePage {

    public void enterKeywordInGoogleSearchBox(String keyword) throws IOException {
        waitAndTypeInto("//input[@name='q']", keyword);
    }

    public void clickGoogleSearchButton() throws IOException {
        setImplicitTimeout(10, ChronoUnit.SECONDS);
        waitAndClickOn("//input[@value='Google Search']");
    }
}
