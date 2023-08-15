package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import pages.Hasta_Kayit_Page_B;
import utilities.Driver;
import utilities.ReusableMethods;

public class HastaKayit_StepDefinitions_B {


    BasePage basePage = new BasePage();

    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    //  Select select=new Select();
    Hasta_Kayit_Page_B hasta_Kayit_Page_B = new Hasta_Kayit_Page_B();


    @When("Select Kimliksiz Hasta from   Hasta Türü drop down menu")
    public void selectKimliksizHastaFromHastaTuruDropDownMenu() {
        hasta_Kayit_Page_B.hastaTuruButton.click();
        System.out.println(ReusableMethods.getElementsText(hasta_Kayit_Page_B.hastaTuruList));
        actions.doubleClick(hasta_Kayit_Page_B.hastaTuruList.get(4)).perform();


    }


    @And("Write a valid Cep Telefonu")
    public void writeAValidCepTelefonu() {
        hasta_Kayit_Page_B.ceptelefonu.click();
        String mobilePhone="5" + faker.number().digits(9);
        hasta_Kayit_Page_B.ceptelefonu.sendKeys(mobilePhone);
    }

    @And("Select a valid Doğum Tarihi")
    public void selectAValidDogumTarihi() {
        hasta_Kayit_Page_B.dogumTarihiSearchBox.sendKeys("17.05.2000"+ Keys.ENTER);

    }

    @And("Select Cinsiyeti")
    public void selectCinsiyeti() {
        Select select=new Select(hasta_Kayit_Page_B.cinsiyetDropdown);
        select.selectByVisibleText("ERKEK");

    }

    @And("Write a valid Soyadı")
    public void writeAValidSoyadı() {
        hasta_Kayit_Page_B.soyadiSearchBox.click();
        String lastName=faker.name().lastName();
        hasta_Kayit_Page_B.soyadiSearchBox.sendKeys(lastName);
    }

    @And("Write a valid Adı")
    public void writeAValidAdı() {
        hasta_Kayit_Page_B.adiSearchBox.click();
        String firstName=faker.name().name();
        hasta_Kayit_Page_B.adiSearchBox.sendKeys(firstName);
    }

    @And("Select a valid Yakınlığı")
    public void selectAValidYakınlıgı() {
        Select select=new Select(hasta_Kayit_Page_B.yakinligiDropdown);
        select.selectByVisibleText("KENDİSİ");

    }

    @And("Click Kaydet button")
    public void clickKaydetButton() {
        hasta_Kayit_Page_B.kaydetButton.click();
    }

    @And("Click the Bilgi button")
    public void clickTheBilgiButton() {
        hasta_Kayit_Page_B.bilgiButton.click();
    }

    @And("Click the Kapat button")
    public void clickTheKapatButton() {
        hasta_Kayit_Page_B.kapatButton.click();
    }
}


