package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.BasePage;
import pages.Hasta_Kayit_Page_E;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HastaKayit_StepDefinitions_E {

    BasePage basePage = new BasePage();
    Actions actions = new Actions(Driver.getDriver());
    Hasta_Kayit_Page_E hasta_kayit_page = new Hasta_Kayit_Page_E();
    Faker faker = new Faker();
    @When("Click the Hasta button")
    public void click_the_hasta_button() {
        basePage.hastaButton.click();
    }
    @When("Enter Kurum, Kurum detay")
    public void enter_kurum_kurum_detay() throws InterruptedException {
        hasta_kayit_page.kurum.sendKeys(ConfigReader.getProperty("kurum"));
        Thread.sleep(1000);
        hasta_kayit_page.kurumDetay.sendKeys(ConfigReader.getProperty("kurum_Detay"));
        Thread.sleep(1000);
    }
    //test1---------------
    @Then("click the Kaydet-F10- button")
    public void click_the_kaydet_f10_button() {
        hasta_kayit_page.ceptelefonu.click();
        hasta_kayit_page.ceptelefonu.sendKeys("05411111458");
        hasta_kayit_page.kaydetButton.click();
    }
    @Then("verify -Hasta Karti Düzenleme - T.C kimlik numarasi bos olamaz ...PROBEL!- message")
    public void verify_hasta_karti_düzenleme_t_c_kimlik_numarasi_bos_olamaz_probel_message() {
        Assert.assertTrue(hasta_kayit_page.HataMassage.isDisplayed());
    }
    //test2--------------
    @Then("select nationality uyruk -ABD \\(Amerika Birleşik D.)-")
    public void selectNationalityUyrukABDAmerikaBirleşikD() {
        Select select = new Select(hasta_kayit_page.uyruguDropdown);
        select.selectByVisibleText("ABD (AMERIKA BIRLEŞİK D.)");
    }
    @And("Verify that -Pasaport ıd- and -pasaport no- are in the page")
    public void verifyThatPasaportIdAndPasaportNoAreInThePage() {
        Assert.assertTrue(hasta_kayit_page.pasaportIdSearchBox.isDisplayed());
        Assert.assertTrue(hasta_kayit_page.pasaportNoSearchBox1.isDisplayed());
        Assert.assertTrue(hasta_kayit_page.pasaportNoSearchBox2.isDisplayed());
    }
    //test3------------------------
    @Then("make patient type SAGLİK TURİZMİ")
    public void makePatientTypeSAGLİKTURİZMİ() throws InterruptedException {
        hasta_kayit_page.hastaTuruButton.click();
        Thread.sleep(3000);
        hasta_kayit_page.saglikTurizimiButton.click();
    }
    @Then("Enter TC no")
    public void enter_tc_no() throws InterruptedException {
        hasta_kayit_page.TCsearchBox.sendKeys("11771511824");
        Thread.sleep(1000);
    }
    @Then("Enter Adi")
    public void enter_adi()throws InterruptedException {
        hasta_kayit_page.adiSearchBox.sendKeys(faker.name().firstName());
    }
    @Then("Enter soyadi")
    public void enter_soyadi()throws InterruptedException {
        hasta_kayit_page.soyadiSearchBox.sendKeys(faker.name().lastName());
        Thread.sleep(3000);
    }
    @Then("Enter dogum tarihi")
    public void enter_dogum_tarihi()throws InterruptedException {
        hasta_kayit_page.dogumTarihiSearchBox.sendKeys("15/08/2023");
        Thread.sleep(4000);
    }
    @Then("Enter cinsiyet")
    public void enter_cinsiyet()throws InterruptedException {
        Select select2 = new Select(hasta_kayit_page.cinsiyetDropdown);
        select2.selectByIndex(1);
        Thread.sleep(1000);
    }
    @Then("Enter ana adi")
    public void enter_ana_adi() throws InterruptedException{
        hasta_kayit_page.anaAdiSearchBox.sendKeys(faker.name().firstName());
        Thread.sleep(1000);
    }
    @Then("Enter baba adi")
    public void enter_baba_adi()throws InterruptedException {
        hasta_kayit_page.babaAdiSearchBox.sendKeys(faker.name().firstName());
    }
    @Then("doğum yeri")
    public void doğum_yeri()throws InterruptedException {
        hasta_kayit_page.dogumYeriSearchBox.sendKeys(faker.address().city());
    }
    @Then("anne tc no")
    public void anne_tc_no() throws InterruptedException{
        hasta_kayit_page.anneTCNoSearchBox.sendKeys("23306127172");
        Thread.sleep(1000);
    }
    @Then("Yeni doğan button click")
    public void yeni_doğan_button_click()throws InterruptedException {
        Thread.sleep(1000);
        org.junit.Assert.assertTrue(hasta_kayit_page.yenidoganCheckBox.isDisplayed());
        Thread.sleep(1000);
        if (!hasta_kayit_page.yenidoganCheckBox.isSelected()){
            hasta_kayit_page.yenidoganCheckBox.click();
        }
    }
    @And("verify the text Bebegin dogum haftasi günü")
    public void verifyTheTextBebeginDogumHaftasiGünü() throws InterruptedException {
        Thread.sleep(1000);
        try {
            org.junit.Assert.assertTrue(hasta_kayit_page.bebeginDogumGunuSearchBox.isDisplayed());
            org.junit.Assert.assertTrue(hasta_kayit_page.bebeginDogumHaftasiSearchBox.isDisplayed());
        }catch (Exception e){
        }
    }
    @And("Bebeğin dogum haftasi gunu enter a week and future days")
    public void bebeğinDogumHaftasiGunuEnterAWeekAndFutureDays() throws InterruptedException {
        Thread.sleep(3000);
        hasta_kayit_page.bebeginDogumHaftasiSearchBox.sendKeys(faker.number().digit());
        hasta_kayit_page.bebeginDogumGunuSearchBox.sendKeys(faker.number().digit());
    }
    @Then("enter mobile number cep telefonu and click sms gönderilebilir")
    public void enter_mobile_number_cep_telefonu_and_click_sms_gönderilebilir() throws InterruptedException {
        Thread.sleep(1000);
        hasta_kayit_page.ceptelefonu.click();
        Thread.sleep(1000);
        hasta_kayit_page.ceptelefonu.sendKeys("5424218774");
        hasta_kayit_page.SMS.click();
    }
    @Then("Click the kaydet f10 box")
    public void click_the_kaydet_f10_box() throws InterruptedException {
        Thread.sleep(7000);
        hasta_kayit_page.kaydetButton.click();
        Assert.assertTrue(hasta_kayit_page.massageVerfy.isDisplayed());
    }
    @Then("Select a valid Poliklinik on Muayene Kayıt Page")
    public void select_a_valid_poliklinik_on_muayene_kayıt_page() {
        ReusableMethods.doubleClick(hasta_kayit_page.poliklinkSearchBox);
        ReusableMethods.doubleClick(hasta_kayit_page.acilPoliklinkButton);
    }
    @And("Select a valid Gelis sekli on Muayene Kayit Page")
    public void selectAValidGelisSekliOnMuayeneKayitPage() {
        Select select = new Select(hasta_kayit_page.gelisNedeni);
        select.selectByVisibleText("Ayaktan");
    }
    @Then("Click Kaydet button on Muayene Kayıt Page")
    public void click_kaydet_button_on_muayene_kayıt_page() {
        hasta_kayit_page.kaydetButton.click();
    }
    @Then("Bilgiler Kaydedildi should be seen on Popup Alert on Muayene Kayıt Page")
    public void bilgiler_kaydedildi_should_be_seen_on_popup_alert_on_muayene_kayıt_page() {
        Assert.assertTrue(hasta_kayit_page.massageVerfy.isDisplayed());
    }
    //test4------------------------
    @Then("select nationality -uyruk- -Almanya-")
    public void select_nationality_uyruk_almanya() {
        Select select3 = new Select(hasta_kayit_page.uyruguDropdown);
        select3.selectByValue("3");
    }
    @Then("Verify that -Tahsis no- and -karne seri no- are in the page")
    public void verify_that_tahsis_no_and_karne_seri_no_are_in_the_page() throws InterruptedException {
        Thread.sleep(2000);
        org.junit.Assert.assertTrue(hasta_kayit_page.tahsisNoSearchBox.isDisplayed());
        org.junit.Assert.assertTrue(hasta_kayit_page.karneSeriNoSearchBox1.isDisplayed());
        org.junit.Assert.assertTrue(hasta_kayit_page.karneSeriNoSearchBox2.isDisplayed());
    }
    //test5---------------------
    @Then("-Anne doğum tarihi- enter a future date")
    public void anne_doğum_tarihi_enter_a_future_date() throws InterruptedException {
        Thread.sleep(2000);
        hasta_kayit_page.anneDogumTarihiSearchBox.click();
        hasta_kayit_page.anneDogumTarihiSearchBox.sendKeys("14/10/2023");
        Thread.sleep(2000);
    }
    @Then("select -Hasta türü- -Kimliksiz hasta-")
    public void select_hasta_türü_kimliksiz_hasta() throws InterruptedException {
        hasta_kayit_page.hastaTuruButton.click();
        Thread.sleep(3000);
        hasta_kayit_page.kimliksizHastaButton.click();
    }
    @Then("Enter -Kişi bilgileri- -TC-,-Adı-,-Soyadı-,-cinsiyet-,-Baba Adı-,-Anne adi-,-Doğum yeri-,-Anne tc-")
    public void enter_kişi_bilgileri_tc_adı_soyadı_cinsiyet_baba_adı_anne_adi_doğum_yeri_anne_tc() throws InterruptedException {
        Thread.sleep(2000);
        hasta_kayit_page.adiSearchBox.sendKeys(faker.name().firstName());
        hasta_kayit_page.soyadiSearchBox.sendKeys(faker.name().lastName());
        Select select = new Select(hasta_kayit_page.cinsiyetDropdown);
        select.selectByIndex(2);
        Thread.sleep(2000);
        hasta_kayit_page.dogumTarihiSearchBox.click();
        Thread.sleep(2000);
        hasta_kayit_page.dogumTarihiSearchBox.sendKeys("15/06/1998");
        Thread.sleep(2000);
        hasta_kayit_page.ceptelefonu.click();
        hasta_kayit_page.ceptelefonu.sendKeys("5427418567");
        Thread.sleep(2000);
        hasta_kayit_page.kaydetButton.click();
    }
    @Then("Hata message verifyy")
    public void hata_message_verifyy() {
        System.out.println(hasta_kayit_page.HataMassage.getText());
        String Expected = hasta_kayit_page.HataMassage.getText();
        String actualErorMassage= "İşlem Başarısız";
        org.junit.Assert.assertEquals(Expected,actualErorMassage);
    }
    //test6---------------
    @Then("click the -Yeni Doğan- button")
    public void click_the_yeni_doğan_button() {
        hasta_kayit_page.yenidoganCheckBox.click();
        org.junit.Assert.assertTrue(hasta_kayit_page.bebeginDogumGunuSearchBox.isDisplayed());
        org.junit.Assert.assertTrue(hasta_kayit_page.bebeginDogumHaftasiSearchBox.isDisplayed());
        hasta_kayit_page.bebeginDogumGunuSearchBox.sendKeys(faker.number().digit());
        hasta_kayit_page.bebeginDogumHaftasiSearchBox.sendKeys(faker.number().digit());
    }
    @Then("Enter -Kişi bilgileri- -TC-,-Adı-,-Soyadı-,-cinsiyet-,-Baba Adi-,-Anne adi-,-Dogum yeri-,-Anne tc-")
    public void enter_kişi_bilgileri_tc_adı_soyadı_cinsiyet_baba_adi_anne_adi_dogum_yeri_anne_tc() throws InterruptedException {
        Thread.sleep(2000);
        hasta_kayit_page.hastaTuruButton.click();
        hasta_kayit_page.kimliksizHastaButton.click();
        Thread.sleep(2000);
        hasta_kayit_page.adiSearchBox.sendKeys(faker.name().firstName());
        hasta_kayit_page.soyadiSearchBox.sendKeys(faker.name().lastName());
        Thread.sleep(2000);
        Select cinsiyet = new Select(hasta_kayit_page.cinsiyetDropdown);
        cinsiyet.selectByIndex(1);
        hasta_kayit_page.ceptelefonu.click();
        hasta_kayit_page.ceptelefonu.sendKeys("5421478956");
        Thread.sleep(3000);
    }
    @Then("-Doğum T.- enter a future date")
    public void doğum_t_enter_a_future_date() throws InterruptedException {
        hasta_kayit_page.dogumTarihiSearchBox.sendKeys("25/09/2024");
        Thread.sleep(4000);
    }
    @Then("-Kaydet- button click")
    public void kaydet_button_click() {
        hasta_kayit_page.kaydetButton.click();
    }
    @Then("-Hata- message verify")
    public void hata_message_verify() {
        System.out.println(hasta_kayit_page.HataMassage.getText());
        String Expected = hasta_kayit_page.HataMassage.getText();
        String actualErorMassage= "İşlem Başarısız";
        org.junit.Assert.assertEquals(Expected,actualErorMassage);
    }
    //test7--------------------
    @Then("Type {int}- in the -İl- box")
    public void type_in_the_il_box(Integer int1) throws InterruptedException {
        ReusableMethods.doubleClick(hasta_kayit_page.ilSearchBox);
        Thread.sleep(2000);
        hasta_kayit_page.ilKoduSearchBox.click();
        Thread.sleep(1000);
        hasta_kayit_page.ilKoduSearchBox.sendKeys("47"+ Keys.ENTER);
        Thread.sleep(5000);
    }
    @Then("Double click the -İlce- box and check the popup")
    public void double_click_the_ilce_box_and_check_the_popup() {
        ReusableMethods.doubleClick(hasta_kayit_page.ilceSearchBox);
    }
    @Then("Verify -oge sayisi\"")
    public void verify_oge_sayisi() {
        System.out.println(hasta_kayit_page.ogeSayisi.getText());
        String expected=  hasta_kayit_page.ogeSayisi.getText();
        String actual = "Sayfa 1 / 1 (11 öğe)";
        org.junit.Assert.assertEquals(expected,actual);
    }
    //test8--------------------
    @Then("select nationality uyruk -ANDORRA-")
    public void select_nationality_uyruk_andorra() {
        Select select = new Select(hasta_kayit_page.uyruguDropdown);
        select.selectByVisibleText("ANDORRA");
    }
    @Then("enter patient type -T.C. SAĞLIK BAKANLIĞI SAĞLIK VE TIP ALANINDA İKİLİ İŞ BİRLİĞİ ANLAŞMALARI KAPSAMINDAKİ HASTALAR-")
    public void enter_patient_type_t_c_sağlık_bakanlığı_sağlık_ve_tıp_alanında_ikili_iş_birliği_anlaşmaları_kapsamındaki_hastalar() {
        hasta_kayit_page.hastaTuruButton.click();
        hasta_kayit_page.hastaTurur3.click();
    }
    @Then("Enter -pasaport no- and -passport id-")
    public void enter_pasaport_no_and_passport_id() throws InterruptedException {
        Thread.sleep(2000);
        hasta_kayit_page.pasaportIdSearchBox.sendKeys("123456");
        hasta_kayit_page.pasaportNoSearchBox1.sendKeys("1234");
        Thread.sleep(2000);
        hasta_kayit_page.pasaportNoSearchBox2.sendKeys("156874");
    }
    @Then("-cinsiyet- enter")
    public void cinsiyet_enter() throws InterruptedException {
        Thread.sleep(1000);
        Select select1 = new Select(hasta_kayit_page.cinsiyetDropdown);
        select1.selectByIndex(2);
    }
    @Then("-cep telefonu- enter")
    public void cep_telefonu_enter() throws InterruptedException {
        hasta_kayit_page.ceptelefonu.click();
        Thread.sleep(2000);
        hasta_kayit_page.ceptelefonu.sendKeys("5421586547");
    }
    @Then("Enter -adi- and -soyadi-")
    public void enter_adi_and_soyadi() {
        hasta_kayit_page.adiSearchBox.sendKeys(faker.name().firstName());
        hasta_kayit_page.soyadiSearchBox.sendKeys(faker.name().lastName());
    }
    @And("Enterr dogum Tarihi")
    public void enterrDogumTarihi() throws InterruptedException {
        Thread.sleep(5000);
        hasta_kayit_page.dogumTarihiSearchBox.sendKeys("14/02/2000");
        Thread.sleep(3000);
    }
    @Then("-işlem başarılı- massage verify")
    public void işlem_başarılı_massage_verify() {
        hasta_kayit_page.kaydetButton.click();
        org.junit.Assert.assertTrue(hasta_kayit_page.massageVerfy.isDisplayed());
        hasta_kayit_page.popupKapatButton.click();
    }
    @Then("-kapat- button click")
    public void kapat_button_click() {
        hasta_kayit_page.KapatButton.click();
    }
    @Then("Poliklinik enter")
    public void poliklinik_enter() {
        hasta_kayit_page.poliklinkSearchBox.sendKeys("2"+Keys.ENTER);
    }
    @Then("select -geliş nedeni-")
    public void select_geliş_nedeni() {
        Select select2 = new Select(hasta_kayit_page.gelisNedeni);
        select2.selectByIndex(5);
    }
    @Then("-kaydett- button click")
    public void kaydett_button_click() {
        hasta_kayit_page.kaydetButton.click();
    }
    @When("-Bilgiler kaydedildi- massage veryfy")
    public void bilgiler_kaydedildi_massage_veryfy() {
        Assert.assertTrue(hasta_kayit_page.massageVerfy.isDisplayed());
    }
    //Test09--------------------
    @Given("click the button Yeni Dogan")
    public void clickTheButtonYeniDogan() {
        hasta_kayit_page.yenidoganCheckBox.click();
    }
    @When("Enter a date beyond {int} days of birth")
    public void enterADateBeyondDaysOfBirth(int arg0) throws InterruptedException {
        Thread.sleep(1000);
        hasta_kayit_page.dogumTarihiSearchBox.click();
        Thread.sleep(3000);
        hasta_kayit_page.dogumTarihiSearchBox.sendKeys("18.06.2023");
        Thread.sleep(5000);
    }
    @And("Enter anne tc no")
    public void enterAnneTcNo() {
        hasta_kayit_page.anneTCNoSearchBox.sendKeys("23306127172");
    }
    @And("Bebegin dogum haftasi and gunu enter")
    public void bebeginDogumHaftasiAndGunuEnter() {
        hasta_kayit_page.bebeginDogumGunuSearchBox.sendKeys("2");
        hasta_kayit_page.bebeginDogumHaftasiSearchBox.sendKeys("3");
    }
    @And("Enter -telefon no-")
    public void enterTelefonNo() throws InterruptedException {
        hasta_kayit_page.ceptelefonu.click();
        hasta_kayit_page.ceptelefonu.sendKeys("05416985423");
        Thread.sleep(2000);
    }
    @And("-Doğum tarihi {int} günü geçmiş hastalar için yenidoğan seçeneği işaretlenemez..!- veryfy")
    public void doğumTarihiGünüGeçmişHastalarIçinYenidoğanSeçeneğiIşaretlenemezVeryfy(int arg0) {
        System.out.println(hasta_kayit_page.massageVerfy.getText());
        String expected = "Doğum tarihi 30 günü geçmiş hastalar için yenidoğan seçeneği işaretlenemez..!";
        String actual = hasta_kayit_page.massageVerfy.getText();
        Assert.assertEquals(expected,actual);
    }


}
