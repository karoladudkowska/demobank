package page.object.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.object.BasePage;

public class Przelewy extends BasePage {
    public Przelewy(WebDriver driver){
        super(driver);
    }
    @FindBy(id = "recipientName")
    protected WebElement recipientNameInp;


    @FindBy(id = "beneficiaryNumberDashboard")
    protected WebElement accountNumberInp;

    @FindBy(css = "[data-test-id='transfer-form-continue']")
    protected WebElement continueBtn;

    @FindBy(id ="instructedAmount")
    protected WebElement amountInp;

    @FindBy(id = "paymentTitle")
    protected WebElement titleInp;

    @FindBy(xpath = "//div[contains(text(),'Nazwa odbiorcy')]//following-sibling::div//div")
    protected WebElement nazwaOdbiorcyPodsumowanie;

    @FindBy(xpath = "//div[contains(text(),'Tytuł przelewu')]//following-sibling::div//div")
    protected WebElement tytulPrzelewuPodsumowanie;

}
