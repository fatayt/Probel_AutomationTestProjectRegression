package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Hasta_Kayit_Page_M {
    public Hasta_Kayit_Page_M() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

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


    }
