package page.object.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.object.BasePage;

public class LogowaniedoBNP extends BasePage {


    public LogowaniedoBNP(WebDriver driver) {
        super(driver);
    }

    protected WebElement loginInput() {
        return driver.findElement(By.cssSelector("[data-test-id='username-input']"));

    }
    protected WebElement dalejButton() {
        return driver.findElement(By.cssSelector("[data-test-id='submit-button']"));

    }
}

