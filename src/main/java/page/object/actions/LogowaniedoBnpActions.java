package page.object.actions;


import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import page.object.pages.LogowaniedoBNP;
import utils.GlobalDefinitions;

public class LogowaniedoBnpActions extends LogowaniedoBNP {

    public LogowaniedoBnpActions(WebDriver driver) {
        super(driver);
    }

    public void logowanieDoBNP(String login) {
        goTOurl(GlobalDefinitions.URL_DO_APLIKACJI_BNP);
        uzupełnijPoleLogin(login);
        kliknijDalej();
    }

    private void goTOurl(String adressStrony){
        goTOURL(adressStrony);
    }

    private void uzupełnijPoleLogin(String login) {
        loginInput().sendKeys(login);
        log("Wpisuje w pole login " + login);
    }

    private void kliknijDalej() {
        waitAndClick(dalejButton());
//        log("Kliknięcie w przycisk Dalej");
    }
}
