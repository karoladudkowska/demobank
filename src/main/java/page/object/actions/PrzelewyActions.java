package page.object.actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.object.pages.Przelewy;
import utils.Object;

public class PrzelewyActions extends Przelewy {
    public PrzelewyActions(WebDriver driver) {
        super(driver);
    }

    public PrzelewyActions fillRecipientNameInp(String text) {
        log("Wpisuje nazwę odbiorcy: " + text);
        waitAndWriteText(recipientNameInp, text);
        Object.setNazwaOdbiorcy(text);
        return this;
    }

    public PrzelewyActions fillAccountNumberInp(String accountNumber) {
        log("Wpisuje numer konta odbiorcy: " + accountNumber);
        waitAndWriteText(accountNumberInp, accountNumber);
        Object.setNumerRachunku(accountNumber);
        return this;
    }

    public PrzelewyActions clicOnContinue() {
        log("klikam w przycisk Kontynuuj");
        waitAndClick(continueBtn);

        return this;
    }

    public PrzelewyActions fillAmountInp(String amount) {
        log("Wpisuje kwotę " + amount);
        waitAndWriteText(amountInp, amount);
        Object.setKWOTA(amount);
        return this;


    }

    public PrzelewyActions fillTitle(String title) {
        log("Wpisuje tytuł " + title);
        waitAndWriteText(titleInp, title);
        Object.setTytułPrzelewu(title);
        return this;
    }

//    public PrzelewyActions assertSubmitTransfers() {
//        log("Sprawdzenie czy dane na Podsumowaniu zgadzają się z a danymi wprowadzonymi na formatce przelewu");
//        Assert.assertEquals(nazwaOdbiorcyPodsumowanie.getText(),Object.getNazwaOdbiorcy(), "Nazwa odbiorcy jest nie zgodna z tą wprowadzoną na formatce przelewu");
//        Assert.assertTrue(tytulPrzelewuPodsumowanie.getText().contains(Object.getTytułPrzelewu()), "Tytuł przelewu jest nie zgodny z tym wprowadzonym na formatce przelewu");
//
//        return this;
//    }
}


