package page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import utils.GlobalDefinitions;

import java.util.Random;

public class BasePage {
    protected WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, GlobalDefinitions.EXPLICTY_WAIT);
        PageFactory.initElements(driver,this);
    }

    protected void goTOURL(String url) {
        log("idź do strony:" + url);
        driver.get(url);

    }
    public static void log (String textToLog) {
        Reporter.log(textToLog, true);
    }


    protected void waitForElementVisible(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));

    }


    protected void waitAndClick(WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
                webElement.click();
    }


    protected void waitAndWriteText(WebElement webElement, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.clear();
        webElement.sendKeys(text);
    }



    protected void assertObjectsExists(WebElement webElement) {
        log("sprawdzenie czy strona głowna wyświetliła sie po logowaniu");

        Assert.assertTrue(webElement.isDisplayed(), "Strona główna nie poprawnie wyświetlona");

    }
}
