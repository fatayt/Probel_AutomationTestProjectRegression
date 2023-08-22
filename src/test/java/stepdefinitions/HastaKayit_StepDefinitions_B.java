package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import pages.Hasta_Kayit_Page_B;
import pages.Muayene_Kayit_Page_B;
import utilities.Driver;
import utilities.ReusableMethods;
import io.cucumber.datatable.DataTable;

import java.text.ParseException;
import java.time.LocalDate;


public class HastaKayit_StepDefinitions_B {


    BasePage basePage = new BasePage();

    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    //  Select select=new Select();
    Hasta_Kayit_Page_B hasta_Kayit_Page_B = new Hasta_Kayit_Page_B();
    Muayene_Kayit_Page_B muayene_Kayit_Page_B = new Muayene_Kayit_Page_B();
static LocalDate birthDateMother;

    @When("Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page")
    public void selectKimliksizHastaFromHastaTuruDropDownMenuOnHastaKayıtPage() {
        hasta_Kayit_Page_B.selectWithoutId();
    }

    @And("Write a valid Cep Telefonu on Hasta Kayıt Page")
    public void writeAValidCepTelefonuOnHastaKayıtPage() {
        hasta_Kayit_Page_B.writeValidMobilePhone();
    }

    @And("Select a valid Doğum Tarihi on Hasta Kayıt Page")
    public void selectAValidDogumTarihiOnHastaKayıtPage() {
        hasta_Kayit_Page_B.selectValidBirthday();
    }

    @And("Select Cinsiyeti on Hasta Kayıt Page")
    public void selectCinsiyetiOnHastaKayıtPage() {
        hasta_Kayit_Page_B.selectGender();
    }


    @And("Write a valid Soyadı on Hasta Kayıt Page")
    public void writeAValidSoyadıOnHastaKayıtPage() {
        hasta_Kayit_Page_B.writeValidLastName();
    }

    @And("Write a valid Adı on Hasta Kayıt Page")
    public void writeAValidAdıOnHastaKayıtPage() {
        hasta_Kayit_Page_B.writeValidName();
    }

    @And("Select a valid Yakınlığı on Hasta Kayıt Page")
    public void selectAValidYakınlıgıOnHastaKayıtPage() {
        hasta_Kayit_Page_B.selectValidRelation();
    }

    @And("Click Kaydet button on Hasta Kayıt Page")
    public void clickKaydetButtonOnHastaKayıtPage() {
        hasta_Kayit_Page_B.clickSaveButton();
    }

    @And("Click the Bilgi button on Hasta Kayıt Page")
    public void clickTheBilgiButtonOnHastaKayıtPage() throws InterruptedException {
        hasta_Kayit_Page_B.clickInfoButton();
    }

    @And("Click the Kapat button on Hasta Kayıt Page")
    public void clickTheKapatButtonOnHastaKayıtPage() {
        hasta_Kayit_Page_B.clickCloseButton();
    }


    @And("Select an invalid future  Doğum Tarihi on Hasta Kayıt Page")
    public void selectAnInvalidFutureDogumTarihiOnHastaKayıtPage() {
        hasta_Kayit_Page_B.selectAnInvalidFutureBirthday();
    }

    @Then("İşlem Başarılı   shouldnt be seen on popoup on Hasta Kayıt Page")
    public void islemBasarılıShouldntBeSeenOnPopoupOnHastaKayıtPage() {
        hasta_Kayit_Page_B.operationFailded();
    }

    @And("Write a statement contains some numbers  as Soyadı  on Hasta Kayıt Page")
    public void writeAStatementContainsSomeNumbersAsSoyadıOnHastaKayıtPage() {
        hasta_Kayit_Page_B.writeContainsNumbersLastNameBox();
    }

    @And("Write a statement contains some numbers  as Adı  on Hasta Kayıt Page")
    public void writeAStatementContainsSomeNumbersAsAdıOnHastaKayıtPage() {
        hasta_Kayit_Page_B.writeContainsNumbersNameBox();

    }

    @And("click Yenidoğan checkbox  on Hasta Kayıt Page")
    public void clickYenidoganCheckboxOnHastaKayıtPage() {
        hasta_Kayit_Page_B.clickNewbornBox();
    }

    @And("Select a valid date within one month at the latest as Doğum Tarihi on Hasta Kayıt Page")
    public void selectAValidDateWithinOneMonthAtTheLatestAsDogumTarihiOnHastaKayıtPage() {
        hasta_Kayit_Page_B.selectValidDateWithinOneMonth();
    }

    @And("write a valid value on Haftası for Bebeğin Doğum  on Hasta Kayıt Page")
    public void writeAValidValueOnHaftasıForBebeginDogumOnHastaKayıtPage() {
        hasta_Kayit_Page_B.writeValidWeek();
    }

    @And("write a valid value on Günü for Bebeğin Doğum  on Hasta Kayıt Page")
    public void writeAValidValueOnGunuForBebeginDogumOnHastaKayıtPage() {
        hasta_Kayit_Page_B.writeValidDay();
    }

    @And("Select Cinsiyeti as Erkek on Hasta Kayıt Page")
    public void selectCinsiyetiAsErkekOnHastaKayıtPage() {
        hasta_Kayit_Page_B.selectCinsiyetiAsMan();
    }

    @And("Select country  from   Uyruğu drop down menu on Hasta Kayıt Page")
    public void selectCountryFromUyruguDropDownMenuOnHastaKayıtPage(DataTable dataTable) {
        hasta_Kayit_Page_B.selectCountryDropDown(dataTable);
    }


    @And("click Mavikart checkbox on Hasta Kayıt Page")
    public void clickMavikartCheckboxOnHastaKayıtPage() {
        hasta_Kayit_Page_B.clickCheckBox();
    }


    @Then("Only positive integers should be written to Doğumsırası on Hasta Kayıt Page")
    public void writeSomeNumbersToDogumsırasıOnHastaKayıtPage(DataTable dataTable) {
        hasta_Kayit_Page_B.checkValidNumbers(dataTable);

    }


    @Then("only valid emails should be accepted")
    public void onlyValidEmailsShouldBeAccepted(DataTable dataTable) throws InterruptedException {
        hasta_Kayit_Page_B.checkValidEmails(dataTable);
    }


    @And("Only valid Birth Dates should be accepted on Hasta Kayıt Sayfası")
    public void onlyValidBirthDatesShouldBeAcceptedOnHastaKayıtSayfası(DataTable dataTable) throws ParseException, InterruptedException {
        hasta_Kayit_Page_B.chechValidBirthDates(dataTable);


    }


    @And("click  E-mail Gönderilebilir button   on Hasta Kayıt Page")
    public void clickEMailGonderilebilirButtonOnHastaKayıtPage() {
        hasta_Kayit_Page_B.clickEmailCheckBox();
    }


    @And("E-mail box should be active on Hasta Kayıt Page")
    public void eMailBoxShouldBeActiveOnHastaKayıtPage() {
        hasta_Kayit_Page_B.checkEmailActive();

    }






    @Then("The Age of The Mother shouldn't be smaller than fifteen on Hasta Kayıt Page")
    public void theAgeOfTheMotherShouldnTBeSmallerThanFifteenOnHastaKayıtPage(DataTable dataTable) throws InterruptedException {

        hasta_Kayit_Page_B.checkAgeOfMother(dataTable);
    }

    @And("Select Proximity from Yakınlığı drop down menu on Hasta Kayıt Page")
    public void SelectProximityfromYakınlığıDropDownMenuOnHastaKayıtPage() {
        hasta_Kayit_Page_B.clickProximity();
    }


    @Then("Kart Sahibi box should be active on Hasta Kayıt Page when If something except Kendisi is selected")
    public void kartSahibiBoxShouldBeActiveOnHastaKayıtPageWhenIfSomethingExceptKendisiIsSelected() throws InterruptedException {
        hasta_Kayit_Page_B.checkProximity();
    }

    @When("Select Mavi Kartlılar from   Hasta Türü drop down menu on Hasta Kayıt Page")
    public void selectMaviKartlılarFromHastaTuruDropDownMenuOnHastaKayıtPage() {
                 hasta_Kayit_Page_B.selectWithBlueCards();
        }


    @And("Write a valid T.C. Kimlik No on Hasta Kayıt Page")
    public void writeAValidTCKimlikNoOnHastaKayıtPage() {
        hasta_Kayit_Page_B.writeValidID();
    }


    @Then("If Id is valid then İşlem Başarılı   should be seen on popoup on Hasta Kayıt Page")
    public void ifIdIsValidThenIslemBasarılıShouldBeSeenOnPopoupOnHastaKayıtPage(DataTable dataTable) throws InterruptedException {
        hasta_Kayit_Page_B.checkIdValidaty(dataTable);
    }
}
//

























