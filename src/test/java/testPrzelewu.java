import org.testng.annotations.Test;
import page.object.actions.LogowaniedoBnpActions;
import page.object.actions.PrzelewyActions;
import page.object.actions.StronaStartowaActions;
import utils.Generatory;
import utils.GlobalDefinitions;

public class testPrzelewu extends BaseTest{
    @Test
    public void testPrzelewu() {
        new LogowaniedoBnpActions(driver)
        .logowanieDoBNP("123456");

//        LogowaniedoBnpActions logowaniedoBnpActions = new LogowaniedoBnpActions(driver);
//        logowaniedoBnpActions.goTOurl(GlobalDefinitions.URL_DO_APLIKACJI_BNP);
//        logowaniedoBnpActions.uzupełnijPoleLogin("12345678");
//        logowaniedoBnpActions.kliknijDalej();

//        StronaStartowaActions stronaStartowaActions = new StronaStartowaActions(driver);
//        stronaStartowaActions.sprawdzenieCzyStronaGłównaSięWczytała();


        new StronaStartowaActions(driver)
                .sprawdzenieCzyStronaGłównaSięWczytała()
                .clickOnTransfers();
        PrzelewyActions przelewyActions;
        przelewyActions = new PrzelewyActions(driver)
                .fillRecipientNameInp(Generatory.generateRandomString(5))
                .fillAccountNumberInp("88109015513476190892095652")
                .clicOnContinue()
                .fillAmountInp(String.valueOf(Generatory.generateRandomInt(1, 10)))
                .fillTitle(Generatory.generateRandomString(4))
                .clicOnContinue();
//               .assertSubmitTransfers();
    }

}
