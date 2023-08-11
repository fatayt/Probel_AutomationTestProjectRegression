package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;




public class Hasta_Kayit_Page_B {

    public Hasta_Kayit_Page_B(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //  @FindBy(xpath = "(//input[@class='inpt wpx50'])[3]")
    @FindBy(id = "TXT_HASTA_KAYIT_ANA_KURUM_KODU")
    public WebElement kurum;

    // @FindBy(xpath = "(//input[@class='inpt wpx50'])[4]")
    @FindBy(id = "TXT_HASTA_KAYIT_ALT_KURUM_KODU")
    public WebElement kurumDetay;

    @FindBy(id = "PopupSaveButton_0")
    public  WebElement kaydetButton;
    @FindBy(xpath = "(//p)[1]")
    public WebElement HataMassage;

    //----------------------------- Merve
    @FindBy(id="CHK_HASTA_KAYIT_YENIDOGAN")
    public WebElement yenidoganCheckBox;

    @FindBy(id="TXT_HASTA_KAYIT_DOGUM_SIRASI")
    public WebElement dogumSirasiSearchBox;

    @FindBy(id="CHK_HASTA_KAYIT_MAVIKART")
    public WebElement maviKartCheckBox;

    @FindBy(id="TXT_HASTA_KAYIT_TC_KIMLIK_NO")
    public WebElement TCsearchBox;

    @FindBy(id="TXT_HASTA_KAYIT_DOGUM_TARIHI")
    public WebElement dogumTarihiSearchBox;

    @FindBy(xpath = "//a[@onclick='HastaKayitTCKimlikAktar()']")
    public WebElement TCaktarButton;

    @FindBy(xpath = "//a[@onclick='HastaKayitTCKimlikDogrula()']")
    public WebElement TCDogrulaButton;

    @FindBy(xpath = "//*[@id=\"dlgKurumArama\"]/div[2]/div[1]/a/span")
    public WebElement dogrulaKapatButton;

    @FindBy(id="TXT_HASTA_KAYIT_SOYADI")
    public WebElement soyadiSearchBox;

    @FindBy(id="TXT_HASTA_KAYIT_ADI")
    public WebElement adiSearchBox;

    @FindBy(id="CMB_HASTA_KAYIT_YAKINLIK")
    public WebElement yakinligiDropdown;

    @FindBy(id="TXT_HASTA_KAYIT_KART_SAHIBI")
    public WebElement kartSahibiSearchBox;

    @FindBy(id="CMB_HASTA_KAYIT_CINSIYET")
    public  WebElement cinsiyetDropdown;

    @FindBy(id="TXT_HASTA_KAYIT_MEDENI_HAL")
    public WebElement medeniHaliSearchBox;

    //------------------------------- İlyas
    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_TEL\"]")
    public WebElement telefonnumarasi;

    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_CEP_TEL\"]")
    public WebElement ceptelefonu;

    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_EMAIL\"]")
    public WebElement email;

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
    public WebElement EMAIL;

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
    public  WebElement ilceSearchBox;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[11]")
    public  WebElement mahalleSearchBox;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[10]")
    public  WebElement koySearchBox;

    @FindBy(xpath = "//input[@class='inpt wpx160']")
    public  WebElement caddeSkSearchBox;

    @FindBy(xpath = "//input[@class='inpt wpx70']")
    public  WebElement postaKoduSearchBox;

    @FindBy(xpath = "(//a[@class='hastaButton backWhite'])[6]")
    public  WebElement adresAktarButton;

    @FindBy(xpath = "(//a[@class='hastaButton backWhite'])[7]")
    public  WebElement beyanAdresButton;

    @FindBy(xpath = "//textarea[@class='inpt wpx355']")
    public WebElement aciklamaSearchBox;

    //--------------------------------------------------------- Baris

    //@FindBy(xpath = "(//select[@class='inpt '])[1]")
    @FindBy(id= "CMB_HASTA_KAYIT_UYRUK")
    public  WebElement uyruguDropdown;

    @FindBy(xpath = "(//select[@class='inpt '])[2]")
    public  WebElement basvuruSekliDropdown;

    // @FindBy(xpath = "(//input[@class='inpt '])[13]")
    @FindBy(id = "TXT_HASTA_KAYIT_BABA_ADI")
    public  WebElement babaAdiSearchBox;

    // @FindBy(xpath = "(//input[@class='inpt '])[14]")
    @FindBy(id = "(TXT_HASTA_KAYIT_ANA_ADI")
    public  WebElement anaAdiSearchBox;

    // @FindBy(xpath = "(//input[@class='inpt '])[15]")
    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_YERI")
    public  WebElement dogumYeriSearchBox;

    //@FindBy(id = "TXT_HASTA_KAYIT_ANNE_TC_KIMLIK_NO")
    @FindBy(id = "TXT_HASTA_KAYIT_ANNE_TC_KIMLIK_NO")
    public  WebElement anneTCNoSearchBox;

    // @FindBy(xpath = "(//a[@class='hastaButton backWhite'])[5]")
    @FindBy(xpath = "(//a[contains(text(),'Doğrula-F1')])[1]")
    public  WebElement dogrulaF1Button;

    // @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_ANNE_DOGUM_TARIHI']")
    @FindBy(id = "TXT_HASTA_KAYIT_ANNE_DOGUM_TARIHI")
    public WebElement anneDogumTarihiSearchBox;

    //@FindBy(xpath = "(//a[@class='hem_border hem_button hem_sil hem_left lookupClearButton backWhite'])")
    @FindBy(xpath = "(//a[@title='Değerleri temizle'])[1])")
    public  WebElement hastaTuruSilmeButton;

    // @FindBy(xpath = "(//input[@class='inpt  lookupOpenButton'])[3]")
    @FindBy(xpath = "(//input[contains(@value,'...')])[3]")
    public WebElement hastaTuruButton;

    @FindBy(className = "dxgvDataRow_MetropolisBlue")
    public List<WebElement> hastaTuruList;











}


