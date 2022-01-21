package tests.bdd.CucumberSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import tests.bdd.SerenitySteps.AmazonAppPageSteps;

import java.io.IOException;

public class AmazonAppPageStepDef {

    @Steps
    AmazonAppPageSteps amazonAppPageSteps = new AmazonAppPageSteps();

    @Given("I navigate to Amazon application")
    public void i_navigate_to_amazon_application() {
        amazonAppPageSteps.openAmazonHomePage();
    }

    @Then("I verify Amazon home page is displayed")
    public void i_verify_amazon_home_page_is_displayed() throws IOException {
        amazonAppPageSteps.homePageShouldDisplay();
    }
}
