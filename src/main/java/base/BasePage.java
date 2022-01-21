package base;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class BasePage extends PageObject {

    Log log = new Log();

    public void waitAndClickOn(String locator) throws IOException {
        waitFor(getElement(locator)).click();
        log.info("The Element of locator '" + locator + "' has been clicked.");
    }

    public void waitAndTypeInto(String locator, String value) throws IOException {
        waitFor(getElement(locator)).sendKeys(value);
        log.info("The text '" + value + "' has been emtered into the Element of locator '" + locator + "'.");
    }

    public String getPageTitle() throws IOException {
        log.info("The page title is - '" + getDriver().getTitle() + "'");
        return getDriver().getTitle();
    }

    public String getAttribute(String locator, String attribute) {
        return waitFor(getElement(locator)).getAttribute(attribute);
    }

    public void moveMouseTo(String locator) {
        WebElement moveTo = waitFor(getElement(locator));
        withAction().moveToElement(moveTo).perform();
    }

    public boolean isElementDisplayed(String locator) {
        return waitFor(getElement(locator)).isDisplayed();
    }

    public void waitForElement(String locator) {
        waitFor(locator);
    }

    // Finding Element
    public WebElementFacade getElement(String xpathOrCss) {
        return $(xpathOrCss);
    }

}
