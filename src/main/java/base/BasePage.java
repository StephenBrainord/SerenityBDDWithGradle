package base;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.PropertyConfigurator;

public class BasePage extends PageObject {

    public Logger getLogger() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("log4j.properties"));
        PropertyConfigurator.configure(properties);
        return Logger.getLogger(BasePage.class);
    }

    public void waitAndClickOn(String locator) throws IOException {
        waitFor(getElement(locator)).click();
        getLogger().info("The Element of locator '" + locator + "' has been clicked.");
    }

    public void waitAndTypeInto(String locator, String value) throws IOException {
        waitFor(getElement(locator)).sendKeys(value);
        getLogger().info("The text '" + value + "' has been emtered into the Element of locator '" + locator + "'.");
    }

    public String getPageTitle(String locator) {
        return getDriver().getTitle();
    }

    public String getAttribute(String locator, String attribute) {
        return waitFor(getElement(locator)).getAttribute(attribute);
    }

    public void moveMouseTo(String locator) {
        WebElement moveTo = waitFor(getElement(locator));
        withAction().moveToElement(moveTo).perform();
    }

    public void isElementVisible(String locator) {
        waitFor(getElement(locator)).shouldBeVisible();
    }

    public void waitForElement(String locator) {
        waitFor(locator);
    }

    // Finding Element
    public WebElementFacade getElement(String xpathOrCss) {
        return $(xpathOrCss);
    }

}
