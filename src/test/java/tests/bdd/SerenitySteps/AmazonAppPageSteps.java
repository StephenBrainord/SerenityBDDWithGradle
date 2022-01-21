package tests.bdd.SerenitySteps;

import base.BasePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import tests.bdd.pages.AmazonAppPage;

import java.io.IOException;

public class AmazonAppPageSteps extends BasePage {

    private AmazonAppPage amazonAppPage = new AmazonAppPage();

    @Step
    public void openAmazonHomePage() {
        getDriver().get("http://www.amazon.in");
    }

    @Step
    public void navigateToAmazonSignInPage() throws IOException {
        amazonAppPage.clickSignInButton();
    }

    @Step
    public void emailFieldIsDisplayed() {
        Assert.assertTrue(amazonAppPage.verifyEmailField());
    }

    @Step
    public void continueButtonIsDisplayed() {
        Assert.assertTrue(amazonAppPage.verifyContinueButton());
    }

    @Step
    public void homePageShouldDisplay() throws IOException {
        Assert.assertTrue(amazonAppPage.verifyPageTitle("Amazon"));
    }

    @Step
    public void signInPageShouldDisplay() throws IOException {
        Assert.assertTrue(amazonAppPage.verifyPageTitle("Sign In"));
    }
}
