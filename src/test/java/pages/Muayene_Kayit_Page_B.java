package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Muayene_Kayit_Page_B {

    static String hastaNo;
    static String kimlikNo;
    static String soyadi;
    static String adi;

    public Muayene_Kayit_Page_B() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "pageTitle")
    public WebElement muayeneKayit_title;

    @FindBy(xpath = "//a[@title='Sorgula(F11)']")
    public WebElement sorgu_button;

    @FindBy(id = "protokol_ara")
    public WebElement protokolAra_box;

    @FindBy(xpath = "//a[@title='Çalıştır']")
    public WebElement calistir_button;

    @FindBy(xpath = "//a[@title='İptal']")
    public WebElement iptal_button;

    @FindBy(xpath = "//a[@title='Kaydet(F10)']")
    public WebElement kaydet_button;

    @FindBy(xpath = "//a[@title='Yeni(F5)']")
    public WebElement yeni_button;

    @FindBy(xpath = "//a[@title='Sil(F8)']")
    public WebElement sil_button;

    @FindBy(xpath = "//a[@title='Temizle(F5)']")
    public WebElement temizle_button;

    @FindBy(xpath = "//a[@title='Yazdır']")
    public WebElement yazdir_button;

    //  @FindBy(linkText = "Detaylı Hasta Arama")
    //  public WebElement detayliHastaArama_button;

    @FindBy(xpath = "//a[contains(text(),'Detaylı Hasta Arama')]")
    public WebElement detayliHastaArama_button;

    @FindBy(linkText = "Etiket")
    public WebElement etiket_button;

    @FindBy(linkText = "Raporlar")
    public WebElement raporlar_button;

    @FindBy(linkText = "Sağlık Kurulu")
    public WebElement saglikKurulu_button;

    @FindBy(linkText = "Yardımcı İşlemler")
    public WebElement yardimciIslemler_button;

    @FindBy(linkText = "Ris")
    public WebElement ris_button;

    @FindBy(linkText = "Lab")
    public WebElement lab_button;

    @FindBy(linkText = "Kayıt")
    public WebElement kayit_button;

    @FindBy(xpath = "//input[@class='bgGrn']")
    public WebElement tcIdNo_box;
    @FindBy(id = "TXT_HASTA_KAYIT_TC_KIMLIK_NO")
    public WebElement assert_tcIdNo;

    @FindBy(id = "TXT_HASTA_KAYIT_HASTA_NO")
    public WebElement assert_hastaNo;

    @FindBy(xpath = "//a[@class='btnTcDogrulaPop  text_btn text_btn_ok pBtn']")
    public WebElement dogrula_button;

    @FindBy(xpath = "//input[@id='HASTA_NO']")
    public WebElement hastaNo_box;

    @FindBy(xpath = "//a[@class='btnHastaAraPop wpx50  text_btn text_btn_bul pBtn']")
    public WebElement ara_button;

    @FindBy(xpath = "//a[@title='Hasta Kayıt(F6)']")
    public WebElement hasta_button;

    @FindBy(xpath = "//a[@class='PopupCloseButton PopupButton']")
    public WebElement closeHastaKayit_button;

    @FindBy(id = "POLIKLINIK_KODU")
    public WebElement poliklinik_box;

    @FindBy(id = "polkList")
    public List<WebElement> poliklinik_list;

    @FindBy(xpath = "(//input[@class='inpt tacnt wpx50'])[2]")
    public WebElement doktor_box;

    @FindBy(xpath = "(//input[@class='inpt tacnt wpx50'])[3]")
    public WebElement asistan_box;

    @FindBy(xpath = "(//input[@class='inpt wpx50 tacnt'])[2]")
    public WebElement cgrTipiNo_box;

    // TODO: Gelişine Ait Bilgiler Section

    @FindBy(xpath = "//label[@data-target='pGelis']")
    public WebElement gelisineAitBilgiler_section;

    @FindBy(id = "PROTOKOL_NO")
    public WebElement protokolNo_box;

    @FindBy(id = "KIMLIK_KONTROL")
    public WebElement kimlikKontrol_checkBox;

    @FindBy(id = "KIMLIK_FOTOKOPISI")
    public WebElement kimlikFotokopisi_checkBox;

    @FindBy(id = "HES_DOGRULAMA")
    public WebElement hesKoduDogrula_checkBox;

    @FindBy(id = "ANA_KURUM_KODU")
    public WebElement kurumu_box;

    @FindBy(id = "ALT_KURUM_KODU")
    public WebElement kurumDetayi_box;

    @FindBy(id = "ADLI_VAKA")
    public WebElement hakSahTipi_dropDown;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[1]")
    public WebElement bransi_box;

    @FindBy(id = "GSS_SORGU_TURU")
    public WebElement tedaviTipi_dropDown;

    @FindBy(id = "GSS_TAKIP_NO")
    public WebElement gssIlkTakip_box;

    @FindBy(xpath = "//a[@class='btnTakipAra text_btn_bul text_btn  pBtn']")
    public WebElement takipAra_button;

    @FindBy(xpath = "//a[@class='btnHakSah text_btn_devam text_btn  pBtn']")
    public WebElement hakSahipligi_button;

    @FindBy(id = "btnfGSS_C00Ac")
    public WebElement gssC00_button;

    @FindBy(id = "GELIS_SEKLI_KODU")
    public WebElement gelisSekli_dropDown;

    @FindBy(id = "DOSYA_ISTEM")
    public WebElement dosyaIstem_checkBox;

    @FindBy(id = "SAGLIK_KURULU_SEVK")
    public WebElement saglikKuruluSevk_checkBox;

    @FindBy(id = "CARI_BEKLENECEK_TARIH")
    public WebElement cariBekTarih_calender;


    // TODO: Kabul Bilgileri Section

    @FindBy(xpath = "//label[@data-target='pKabul']")
    public WebElement kabulBilgileri_section;

    @FindBy(id = "KABUL_SEKLI_ID")
    public WebElement kabulSekli_dropDown;

    @FindBy(id = "BASVURU_NEDEN_ID")
    public WebElement basvuruNedeni_dropDown;

    @FindBy(id = "BASVURU_NEDEN_ACIKLAMA")
    public WebElement basvuruNedenAciklama_dropDown;

    @FindBy(id = "TERCIH_NEDEN_ID")
    public WebElement tercihNedeni_dropDown;

    @FindBy(id = "YAKINMA_SIKAYET")
    public WebElement yakinmaSikayet_box;

    @FindBy(xpath = "//input[@class='inpt wpx75 tacnt']")
    public WebElement yakinlik_box;

    @FindBy(id = "YAKIN_TC_NO")
    public WebElement yakinTCNo_box;

    @FindBy(id = "YAKIN_DOGUM_TARIHI")
    public WebElement yakinDogumTarihi_box;

    @FindBy(id = "YAKIN_ADI_SOYADI")
    public WebElement yakinAdSoyad_box;

    @FindBy(id = "YAKIN_CEP_TEL")
    public WebElement yakinTelNo_box;

    @FindBy(id = "YAKIN_PASAPORT_NO")
    public WebElement yakinPasaportNo_box;

    @FindBy(id = "YAKIN_EMAIL")
    public WebElement yakinEPosta_box;

    @FindBy(id = "YAKIN_ADRES")
    public WebElement yakinAdres_box;

    @FindBy(xpath = "//a[@class='btnYakinTcDogrula  text_btn text_btn_ok pBtn']")
    public WebElement aktar_button;

    @FindBy(id = "YAKIN_ONAM_DURUM_1")
    public WebElement alindi_radioButton;

    @FindBy(id = "YAKIN_ONAM_DURUM_2")
    public WebElement alinmadi_radioButton;

    @FindBy(id = "PANSUMAN")
    public WebElement pansuman_box;

    @FindBy(id = "KIMLIKSIZ")
    public WebElement kimlikYaninda_box;

    @FindBy(id = "RECETE_HASTASI")
    public WebElement receteIcinGeldi_box;

    @FindBy(id = "ENGEL_DURUMU")
    public WebElement engelDurumu_dropDown;

    @FindBy(id = "SOSYAL_DESTEK")
    public WebElement sosyalDestek_dropDown;

    @FindBy(id = "IHTIYAC_DEGERLENDIRME")
    public WebElement ihtiyacDegerlendirme_dropDown;

    @FindBy(xpath = "//a[@class='btnPolMuayeneDetayTanim   text_btn_border pBtn']")
    public WebElement kabulBilgileriTanim_button;

    @FindBy(xpath = "//a[@class='btnYabanciHastaKayit   text_btn_border pBtn']")
    public WebElement yabanciHastaKayitFormu_button;


    @FindBy(xpath = "//label[@data-target='pHesap']")
    public WebElement hesap_section;

    @FindBy(xpath = "//label[@data-target='pAvans']")
    public WebElement avans_section;

    @FindBy(id = "TELEFON")
    public WebElement phone;

    @FindBy(xpath = "//div[@class='alertText']")
    public WebElement warningPopUpTCID;

    @FindBy(xpath = "//span[@class='no item']")
    public WebElement bilgilerKydedildi;

    public void selectValidPoliklinik() {
        poliklinik_box.click();
        poliklinik_box.sendKeys("1" + Keys.ENTER);

    }

    public void selectAValidArrivalType() {
        Select select = new Select(gelisSekli_dropDown);
        select.selectByVisibleText("Ayaktan");
    }

    public void clickSaveButton() {
        kaydet_button.click();
    }


    public void selectPoliklinikAsKadinDogum() {
        poliklinik_box.click();
        String kadinDogum = String.valueOf(ReusableMethods.getRandomNumberBetweenRange(149, 152));
        poliklinik_box.sendKeys(kadinDogum + Keys.ENTER);
    }


    public void succesAlert() throws InterruptedException {


        Assert.assertEquals("Tamam", bilgilerKydedildi.getText());
        System.out.println(bilgilerKydedildi.getText());
        hastaNo = hastaNo_box.getAttribute("value");
        kimlikNo = kimlikNo_Box.getAttribute("value");
        soyadi = soyadi_Box.getAttribute("value");
        adi = adi_Box.getAttribute("value");
        Thread.sleep(3000);
        bilgilerKydedildi.click();
        ReusableMethods.waitForClickablility(detayliHastaArama_button, 3).click();


    }


    public void alertSeen() {
        Assert.assertTrue(warningPopUpTCID.isDisplayed());
    }


    public void emergencyAdult() {
        poliklinik_box.click();
        poliklinik_box.sendKeys("3" + Keys.ENTER);
    }

    public void failAlert() {
        Assert.assertNotEquals("Tamam", bilgilerKydedildi.getText());
    }

    @FindBy(id = "TC_KIMLIK_NO")
    public WebElement kimlikNo_Box;

    @FindBy(id = "SOYADI")
    public WebElement soyadi_Box;

    @FindBy(id = "ADI")
    public WebElement adi_Box;


}
