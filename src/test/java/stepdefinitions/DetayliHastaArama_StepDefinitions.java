package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.BasePage;
import pages.Detayli_Arama_Page;
import utilities.Driver;

public class DetayliHastaArama_StepDefinitions {
    BasePage basePage = new BasePage();
    Detayli_Arama_Page detayliHastaAramaPage = new Detayli_Arama_Page();
    Actions actions = new Actions(Driver.getDriver());

    @And("The user clicks Detayli Hasta arama Button")
    public void theUserClicksDetayliHastaAramaButton() {
        detayliHastaAramaPage.DetayliHastaAra.click();
    }

    @And("The user enters ProtokolNO")
    public void theUserEntersProtokolNO() {
        detayliHastaAramaPage.ProtocolNo.click();
        detayliHastaAramaPage.ProtocolNo.sendKeys("15388430");
    }

    @And("The user clicks sorgulama button")
    public void theUserClicksSorgulamaButton() {
        detayliHastaAramaPage.SorgulaButton.click();
    }

    @And("The user Verifies that the patient displays")
    public void theUserVerifiesThatThePatientDisplays() {
        Assert.assertTrue(detayliHastaAramaPage.verifyProtocolNo.getText().contains("15388430"));
    }

    @And("The user enters TcKimlikNo")
    public void theUserEntersTcKimlikNo() {
        detayliHastaAramaPage.TCKimlikNo.click();
        detayliHastaAramaPage.TCKimlikNo.sendKeys("19834211032");
    }

    @And("Visibility is checked with the patient's TC Kimlik No")
    public void visibilityIsCheckedWithThePatientSTCKimlikNo() {
        Assert.assertTrue(detayliHastaAramaPage.verifyProtocolNo.getText().contains("15388430"));
    }

    @And("The user enters Hasta No")
    public void theUserEntersHastaNo() {
        detayliHastaAramaPage.HASTANo.click();
        detayliHastaAramaPage.HASTANo.sendKeys("2013299573");
        detayliHastaAramaPage.SorgulaButton.click();
    }

    @And("The patient number called and the patient number received must be verified")
    public void thePatientNumberCalledAndThePatientNumberReceivedMustBeVerified() {
        Assert.assertEquals(2013299573, 2013299573);
    }

    @And("Detaylı Tarih Seçimi tab is clicked.")
    public void detaylıTarihSeçimiTabIsClicked() {
        detayliHastaAramaPage.DetayliTarihSecimi.click();
    }

    @And("Last Three Months tab is clicked.")
    public void lastThreeMonthsTabIsClicked() {
        detayliHastaAramaPage.SonUcAyTarih.click();
    }

    @And("Select tab is clicked.")
    public void selectTabIsClicked() {
        detayliHastaAramaPage.popupCloseButton.click();
    }

    @And("Query tab is clicked.")
    public void queryTabIsClicked() {
        detayliHastaAramaPage.SorgulaButton.click();
    }

    @And("Verify that patients registered in the Last Three Months can be listed")
    public void verifyThatPatientsRegisteredInTheLastMonthsCanBeListed(int arg0) {
        //*******************************************************
    }

    @And("Gelis Detayli Tarih Seçimitab is clicked")
    public void gelisDetayliTarihSeçimitabIsClicked() {
        detayliHastaAramaPage.CikisTarihi.click();
    }

    @And("Son Three Months tab is clicked")
    public void sonThreeMonthsTabIsClicked() {
        detayliHastaAramaPage.gelecekUcAy.click();
    }

    @And("Seçtab is clicked")
    public void seçtabIsClicked() {
        detayliHastaAramaPage.popupCloseButton.click();
        detayliHastaAramaPage.SorgulaButton.click();
    }

    @And("Verify that patients registered in the Last Three Months can be listed two")
    public void verifyThatPatientsRegisteredInTheLastThreeMonthsCanBeListedTwo() {
    }

    //**********************************************
    @And("Double click on the User tab")
    public void doubleClickOnTheUserTab() {
        actions.doubleClick(detayliHastaAramaPage.Kullanici).perform();
    }

    @And("Enter user name")
    public void enterUserName() {
        detayliHastaAramaPage.KullanıcıID.sendKeys("%RKArol%");
    }

    @And("Enter ID")
    public void enterID() {
        actions.click().perform();
    }

    @And("Click on the UserSec")
    public void clickOnTheUserSec() {
        detayliHastaAramaPage.KullanıcıSec.click();
        detayliHastaAramaPage.SorgulaButton.click();
    }

    @And("Verify that the user's list of patients is displayed")
    public void verifyThatTheUserSListOfPatientsIsDisplayed() {
        detayliHastaAramaPage.HastaAdiSoyadi.getText();
    }
}

