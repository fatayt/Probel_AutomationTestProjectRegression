package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import pages.Login_Page;
import utilities.ConfigReader;
import utilities.Driver;

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
        @When("The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt")
        public void the_user_goes_hasta_işlemleri_ayaktan_hasta_işlemleri_and_then_click_poliklinik_muayene_kayıt() {

            actions.moveToElement(basePage.hastaIslemleri).
               moveToElement(basePage.ayaktanHastaIslemleri).
                perform();

            basePage.poliklinikMuayneKayit.click();


        }
}
