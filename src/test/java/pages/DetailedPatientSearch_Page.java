package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class DetailedPatientSearch_Page {
    public DetailedPatientSearch_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class='pmkTL  btnDetayliHastaAra']")
    public WebElement DetayliHastaAra;
    @FindBy(xpath = "(//*[@id=\"PROTOKOL_NO\"])[2]")
    public WebElement ProtocolNo;
    @FindBy(xpath = "//*[@class=\"inpt wpx225\"]")
    public WebElement TCKimlikNo;
    @FindBy(xpath = "//*[@data-col-name=\"HASTA_NO\"]")
    public WebElement HASTANo;
    @FindBy(xpath = "(//*[@id=\"USER_KODU\"])[2]")
    public WebElement Kullanici;
    @FindBy(xpath = "(//*[@id=\"TarihBlock\"]/a)[3]")
    public WebElement CikisTarihi;
    @FindBy(xpath = "//*[@id=\"DateRangePicker\"]/div[3]/div[2]/label")
    public WebElement gelecekUcAy;
    @FindBy(xpath = "//*[@id=\"TarihBlock\"]/a[1]")
    public WebElement DetayliTarihSecimi;
    @FindBy(xpath = "//*[@id=\"DateRangePicker\"]/div[2]/div[2]/label")
    public WebElement SonUcAyTarih;
    @FindBy(id = "btnSorgula")
    public WebElement SorgulaButton;
    @FindBy(xpath = "//*[@id=\"LISTE_HASTA_GELIS_GECMISI_DXDataRow0\"]/td[2]")
    public WebElement verifyProtocolNo;
    @FindBy(xpath = "//*[@id=\"DateRangePicker\"]/div[2]/div[1]/a")
    public WebElement popupCloseButton;
    @FindBy(xpath = "//*[@id=\"HastaAramaList_DXFREditorcol0_I\"]")
    public WebElement KullaniciID;
    @FindBy(xpath = "HastaAramaList_tccell0_2")
    public WebElement KullaniciSec;
    @FindBy(xpath = "//*[@id=\"LISTE_HASTA_GELIS_GECMISI_DXDataRow0\"]/td[1]")
    public WebElement HastaAdiSoyadi;

    @FindBy(xpath = "(//input[@id='HASTA_NO'])[2]")
    public WebElement hastaNoBox;

    @FindBy(id = "btnSorgula")
    public WebElement queryButton;


    @FindBy(xpath = " //table[@id='LISTE_HASTA_GELIS_GECMISI_DXMainTable']//tr[2]//td[1]")
    public WebElement patientNameSurname;


    public void confirmRegisteredPatient() {
        String hastano = ServiceRegistration_Page.hastaNo;
        hastaNoBox.sendKeys(hastano + Keys.ENTER);
        queryButton.click();
        String patientNameExpected = ServiceRegistration_Page.adi;
        String patientNameActual = patientNameSurname.getText();
        Assert.assertTrue(patientNameActual.contains(patientNameExpected));

    }
}
