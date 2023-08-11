package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Muayene_Kayit_Page {
    public Muayene_Kayit_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "pageTitle")
    WebElement muayeneKayit_title;

    @FindBy(xpath = "//a[@title='Sorgula(F11)']")
    WebElement sorgu_button;

    @FindBy(id = "protokol_ara")
    WebElement protokolAra_box;

    @FindBy(xpath = "//a[@title='Çalıştır']")
    WebElement calistir_button;

    @FindBy(xpath = "//a[@title='İptal']")
    WebElement iptal_button;

    @FindBy(xpath = "//a[@title='Kaydet(F10)']")
    WebElement kaydet_button;

    @FindBy(xpath = "//a[@title='Yeni(F5)']")
    WebElement yeni_button;

    @FindBy(xpath = "//a[@title='Sil(F8)']")
    WebElement sil_button;

    @FindBy(xpath = "//a[@title='Temizle(F5)']")
    WebElement temizle_button;

    @FindBy(xpath = "//a[@title='Yazdır']")
    WebElement yazdir_button;

    @FindBy(linkText = "Detaylı Hasta Arama")
    WebElement detayliHastaArama_button;

    @FindBy(linkText = "Etiket")
    WebElement etiket_button;

    @FindBy(linkText = "Raporlar")
    WebElement raporlar_button;

    @FindBy(linkText = "Sağlık Kurulu")
    WebElement saglikKurulu_button;

    @FindBy(linkText = "Yardımcı İşlemler")
    WebElement yardimciIslemler_button;

    @FindBy(linkText = "Ris")
    WebElement ris_button;

    @FindBy(linkText = "Lab")
    WebElement lab_button;

    @FindBy(linkText = "Kayıt")
    WebElement kayit_button;

    @FindBy(xpath = "//input[@class='bgGrn']")
    WebElement tcIdNo_box;
    @FindBy(id = "TXT_HASTA_KAYIT_TC_KIMLIK_NO")
    WebElement assert_tcIdNo;

    @FindBy(id = "TXT_HASTA_KAYIT_HASTA_NO")
    WebElement assert_hastaNo;

    @FindBy(xpath = "//a[@class='btnTcDogrulaPop  text_btn text_btn_ok pBtn']")
    WebElement dogrula_button;

    @FindBy(xpath = "//input[@id='HASTA_NO']")
    WebElement hastaNo_box;

    @FindBy(xpath = "//a[@class='btnHastaAraPop wpx50  text_btn text_btn_bul pBtn']")
    WebElement ara_button;

    @FindBy(xpath = "//a[@title='Hasta Kayıt(F6)']")
    WebElement hasta_button;

    @FindBy(xpath = "//a[@class='PopupCloseButton PopupButton']")
    WebElement closeHastaKayit_button;

    @FindBy(xpath = "(//input[@class='inpt tacnt wpx50'])[1]")
    WebElement poliklinik_box;

    @FindBy(xpath = "(//input[@class='inpt tacnt wpx50'])[2]")
    WebElement doktor_box;

    @FindBy(xpath = "(//input[@class='inpt tacnt wpx50'])[3]")
    WebElement asistan_box;

    @FindBy(xpath = "(//input[@class='inpt wpx50 tacnt'])[2]")
    WebElement cgrTipiNo_box;

        // TODO: Gelişine Ait Bilgiler Section

    @FindBy(xpath = "//label[@data-target='pGelis']")
    WebElement gelisineAitBilgiler_section;

    @FindBy(id = "PROTOKOL_NO")
    WebElement protokolNo_box;

    @FindBy(id = "KIMLIK_KONTROL")
    WebElement kimlikKontrol_checkBox;

    @FindBy(id = "KIMLIK_FOTOKOPISI")
    WebElement kimlikFotokopisi_checkBox;

    @FindBy(id = "HES_DOGRULAMA")
    WebElement hesKoduDogrula_checkBox;

    @FindBy(id = "ANA_KURUM_KODU")
    WebElement kurumu_box;

    @FindBy(id = "ALT_KURUM_KODU")
    WebElement kurumDetayi_box;

    @FindBy(id = "ADLI_VAKA")
    WebElement hakSahTipi_dropDown;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[1]")
    WebElement bransi_box;

    @FindBy(id = "GSS_SORGU_TURU")
    WebElement tedaviTipi_dropDown;

    @FindBy(id = "GSS_TAKIP_NO")
    WebElement gssIlkTakip_box;

    @FindBy(xpath = "//a[@class='btnTakipAra text_btn_bul text_btn  pBtn']")
    WebElement takipAra_button;

    @FindBy(xpath = "//a[@class='btnHakSah text_btn_devam text_btn  pBtn']")
    WebElement hakSahipligi_button;

    @FindBy(id = "btnfGSS_C00Ac")
    WebElement gssC00_button;

    @FindBy(id = "GELIS_SEKLI_KODU")
    WebElement gelisSekli_dropDown;

    @FindBy(id = "DOSYA_ISTEM")
    WebElement dosyaIstem_checkBox;

    @FindBy(id = "SAGLIK_KURULU_SEVK")
    WebElement saglikKuruluSevk_checkBox;

    @FindBy(id = "CARI_BEKLENECEK_TARIH")
    WebElement cariBekTarih_calender;


        // TODO: Kabul Bilgileri Section

    @FindBy(xpath = "//label[@data-target='pKabul']")
    WebElement kabulBilgileri_section;

    @FindBy(id = "KABUL_SEKLI_ID")
    WebElement kabulSekli_dropDown;

    @FindBy(id = "BASVURU_NEDEN_ID")
    WebElement basvuruNedeni_dropDown;

    @FindBy(id = "BASVURU_NEDEN_ACIKLAMA")
    WebElement basvuruNedenAciklama_dropDown;

    @FindBy(id = "TERCIH_NEDEN_ID")
    WebElement tercihNedeni_dropDown;

    @FindBy(id = "YAKINMA_SIKAYET")
    WebElement yakinmaSikayet_box;

    @FindBy(xpath = "//input[@class='inpt wpx75 tacnt']")
    WebElement yakinlik_box;

    @FindBy(id = "YAKIN_TC_NO")
    WebElement yakinTCNo_box;

    @FindBy(id = "YAKIN_DOGUM_TARIHI")
    WebElement yakinDogumTarihi_box;

    @FindBy(id = "YAKIN_ADI_SOYADI")
    WebElement yakinAdSoyad_box;

    @FindBy(id = "YAKIN_CEP_TEL")
    WebElement yakinTelNo_box;

    @FindBy(id = "YAKIN_PASAPORT_NO")
    WebElement yakinPasaportNo_box;

    @FindBy(id = "YAKIN_EMAIL")
    WebElement yakinEPosta_box;

    @FindBy(id = "YAKIN_ADRES")
    WebElement yakinAdres_box;

    @FindBy(xpath = "//a[@class='btnYakinTcDogrula  text_btn text_btn_ok pBtn']")
    WebElement aktar_button;

    @FindBy(id = "YAKIN_ONAM_DURUM_1")
    WebElement alindi_radioButton;

    @FindBy(id = "YAKIN_ONAM_DURUM_2")
    WebElement alinmadi_radioButton;

    @FindBy(id = "PANSUMAN")
    WebElement pansuman_box;

    @FindBy(id = "KIMLIKSIZ")
    WebElement kimlikYaninda_box;

    @FindBy(id = "RECETE_HASTASI")
    WebElement receteIcinGeldi_box;

    @FindBy(id = "ENGEL_DURUMU")
    WebElement engelDurumu_dropDown;

    @FindBy(id = "SOSYAL_DESTEK")
    WebElement sosyalDestek_dropDown;

    @FindBy(id = "IHTIYAC_DEGERLENDIRME")
    WebElement ihtiyacDegerlendirme_dropDown;

    @FindBy(xpath = "//a[@class='btnPolMuayeneDetayTanim   text_btn_border pBtn']")
    WebElement kabulBilgileriTanim_button;

    @FindBy(xpath = "//a[@class='btnYabanciHastaKayit   text_btn_border pBtn']")
    WebElement yabanciHastaKayitFormu_button;


    @FindBy(xpath = "//label[@data-target='pHesap']")
    WebElement hesap_section;

    @FindBy(xpath = "//label[@data-target='pAvans']")
    WebElement avans_section;

    @FindBy(id = "TELEFON")
    WebElement phone;

    @FindBy(xpath = "//div[@class='alertText']")
    WebElement warningPopUpTCID;
}
