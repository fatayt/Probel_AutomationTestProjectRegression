package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import pages.Hasta_Kayit_Page_F;
import utilities.Driver;

public class HastaKayit_StepDefinitions_F {

    BasePage basePage = new BasePage();
    Actions actions = new Actions(Driver.getDriver());
    Hasta_Kayit_Page_F hasta_kayit_page_f = new Hasta_Kayit_Page_F();
    Faker faker = new Faker();

    //---------------------------fatih
    @Given("user selects the Uyruk")
    public void user_selects_the_uyruk() throws InterruptedException {
        hasta_kayit_page_f.uyruguDropdown.sendKeys("ABD (AMERIKA BIRLEŞİK D.)");
        Thread.sleep(1000);

    }

    @Given("user selects the Uyruk as Seysel")
    public void user_selects_the_uyruk_as_seysel() throws InterruptedException {
        hasta_kayit_page_f.uyruguDropdown.sendKeys("SEYSEL");
        Thread.sleep(1000);

    }

    @Given("user selects the Uyruk as Svaziland")
    public void user_selects_the_uyruk_as_svaziland() throws InterruptedException {
        hasta_kayit_page_f.uyruguDropdown.sendKeys("SVAZILAND");
        Thread.sleep(1000);
    }

    @Given("user selects the Uyruk as Almanya")
    public void user_selects_the_uyruk_as_almanya() throws InterruptedException {
        hasta_kayit_page_f.uyruguDropdown.sendKeys("ALMANYA");
        Thread.sleep(1000);
    }

    @Given("user selects the Uyruk as arnavutluk")
    public void user_selects_the_uyruk_as_arnavutluk() {
        hasta_kayit_page_f.uyruguDropdown.sendKeys("ARNAVUTLUK");
    }

    @Given("user selects the Uyruk as ??L?")
    public void user_selects_the_uyruk_as_l() {
        hasta_kayit_page_f.uyruguDropdown.sendKeys("??L?");
    }

    @Given("user click hasta Turu")
    public void user_click_hasta_turu() throws InterruptedException {
        hasta_kayit_page_f.hastaTuruButton.click();
        Thread.sleep(1000);

    }


    @Given("user writes the name of the mother")
    public void user_writes_the_name_of_the_mother() throws InterruptedException {
        hasta_kayit_page_f.anaAdiSearchBox.sendKeys(faker.name().firstName());
        Thread.sleep(1000);

    }

    @Given("user writes the name of the father")
    public void user_writes_the_name_of_the_father() throws InterruptedException {
        hasta_kayit_page_f.babaAdiSearchBox.sendKeys("Ahmet");
        Thread.sleep(1000);

    }

    @Given("user selects the date of birth mother")
    public void user_selects_the_date_of_birth_mother() throws InterruptedException {
        hasta_kayit_page_f.anneDogumTarihiSearchBox.click();
        hasta_kayit_page_f.anneDogumTarihiSearchBox.sendKeys("11.11.2025");
        Thread.sleep(1000);
        hasta_kayit_page_f.dateCloseButton.click();
        Thread.sleep(1000);


    }

    @Given("user writes the place of birth")
    public void user_writes_the_place_of_birth() throws InterruptedException {
        hasta_kayit_page_f.dogumYeriSearchBox.sendKeys("Ankara");
        Thread.sleep(2000);

    }

    @Given("user selects the date of birth")
    public void user_selects_the_date_of_birth() throws InterruptedException {
        hasta_kayit_page_f.dogumTarihiSearchBox.click();
        hasta_kayit_page_f.dogumTarihiSearchBox.sendKeys("01.08.2000");
        hasta_kayit_page_f.dateCloseButton.click();
        Thread.sleep(1000);

    }

    @Given("user selects the date of birth newborn")
    public void user_selects_the_date_of_birth_newborn() throws InterruptedException {
        hasta_kayit_page_f.dogumTarihiSearchBox.click();
        hasta_kayit_page_f.dogumTarihiSearchBox.sendKeys("17.08.2023");
        hasta_kayit_page_f.dateCloseButton.click();
        Thread.sleep(1000);

    }

    @Given("user enters the surname")
    public void user_enters_the_surname() throws InterruptedException {
        hasta_kayit_page_f.soyadiSearchBox.sendKeys("Yilmaz");
        Thread.sleep(1000);

    }

    @Given("enter the user name")
    public void enter_the_user_name() throws InterruptedException {
        hasta_kayit_page_f.adiSearchBox.sendKeys("Semsettin");
        Thread.sleep(1000);

    }

    @Given("user selects the proximity")
    public void user_selects_the_proximity() throws InterruptedException {
        hasta_kayit_page_f.yakinligiDropdown.sendKeys("KENDİSİ");
        Thread.sleep(1000);

    }

    @Given("user selects a gender")
    public void user_selects_a_gender() throws InterruptedException {
        hasta_kayit_page_f.cinsiyetDropdown.sendKeys("ERKEK");
        Thread.sleep(1000);

    }

    @Given("user chooses a marital status")
    public void user_chooses_a_marital_status() throws InterruptedException {
        hasta_kayit_page_f.medeniHaliSearchBox.sendKeys("EVLİ");
        Thread.sleep(1000);

    }

    @Given("user writes Passport Id")
    public void user_writes_passport_ıd() throws InterruptedException {
        hasta_kayit_page_f.pasaportIdSearchBox.sendKeys("12345");
        Thread.sleep(1000);

    }

    @Given("user writes Passport No")
    public void user_writes_passport_no() throws InterruptedException {
        hasta_kayit_page_f.pasaportNoSearchBox1.sendKeys("123");
        hasta_kayit_page_f.pasaportNoSearchBox2.sendKeys("123456");
        Thread.sleep(1000);

    }

    @Given("user enters the mobile phone")
    public void user_enters_the_mobile_phone() throws InterruptedException {
        hasta_kayit_page_f.ceptelefonu.click();
        hasta_kayit_page_f.ceptelefonu.sendKeys("5423456789");
        Thread.sleep(1000);

    }

    @Given("user writes E-mail")
    public void user_writes_e_mail() throws InterruptedException {
        hasta_kayit_page_f.email.sendKeys("test@test.com");
        Thread.sleep(1000);

    }

    @Given("user chooses a profession")
    public void user_chooses_a_profession() throws InterruptedException {
        hasta_kayit_page_f.meslek.sendKeys("55");
        Thread.sleep(1000);

    }

    @Given("user selects the status")
    public void user_selects_the_status() throws InterruptedException {
        hasta_kayit_page_f.statu.sendKeys("NORMAL");
        Thread.sleep(1000);

    }

    @Given("user selects the learning")
    public void user_selects_the_learning() throws InterruptedException {
        hasta_kayit_page_f.ogrenim.sendKeys("Yüksek Öğretim");
        Thread.sleep(1000);

    }

    @Given("user selects the blood type")
    public void user_selects_the_blood_type() throws InterruptedException {
        hasta_kayit_page_f.kangrubu.sendKeys("0 RH+");
        Thread.sleep(1000);

    }

    @Given("user clicks on the save button")
    public void user_clicks_on_the_save_button() throws InterruptedException {
        hasta_kayit_page_f.kaydetButton.click();
        Thread.sleep(1000);

    }

    @Given("user assert the registration")
    public void user_assert_the_registration() {

    }

    @Given("user select multeci kisiler")
    public void user_select_multeci_kisiler() {
        hasta_kayit_page_f.multeci.click();
    }

    @Given("user click Islem Kapat button")
    public void user_click_islem_kapat_button() throws InterruptedException {
        hasta_kayit_page_f.islembasariliClose.click();
        Thread.sleep(1000);
    }

    @Given("user click Kayit Kapat button")
    public void user_click_kayit_kapat_button() {
        hasta_kayit_page_f.kayitClose.click();

    }

    @Given("user select stateless persons")
    public void user_select_stateless_persons() {
        hasta_kayit_page_f.vatansizKisiler.click();

    }

    @Given("user click newborn")
    public void user_click_newborn() {
        hasta_kayit_page_f.yenidoganCheckBox.click();
    }

    @Given("user assert issue message")
    public void user_assert_issue_message() {
        Assert.assertTrue(hasta_kayit_page_f.passaportKimliksizVatansiz.isDisplayed());
    }

    @Given("user select Gelis sekli")
    public void user_selects_gelis_sekli() {
        hasta_kayit_page_f.gelisSekliButton.click();
        hasta_kayit_page_f.gelisSekliAyaktanButton.click();

    }

    @Given("user click Doktor")
    public void user_click_doktor() throws InterruptedException {
        hasta_kayit_page_f.doktorButton.click();
        actions.doubleClick();
        hasta_kayit_page_f.doktorlist.click();
        hasta_kayit_page_f.mainpage.click();
        Thread.sleep(1000);
    }

    @Then("user closes the application")
    public void user_closes_the_application() {
        Driver.closeDriver();
    }

    @Given("user click Kaydet button")
    public void user_click_kaydet_button() throws InterruptedException {
        hasta_kayit_page_f.MuayeneKayit.click();
        Thread.sleep(1000);
    }

    @Given("user click TAMAM button in the popup")
    public void user_click_tamam_button_in_the_popup() throws InterruptedException {
        hasta_kayit_page_f.yetkisizlik.click();
        Thread.sleep(1000);
    }

    @Given("user close the message bilgiler kaydedildi")
    public void user_close_the_message_bilgiler_kaydedildi() {
        hasta_kayit_page_f.muayeneKayitClose.click();
    }

    @Given("user registration verifies")
    public void user_registration_verifies() {

    }

    @Given("user enters the TC number of mother")
    public void user_enters_the_tc_number_of_mother() {
        hasta_kayit_page_f.motherTCnumber.sendKeys("43416048730");
    }

    @Given("user enters the baby birthweek")
    public void user_enters_the_baby_birthweek() {

        hasta_kayit_page_f.babyBirthweek.sendKeys("32");
    }

    @Given("user enters the baby birthday")
    public void user_enters_the_baby_birthday() {

        hasta_kayit_page_f.babyBirthday.sendKeys("3");
    }

    @Given("user click Basvuru sekli")
    public void user_click_basvuru_sekli() {
        hasta_kayit_page_f.basvuruSekliDropdown.click();
    }

    @Given("user select Basvuru sekli")
    public void user_select_basvuru_sekli() {
        hasta_kayit_page_f.basvuruSekliSelect.click();
    }

    @Given("user assert that the options in the list are unique")
    public void user_assert_that_the_options_in_the_list_are_unique() {
        Assert.assertTrue(hasta_kayit_page_f.basvuruSekliSelect.isSelected());
    }

}

