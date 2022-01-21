package tests.bdd.pages;

import base.BasePage;

public class AmazonAppPage extends BasePage {

    public boolean verifyHomePage() {
        waitFor(10);
        return getDriver().getTitle().contains("Amazon");
    }
}
