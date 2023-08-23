package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Hasta_Kayit_Page_E {
    public Hasta_Kayit_Page_E() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[3]")
    public WebElement kurum;
    @FindBy(xpath = "(//input[@class='inpt wpx50'])[4]")
    public WebElement kurumDetay;
    @FindBy(id = "PopupSaveButton_0")
    public WebElement kaydetButton;
    @FindBy(xpath = "(//p)[1]")
    public WebElement HataMassage;
    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_CEP_TEL\"]")
    public WebElement ceptelefonu;
    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_EMAIL\"]")
    public WebElement email;
    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_TAHSIS_NO']")
    public WebElement pasaportIdSearchBox;
    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_KARNE_SERI']")
    public WebElement pasaportNoSearchBox1;
    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_KARNE_NO']")
    public WebElement pasaportNoSearchBox2;
    @FindBy(xpath = "(//select[@class='inpt '])[1]")
    public WebElement uyruguDropdown;
    @FindBy(id = "TXT_HASTA_KAYIT_TAHSIS_NO")
    public WebElement tahsisNoSearchBox;
    @FindBy(id = "TXT_HASTA_KAYIT_KARNE_SERI")
    public WebElement karneSeriNoSearchBox1;
    @FindBy(id = "TXT_HASTA_KAYIT_KARNE_NO")
    public WebElement karneSeriNoSearchBox2;
    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_ANNE_DOGUM_TARIHI']")
    public WebElement anneDogumTarihiSearchBox;
    @FindBy(xpath = "(//input[@class='inpt  lookupOpenButton'])[3]")
    public WebElement hastaTuruButton;
    @FindBy(xpath = "(//a[@class='LookupSelectButton text_btn text_btn_ok backWhite'])[5]")
    public WebElement kimliksizHastaButton;
    @FindBy(id = "TXT_HASTA_KAYIT_SOYADI")
    public WebElement soyadiSearchBox;
    @FindBy(id = "TXT_HASTA_KAYIT_ADI")
    public WebElement adiSearchBox;
    @FindBy(id = "CMB_HASTA_KAYIT_CINSIYET")
    public WebElement cinsiyetDropdown;
    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_TARIHI")
    public WebElement dogumTarihiSearchBox;
    @FindBy(id = "CHK_HASTA_KAYIT_YENIDOGAN")
    public WebElement yenidoganCheckBox;
    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_BEBEK_DOGUM_HAFTA']")
    public WebElement bebeginDogumHaftasiSearchBox;
    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_BEBEK_DOGUM_HAFTA_GUN']")
    public WebElement bebeginDogumGunuSearchBox;
    @FindBy(xpath = "(//input[@class='inpt wpx50'])[9]")
    public WebElement ilSearchBox;
    @FindBy(xpath = "(//input[@class='inpt wpx50'])[10]")
    public WebElement ilceSearchBox;
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
    @FindBy(id = "TXT_HASTA_KAYIT_TC_KIMLIK_NO")
    public WebElement TCsearchBox;
    @FindBy(xpath = "(//input[@id='TXT_HASTA_KAYIT_BABA_ADI'])")
    public WebElement babaAdiSearchBox;
    @FindBy(id = "TXT_HASTA_KAYIT_ANA_ADI")
    public WebElement anaAdiSearchBox;
    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_YERI")
    public WebElement dogumYeriSearchBox;
    @FindBy(id = "TXT_HASTA_KAYIT_ANNE_TC_KIMLIK_NO")
    public WebElement anneTCNoSearchBox;
    @FindBy(xpath = "//*[@id='CHK_HASTA_KAYIT_SMS_GONDERILEBILIR']")
    public WebElement SMS;
    @FindBy(xpath = "//td[@id='polkList_tccell5_14']//a[1]")
    public WebElement acilPoliklinkButton;


}



