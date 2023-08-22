package pages;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;


public class Hasta_Kayit_Page_B {

    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    public Hasta_Kayit_Page_B() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='info item']")
    public WebElement bilgiButton;

    @FindBy(xpath = "//p[contains(text(),'İşlem Başarılı')]")
    public WebElement islembasarili;


    @FindBy(xpath = "(//span[contains(text(),'Kapat')])[1]")
    public WebElement kapatButton;


    @FindBy(id = "TXT_HASTA_KAYIT_ANA_KURUM_KODU")
    public WebElement kurum;


    @FindBy(id = "TXT_HASTA_KAYIT_ALT_KURUM_KODU")
    public WebElement kurumDetay;

    @FindBy(id = "PopupSaveButton_0")
    public WebElement kaydetButton;
    @FindBy(xpath = "(//p)[1]")
    public WebElement HataMassage;

    //----------------------------- Merve
    @FindBy(id = "CHK_HASTA_KAYIT_YENIDOGAN")
    public WebElement yenidoganCheckBox;

    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_SIRASI")
    public WebElement dogumSirasiSearchBox;

    @FindBy(id = "CHK_HASTA_KAYIT_MAVIKART")
    public WebElement maviKartCheckBox;

    @FindBy(id = "TXT_HASTA_KAYIT_TC_KIMLIK_NO")
    public WebElement TCsearchBox;

    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_TARIHI")
    public WebElement dogumTarihiSearchBox;

    @FindBy(xpath = "//a[@onclick='HastaKayitTCKimlikAktar()']")
    public WebElement TCaktarButton;

    @FindBy(xpath = "//a[@onclick='HastaKayitTCKimlikDogrula()']")
    public WebElement TCDogrulaButton;

    @FindBy(xpath = "//*[@id=\"dlgKurumArama\"]/div[2]/div[1]/a/span")
    public WebElement dogrulaKapatButton;

    @FindBy(id = "TXT_HASTA_KAYIT_SOYADI")
    public WebElement soyadiSearchBox;

    @FindBy(id = "TXT_HASTA_KAYIT_ADI")
    public WebElement adiSearchBox;

    @FindBy(id = "CMB_HASTA_KAYIT_YAKINLIK")
    public WebElement yakinligiDropdown;

    @FindBy(id = "TXT_HASTA_KAYIT_KART_SAHIBI")
    public WebElement kartSahibiSearchBox;

    @FindBy(id = "CMB_HASTA_KAYIT_CINSIYET")
    public WebElement cinsiyetDropdown;

    @FindBy(id = "TXT_HASTA_KAYIT_MEDENI_HAL")
    public WebElement medeniHaliSearchBox;

    //------------------------------- İlyas
    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_TEL\"]")
    public WebElement telefonnumarasi;

    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_CEP_TEL\"]")
    public WebElement ceptelefonu;

    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_EMAIL\"]")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_MESLEK_KODU\"]")
    public WebElement meslek;

    @FindBy(xpath = "//*[@id=\"CMB_HASTA_KAYIT_STATUS\"]")
    public WebElement statu;

    @FindBy(xpath = "//*[@id=\"CMB_HASTA_KAYIT_OGRENIM\"]")
    public WebElement ogrenim;

    @FindBy(xpath = "//*[@id=\"CMB_HASTA_KAYIT_KAN_GRUBU\"]")
    public WebElement kangrubu;

    @FindBy(xpath = "//*[@id='CHK_HASTA_KAYIT_SMS_GONDERILEBILIR']")
    public WebElement SMS;

    @FindBy(id = "CHK_HASTA_KAYIT_EMAIL_GONDERILEBILIR")
    public WebElement emailCheckBox;

    @FindBy(xpath = "//*[@id='CHK_HASTA_KAYIT_KIMLIK_FOTOKOPISI']")
    public WebElement kimlikfotokopi;

    @FindBy(xpath = "//*[@id='CHK_HASTA_KAYIT_KVKK_ONAM']")
    public WebElement KVKK;

    //----------------------------------------------------- Fatih


    @FindBy(xpath = "//input[@class='inpt wpx270']")
    public WebElement adresSearchBox;

    @FindBy(xpath = "//input[@class='inpt wpx265']")
    public WebElement adresSearchBox2;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[9]")
    public WebElement ilSearchBox;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[10]")
    public WebElement ilceSearchBox;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[11]")
    public WebElement mahalleSearchBox;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[10]")
    public WebElement koySearchBox;

    @FindBy(xpath = "//input[@class='inpt wpx160']")
    public WebElement caddeSkSearchBox;

    @FindBy(xpath = "//input[@class='inpt wpx70']")
    public WebElement postaKoduSearchBox;

    @FindBy(xpath = "(//a[@class='hastaButton backWhite'])[6]")
    public WebElement adresAktarButton;

    @FindBy(xpath = "(//a[@class='hastaButton backWhite'])[7]")
    public WebElement beyanAdresButton;

    @FindBy(xpath = "//textarea[@class='inpt wpx355']")
    public WebElement aciklamaSearchBox;

    //--------------------------------------------------------- Baris


    @FindBy(id = "CMB_HASTA_KAYIT_UYRUK")
    public WebElement uyruguDropdown;

    @FindBy(xpath = "(//select[@class='inpt '])[2]")
    public WebElement basvuruSekliDropdown;


    @FindBy(id = "TXT_HASTA_KAYIT_BABA_ADI")
    public WebElement babaAdiSearchBox;


    @FindBy(id = "(TXT_HASTA_KAYIT_ANA_ADI")
    public WebElement anaAdiSearchBox;


    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_YERI")
    public WebElement dogumYeriSearchBox;


    @FindBy(id = "TXT_HASTA_KAYIT_ANNE_TC_KIMLIK_NO")
    public WebElement anneTCNoSearchBox;


    @FindBy(xpath = "(//a[contains(text(),'Doğrula-F1')])[1]")
    public WebElement dogrulaF1Button;


    @FindBy(id = "TXT_HASTA_KAYIT_ANNE_DOGUM_TARIHI")
    public WebElement anneDogumTarihiSearchBox;


    @FindBy(xpath = "(//a[@title='Değerleri temizle'])[1])")
    public WebElement hastaTuruSilmeButton;


    @FindBy(xpath = "(//input[contains(@value,'...')])[3]")
    public WebElement hastaTuruButton;

    @FindBy(className = "dxgvDataRow_MetropolisBlue")
    public List<WebElement> hastaTuruList;

    @FindBy(id = "TXT_HASTA_KAYIT_HASTA_NO")
    public WebElement hastaNo;

    @FindBy(id = "TXT_HASTA_KAYIT_BEBEK_DOGUM_HAFTA")
    public WebElement bebekDogumHaftasi;

    @FindBy(id = "TXT_HASTA_KAYIT_BEBEK_DOGUM_HAFTA_GUN")
    public WebElement bebekDogumGunu;

    @FindBy(id = "TXT_HASTA_KAYIT_TAHSIS_NO")
    public WebElement passportId;

    @FindBy(id = "TXT_HASTA_KAYIT_KARNE_NO")
    public WebElement passportNo;


    public void selectWithoutId() {
        hastaTuruButton.click();
        ReusableMethods.doubleClick(hastaTuruList.get(4));
    }

    public void writeValidMobilePhone() {
        ceptelefonu.click();
        String mobilePhone = "5" + faker.number().digits(9);
        ceptelefonu.sendKeys(mobilePhone);
    }

    public void selectValidBirthday() {
        dogumTarihiSearchBox.click();
        dogumTarihiSearchBox.sendKeys("17.05.2000" + Keys.ENTER);

    }

    public void clickCheckBox() {
        maviKartCheckBox.click();
    }

    public void clickEmailCheckBox() {
        emailCheckBox.click();
    }

    public void checkEmailActive() {
        Assert.assertTrue(emailBox.isEnabled());
    }

    public void chechValidBirthDates(DataTable dataTable) throws ParseException, InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        for (int row = 1; row < dataTable.height(); row++) { // Rowlari doner

            String dateStr = dataTable.cell(row, 0);
            Boolean newborn = ReusableMethods.daysBetweenDates(dateStr);
            dogumTarihiSearchBox.sendKeys(dateStr + Keys.ENTER);
            kaydetButton.click();
            String kapatString = kapatButton.getText();
            softAssert.assertEquals(newborn.booleanValue(), (kapatString.contains("İşlem")));
            Thread.sleep(2000);
            kapatButton.click();
            dogumTarihiSearchBox.clear();
        }
        softAssert.assertAll();
    }


    public void checkValidEmails(DataTable dataTable) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        for (int row = 1; row < dataTable.height(); row++) { // Rowlari doner
            String email = dataTable.cell(row, 0);
            emailBox.sendKeys(email);
            Boolean emailValidation = ReusableMethods.isEmailValid(email);
            kaydetButton.click();
            String kapatString = kapatButton.getText();
            softAssert.assertEquals(emailValidation.booleanValue(), (kapatString.contains("İşlem")));
            Thread.sleep(2000);
            kapatButton.click();
            emailBox.clear();
        }
        softAssert.assertAll();
    }

    public void selectGender() {
        Select select = new Select(cinsiyetDropdown);
        select.selectByVisibleText("ERKEK");
    }


    public void checkAgeOfMother(DataTable dataTable) throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();
        for (int row = 1; row < dataTable.height(); row++) {
            boolean checkAge = true;
            String dateStr = dataTable.cell(row, 0);
            anneDogumTarihiSearchBox.sendKeys(dateStr + Keys.ENTER);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate birthdateMother = LocalDate.parse(dateStr, formatter);
            LocalDate currentDate = LocalDate.now();
            int ageOfMother = (int) ChronoUnit.YEARS.between(birthdateMother, currentDate);

            if (ageOfMother <= 15) {
                checkAge = false;
            }
            kaydetButton.click();
            String kapatString = islembasarili.getText();
            Thread.sleep(2000);
            kapatButton.click();
            anneDogumTarihiSearchBox.clear();
            softAssert.assertEquals(kapatString.contains("İşlem"), checkAge);
        }
        softAssert.assertAll();


    }


    public void checkValidNumbers(DataTable dataTable) {
        SoftAssert softAssert = new SoftAssert();
        for (int row = 1; row < dataTable.height(); row++) { // Rowlari doner
            String number = dataTable.cell(row, 0);
            dogumSirasiSearchBox.sendKeys(number + Keys.ENTER);
            dogumSirasiSearchBox.clear();
            softAssert.assertNull(dogumSirasiSearchBox, "Only positive integers should be written");
        }
        softAssert.assertAll();

    }


    public void writeValidLastName() {
        soyadiSearchBox.click();
        String lastName = faker.name().lastName();
        soyadiSearchBox.sendKeys(lastName);
    }

    public void writeValidName() {
        adiSearchBox.click();
        String firstName = faker.name().name();
        adiSearchBox.sendKeys(firstName);
    }

    public void selectCinsiyetiAsMan() {
        Select select = new Select(cinsiyetDropdown);
        select.selectByVisibleText("ERKEK");
    }


    public void selectValidRelation() {
        Select select = new Select(yakinligiDropdown);
        select.selectByVisibleText("KENDİSİ");
    }

    public void clickSaveButton() {
        kaydetButton.click();
    }

    public void selectCountryDropDown(DataTable dataTable) {
        SoftAssert softAssert = new SoftAssert();

        for (int row = 1; row < dataTable.height(); row++) { // Rowlari doner
            String country = dataTable.cell(row, 0);
            Select select = new Select(uyruguDropdown);
            select.selectByVisibleText(country);
            softAssert.assertFalse(passportId.isEnabled(), "PassortId is disabled");
            softAssert.assertFalse(passportNo.isEnabled(), "PassortNo is disabled");
        }
        softAssert.assertAll();
    }


    public void clickAlertButton() {
        bilgiButton.click();
   /*   JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver(); ;
        js.executeScript("document.querySelector(\"#TXT_HASTA_KAYIT_HASTA_NO\").disabled=false");
        Thread.sleep(3000);
      String hastaNo1=hasta_Kayit_Page_B.hastaNo.getText();
      String hastaNo2=hasta_Kayit_Page_B.hastaNo.getAttribute("innerText");
       String hastaNo3=hasta_Kayit_Page_B.hastaNo.getAttribute("textContent");   */
    }

    public void clickInfoButton() {
        bilgiButton.click();
    }

    public void writeContainsNumbersLastNameBox() {
        String invalidLastName_Name = "123" + faker.name().name();
        soyadiSearchBox.sendKeys(invalidLastName_Name);
    }

    public void writeContainsNumbersNameBox() {
        String invalidName = "123" + faker.name().name() + "456";
        adiSearchBox.sendKeys(invalidName);
    }


    public void clickCloseButton() {
        kapatButton.click();
    }

    public void selectAnInvalidFutureBirthday() {
        dogumTarihiSearchBox.sendKeys("13.10.2023" + Keys.ENTER);
    }

    public void operationFailded() {
        Assert.assertNotEquals("İşlem Başarılı", islembasarili.getText());
    }

    public void clickNewbornBox() {
        yenidoganCheckBox.click();
    }

    public void selectValidDateWithinOneMonth() {
        dogumTarihiSearchBox.sendKeys("7.08.2023" + Keys.ENTER);
    }

    public void writeValidWeek() {
        bebekDogumHaftasi.sendKeys("39");
    }

    public void writeValidDay() {
        bebekDogumGunu.sendKeys("5");
    }

    public void clickProximity() {
        yakinligiDropdown.click();
    }

    public void checkProximity() throws InterruptedException {


        Select select = new Select(yakinligiDropdown);
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Boolean cardOwnerBoxEnabled = true;
            select.selectByIndex(i);
            Thread.sleep(1500);
            if (options.get(i).getText().equals("KENDİSİ")) {
                kartSahibiSearchBox.isEnabled();
                Assert.assertTrue(kartSahibiSearchBox.isEnabled());
            }
        }

    }


    public void selectWithBlueCards() {
        hastaTuruButton.click();
        ReusableMethods.doubleClick(hastaTuruList.get(5));
    }

    public void writeValidID() { //check!!
        TCsearchBox.click();
        TCsearchBox.sendKeys(ReusableMethods.generateValidId());
    }

    public void checkIdValidaty(DataTable dataTable) throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();
        for (int row = 1; row < dataTable.height(); row++) { // Rowlari doner
            String id = dataTable.cell(row, 0);
            TCsearchBox.sendKeys(id);
            kaydetButton.click();
            Thread.sleep(2000);
            String kapatString = kapatButton.getText();
            softAssert.assertEquals(ReusableMethods.isIdValid(id), (kapatString.contains("İşlem")));
            kapatButton.click();
            TCsearchBox.clear();

        }
        softAssert.assertAll();

    }


}


