package tests.bdd.pages;

import base.BasePage;

import java.io.IOException;

public class AmazonAppPage extends BasePage {

    public void clickSignInButton() throws IOException {
        waitAndClickOn("//span[@id='nav-link-accountList-nav-line-1']");
    }

    public boolean verifyEmailField() {
        return isElementDisplayed("//input[@type='email']");
    }

    public boolean verifyContinueButton() {
        return isElementDisplayed("//input[@id='continue']");
    }

    public boolean verifyPageTitle(String title) throws IOException {
        waitFor(10);
        return getPageTitle().contains(title);
    }
}
