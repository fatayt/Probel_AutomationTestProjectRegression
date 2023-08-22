package pages;

import com.github.javafaker.Faker;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;


public class Detaylı_Arama_Page_B {

    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    public Detaylı_Arama_Page_B() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@id='HASTA_NO'])[2]")
    public WebElement hastaNoBox;

    @FindBy(id = "btnSorgula")
    public WebElement queryButton;

    @FindBy(id = "LISTE_HASTA_GELIS_GECMISI_DXMainTable")
    public WebElement patientSearchTable;

    @FindBy(xpath = " //table[@id='LISTE_HASTA_GELIS_GECMISI_DXMainTable']//tr[2]//td[1]")
    public WebElement patientNameSurname;


    public void confirmRegisteredPatient() {

        String hastano = Muayene_Kayit_Page_B.hastaNo;
        hastaNoBox.sendKeys(hastano + Keys.ENTER);
        queryButton.click();
        String patientNameExpected = Muayene_Kayit_Page_B.adi;
        String patientNameActual = patientNameSurname.getText();
        Assert.assertEquals(patientNameExpected, patientNameActual);


    }


}