package tests.bdd.testcases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import tests.bdd.SerenitySteps.AmazonAppPageSteps;

import java.io.IOException;

@RunWith(SerenityRunner.class)
public class AmazonAppTests {

    @Steps
    AmazonAppPageSteps amazonAppPageSteps = new AmazonAppPageSteps();

    @Managed
    WebDriver driver;

    @Title("Opening Amazon Application")
    @Test
    public void amazonHomePage() throws IOException {
        amazonAppPageSteps.openAmazonHomePage();
        amazonAppPageSteps.homePageShouldDisplay();
    }

    @Title("Opening Amazon Application")
    @Test
    public void amazonLoginPage() throws IOException {
        amazonAppPageSteps.openAmazonHomePage();
        amazonAppPageSteps.navigateToAmazonSignInPage();
        amazonAppPageSteps.signInPageShouldDisplay();
        amazonAppPageSteps.emailFieldIsDisplayed();
        amazonAppPageSteps.continueButtonIsDisplayed();
    }

}
