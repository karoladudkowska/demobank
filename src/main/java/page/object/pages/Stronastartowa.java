package page.object.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.object.BasePage;

public class Stronastartowa extends BasePage {
    public Stronastartowa(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "(//a[@data-test-id='main-nav-start'])[1]")
    protected WebElement startLink;

    @FindBy(xpath = "(//a[@data-test-id='main-nav-transfers'])[1]")
    protected WebElement tranfers;
}
