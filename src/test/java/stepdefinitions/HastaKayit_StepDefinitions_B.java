package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
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
        hasta_Kayit_Page_B.ceptelefonu.sendKeys("5" + faker.number().digits(9));
    }

    @And("Select a valid Doğum Tarihi")
    public void selectAValidDogumTarihi() {
        hasta_Kayit_Page_B.dogumTarihiSearchBox.sendKeys("12.09.2000");

    }

    @And("Select Cinsiyeti")
    public void selectCinsiyeti() {

    }
}


