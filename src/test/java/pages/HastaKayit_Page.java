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

public class HastaKayit_Page {
    public HastaKayit_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();







    @FindBy(id = "PopupSaveButton_0")
    public WebElement saveButton;

    @FindBy(id = "TXT_HASTA_KAYIT_TC_KIMLIK_NO")
    public WebElement TCsearchBox;

    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_TARIHI")
    public WebElement dateOfBirthSearchBox;

    @FindBy(id = "TXT_HASTA_KAYIT_SOYADI")
    public WebElement surnameSearchBox;

    @FindBy(id = "TXT_HASTA_KAYIT_ADI")
    public WebElement nameSearchBox;

    @FindBy(id = "CMB_HASTA_KAYIT_CINSIYET")
    public WebElement genderDropdown;

    @FindBy(id = "TXT_HASTA_KAYIT_MEDENI_HAL")
    public WebElement medeniHaliSearchBox;

    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_TAHSIS_NO']")
    public WebElement pasaportIdSearchBox;

    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_KARNE_NO']")
    public WebElement pasaportNoSearchBox2;

    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_CEP_TEL\"]")
    public WebElement mobilePhoneNumber;

    @FindBy(id = "CMB_HASTA_KAYIT_UYRUK")
    public WebElement nationalityDropdown;

    @FindBy(xpath = "/html/body/div[10]/div[2]/div[2]/div/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div/input[3]")
    public WebElement patientType;

    @FindBy(xpath = "//*[@id=\"HastaTuruList_tccell0_2\"]/a")
    public WebElement dualCitizensChooseButton;

    @FindBy(xpath = "//*[@id=\"HastaTuruList_tccell1_2\"]/a")
    public WebElement comingForEducation;


    @FindBy(id = "TXT_HASTA_KAYIT_ANNE_TC_KIMLIK_NO")
    public WebElement motherTCNoSearchBox;

    @FindBy(xpath = "//*[@id=\"hataIcerik\"]/div/div[1]/p")
    public WebElement WarningMessage;

    @FindBy(xpath = "//*[@id=\"LB_TAHSIS_NO\"]")
    public WebElement allocationNumberBoxName;

    @FindBy(xpath = "//*[@id=\"LB_KARNE_SERI_NO\"]")
    public WebElement reportCardSerialNoBoxName;

    @FindBy(xpath = "//a[@class='PopupCloseButton PopupButton']")
    public WebElement closeButton;

    @FindBy (xpath = "//span[@class='no item']")
    public WebElement cl;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/span")
    public WebElement closeButon;

    @FindBy(xpath = "//a[@title='Kapat']")
    public WebElement kapatButton;

    @FindBy(xpath = "(//input[@class='inpt tacnt wpx50'])[1]")
    public WebElement policnicSearchBox;

    @FindBy(xpath = "//select[@class='wpx190']")
    public WebElement arrivalType;

    @FindBy(xpath = "//span[@class='tbText']")
    public WebElement patientSaveButton;

    @FindBy(xpath = "//*[@id=\"hataIcerik\"]/div/div[3]/span")
    public WebElement readAuthorizationCloseButton;

    @FindBy(xpath = "/html/body/div[1]/div[3]/header/nav[2]/ul/li[3]/a")
    public WebElement user;

    @FindBy(linkText = "Detaylı Hasta Arama")
    public WebElement detailedPatientSearch;

    @FindBy(xpath = "//*[@id=\"btnSorgula\"]")
    public WebElement queryButton;

    @FindBy(xpath = "//input[@id='CHK_HASTA_KAYIT_EMAIL_GONDERILEBILIR']")
    public WebElement eMailCheckBox;

    @FindBy(xpath = "//input[@id='CHK_HASTA_KAYIT_YENIDOGAN']")
    public WebElement newbornCheckbox;

    @FindBy(xpath = "//*[@id=\"bilgiIcerik\"]/div/div[3]/span")
    public WebElement succesButton;

    @FindBy(xpath = "//input[@id='CHK_HASTA_KAYIT_MAVIKART']")
    public WebElement bluecardButton;

    @FindBy(xpath = "//label[text()=\"Doğum Sırası\"]")
    public WebElement birthOrder;

    @FindBy(id = "CMB_HASTA_KAYIT_YAKINLIK")
    public WebElement yakinligiDropdown;

    @FindBy(id = "TXT_HASTA_KAYIT_KART_SAHIBI")
    public WebElement cardOwnerSearchBox;

    @FindBy(xpath = "//a[@id='PopupDeleteButton_1']")
    public WebElement clearButton;

    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_SIRASI")
    public WebElement birthOrderSearchBox;

    @FindBy(xpath = "(//td[@class='dxgv dx-ellipsis dx-ar'])[2]")
    public WebElement protocolNo;

    @FindBy(xpath = "(//input[@id='PROTOKOL_NO'])[2]")
    public WebElement detayliOrotokolNo;

    @FindBy(xpath = "//*[@id=\"hastaGelisListeGrid_DXDataRow0\"]/td[7]")
    public WebElement lastProtocolNo;

    @FindBy (xpath = "//*[@id=\"basariliIcerik\"]/div/div[3]/span")
    public WebElement infoSaved;

    @FindBy (id = "TXT_HASTA_KAYIT_BEBEK_DOGUM_HAFTA")
    public WebElement birthWeekButton;

    @FindBy (id = "TXT_HASTA_KAYIT_BEBEK_DOGUM_HAFTA_GUN")
    public WebElement birthDayButton;

    @FindBy (xpath = "//*[@id=\"uyariMesajiIcerik\"]/div/div[3]/span")
    public WebElement warningButtonAdd;

    @FindBy (id = "TXT_HASTA_KAYIT_EMAIL")
    public WebElement emailSearchBox;

    @FindBy (xpath = "//*[@id=\"onayVazgecIcerik\"]/div/div[3]/span[2]")
    public WebElement acceptButtomNo;

    @FindBy (xpath = "//a[contains(text(),'Çıkış')]")
    public WebElement exit;

    @FindBy (xpath = "//span[@class='yes item']")
    public WebElement continueYesButton;












    @FindBy(id="TXT_HASTA_KAYIT_SOYADI")
    public WebElement soyadiSearchBox;

    @FindBy(id="TXT_HASTA_KAYIT_ADI")
    public WebElement adiSearchBox;



    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_CEP_TEL\"]")
    public WebElement ceptelefonu;

    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_EMAIL\"]")
    public WebElement email;


    @FindBy(id = "CHK_HASTA_KAYIT_EMAIL_GONDERILEBILIR")
    public WebElement EMAIL;

    @FindBy(xpath = "//*[@id='CHK_HASTA_KAYIT_KIMLIK_FOTOKOPISI']")
    public WebElement kimlikfotokopi;

    @FindBy(xpath = "//*[@id='CHK_HASTA_KAYIT_KVKK_ONAM']")
    public WebElement KVKK;

    @FindBy(id = "HastaTuruList_tccell9_2")
    public WebElement tikaButton;
    @FindBy(id = "HastaTuruList_tccell10_2")
    public WebElement turistButton;

    @FindBy(id = "HastaTuruList_tccell11_2")
    public WebElement turkSoyluButton;

    @FindBy(xpath = "//a[@class='PopupCloseButton PopupButton']")
    public WebElement hastaKayitKapatButton;



    @FindBy(xpath = "/html/body/div[1]/div[4]/section/form/div[3]/div[1]/div[1]/div/div[6]/div/input[4]")
    public WebElement homePageYabHastaTuruButton;


    @FindBy(xpath = "//*[@id=\"yabHstTurList_DXFREditorcol1_I\"]")
    public WebElement popupYabHastaTuruBox;



    @FindBy(xpath = "//*[@id=\"b9cd1d38_4657_4eaf_be44_0a02853922b1\"]/input[4]")
    public WebElement yabanciHasTurButton;


    @FindBy(xpath = "//*[@id=\"bilgiIcerik\"]/div/div[3]/span")
    public WebElement popupCloseButton;

    @FindBy(xpath = "//*[@id=\"POLIKLINIK_KODU\"]")
    public WebElement poliklinikButton;


    @FindBy(xpath = "//*[@id=\"GELIS_SEKLI_KODU\"]")
    public WebElement gelisSekliButton;

    @FindBy(xpath = "//*[@id=\"GELIS_SEKLI_KODU\"]/option[2]")
    public WebElement gelisSekliAyaktanButton;




    @FindBy(xpath = "/html/body/div[1]/div[4]/section/form/div[2]/div[2]/a[4]/span")
    public WebElement anaSayfaKaydetButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/span")
    public WebElement popupBilgilerKaydedildiTAMAMbutton;





    @FindBy(xpath = "(//input[@class='inpt wpx50'])[10]")
    public  WebElement ilceSearchBox;



    @FindBy(xpath = "(//select[@class='inpt '])[1]")
    public  WebElement uyruguDropdown;



    @FindBy(id = "TXT_HASTA_KAYIT_BABA_ADI")
    public  WebElement babaAdiSearchBox;

    @FindBy(id = "TXT_HASTA_KAYIT_ANA_ADI")
    public  WebElement anaAdiSearchBox;

    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_YERI")
    public  WebElement dogumYeriSearchBox;

    @FindBy(id = "PopupSaveButton_0")
    public  WebElement kaydetButton;

    @FindBy(id="CHK_HASTA_KAYIT_YENIDOGAN")
    public WebElement yenidoganCheckBox;


    @FindBy(id="TXT_HASTA_KAYIT_DOGUM_TARIHI")
    public WebElement dogumTarihiSearchBox;

    @FindBy(id="CMB_HASTA_KAYIT_CINSIYET")
    public  WebElement cinsiyetDropdown;

    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_KARNE_SERI']")
    public WebElement pasaportNoSearchBox1;

    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_MESLEK_KODU\"]")
    public WebElement meslek;

    @FindBy(xpath = "//*[@id=\"CMB_HASTA_KAYIT_STATUS\"]")
    public WebElement statu;

    @FindBy(xpath = "//*[@id=\"CMB_HASTA_KAYIT_OGRENIM\"]")
    public WebElement ogrenim;

    @FindBy(xpath = "//*[@id=\"CMB_HASTA_KAYIT_KAN_GRUBU\"]")
    public WebElement kangrubu;

    @FindBy(xpath = "//button[normalize-space()='kapat']")
    public WebElement dateCloseButton;

    @FindBy(id = "HastaTuruList_tccell12_2")
    public WebElement multeci;

    @FindBy(id = "HastaTuruList_tccell14_2")
    public WebElement vatansizKisiler;

    @FindBy(xpath = "//span[@class='info item']")
    public WebElement islembasariliClose;

    @FindBy(xpath = "//span[normalize-space()='Kapat']")
    public WebElement kayitClose;

    @FindBy(xpath = "//*[@id=\"hataIcerik\"]/div/div[3]/span")
    public WebElement yetkisizlik;

    @FindBy(xpath = "//span[@class='no item']")
    public WebElement muayeneKayitClose;

    @FindBy(id = "TXT_HASTA_KAYIT_ANNE_TC_KIMLIK_NO")
    public WebElement motherTCnumber;

    @FindBy(id = "TXT_HASTA_KAYIT_BEBEK_DOGUM_HAFTA")
    public WebElement babyBirthweek;

    @FindBy(id = "TXT_HASTA_KAYIT_BEBEK_DOGUM_HAFTA_GUN")
    public WebElement babyBirthday;

    @FindBy(xpath = "//*[@id=\"hataIcerik\"]/div/div[1]/p")
    public WebElement passaportKimliksizVatansiz;

    @FindBy(xpath = "//select[@id='CMB_HASTA_KAYIT_ANKET_CEVAP_ID']")
    public  WebElement basvuruSekliDropdown;

    @FindBy(xpath = "//*[@id=\"CMB_HASTA_KAYIT_ANKET_CEVAP_ID\"]/option[7]")
    public  WebElement basvuruSekliSelect;

    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_ANNE_DOGUM_TARIHI']")
    public WebElement anneDogumTarihiSearchBox;

    @FindBy(xpath = "(//input[@class='inpt  lookupOpenButton'])[3]")
    public  WebElement hastaTuruButton;

    @FindBy(id = "DOKTOR_KODU")
    public  WebElement doktorButton;

    @FindBy(xpath = "//a[@class=' hem_button hem_kaydet cmd_MuayeneKayit']")
    public WebElement MuayeneKayit;

    @FindBy(xpath = "/html/body")
    public WebElement mainpage;

    @FindBy(xpath = "//*[@id=\"dokList_tccell40_3\"]/a")
    public WebElement doktorlist;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[3]")
    public WebElement kurumE;
    @FindBy(xpath = "(//input[@class='inpt wpx50'])[4]")
    public WebElement kurumDetay;
    @FindBy(xpath = "(//p)[1]")
    public WebElement HataMassage;


    @FindBy(id = "TXT_HASTA_KAYIT_TAHSIS_NO")
    public WebElement tahsisNoSearchBox;
    @FindBy(id = "TXT_HASTA_KAYIT_KARNE_SERI")
    public WebElement karneSeriNoSearchBox1;
    @FindBy(id = "TXT_HASTA_KAYIT_KARNE_NO")
    public WebElement karneSeriNoSearchBox2;

    @FindBy(xpath = "(//a[@class='LookupSelectButton text_btn text_btn_ok backWhite'])[5]")
    public WebElement kimliksizHastaButton;

    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_BEBEK_DOGUM_HAFTA']")
    public WebElement bebeginDogumHaftasiSearchBox;
    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_BEBEK_DOGUM_HAFTA_GUN']")
    public WebElement bebeginDogumGunuSearchBox;
    @FindBy(xpath = "(//input[@class='inpt wpx50'])[9]")
    public WebElement ilSearchBox;

    @FindBy(xpath = "(//input[@class='dxeEditArea_MetropolisBlue dxeEditAreaSys'])[1]")
    public WebElement ilKoduSearchBox;
    @FindBy(xpath = "//table[@id='IlceKodlariList']")
    public WebElement ogeSayisi;
    @FindBy(xpath = "(//p)")
    public WebElement massageVerfy;
    @FindBy(xpath = "//span[@class='info item']")
    public WebElement popupKapatButton;
    @FindBy(xpath = "//a[@class='PopupCloseButton PopupButton']")
    public WebElement KapatButton;
    @FindBy(xpath = "//input[@class='inpt tacnt wpx50']")
    public WebElement poliklinkSearchBox;
    @FindBy(id = "GELIS_SEKLI_KODU")
    public WebElement gelisNedeni;
    @FindBy(xpath = "(//a[@class='LookupSelectButton text_btn text_btn_ok backWhite'])[8]")
    public WebElement hastaTurur3;
    @FindBy(xpath = "//a[@data-returnvalues='[{\"TUR_KODU\":\"1\",\"TUR_ADI\":\"SAĞLIK TURİZMİ\"}]']")
    public WebElement saglikTurizimiButton;
    @FindBy(id = "TXT_HASTA_KAYIT_ANNE_TC_KIMLIK_NO")
    public WebElement anneTCNoSearchBox;
    @FindBy(xpath = "//*[@id='CHK_HASTA_KAYIT_SMS_GONDERILEBILIR']")
    public WebElement SMS;
    @FindBy(xpath = "//td[@id='polkList_tccell5_14']//a[1]")
    public WebElement acilPoliklinkButton;

    @FindBy(xpath = "//span[@class='info item']")
    public WebElement bilgiButton;

    @FindBy(xpath = "//p[contains(text(),'İşlem Başarılı')]")
    public WebElement islembasarili;


    @FindBy(xpath = "(//span[contains(text(),'Kapat')])[1]")
    public WebElement kapatButtonB;

    @FindBy(id = "TXT_HASTA_KAYIT_ANA_KURUM_KODU")
    public WebElement kurum;

    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_SIRASI")
    public WebElement dogumSirasiSearchBox;

    @FindBy(id = "CHK_HASTA_KAYIT_MAVIKART")
    public WebElement maviKartCheckBox;

    @FindBy(xpath = "//a[@onclick='HastaKayitTCKimlikAktar()']")
    public WebElement TCaktarButton;

    @FindBy(xpath = "//a[@onclick='HastaKayitTCKimlikDogrula()']")
    public WebElement TCDogrulaButton;

    @FindBy(xpath = "//*[@id=\"dlgKurumArama\"]/div[2]/div[1]/a/span")
    public WebElement dogrulaKapatButton;

    @FindBy(id = "TXT_HASTA_KAYIT_KART_SAHIBI")
    public WebElement kartSahibiSearchBox;
 @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_TEL\"]")
    public WebElement telefonnumarasi;

    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_EMAIL\"]")
    public WebElement emailBox;

    @FindBy(id = "CHK_HASTA_KAYIT_EMAIL_GONDERILEBILIR")
    public WebElement emailCheckBox;

    @FindBy(className = "dxgvDataRow_MetropolisBlue")
    public List<WebElement> hastaTuruList;


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
            String kapatString = kapatButtonB.getText();
            softAssert.assertEquals(newborn.booleanValue(), (kapatString.contains("İşlem")));
            Thread.sleep(2000);
            kapatButtonB.click();
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
            String kapatString = kapatButtonB.getText();
            softAssert.assertEquals(emailValidation.booleanValue(), (kapatString.contains("İşlem")));
            Thread.sleep(2000);
            kapatButtonB.click();
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
            kapatButtonB.click();
            anneDogumTarihiSearchBox.clear();
            softAssert.assertEquals(kapatString.contains("İşlem"), checkAge);
        }
        softAssert.assertAll();


    }


    public void checkValidNumbers(DataTable dataTable) {
        SoftAssert softAssert = new SoftAssert();
        for (int row = 1; row < dataTable.height(); row++) { // Rowlari doner
            String number = dataTable.cell(row, 0);
            int numberInt = Integer.parseInt(number);
            dogumSirasiSearchBox.sendKeys(number + Keys.ENTER);
            dogumSirasiSearchBox.clear();
            softAssert.assertTrue( ReusableMethods.isNumeric(number) && numberInt>0 );
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
        kapatButtonB.click();
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
            String kapatString = kapatButtonB.getText();
            softAssert.assertEquals(ReusableMethods.isIdValid(id), (kapatString.contains("İşlem")));
            kapatButtonB.click();
            TCsearchBox.clear();

        }
        softAssert.assertAll();

    }

    }
