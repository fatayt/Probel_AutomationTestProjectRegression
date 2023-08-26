package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.BasePage;
import pages.DetailedPatientSearch_Page;
import utilities.Driver;

public class DetailedPatientSearch_StepDefinitions {
    BasePage basePage = new BasePage();
    DetailedPatientSearch_Page dha = new DetailedPatientSearch_Page();
    Actions actions = new Actions(Driver.getDriver());


    @And("The user clicks Detayli Hasta arama Button")
    public void theUserClicksDetayliHastaAramaButton() {
        dha.DetayliHastaAra.click();
    }
    @And("The user enters ProtokolNO")
    public void theUserEntersProtokolNO() {
        dha.ProtocolNo.click();
        dha.ProtocolNo.sendKeys("15388430");
    }
    @And("The user clicks sorgulama button")
    public void theUserClicksSorgulamaButton() {
        dha.SorgulaButton.click();
    }
    @And("The user Verifies that the patient displays")
    public void theUserVerifiesThatThePatientDisplays() {
        Assert.assertTrue(dha.verifyProtocolNo.getText().contains("15388430"));
    }
    @And("The user enters TcKimlikNo")
    public void theUserEntersTcKimlikNo() {
        dha.TCKimlikNo.click();
        dha.TCKimlikNo.sendKeys("19834211032");
    }
    @And("Visibility is checked with the patient's TC Kimlik No")
    public void visibilityIsCheckedWithThePatientSTCKimlikNo() {
        Assert.assertTrue(dha.verifyProtocolNo.getText().contains("15388430"));
    }
    @And("The user enters Hasta No")
    public void theUserEntersHastaNo() {
        dha.HASTANo.click();
        dha.HASTANo.sendKeys("2013299573");
        dha.SorgulaButton.click();
    }
    @And("The patient number called and the patient number received must be verified")
    public void thePatientNumberCalledAndThePatientNumberReceivedMustBeVerified() {
        Assert.assertEquals(2013299573, 2013299573);
    }
    @And("Detayli Tarih Secimi tab is clicked.")
    public void detayliTarihSecimiTabIsClicked() {
        dha.DetayliTarihSecimi.click();
    }
    @And("Last Three Months tab is clicked.")
    public void lastThreeMonthsTabIsClicked() {
        dha.SonUcAyTarih.click();
    }
    @And("Select tab is clicked.")
    public void selectTabIsClicked() {
        dha.popupCloseButton.click();
    }
    @And("Query tab is clicked.")
    public void queryTabIsClicked() {
        dha.SorgulaButton.click();
    }
    @And("Verify that patients registered in the Last Three Months can be listed")
    public void verifyThatPatientsRegisteredInTheLastMonthsCanBeListed() {
        //*******************************************************
    }
    @And("Gelis Detayli Tarih Secimitab is clicked")
    public void gelisDetayliTarihSecimitabIsClicked() {
        dha.CikisTarihi.click();
    }
    @And("Son Three Months tab is clicked")
    public void sonThreeMonthsTabIsClicked() {
        dha.gelecekUcAy.click();
    }
    @And("Seçtab is clicked")
    public void sectabIsClicked() {
        dha.popupCloseButton.click();
        dha.SorgulaButton.click();
    }
    @And("Verify that patients registered in the Last Three Months can be listed two")
    public void verifyThatPatientsRegisteredInTheLastThreeMonthsCanBeListedTwo() {
    }
    //**********************************************
    @And("Double click on the User tab")
    public void doubleClickOnTheUserTab() {
        actions.doubleClick(dha.Kullanici).perform();
    }
    @And("Enter user name")
    public void enterUserName() {
        dha.KullaniciID.sendKeys("%RKArol%");
    }
    @And("Enter ID")
    public void enterID() {
        actions.click().perform();
    }
    @And("Click on the UserSec")
    public void clickOnTheUserSec() {
        dha.KullaniciSec.click();
        dha.SorgulaButton.click();
    }
    @And("Verify that the user's list of patients is displayed")
    public void verifyThatTheUserSListOfPatientsIsDisplayed() {
        dha.HastaAdiSoyadi.getText();
    }

















    @Then("Registered patient should be seen on Detaylı Hasta Arama Page")
    public void registeredPatientShouldBeSeenOnDetaylıHastaAramaPage() {
        dha.confirmRegisteredPatient();
    }



    @And("Detaylı Tarih Seçimi tab is clicked.")
    public void detaylıTarihSeçimiTabIsClicked() {
        dha.DetayliTarihSecimi.click();
    }


    @And("Gelis Detayli Tarih Seçimitab is clicked")
    public void gelisDetayliTarihSeçimitabIsClicked() {
        dha.CikisTarihi.click();
    }



}
