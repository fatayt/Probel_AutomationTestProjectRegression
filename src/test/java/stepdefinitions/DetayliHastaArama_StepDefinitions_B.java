package stepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import pages.Detaylı_Arama_Page_B;
import pages.Hasta_Kayit_Page_B;
import pages.Muayene_Kayit_Page_B;
import utilities.Driver;

import java.time.LocalDate;


public class DetayliHastaArama_StepDefinitions_B {


    BasePage basePage = new BasePage();

    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    //  Select select=new Select();
    Hasta_Kayit_Page_B hasta_Kayit_Page_B = new Hasta_Kayit_Page_B();
    Muayene_Kayit_Page_B muayene_Kayit_Page_B = new Muayene_Kayit_Page_B();
    Detaylı_Arama_Page_B detaylı_Arama_Page_B = new Detaylı_Arama_Page_B();
    static LocalDate birthDateMother;



    @Then("Registered patient should be seen on Detaylı Hasta Arama Page")
    public void registeredPatientShouldBeSeenOnDetaylıHastaAramaPage() {
detaylı_Arama_Page_B.confirmRegisteredPatient();

    }
}