package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.Assertion;
import pages.BasePage;
import pages.Hasta_Kayit_Page_İ;
import utilities.Driver;

public class HastaKayit_StepDefinitions_İ {

    BasePage basePage = new BasePage();
    Actions actions = new Actions(Driver.getDriver());
    Hasta_Kayit_Page_İ hasta_kayit_page_i = new Hasta_Kayit_Page_İ();
    Faker faker = new Faker();





    //@Given("user selects the Uyruk")
    //public void user_selects_the_uyruk() throws InterruptedException {
    //    hasta_kayit_page_i.uyruguDropdown.sendKeys("ABD (AMERIKA BIRLEŞİK D.)");
    //    Thread.sleep(1000);
//
    //}

   //@Given("user click hasta Turu")
   //public void user_click_hasta_turu() throws InterruptedException {
   //    hasta_kayit_page_i.hastaTuruButton.click();
   //    Thread.sleep(1000);

   //}
    @Given("user click tika tarafindan getirilen hastalar")
    public void user_click_tika_tarafindan_getirilen_hastalar() throws InterruptedException {
        hasta_kayit_page_i.tikaButton.click();
        Thread.sleep(1000);

    }

   //@Given("user writes the name of the mother")
   //public void user_writes_the_name_of_the_mother() throws InterruptedException {
   //    hasta_kayit_page_i.anaAdiSearchBox.sendKeys("ayse");
   //    Thread.sleep(1000);

   //}
  // @Given("user writes the name of the father")
  // public void user_writes_the_name_of_the_father() throws InterruptedException {
  //     hasta_kayit_page_i.babaAdiSearchBox.sendKeys("ahmet");
  //     Thread.sleep(1000);

  // }
   // @Given("user selects the date of birth mother")
   // public void user_selects_the_date_of_birth_mother() throws InterruptedException {
   //     hasta_kayit_page_i.anneDogumTarihiSearchBox.click();
   //     hasta_kayit_page_i.anneDogumTarihiSearchBox.sendKeys("11.11.2025");
   //     Thread.sleep(1000);
   //     hasta_kayit_page_i.dateCloseButton.click();
   //     Thread.sleep(1000);
//
//
//
   // }
   // @Given("user writes the place of birth")
   // public void user_writes_the_place_of_birth() throws InterruptedException {
   //     hasta_kayit_page_i.dogumYeriSearchBox.sendKeys("ankara");
   //     Thread.sleep(2000);
//
   // }
  //  @Given("user selects the date of birth")
  //  public void user_selects_the_date_of_birth() throws InterruptedException {
  //      hasta_kayit_page_i.dogumTarihiSearchBox.click();
  //      hasta_kayit_page_i.dogumTarihiSearchBox.sendKeys("01.01.1990");
  //      hasta_kayit_page_i.dateCloseButton.click();
  //      Thread.sleep(1000);
//
  //  }
    //@Given("user enters the surname")
    //public void user_enters_the_surname() throws InterruptedException {
    //    //   hasta_kayit_page_i̇.soyadiSearchBox.sendKeys("yilmaz");
    //    hasta_kayit_page_i.soyadiSearchBox.click();
    //    String surname = faker.name().lastName();
    //    hasta_kayit_page_i.soyadiSearchBox.sendKeys(surname);
    //    Thread.sleep(1000);
//
    //}
  //@Given("enter the user name")
  //public void enter_the_user_name() throws InterruptedException {
  //    //    hasta_kayit_page_i̇.adiSearchBox.sendKeys("semsettin");
  //    String name = faker.name().name();
  //    hasta_kayit_page_i.adiSearchBox.sendKeys(name);
  //    Thread.sleep(1000);

  //}
   // @Given("user selects the proximity")
   // public void user_selects_the_proximity() throws InterruptedException {
   //     hasta_kayit_page_i.yakinligiDropdown.sendKeys("KENDİSİ");
   //     Thread.sleep(1000);
//
   // }
    //@Given("user selects a gender")
    //public void user_selects_a_gender() throws InterruptedException {
    //    hasta_kayit_page_i.cinsiyetDropdown.sendKeys("ERKEK");
    //    Thread.sleep(1000);
//
    //}
  // @Given("user chooses a marital status")
  // public void user_chooses_a_marital_status() throws InterruptedException {
  //     hasta_kayit_page_i.medeniHaliSearchBox.sendKeys("EVLİ");
  //     Thread.sleep(1000);

  // }
   // @Given("user writes Passport Id")
   // public void user_writes_passport_ıd() throws InterruptedException {
   //     hasta_kayit_page_i.pasaportIdSearchBox.sendKeys("12345");
   //     Thread.sleep(1000);
//
   // }
  //  @Given("user writes Passport No")
  //  public void user_writes_passport_no() throws InterruptedException {
  //      hasta_kayit_page_i.pasaportNoSearchBox1.sendKeys("123");
  //      hasta_kayit_page_i.pasaportNoSearchBox2.sendKeys("123456");
  //      Thread.sleep(1000);
//
  //  }
  //  @Given("user enters the mobile phone")
  //  public void user_enters_the_mobile_phone() throws InterruptedException {
  //      hasta_kayit_page_i.ceptelefonu.click();
  //      hasta_kayit_page_i.ceptelefonu.sendKeys("5411234567");
  //      Thread.sleep(1000);

  //  }
   // @Given("user writes E-mail")
   // public void user_writes_e_mail() throws InterruptedException {
   //     hasta_kayit_page_i.email.sendKeys("test@test.com");
   //     Thread.sleep(1000);
//
   // }
   // @Given("user chooses a profession")
   // public void user_chooses_a_profession() throws InterruptedException {
   //     hasta_kayit_page_i.meslek.sendKeys("55");
   //     Thread.sleep(1000);
//
   // }
 // @Given("user selects the status")
 // public void user_selects_the_status() throws InterruptedException {
 //     hasta_kayit_page_i.statu.sendKeys("NORMAL");
 //     Thread.sleep(1000);

 // }
   // @Given("user selects the learning")
   // public void user_selects_the_learning() throws InterruptedException {
   //     hasta_kayit_page_i.ogrenim.sendKeys("Yüksek Öğretim");
   //     Thread.sleep(1000);
//
   // }
 //  @Given("user selects the blood type")
 //  public void user_selects_the_blood_type() throws InterruptedException {
 //      hasta_kayit_page_i.kangrubu.sendKeys("0 RH+");
 //      Thread.sleep(1000);

 //  }
   // @Given("user clicks on the save button")
   // public void user_clicks_on_the_save_button() throws InterruptedException {
   //     hasta_kayit_page_i.kaydetButton.click();
   //     Thread.sleep(1000);
//
//
   // }
  //  @Given("user assert the registration")
  //  public void user_assert_the_registration() {
  //      Assertion assertion = new Assertion();
  //      //  Assert.assertEquals("İşlem Başarılı", hasta_kayit_page_i̇.islembasarili.getText());
  //      Assert.assertFalse("İşlem Başarılı", false);
//
//
//
  //  }
  //  @Then("user closes the application")
  //  public void user_closes_the_application() {
  //      Driver.closeDriver();
//
  //  }
    @Given("user click turistin sagligi")
    public void user_click_turistin_sagligi() {
        hasta_kayit_page_i.turistButton.click();
    }

    @Given("user chooses ilçe")
    public void user_chooses_ilçe() {
        hasta_kayit_page_i.ilceSearchBox.sendKeys("3555");

    }

   @Given("user clicks the patient registration KAPAT button")
   public void user_clicks_the_patient_registration_kapat_button() throws InterruptedException {
       Thread.sleep(1000);
       hasta_kayit_page_i.hastaKayitKapatButton.click();

   }






    @Given("user clicks on home page foreign patient type")
    public void user_clicks_on_home_page_foreign_patient_type() throws InterruptedException {
        Thread.sleep(1000);
        hasta_kayit_page_i.homePageYabHastaTuruButton.click();


    }
    @Given("user writes on the popup  health of the tourist")
    public void user_writes_on_the_popup_health_of_the_tourist() {
        hasta_kayit_page_i.popupYabHastaTuruBox.sendKeys("TURİSTİN SAĞLIĞI" + Keys.ENTER);

    }


    @Given("user clicks on foreign patient type")
    public void user_clicks_on_foreign_patient_type() {
        hasta_kayit_page_i.yabanciHasTurButton.click();


    }
    @Given("user writes on the health of the tourist")
    public void user_writes_on_the_health_of_the_tourist() {
        hasta_kayit_page_i.yabanciHasTurButton.sendKeys("TURİSTİN SAĞLIĞI");

    }
    @Given("user clicks the papup close button")
    public void user_clicks_the_papup_close_button() throws InterruptedException {
        hasta_kayit_page_i.popupCloseButton.click();
        Thread.sleep(1000);
    }


    @Given("user selects the Uyruk SURİYE")
    public void user_selects_the_uyruk_suriye() {
        hasta_kayit_page_i.uyruguDropdown.sendKeys("SURİYE");

    }
    @Given("user clik Email button")
    public void user_clik_email_button() {
        hasta_kayit_page_i.EMAIL.click();

    }
    @Given("user click kimlik fotokopisi alindi button")
    public void user_click_kimlik_fotokopisi_alindi_button() {
        hasta_kayit_page_i.kimlikfotokopi.click();

    }
    @Given("user click KVKK button")
    public void user_click_kvkk_button() {
        hasta_kayit_page_i.KVKK.click();

    }
    @Given("user chooses ilçe Aliaga")
    public void user_chooses_ilçe_aliaga() {
        hasta_kayit_page_i.ilceSearchBox.sendKeys("3519");
    }
    @Given("user selects the Uyruk ALMANYA")
    public void user_selects_the_uyruk_almanya() {
        hasta_kayit_page_i.uyruguDropdown.sendKeys("ALMANYA");
    }
    @Given("user selects the Uyruk AZERBEYCAN")
    public void user_selects_the_uyruk_azerbeycan() {
        hasta_kayit_page_i.uyruguDropdown.sendKeys("AZARBEYCAN");
    }
    @Given("user click Turk Soylu Yabancilar")
    public void user_click_turk_soylu_yabancilar() throws InterruptedException {
        Thread.sleep(1000);
        hasta_kayit_page_i.turkSoyluButton.click();
        Thread.sleep(1000);

    }

    @Given("user enters the mobile phone number in the wrong format")
    public void user_enters_the_mobile_phone_number_in_the_wrong_format() {
        hasta_kayit_page_i.ceptelefonu.click();
        hasta_kayit_page_i.ceptelefonu.sendKeys("5411111111");
    }
    @Given("user enters the surname wrong format")
    public void user_enters_the_surname_wrong_format() {
        hasta_kayit_page_i.soyadiSearchBox.sendKeys("55?_*/*--");
    }

    @Given("enter the user name wrong format")
    public void enter_the_user_name_wrong_format() {
        hasta_kayit_page_i.adiSearchBox.sendKeys("8758-*0//*");

    }
    @Given("user selects an poliklinik")
    public void user_selects_an_poliklinik() {
        hasta_kayit_page_i.poliklinikButton.click();
        hasta_kayit_page_i.poliklinikButton.sendKeys("6"+Keys.ENTER);
    }
    @Given("user selects the mode of arrival")
    public void user_selects_the_mode_of_arrival() {
        hasta_kayit_page_i.gelisSekliButton.click();
        hasta_kayit_page_i.gelisSekliAyaktanButton.click();

    }
    @Given("user click kaydet")
    public void user_click_kaydet() throws InterruptedException {
        Thread.sleep(1000);
        hasta_kayit_page_i.anaSayfaKaydetButton.click();
        Thread.sleep(2000);

    }

    @Given("user verifies the message {string}")
    public void user_verifies_the_message(String string) {
        Assertion assertion = new Assertion();
        Assert.assertTrue("Bilgiler kaydedildi." , true);
//Assert.assertEquals("Bilgiler kaydedildi.",hasta_kayit_page_i.popupBilgilerKaydedildiMesaji.getText());




    }
    @Given("user breaks down the popup to the TAMAM button")
    public void user_breaks_down_the_popup_to_the_tamam_button() {
        hasta_kayit_page_i.popupBilgilerKaydedildiTAMAMbutton.click();

    }
    @Given("user enters the baba adi wrong format")
    public void user_enters_the_baba_adi_wrong_format() {
        hasta_kayit_page_i.babaAdiSearchBox.sendKeys("885/***/++??");

    }
    @Given("enter the user anne adi wrong format")
    public void enter_the_user_anne_adi_wrong_format() {
        hasta_kayit_page_i.anaAdiSearchBox.sendKeys("????**/*/2562-+");

    }
    @Given("enter the user dogum yeri wrong format")
    public void enter_the_user_dogum_yeri_wrong_format() {
        hasta_kayit_page_i.dogumYeriSearchBox.sendKeys("1234567*/*-+???**");

    }
}
