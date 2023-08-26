package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import pages.Login_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Login_StepDefinitions {

    Login_Page login_page = new Login_Page();
    BasePage basePage = new BasePage();
    Actions actions = new Actions(Driver.getDriver());



        @Given("The user logs in")
        public void the_user_logs_in() {

        login_page.kullaniciKodu.sendKeys(ConfigReader.getProperty("userName"));
        login_page.sifre.sendKeys(ConfigReader.getProperty("password"));
        login_page.webSifre.sendKeys(ConfigReader.getProperty("web_password"));
        login_page.clickButton.click();

        }
        @When("The user goes Hasta Islemleri, Ayaktan Hasta Islemleri and then click Poliklinik Muayene Kayit")
        public void the_user_goes_hasta_islemleri_ayaktan_hasta_islemleri_and_then_click_poliklinik_muayene_kayit() {
            ReusableMethods.jseWithClick(Driver.getDriver(), basePage.hastaIslemleri);
            ReusableMethods.jseWithClick(Driver.getDriver(), basePage.ayaktanHastaIslemleri);
            ReusableMethods.jseWithClick(Driver.getDriver(), basePage.poliklinikMuayneKayit);
        }
}
