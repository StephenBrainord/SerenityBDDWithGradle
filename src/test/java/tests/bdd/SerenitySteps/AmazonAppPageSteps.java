package tests.bdd.SerenitySteps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import tests.bdd.pages.AmazonAppPage;

public class AmazonAppPageSteps {

    private AmazonAppPage amazonAppPage = new AmazonAppPage();

    @Step
    public void homePageShouldDisplay() {
        Assert.assertTrue(amazonAppPage.verifyHomePage());
    }
}
