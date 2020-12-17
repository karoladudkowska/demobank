package page.object.actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.object.pages.Stronastartowa;

public class StronaStartowaActions extends Stronastartowa {
    public StronaStartowaActions(WebDriver driver) {
        super(driver);
    }

    public StronaStartowaActions sprawdzenieCzyStronaGłównaSięWczytała()

    {
        log("sprawdzenie czy strona głowna wyświetliła sie po logowaniu");
        waitForElementVisible(startLink);
        Assert.assertTrue(startLink.isDisplayed(), "Strona główna nie poprawnie wyświetlona");
        return this;

    }
    public StronaStartowaActions clickOnTransfers() {
        waitAndClick(tranfers);
        return this;
    }
}