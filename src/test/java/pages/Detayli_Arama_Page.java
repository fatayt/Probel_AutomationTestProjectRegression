package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Detayli_Arama_Page {
           public Detayli_Arama_Page(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
        @FindBy(xpath = "//a[@class='pmkTL  btnDetayliHastaAra']")
        public WebElement DetayliHastaAra;
        @FindBy(xpath = "//div[@class='chck_block marleftpx5']")
        public WebElement SadeceBugunGelis;
        @FindBy(xpath = "(//*[@id=\"PROTOKOL_NO\"])[2]")
        public WebElement ProtocolNo;
        @FindBy(xpath ="//*[@class=\"inpt wpx225\"]")
        public WebElement TCKimlikNo;
        @FindBy(xpath = "//*[@data-col-name=\"HASTA_NO\"]")
        public WebElement HASTANo;
        @FindBy(xpath = "(//*[@id=\"USER_KODU\"])[2]")
        public WebElement Kullanici;
        @FindBy(xpath = "(//*[@id=\"TarihBlock\"]/a)[2]")
        public WebElement YatisTarihi;
        @FindBy(xpath = "(//*[@id=\"TarihBlock\"]/a)[3]")
        public WebElement CikisTarihi;
        @FindBy(xpath = "//*[@id=\"DateRangePicker\"]/div[3]/div[2]/label")
        public WebElement gelecekUcAy;
        @FindBy(xpath = "//*[@id=\"TarihBlock\"]/a[1]")
        public WebElement DetayliTarihSecimi;
        @FindBy(xpath = "//*[@id=\"DateRangePicker\"]/div[2]/div[2]/label")
        public WebElement SonUcAyTarih;
        @FindBy(id="btnSorgula")
        public WebElement SorgulaButton;
        @FindBy(xpath = "//*[@id=\"LISTE_HASTA_GELIS_GECMISI_DXDataRow0\"]/td[2]")
        public WebElement verifyProtocolNo;
        @FindBy(xpath = "//*[@id=\"DateRangePicker\"]/div[2]/div[1]/a")
        public WebElement popupCloseButton;
        @FindBy(xpath = "//*[@id=\"DateRangePicker\"]/div[8]/a")
        public WebElement PopupSecButton;
        @FindBy(id = "LISTE_HASTA_GELIS_GECMISI_DXEmptyRow")
        public WebElement GoruntulenecekVeriYok;
        @FindBy(xpath = "//*[@id=\"LISTE_HASTA_GELIS_GECMISI_tccell0_12\"]/a")
        public WebElement HastaNoSeç;
        @FindBy(xpath = "//*[@id=\"HASTA_NO\"]")
        public WebElement HastaNODğrulama;
        @FindBy(xpath = "//*[@id=\"HastaAramaList_DXFREditorcol0_I\"]")
        public WebElement KullanıcıID;
        @FindBy(xpath = "HastaAramaList_tccell0_2")
        public WebElement KullanıcıSec;
        @FindBy(xpath = "//*[@id=\"LISTE_HASTA_GELIS_GECMISI_DXDataRow0\"]/td[1]")
        public WebElement HastaAdiSoyadi;
        @FindBy(xpath ="//*[@id=\"LISTE_HASTA_GELIS_GECMISI_DXDataRow0\"]/td[1]")
        public WebElement HastaAdıSoyadı;
    }
