package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Hasta_Kayit_Page_F {


    public Hasta_Kayit_Page_F(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[3]")
    public WebElement kurum;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[4]")
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

    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_TAHSIS_NO']")
    public WebElement pasaportIdSearchBox;

    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_KARNE_SERI']")
    public WebElement pasaportNoSearchBox1;

    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_KARNE_NO']")
    public WebElement pasaportNoSearchBox2;

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

    @FindBy(id = "HastaTuruList_tccell9_2")
    public WebElement tikaButton;
    @FindBy(id = "HastaTuruList_tccell10_2")
    public WebElement turistButton;

    @FindBy(id = "HastaTuruList_tccell11_2")
    public WebElement turkSoyluButton;



    @FindBy(xpath = "//*[@id=\"bilgiIcerik\"]/div/div[1]/p")
    public WebElement islembasarili;

    @FindBy(xpath = "//button[normalize-space()='kapat']")
    public WebElement dateCloseButton;


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

    @FindBy(xpath = "//*[@id=\"basariliIcerik\"]/div/div[1]/p")
    public WebElement popupBilgilerKaydedildiMesaji;

    @FindBy(xpath = "//*[@id=\"basariliIcerik\"]/div/div[3]/span")
    public WebElement popupBilgilerKaydedildiTAMAMbutton;

    @FindBy(xpath = "//*[@id=\"hataIcerik\"]/div/div[1]/p")
    public WebElement Okumaişlemineyetkinizbulunmuyor;

    @FindBy(xpath = "//*[@id=\"hataIcerik\"]/div/div[3]/span")
    public WebElement hamePageDikkatKAPATMbutton;


    //----------------------------------------------------- Fatih

    @FindBy(id = "HastaTuruList_tccell12_2")
    public WebElement multeci;

    @FindBy(id = "HastaTuruList_tccell13_2")
    public WebElement vatansizSiginmaci;

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

    @FindBy(xpath = "//td[normalize-space()='Ayaktan']")
    public WebElement verifyAyaktan;

    @FindBy(xpath = "\"//p\"")
    public WebElement PassaprtNotVerify;

    @FindBy(id = "TXT_HASTA_KAYIT_ANNE_TC_KIMLIK_NO")
    public WebElement motherTCnumber;
    @FindBy(id = "TXT_HASTA_KAYIT_BEBEK_DOGUM_HAFTA")
    public WebElement babyBirthweek;
    @FindBy(id = "TXT_HASTA_KAYIT_BEBEK_DOGUM_HAFTA_GUN")
    public WebElement babyBirthday;
    @FindBy(xpath = "//*[@id=\"hataIcerik\"]/div/div[1]/p")
    public WebElement passaportKimliksizVatansiz;





    //--------------------------------------------------------- Baris

    @FindBy(xpath = "(//select[@class='inpt '])[1]")
    public  WebElement uyruguDropdown;

    @FindBy(xpath = "//select[@id='CMB_HASTA_KAYIT_ANKET_CEVAP_ID']")
    public  WebElement basvuruSekliDropdown;

    @FindBy(xpath = "//*[@id=\"CMB_HASTA_KAYIT_ANKET_CEVAP_ID\"]/option[7]")
    public  WebElement basvuruSekliSelect;



    @FindBy(id = "TXT_HASTA_KAYIT_BABA_ADI")
    public  WebElement babaAdiSearchBox;

    @FindBy(id = "TXT_HASTA_KAYIT_ANA_ADI")
    public  WebElement anaAdiSearchBox;

    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_YERI")
    public  WebElement dogumYeriSearchBox;

    @FindBy(id = "TXT_HASTA_KAYIT_ANNE_TC_KIMLIK_NO")
    public  WebElement anneTCNoSearchBox;

    @FindBy(xpath = "(//a[@class='hastaButton backWhite'])[5]")
    public  WebElement dogrulaF1Button;

    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_ANNE_DOGUM_TARIHI']")
    public WebElement anneDogumTarihiSearchBox;

    @FindBy(xpath = "(//a[@class='hem_border hem_button hem_sil hem_left lookupClearButton backWhite'])")
    public  WebElement hastaTuruSilmeButton;

    @FindBy(xpath = "(//input[@class='inpt  lookupOpenButton'])[3]")
    public  WebElement hastaTuruButton;

    @FindBy(id = "DOKTOR_KODU")
    public  WebElement doktorButton;

    @FindBy(id = "GELIS_SEKLI_KODU")
    public  WebElement gelissekliButton;

    @FindBy(xpath = "//a[@class=' hem_button hem_kaydet cmd_MuayeneKayit']")
    public WebElement MuayeneKayit;

    @FindBy(xpath = "/html/body")
    public WebElement mainpage;

    @FindBy(xpath = "//*[@id=\"dokList_tccell40_3\"]/a")
    public WebElement doktorlist;

}

