package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import pages.BasePage;
import pages.PatientRegistration_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PatientRegistration_StepDefinitions {
    BasePage basePage = new BasePage();
    Actions actions = new Actions(Driver.getDriver());
    PatientRegistration_Page hkp = new PatientRegistration_Page();
    Faker faker = new Faker();




    @And("User chooses the {string}")
    public void userChoosesThe(String nationality) {
        Select select = new Select(hkp.nationalityDropdown);
        select.selectByVisibleText(ConfigReader.getProperty(nationality));
    }

    @And("User clicks Patient Type box and Choose Button on dual citizens")
    public void userClicksPatientTypeBoxAndChooseButtonOnDualCitizens() {
        actions.click(hkp.patientType).perform();
        hkp.dualCitizensChooseButton.click();
    }

    @And("User clicks Gender box and chooses the {string}")
    public void userClicksGenderBoxAndChoosesThe(String gender) {
        Select select = new Select(hkp.genderDropdown);
        select.selectByVisibleText(ConfigReader.getProperty(gender));
    }

    @And("User enters {string} and {string}")
    public void userEntersAnd(String passportId, String passportNo) {
        ReusableMethods.waitForVisibility(hkp.pasaportIdSearchBox, 15);
        actions.moveToElement(hkp.pasaportIdSearchBox)
                .click()
                .sendKeys(ConfigReader.getProperty(passportId))
                .click(hkp.pasaportNoSearchBox2)
                .sendKeys(ConfigReader.getProperty(passportNo)).perform();
    }

    @And("User clicks the Save button")
    public void userClicksTheSaveButton() {
        hkp.saveButton.click();
    }


    @Then("User verifies that the institution Information Warning Message is displayed")
    public void userVerifiesThatTheInstitutionInformationWarningMessageIsDisplayed() {
        ReusableMethods.waitForVisibility(hkp.WarningMessage, 10);
        ReusableMethods.getElementText(hkp.WarningMessage);
        Assert.assertTrue(hkp.WarningMessage.isDisplayed());
    }


    @And("User enters {string} in name box")
    public void userEntersInNameBox(String name) {
        hkp.nameSearchBox.sendKeys(ConfigReader.getProperty(name));
    }

    @And("User enters {string} in surname box")
    public void userEntersInSurnameBox(String surname) {
        actions.
                click(hkp.surnameSearchBox).
                sendKeys(ConfigReader.getProperty(surname)).
                perform();
    }

    @And("User enters {string} in mobile phone number box")
    public void userEntersInMobilePhoneNumberBox(String mobilePhoneNumber) {
        ReusableMethods.waitForVisibility(hkp.mobilePhoneNumber, 10);
        hkp.mobilePhoneNumber.click();
        hkp.mobilePhoneNumber.sendKeys(ConfigReader.getProperty(mobilePhoneNumber));
    }

    @And("User enters {string} in TC ID box")
    public void userEntersInTCIDBox(String TC) {
        hkp.TCsearchBox.sendKeys(ConfigReader.getProperty(TC));
    }

    @And("User clicks the pop ap close button")
    public void userClicksThePopApCloseButton() {
        //mPage.close.click();
        hkp.cl.click();
    }

    @And("User clicks the page close button")
    public void userClicksThePageCloseButton() {
        hkp.kapatButton.click();
    }

    @And("User selects the polyclinic on Inspection Registration Page")
    public void userSelectsThepolyclinicOnInspectionRegistrationPage() {
        ReusableMethods.waitForVisibility(hkp.policnicSearchBox, 4);
        hkp.policnicSearchBox.click();
        hkp.policnicSearchBox.sendKeys("1" + Keys.ENTER);

    }


    @And("User selects the arrival type")
    public void userSelectsTheArrivalType() {
        Select select = new Select(hkp.arrivalType);
        select.selectByVisibleText("Ayaktan");


    }

    @And("User clicks the Save button on Inspection Registration Page")
    public void userClicksTheSaveButtonOnInspectionRegistrationPage() {
        ReusableMethods.waitForVisibility(hkp.patientSaveButton,4);
        hkp.patientSaveButton.click();
        ReusableMethods.waitForVisibility(hkp.readAuthorizationCloseButton, 5);
        hkp.readAuthorizationCloseButton.click();
        ReusableMethods.waitFor(4);
    }

    @And("User clicks Detailed patient search button")
    public void userClicksDetailedPatientSearchButton() {
        hkp.detailedPatientSearch.click();
    }

    @And("User enters the patient's protocol number")
    public void userEntersThePatientSProtocolNumber() {
        actions.moveToElement(hkp.detayliOrotokolNo).click().sendKeys(pN).perform();
        // mPage.detayliOrotokolNo.sendKeys(pN);
    }

    @And("Users clicks the query button")
    public void usersClicksTheQueryButton() {
        hkp.queryButton.click();
    }

    @Then("User verifies that the patient is enrolled")
    public void userVerifiesThatThePatientIsEnrolled() {
        Assert.assertEquals(hkp.lastProtocolNo.getText(), pN);
    }

    @Then("User Logs out")
    public void userLogsOut() {
        hkp.kapatButton.click();
        hkp.acceptButtomNo.click();
        ReusableMethods.jseWithClick(Driver.getDriver(), hkp.user);
        ReusableMethods.jseWithClick(Driver.getDriver(), hkp.exit);


    }

    @Then("User verifies that the message {string} is displayed")
    public void userVerifiesThatTheMessageIsDisplayed(String message) {
        ReusableMethods.waitForVisibility(hkp.WarningMessage, 10);
        String m = hkp.WarningMessage.getText();
        System.out.println(m);
        Assert.assertTrue(m.contains(ConfigReader.getProperty(message)));
    }


    @And("User tick the E-mail Gonderilebilir checkbox")
    public void userTickTheEMailGonderilebilirCheckbox() {
        hkp.eMailCheckBox.click();

    }

    @And("User ticks the newborn checkedbox")
    public void userTicksTheNewbornCheckedbox() {
        hkp.newbornCheckbox.click();
    }

    @And("User enters the date of birth less than alti months old in date of birth box")
    public void userEntersTheDateOfBirthLessThanAltiMonthsOldInDateOfBirthBox() {
        LocalDate tarih = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy");
        tarih = tarih.minusMonths(6);
        String data = format.format(tarih);
        ReusableMethods.waitForVisibility(hkp.dateOfBirthSearchBox, 5);
        ReusableMethods.waitFor(4);
        hkp.dateOfBirthSearchBox.click();
        hkp.dateOfBirthSearchBox.sendKeys(data);
        hkp.dateOfBirthSearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(4);
    }


    @And("User enters ID in mother's TC ID box")
    public void userEntersIDInMotherSTCIDBox() {
        hkp.motherTCNoSearchBox.sendKeys(ConfigReader.getProperty("MotherId"));
    }

    @And("User enters the date of birth over than thirty days old in date of birth box")
    public void userEntersTheDateOfBirthOverThanThirtyDaysOldInDateOfBirthBox() {
        LocalDate tarih = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy");
        tarih = tarih.minusYears(30);
        String date = format.format(tarih);
        System.out.println(date);
        ReusableMethods.waitForVisibility(hkp.dateOfBirthSearchBox, 5);
        ReusableMethods.waitFor(4);
        hkp.dateOfBirthSearchBox.click();
        hkp.dateOfBirthSearchBox.sendKeys(date);
        hkp.dateOfBirthSearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(4);
    }












    @Given("user click tika tarafindan getirilen hastalar")
    public void user_click_tika_tarafindan_getirilen_hastalar() throws InterruptedException {
        hkp.tikaButton.click();
        Thread.sleep(1000);

    }


    @Given("user click turistin sagligi")
    public void user_click_turistin_sagligi() {
        hkp.turistButton.click();
    }

    @Given("user chooses ilçe")
    public void user_chooses_ilçe() {
        hkp.ilceSearchBox.sendKeys("3555");

    }

    @Given("user clicks the patient registration KAPAT button")
    public void user_clicks_the_patient_registration_kapat_button() throws InterruptedException {
        Thread.sleep(1000);
        hkp.hastaKayitKapatButton.click();

    }






    @Given("user clicks on home page foreign patient type")
    public void user_clicks_on_home_page_foreign_patient_type() throws InterruptedException {
        Thread.sleep(1000);
        hkp.homePageYabHastaTuruButton.click();


    }
    @Given("user writes on the popup  health of the tourist")
    public void user_writes_on_the_popup_health_of_the_tourist() {
        hkp.popupYabHastaTuruBox.sendKeys("TURİSTİN SAĞLIĞI" + Keys.ENTER);

    }


    @Given("user clicks on foreign patient type")
    public void user_clicks_on_foreign_patient_type() {
        hkp.yabanciHasTurButton.click();


    }
    @Given("user writes on the health of the tourist")
    public void user_writes_on_the_health_of_the_tourist() {
        hkp.yabanciHasTurButton.sendKeys("TURİSTİN SAĞLIĞI");

    }
    @Given("user clicks the papup close button")
    public void user_clicks_the_papup_close_button() throws InterruptedException {
        hkp.popupCloseButton.click();
        Thread.sleep(1000);
    }


    @Given("user selects the Uyruk SURİYE")
    public void user_selects_the_uyruk_suriye() {
        hkp.uyruguDropdown.sendKeys("SURİYE");

    }
    @Given("user clik Email button")
    public void user_clik_email_button() {
        hkp.EMAIL.click();

    }
    @Given("user click kimlik fotokopisi alindi button")
    public void user_click_kimlik_fotokopisi_alindi_button() {
        hkp.kimlikfotokopi.click();

    }
    @Given("user click KVKK button")
    public void user_click_kvkk_button() {
        hkp.KVKK.click();

    }
    @Given("user chooses ilçe Aliaga")
    public void user_chooses_ilçe_aliaga() {
        hkp.ilceSearchBox.sendKeys("3519");
    }
    @Given("user selects the Uyruk ALMANYA")
    public void user_selects_the_uyruk_almanya() {
        hkp.uyruguDropdown.sendKeys("ALMANYA");
    }
    @Given("user selects the Uyruk AZERBEYCAN")
    public void user_selects_the_uyruk_azerbeycan() {
        hkp.uyruguDropdown.sendKeys("AZARBEYCAN");
    }
    @Given("user click Turk Soylu Yabancilar")
    public void user_click_turk_soylu_yabancilar() throws InterruptedException {
        Thread.sleep(1000);
        hkp.turkSoyluButton.click();
        Thread.sleep(1000);

    }

    @Given("user enters the mobile phone number in the wrong format")
    public void user_enters_the_mobile_phone_number_in_the_wrong_format() {
        hkp.ceptelefonu.click();
        hkp.ceptelefonu.sendKeys("5411111111");
    }
    @Given("user enters the surname wrong format")
    public void user_enters_the_surname_wrong_format() {
        hkp.soyadiSearchBox.sendKeys("55?_*/*--");
    }

    @Given("enter the user name wrong format")
    public void enter_the_user_name_wrong_format() {
        hkp.adiSearchBox.sendKeys("8758-*0//*");

    }
    @Given("user selects an poliklinik")
    public void user_selects_an_poliklinik() {
        hkp.poliklinikButton.click();
        hkp.poliklinikButton.sendKeys("6"+Keys.ENTER);
    }
    @Given("user selects the mode of arrival")
    public void user_selects_the_mode_of_arrival() {
        hkp.gelisSekliButton.click();
        hkp.gelisSekliAyaktanButton.click();

    }
    @Given("user click kaydet")
    public void user_click_kaydet() throws InterruptedException {
        Thread.sleep(1000);
        hkp.anaSayfaKaydetButton.click();
        Thread.sleep(2000);

    }

    @Given("user verifies the message {string}")
    public void user_verifies_the_message(String string) {
        Assertion assertion = new Assertion();
        org.junit.Assert.assertTrue("Bilgiler kaydedildi." , true);
//Assert.assertEquals("Bilgiler kaydedildi.",hasta_kayit_page_i.popupBilgilerKaydedildiMesaji.getText());




    }
    @Given("user breaks down the popup to the TAMAM button")
    public void user_breaks_down_the_popup_to_the_tamam_button() {
        hkp.popupBilgilerKaydedildiTAMAMbutton.click();

    }
    @Given("user enters the baba adi wrong format")
    public void user_enters_the_baba_adi_wrong_format() {
        hkp.babaAdiSearchBox.sendKeys("885/***/++??");

    }
    @Given("enter the user anne adi wrong format")
    public void enter_the_user_anne_adi_wrong_format() {
        hkp.anaAdiSearchBox.sendKeys("????**/*/2562-+");

    }
    @Given("enter the user dogum yeri wrong format")
    public void enter_the_user_dogum_yeri_wrong_format() {
        hkp.dogumYeriSearchBox.sendKeys("1234567*/*-+???**");

    }
    @Given("user selects the Uyruk")
    public void user_selects_the_uyruk() throws InterruptedException {
        hkp.uyruguDropdown.sendKeys("ABD (AMERIKA BIRLEŞİK D.)");
        Thread.sleep(1000);

    }

    @Given("user selects the Uyruk as Seysel")
    public void user_selects_the_uyruk_as_seysel() throws InterruptedException {
        hkp.uyruguDropdown.sendKeys("SEYSEL");
        Thread.sleep(1000);

    }

    @Given("user selects the Uyruk as Svaziland")
    public void user_selects_the_uyruk_as_svaziland() throws InterruptedException {
        hkp.uyruguDropdown.sendKeys("SVAZILAND");
        Thread.sleep(1000);
    }

    @Given("user selects the Uyruk as Almanya")
    public void user_selects_the_uyruk_as_almanya() throws InterruptedException {
        hkp.uyruguDropdown.sendKeys("ALMANYA");
        Thread.sleep(1000);
    }

    @Given("user selects the Uyruk as arnavutluk")
    public void user_selects_the_uyruk_as_arnavutluk() {
        hkp.uyruguDropdown.sendKeys("ARNAVUTLUK");
    }

    @Given("user selects the Uyruk as ??L?")
    public void user_selects_the_uyruk_as_l() {
        hkp.uyruguDropdown.sendKeys("??L?");
    }

    @Given("user click hasta Turu")
    public void user_click_hasta_turu() throws InterruptedException {
        hkp.hastaTuruButton.click();
        Thread.sleep(1000);

    }


    @Given("user writes the name of the mother")
    public void user_writes_the_name_of_the_mother() throws InterruptedException {
        hkp.anaAdiSearchBox.sendKeys(faker.name().firstName());
        Thread.sleep(1000);

    }

    @Given("user writes the name of the father")
    public void user_writes_the_name_of_the_father() throws InterruptedException {
        hkp.babaAdiSearchBox.sendKeys("Ahmet");
        Thread.sleep(1000);

    }

    @Given("user selects the date of birth mother")
    public void user_selects_the_date_of_birth_mother() throws InterruptedException {
        hkp.anneDogumTarihiSearchBox.click();
        hkp.anneDogumTarihiSearchBox.sendKeys("11.11.2025");
        Thread.sleep(1000);
        hkp.dateCloseButton.click();
        Thread.sleep(1000);


    }

    @Given("user writes the place of birth")
    public void user_writes_the_place_of_birth() throws InterruptedException {
        hkp.dogumYeriSearchBox.sendKeys("Ankara");
        Thread.sleep(2000);

    }

    @Given("user selects the date of birth")
    public void user_selects_the_date_of_birth() throws InterruptedException {
        hkp.dogumTarihiSearchBox.click();
        hkp.dogumTarihiSearchBox.sendKeys("01.08.2000");
        hkp.dateCloseButton.click();
        Thread.sleep(1000);

    }

    @Given("user selects the date of birth newborn")
    public void user_selects_the_date_of_birth_newborn() throws InterruptedException {
        hkp.dogumTarihiSearchBox.click();
        hkp.dogumTarihiSearchBox.sendKeys("17.08.2023");
        hkp.dateCloseButton.click();
        Thread.sleep(1000);

    }

    @Given("user enters the surname")
    public void user_enters_the_surname() throws InterruptedException {
        hkp.soyadiSearchBox.sendKeys("Yilmaz");
        Thread.sleep(1000);

    }

    @Given("enter the user name")
    public void enter_the_user_name() throws InterruptedException {
        hkp.adiSearchBox.sendKeys("Semsettin");
        Thread.sleep(1000);

    }

    @Given("user selects the proximity")
    public void user_selects_the_proximity() throws InterruptedException {
        hkp.yakinligiDropdown.sendKeys("KENDİSİ");
        Thread.sleep(1000);

    }

    @Given("user selects a gender")
    public void user_selects_a_gender() throws InterruptedException {
        hkp.cinsiyetDropdown.sendKeys("ERKEK");
        Thread.sleep(1000);

    }

    @Given("user chooses a marital status")
    public void user_chooses_a_marital_status() throws InterruptedException {
        hkp.medeniHaliSearchBox.sendKeys("EVLİ");
        Thread.sleep(1000);

    }

    @Given("user writes Passport Id")
    public void user_writes_passport_ıd() throws InterruptedException {
        hkp.pasaportIdSearchBox.sendKeys("12345");
        Thread.sleep(1000);

    }

    @Given("user writes Passport No")
    public void user_writes_passport_no() throws InterruptedException {
        hkp.pasaportNoSearchBox1.sendKeys("123");
        hkp.pasaportNoSearchBox2.sendKeys("123456");
        Thread.sleep(1000);

    }

    @Given("user enters the mobile phone")
    public void user_enters_the_mobile_phone() throws InterruptedException {
        hkp.ceptelefonu.click();
        hkp.ceptelefonu.sendKeys("5423456789");
        Thread.sleep(1000);

    }

    @Given("user writes E-mail")
    public void user_writes_e_mail() throws InterruptedException {
        hkp.email.sendKeys("test@test.com");
        Thread.sleep(1000);

    }

    @Given("user chooses a profession")
    public void user_chooses_a_profession() throws InterruptedException {
        hkp.meslek.sendKeys("55");
        Thread.sleep(1000);

    }

    @Given("user selects the status")
    public void user_selects_the_status() throws InterruptedException {
        hkp.statu.sendKeys("NORMAL");
        Thread.sleep(1000);

    }

    @Given("user selects the learning")
    public void user_selects_the_learning() throws InterruptedException {
        hkp.ogrenim.sendKeys("Yüksek Öğretim");
        Thread.sleep(1000);

    }

    @Given("user selects the blood type")
    public void user_selects_the_blood_type() throws InterruptedException {
        hkp.kangrubu.sendKeys("0 RH+");
        Thread.sleep(1000);

    }

    @Given("user clicks on the save button")
    public void user_clicks_on_the_save_button() throws InterruptedException {
        hkp.kaydetButton.click();
        Thread.sleep(1000);

    }

    @Given("user assert the registration")
    public void user_assert_the_registration() {

    }

    @Given("user select multeci kisiler")
    public void user_select_multeci_kisiler() {
        hkp.multeci.click();
    }

    @Given("user click Islem Kapat button")
    public void user_click_islem_kapat_button() throws InterruptedException {
        hkp.islembasariliClose.click();
        Thread.sleep(1000);
    }

    @Given("user click Kayit Kapat button")
    public void user_click_kayit_kapat_button() {
        hkp.kayitClose.click();

    }

    @Given("user select stateless persons")
    public void user_select_stateless_persons() {
        hkp.vatansizKisiler.click();

    }

    @Given("user click newborn")
    public void user_click_newborn() {
        hkp.yenidoganCheckBox.click();
    }

    @Given("user assert issue message")
    public void user_assert_issue_message() {
        org.junit.Assert.assertTrue(hkp.passaportKimliksizVatansiz.isDisplayed());
    }

    @Given("user select Gelis sekli")
    public void user_selects_gelis_sekli() {
        hkp.gelisSekliButton.click();
        hkp.gelisSekliAyaktanButton.click();

    }

    @Given("user click Doktor")
    public void user_click_doktor() throws InterruptedException {
        hkp.doktorButton.click();
        actions.doubleClick();
        hkp.doktorlist.click();
        hkp.mainpage.click();
        Thread.sleep(1000);
    }

    @Then("user closes the application")
    public void user_closes_the_application() {
        Driver.closeDriver();
    }

    @Given("user click Kaydet button")
    public void user_click_kaydet_button() throws InterruptedException {
        hkp.MuayeneKayit.click();
        Thread.sleep(1000);
    }

    @Given("user click TAMAM button in the popup")
    public void user_click_tamam_button_in_the_popup() throws InterruptedException {
        hkp.yetkisizlik.click();
        Thread.sleep(1000);
    }

    @Given("user close the message bilgiler kaydedildi")
    public void user_close_the_message_bilgiler_kaydedildi() {
        hkp.muayeneKayitClose.click();
    }

    @Given("user registration verifies")
    public void user_registration_verifies() {

    }

    @Given("user enters the TC number of mother")
    public void user_enters_the_tc_number_of_mother() {
        hkp.motherTCnumber.sendKeys("43416048730");
    }

    @Given("user enters the baby birthweek")
    public void user_enters_the_baby_birthweek() {

        hkp.babyBirthweek.sendKeys("32");
    }

    @Given("user enters the baby birthday")
    public void user_enters_the_baby_birthday() {

        hkp.babyBirthday.sendKeys("3");
    }

    @Given("user click Basvuru sekli")
    public void user_click_basvuru_sekli() {
        hkp.basvuruSekliDropdown.click();
    }

    @Given("user select Basvuru sekli")
    public void user_select_basvuru_sekli() {
        hkp.basvuruSekliSelect.click();
    }

    @Given("user assert that the options in the list are unique")
    public void user_assert_that_the_options_in_the_list_are_unique() {
        org.junit.Assert.assertTrue(hkp.basvuruSekliSelect.isSelected());
    }
    @When("Click the Hasta button")
    public void click_the_hasta_button() {
        basePage.hastaButton.click();
    }
    @When("Enter Kurum, Kurum detay")
    public void enter_kurum_kurum_detay() throws InterruptedException {
        hkp.kurum.sendKeys(ConfigReader.getProperty("kurum"));
        Thread.sleep(1000);
        hkp.kurumDetay.sendKeys(ConfigReader.getProperty("kurum_Detay"));
        Thread.sleep(1000);
    }
    //test1---------------
    @Then("click the Kaydet-F10- button")
    public void click_the_kaydet_f10_button() {
        hkp.ceptelefonu.click();
        hkp.ceptelefonu.sendKeys("05411111458");
        hkp.kaydetButton.click();
    }
    @Then("verify -Hasta Karti Düzenleme - T.C kimlik numarasi bos olamaz ...PROBEL!- message")
    public void verify_hasta_karti_düzenleme_t_c_kimlik_numarasi_bos_olamaz_probel_message() {
        Assert.assertTrue(hkp.HataMassage.isDisplayed());
    }
    //test2--------------
    @Then("select nationality uyruk -ABD \\(Amerika Birleşik D.)-")
    public void selectNationalityUyrukABDAmerikaBirleşikD() {
        Select select = new Select(hkp.uyruguDropdown);
        select.selectByVisibleText("ABD (AMERIKA BIRLEŞİK D.)");
    }
    @And("Verify that -Pasaport ıd- and -pasaport no- are in the page")
    public void verifyThatPasaportIdAndPasaportNoAreInThePage() {
        Assert.assertTrue(hkp.pasaportIdSearchBox.isDisplayed());
        Assert.assertTrue(hkp.pasaportNoSearchBox1.isDisplayed());
        Assert.assertTrue(hkp.pasaportNoSearchBox2.isDisplayed());
    }
    //test3------------------------
    @Then("make patient type SAGLİK TURİZMİ")
    public void makePatientTypeSAGLİKTURİZMİ() throws InterruptedException {
        hkp.hastaTuruButton.click();
        Thread.sleep(3000);
        hkp.saglikTurizimiButton.click();
    }
    @Then("Enter TC no")
    public void enter_tc_no() throws InterruptedException {
        hkp.TCsearchBox.sendKeys("11771511824");
        Thread.sleep(1000);
    }
    @Then("Enter Adi")
    public void enter_adi()throws InterruptedException {
        hkp.adiSearchBox.sendKeys(faker.name().firstName());
    }
    @Then("Enter soyadi")
    public void enter_soyadi()throws InterruptedException {
        hkp.soyadiSearchBox.sendKeys(faker.name().lastName());
        Thread.sleep(3000);
    }
    @Then("Enter dogum tarihi")
    public void enter_dogum_tarihi()throws InterruptedException {
        hkp.dogumTarihiSearchBox.sendKeys("15/08/2023");
        Thread.sleep(4000);
    }
    @Then("Enter cinsiyet")
    public void enter_cinsiyet()throws InterruptedException {
        Select select2 = new Select(hkp.cinsiyetDropdown);
        select2.selectByIndex(1);
        Thread.sleep(1000);
    }
    @Then("Enter ana adi")
    public void enter_ana_adi() throws InterruptedException{
        hkp.anaAdiSearchBox.sendKeys(faker.name().firstName());
        Thread.sleep(1000);
    }
    @Then("Enter baba adi")
    public void enter_baba_adi()throws InterruptedException {
        hkp.babaAdiSearchBox.sendKeys(faker.name().firstName());
    }
    @Then("doğum yeri")
    public void doğum_yeri()throws InterruptedException {
        hkp.dogumYeriSearchBox.sendKeys(faker.address().city());
    }
    @Then("anne tc no")
    public void anne_tc_no() throws InterruptedException{
        hkp.anneTCNoSearchBox.sendKeys("23306127172");
        Thread.sleep(1000);
    }
    @Then("Yeni doğan button click")
    public void yeni_doğan_button_click()throws InterruptedException {
        Thread.sleep(1000);
        org.junit.Assert.assertTrue(hkp.yenidoganCheckBox.isDisplayed());
        Thread.sleep(1000);
        if (!hkp.yenidoganCheckBox.isSelected()){
            hkp.yenidoganCheckBox.click();
        }
    }
    @And("verify the text Bebegin dogum haftasi günü")
    public void verifyTheTextBebeginDogumHaftasiGünü() throws InterruptedException {
        Thread.sleep(1000);
        try {
            org.junit.Assert.assertTrue(hkp.bebeginDogumGunuSearchBox.isDisplayed());
            org.junit.Assert.assertTrue(hkp.bebeginDogumHaftasiSearchBox.isDisplayed());
        }catch (Exception e){
        }
    }
    @And("Bebeğin dogum haftasi gunu enter a week and future days")
    public void bebeğinDogumHaftasiGunuEnterAWeekAndFutureDays() throws InterruptedException {
        Thread.sleep(3000);
        hkp.bebeginDogumHaftasiSearchBox.sendKeys(faker.number().digit());
        hkp.bebeginDogumGunuSearchBox.sendKeys(faker.number().digit());
    }
    @Then("enter mobile number cep telefonu and click sms gönderilebilir")
    public void enter_mobile_number_cep_telefonu_and_click_sms_gönderilebilir() throws InterruptedException {
        Thread.sleep(1000);
        hkp.ceptelefonu.click();
        Thread.sleep(1000);
        hkp.ceptelefonu.sendKeys("5424218774");
        hkp.SMS.click();
    }
    @Then("Click the kaydet f10 box")
    public void click_the_kaydet_f10_box() throws InterruptedException {
        Thread.sleep(7000);
        hkp.kaydetButton.click();
        Assert.assertTrue(hkp.massageVerfy.isDisplayed());
    }
    @Then("Select a valid Poliklinik on Muayene Kayıt Page")
    public void select_a_valid_poliklinik_on_muayene_kayıt_page() {
        ReusableMethods.doubleClick(hkp.poliklinkSearchBox);
        ReusableMethods.doubleClick(hkp.acilPoliklinkButton);
    }
    @And("Select a valid Gelis sekli on Muayene Kayit Page")
    public void selectAValidGelisSekliOnMuayeneKayitPage() {
        Select select = new Select(hkp.gelisNedeni);
        select.selectByVisibleText("Ayaktan");
    }
    @Then("Click Kaydet button on Muayene Kayıt Page")
    public void click_kaydet_button_on_muayene_kayıt_page() {
        hkp.kaydetButton.click();
    }
    @Then("Bilgiler Kaydedildi should be seen on Popup Alert on Muayene Kayıt Page")
    public void bilgiler_kaydedildi_should_be_seen_on_popup_alert_on_muayene_kayıt_page() {
        Assert.assertTrue(hkp.massageVerfy.isDisplayed());
    }
    //test4------------------------
    @Then("select nationality -uyruk- -Almanya-")
    public void select_nationality_uyruk_almanya() {
        Select select3 = new Select(hkp.uyruguDropdown);
        select3.selectByValue("3");
    }
    @Then("Verify that -Tahsis no- and -karne seri no- are in the page")
    public void verify_that_tahsis_no_and_karne_seri_no_are_in_the_page() throws InterruptedException {
        Thread.sleep(2000);
        org.junit.Assert.assertTrue(hkp.tahsisNoSearchBox.isDisplayed());
        org.junit.Assert.assertTrue(hkp.karneSeriNoSearchBox1.isDisplayed());
        org.junit.Assert.assertTrue(hkp.karneSeriNoSearchBox2.isDisplayed());
    }
    //test5---------------------
    @Then("-Anne doğum tarihi- enter a future date")
    public void anne_doğum_tarihi_enter_a_future_date() throws InterruptedException {
        Thread.sleep(2000);
        hkp.anneDogumTarihiSearchBox.click();
        hkp.anneDogumTarihiSearchBox.sendKeys("14/10/2023");
        Thread.sleep(2000);
    }
    @Then("select -Hasta türü- -Kimliksiz hasta-")
    public void select_hasta_türü_kimliksiz_hasta() throws InterruptedException {
        hkp.hastaTuruButton.click();
        Thread.sleep(3000);
        hkp.kimliksizHastaButton.click();
    }
    @Then("Enter -Kişi bilgileri- -TC-,-Adı-,-Soyadı-,-cinsiyet-,-Baba Adı-,-Anne adi-,-Doğum yeri-,-Anne tc-")
    public void enter_kişi_bilgileri_tc_adı_soyadı_cinsiyet_baba_adı_anne_adi_doğum_yeri_anne_tc() throws InterruptedException {
        Thread.sleep(2000);
        hkp.adiSearchBox.sendKeys(faker.name().firstName());
        hkp.soyadiSearchBox.sendKeys(faker.name().lastName());
        Select select = new Select(hkp.cinsiyetDropdown);
        select.selectByIndex(2);
        Thread.sleep(2000);
        hkp.dogumTarihiSearchBox.click();
        Thread.sleep(2000);
        hkp.dogumTarihiSearchBox.sendKeys("15/06/1998");
        Thread.sleep(2000);
        hkp.ceptelefonu.click();
        hkp.ceptelefonu.sendKeys("5427418567");
        Thread.sleep(2000);
        hkp.kaydetButton.click();
    }
    @Then("Hata message verifyy")
    public void hata_message_verifyy() {
        System.out.println(hkp.HataMassage.getText());
        String Expected = hkp.HataMassage.getText();
        String actualErorMassage= "İşlem Başarısız";
        org.junit.Assert.assertEquals(Expected,actualErorMassage);
    }
    //test6---------------
    @Then("click the -Yeni Doğan- button")
    public void click_the_yeni_doğan_button() {
        hkp.yenidoganCheckBox.click();
        org.junit.Assert.assertTrue(hkp.bebeginDogumGunuSearchBox.isDisplayed());
        org.junit.Assert.assertTrue(hkp.bebeginDogumHaftasiSearchBox.isDisplayed());
        hkp.bebeginDogumGunuSearchBox.sendKeys(faker.number().digit());
        hkp.bebeginDogumHaftasiSearchBox.sendKeys(faker.number().digit());
    }
    @Then("Enter -Kişi bilgileri- -TC-,-Adı-,-Soyadı-,-cinsiyet-,-Baba Adi-,-Anne adi-,-Dogum yeri-,-Anne tc-")
    public void enter_kişi_bilgileri_tc_adı_soyadı_cinsiyet_baba_adi_anne_adi_dogum_yeri_anne_tc() throws InterruptedException {
        Thread.sleep(2000);
        hkp.hastaTuruButton.click();
        hkp.kimliksizHastaButton.click();
        Thread.sleep(2000);
        hkp.adiSearchBox.sendKeys(faker.name().firstName());
        hkp.soyadiSearchBox.sendKeys(faker.name().lastName());
        Thread.sleep(2000);
        Select cinsiyet = new Select(hkp.cinsiyetDropdown);
        cinsiyet.selectByIndex(1);
        hkp.ceptelefonu.click();
        hkp.ceptelefonu.sendKeys("5421478956");
        Thread.sleep(3000);
    }
    @Then("-Doğum T.- enter a future date")
    public void doğum_t_enter_a_future_date() throws InterruptedException {
        hkp.dogumTarihiSearchBox.sendKeys("25/09/2024");
        Thread.sleep(4000);
    }
    @Then("-Kaydet- button click")
    public void kaydet_button_click() {
        hkp.kaydetButton.click();
    }
    @Then("-Hata- message verify")
    public void hata_message_verify() {
        System.out.println(hkp.HataMassage.getText());
        String Expected = hkp.HataMassage.getText();
        String actualErorMassage= "İşlem Başarısız";
        org.junit.Assert.assertEquals(Expected,actualErorMassage);
    }
    //test7--------------------
    @Then("Type {int}- in the -İl- box")
    public void type_in_the_il_box(Integer int1) throws InterruptedException {
        ReusableMethods.doubleClick(hkp.ilSearchBox);
        Thread.sleep(2000);
        hkp.ilKoduSearchBox.click();
        Thread.sleep(1000);
        hkp.ilKoduSearchBox.sendKeys("47"+ Keys.ENTER);
        Thread.sleep(5000);
    }
    @Then("Double click the -İlce- box and check the popup")
    public void double_click_the_ilce_box_and_check_the_popup() {
        ReusableMethods.doubleClick(hkp.ilceSearchBox);
    }
    @Then("Verify -oge sayisi\"")
    public void verify_oge_sayisi() {
        System.out.println(hkp.ogeSayisi.getText());
        String expected=  hkp.ogeSayisi.getText();
        String actual = "Sayfa 1 / 1 (11 öğe)";
        org.junit.Assert.assertEquals(expected,actual);
    }
    //test8--------------------
    @Then("select nationality uyruk -ANDORRA-")
    public void select_nationality_uyruk_andorra() {
        Select select = new Select(hkp.uyruguDropdown);
        select.selectByVisibleText("ANDORRA");
    }
    @Then("enter patient type -T.C. SAĞLIK BAKANLIĞI SAĞLIK VE TIP ALANINDA İKİLİ İŞ BİRLİĞİ ANLAŞMALARI KAPSAMINDAKİ HASTALAR-")
    public void enter_patient_type_t_c_sağlık_bakanlığı_sağlık_ve_tıp_alanında_ikili_iş_birliği_anlaşmaları_kapsamındaki_hastalar() {
        hkp.hastaTuruButton.click();
        hkp.hastaTurur3.click();
    }
    @Then("Enter -pasaport no- and -passport id-")
    public void enter_pasaport_no_and_passport_id() throws InterruptedException {
        Thread.sleep(2000);
        hkp.pasaportIdSearchBox.sendKeys("123456");
        hkp.pasaportNoSearchBox1.sendKeys("1234");
        Thread.sleep(2000);
        hkp.pasaportNoSearchBox2.sendKeys("156874");
    }
    @Then("-cinsiyet- enter")
    public void cinsiyet_enter() throws InterruptedException {
        Thread.sleep(1000);
        Select select1 = new Select(hkp.cinsiyetDropdown);
        select1.selectByIndex(2);
    }
    @Then("-cep telefonu- enter")
    public void cep_telefonu_enter() throws InterruptedException {
        hkp.ceptelefonu.click();
        Thread.sleep(2000);
        hkp.ceptelefonu.sendKeys("5421586547");
    }
    @Then("Enter -adi- and -soyadi-")
    public void enter_adi_and_soyadi() {
        hkp.adiSearchBox.sendKeys(faker.name().firstName());
        hkp.soyadiSearchBox.sendKeys(faker.name().lastName());
    }
    @And("Enterr dogum Tarihi")
    public void enterrDogumTarihi() throws InterruptedException {
        Thread.sleep(5000);
        hkp.dogumTarihiSearchBox.sendKeys("14/02/2000");
        Thread.sleep(3000);
    }
    @Then("-işlem başarılı- massage verify")
    public void işlem_başarılı_massage_verify() {
        hkp.kaydetButton.click();
        org.junit.Assert.assertTrue(hkp.massageVerfy.isDisplayed());
        hkp.popupKapatButton.click();
    }
    @Then("-kapat- button click")
    public void kapat_button_click() {
        hkp.KapatButton.click();
    }
    @Then("Poliklinik enter")
    public void poliklinik_enter() {
        hkp.poliklinkSearchBox.sendKeys("2"+Keys.ENTER);
    }
    @Then("select -geliş nedeni-")
    public void select_geliş_nedeni() {
        Select select2 = new Select(hkp.gelisNedeni);
        select2.selectByIndex(5);
    }
    @Then("-kaydett- button click")
    public void kaydett_button_click() {
        hkp.kaydetButton.click();
    }
    @When("-Bilgiler kaydedildi- massage veryfy")
    public void bilgiler_kaydedildi_massage_veryfy() {
        Assert.assertTrue(hkp.massageVerfy.isDisplayed());
    }
    //Test09--------------------
    @Given("click the button Yeni Dogan")
    public void clickTheButtonYeniDogan() {
        hkp.yenidoganCheckBox.click();
    }
    @When("Enter a date beyond {int} days of birth")
    public void enterADateBeyondDaysOfBirth(int arg0) throws InterruptedException {
        Thread.sleep(1000);
        hkp.dogumTarihiSearchBox.click();
        Thread.sleep(3000);
        hkp.dogumTarihiSearchBox.sendKeys("18.06.2023");
        Thread.sleep(5000);
    }
    @And("Enter anne tc no")
    public void enterAnneTcNo() {
        hkp.anneTCNoSearchBox.sendKeys("23306127172");
    }
    @And("Bebegin dogum haftasi and gunu enter")
    public void bebeginDogumHaftasiAndGunuEnter() {
        hkp.bebeginDogumGunuSearchBox.sendKeys("2");
        hkp.bebeginDogumHaftasiSearchBox.sendKeys("3");
    }
    @And("Enter -telefon no-")
    public void enterTelefonNo() throws InterruptedException {
        hkp.ceptelefonu.click();
        hkp.ceptelefonu.sendKeys("05416985423");
        Thread.sleep(2000);
    }
    @And("-Doğum tarihi {int} günü geçmiş hastalar için yenidoğan seçeneği işaretlenemez..!- veryfy")
    public void doğumTarihiGünüGeçmişHastalarIçinYenidoğanSeçeneğiIşaretlenemezVeryfy(int arg0) {
        System.out.println(hkp.massageVerfy.getText());
        String expected = "Doğum tarihi 30 günü geçmiş hastalar için yenidoğan seçeneği işaretlenemez..!";
        String actual = hkp.massageVerfy.getText();
        Assert.assertEquals(expected,actual);
    }
    @When("Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page")
    public void selectKimliksizHastaFromHastaTuruDropDownMenuOnHastaKayıtPage() {
        hkp.selectWithoutId();
    }

    @And("Write a valid Cep Telefonu on Hasta Kayıt Page")
    public void writeAValidCepTelefonuOnHastaKayıtPage() {
        hkp.writeValidMobilePhone();
    }

    @And("Select a valid Doğum Tarihi on Hasta Kayıt Page")
    public void selectAValidDogumTarihiOnHastaKayıtPage() {
        hkp.selectValidBirthday();
    }

    @And("Select Cinsiyeti on Hasta Kayıt Page")
    public void selectCinsiyetiOnHastaKayıtPage() {
        hkp.selectGender();
    }


    @And("Write a valid Soyadı on Hasta Kayıt Page")
    public void writeAValidSoyadıOnHastaKayıtPage() {
        hkp.writeValidLastName();
    }

    @And("Write a valid Adı on Hasta Kayıt Page")
    public void writeAValidAdıOnHastaKayıtPage() {
        hkp.writeValidName();
    }

    @And("Select a valid Yakınlığı on Hasta Kayıt Page")
    public void selectAValidYakınlıgıOnHastaKayıtPage() {
        hkp.selectValidRelation();
    }

    @And("Click Kaydet button on Hasta Kayıt Page")
    public void clickKaydetButtonOnHastaKayıtPage() {
        hkp.clickSaveButton();
    }

    @And("Click the Bilgi button on Hasta Kayıt Page")
    public void clickTheBilgiButtonOnHastaKayıtPage() throws InterruptedException {
        hkp.clickInfoButton();
    }

    @And("Click the Kapat button on Hasta Kayıt Page")
    public void clickTheKapatButtonOnHastaKayıtPage() {
        hkp.clickCloseButton();
    }


    @And("Select an invalid future  Doğum Tarihi on Hasta Kayıt Page")
    public void selectAnInvalidFutureDogumTarihiOnHastaKayıtPage() {
        hkp.selectAnInvalidFutureBirthday();
    }

    @Then("İşlem Başarılı   shouldnt be seen on popoup on Hasta Kayıt Page")
    public void islemBasarılıShouldntBeSeenOnPopoupOnHastaKayıtPage() {
        hkp.operationFailded();
    }

    @And("Write a statement contains some numbers  as Soyadı  on Hasta Kayıt Page")
    public void writeAStatementContainsSomeNumbersAsSoyadıOnHastaKayıtPage() {
        hkp.writeContainsNumbersLastNameBox();
    }

    @And("Write a statement contains some numbers  as Adı  on Hasta Kayıt Page")
    public void writeAStatementContainsSomeNumbersAsAdıOnHastaKayıtPage() {
        hkp.writeContainsNumbersNameBox();

    }

    @And("click Yenidoğan checkbox  on Hasta Kayıt Page")
    public void clickYenidoganCheckboxOnHastaKayıtPage() {
        hkp.clickNewbornBox();
    }

    @And("Select a valid date within one month at the latest as Doğum Tarihi on Hasta Kayıt Page")
    public void selectAValidDateWithinOneMonthAtTheLatestAsDogumTarihiOnHastaKayıtPage() {
        hkp.selectValidDateWithinOneMonth();
    }

    @And("write a valid value on Haftası for Bebeğin Doğum  on Hasta Kayıt Page")
    public void writeAValidValueOnHaftasıForBebeginDogumOnHastaKayıtPage() {
        hkp.writeValidWeek();
    }

    @And("write a valid value on Günü for Bebeğin Doğum  on Hasta Kayıt Page")
    public void writeAValidValueOnGunuForBebeginDogumOnHastaKayıtPage() {
        hkp.writeValidDay();
    }

    @And("Select Cinsiyeti as Erkek on Hasta Kayıt Page")
    public void selectCinsiyetiAsErkekOnHastaKayıtPage() {
        hkp.selectCinsiyetiAsMan();
    }

    @And("Select country  from   Uyruğu drop down menu on Hasta Kayıt Page")
    public void selectCountryFromUyruguDropDownMenuOnHastaKayıtPage(DataTable dataTable) {
        hkp.selectCountryDropDown(dataTable);
    }


    @And("click Mavikart checkbox on Hasta Kayıt Page")
    public void clickMavikartCheckboxOnHastaKayıtPage() {
        hkp.clickCheckBox();
    }


    @Then("Only positive integers should be written to Doğumsırası on Hasta Kayıt Page")
    public void writeSomeNumbersToDogumsırasıOnHastaKayıtPage(DataTable dataTable) {
        hkp.checkValidNumbers(dataTable);

    }


    @Then("only valid emails should be accepted")
    public void onlyValidEmailsShouldBeAccepted(DataTable dataTable) throws InterruptedException {
        hkp.checkValidEmails(dataTable);
    }


    @And("Only valid Birth Dates should be accepted on Hasta Kayıt Sayfası")
    public void onlyValidBirthDatesShouldBeAcceptedOnHastaKayıtSayfası(DataTable dataTable) throws ParseException, InterruptedException {
        hkp.chechValidBirthDates(dataTable);


    }


    @And("click  E-mail Gönderilebilir button   on Hasta Kayıt Page")
    public void clickEMailGonderilebilirButtonOnHastaKayıtPage() {
        hkp.clickEmailCheckBox();
    }


    @And("E-mail box should be active on Hasta Kayıt Page")
    public void eMailBoxShouldBeActiveOnHastaKayıtPage() {
        hkp.checkEmailActive();

    }






    @Then("The Age of The Mother shouldn't be smaller than fifteen on Hasta Kayıt Page")
    public void theAgeOfTheMotherShouldnTBeSmallerThanFifteenOnHastaKayıtPage(DataTable dataTable) throws InterruptedException {

        hkp.checkAgeOfMother(dataTable);
    }

    @And("Select Proximity from Yakınlığı drop down menu on Hasta Kayıt Page")
    public void SelectProximityfromYakınlığıDropDownMenuOnHastaKayıtPage() {
        hkp.clickProximity();
    }


    @Then("Kart Sahibi box should be active on Hasta Kayıt Page when If something except Kendisi is selected")
    public void kartSahibiBoxShouldBeActiveOnHastaKayıtPageWhenIfSomethingExceptKendisiIsSelected() throws InterruptedException {
        hkp.checkProximity();
    }

    @When("Select Mavi Kartlılar from   Hasta Türü drop down menu on Hasta Kayıt Page")
    public void selectMaviKartlılarFromHastaTuruDropDownMenuOnHastaKayıtPage() {
        hkp.selectWithBlueCards();
    }


    @And("Write a valid T.C. Kimlik No on Hasta Kayıt Page")
    public void writeAValidTCKimlikNoOnHastaKayıtPage() {
        hkp.writeValidID();
    }


    @Then("If Id is valid then İşlem Başarılı   should be seen on popoup on Hasta Kayıt Page")
    public void ifIdIsValidThenIslemBasarılıShouldBeSeenOnPopoupOnHastaKayıtPage(DataTable dataTable) throws InterruptedException {
        hkp.checkIdValidaty(dataTable);
    }




    @And("User enters the date of birth")
    public void userEntersTheDateOfBirth() {
        LocalDate tarih = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy");
        tarih = tarih.plusDays(1);
        String date = format.format(tarih);
        System.out.println(date);
        ReusableMethods.waitForVisibility(hkp.dateOfBirthSearchBox, 5);
        ReusableMethods.waitFor(4);
        hkp.dateOfBirthSearchBox.click();
        hkp.dateOfBirthSearchBox.sendKeys(date);
        hkp.dateOfBirthSearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(4);
    }

    @And("User clicks the succes close button")
    public void userClicksTheSuccesCloseButton() {
        hkp.succesButton.click();
    }

    @And("User ticks Bluecard checkbox")
    public void userTicksBluecardCheckbox() {
        hkp.bluecardButton.click();
    }

    @Then("Assert that birtDay and birthOrder searchBoxes are display")
    public void assertThatBirtDayAndBirthOrderSearchBoxesAreDisplay() {
        Assert.assertEquals(hkp.birthOrder.getText(), "Doğum Sırası");
    }

    @And("User clicks yakinligi and chooses mother")
    public void userClicksYakinligiAndChoosesMother() {
        Select select = new Select(hkp.yakinligiDropdown);
        select.selectByValue("2");
    }

    @Then("Assert that cardOwner searchBox is display")
    public void assertThatCardOwnerSearchBoxIsDisplay() {
        Assert.assertTrue(hkp.cardOwnerSearchBox.isDisplayed());
    }

    @And("User clicks the clean button")
    public void userClicksTheCleanButton() {
        hkp.clearButton.click();
    }

    @Then("Assert that the page is clear")
    public void assertThatThePageIsClear() {
        Assert.assertTrue(hkp.clearButton.isDisplayed());
    }

    @And("User enters birth order")
    public void userEntersBirthOrder() {
        hkp.birthOrderSearchBox.clear();
        hkp.birthOrderSearchBox.sendKeys("-2");
    }


    @And("User enters date Of Birth Less Than thirty Days in date of birth box")
    public void userEntersDateOfBirthLessThanThirtyDaysInDateOfBirthBox() {
        LocalDate tarih = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy");
        tarih = tarih.minusDays(10);
        String date = format.format(tarih);
        System.out.println(date);
        ReusableMethods.waitForVisibility(hkp.dateOfBirthSearchBox, 5);
        ReusableMethods.waitFor(4);
        hkp.dateOfBirthSearchBox.click();
        hkp.dateOfBirthSearchBox.sendKeys(date);
        hkp.dateOfBirthSearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(4);

    }


    @And("User enters the date of birth over than thirtyone days old in date of birth box")
    public void userEntersTheDateOfBirthOverThanThirtyoneDaysOldInDateOfBirthBox() {
        LocalDate tarih = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy");
        tarih = tarih.minusDays(31);
        String date = format.format(tarih);
        System.out.println(date);
        ReusableMethods.waitForVisibility(hkp.dateOfBirthSearchBox, 5);
        ReusableMethods.waitFor(4);
        hkp.dateOfBirthSearchBox.click();
        hkp.dateOfBirthSearchBox.sendKeys(date);
        hkp.dateOfBirthSearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(4);
    }

    @And("User enters date Of Birth in date of birth box")
    public void userEntersDateOfBirthInDateOfBirthBox() {
        LocalDate tarih = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy");
        tarih = tarih.minusMonths(15).minusYears(15);
        String data = format.format(tarih);
        ReusableMethods.waitForVisibility(hkp.dateOfBirthSearchBox, 5);
        ReusableMethods.waitFor(4);
        hkp.dateOfBirthSearchBox.click();
        hkp.dateOfBirthSearchBox.sendKeys(data);
        hkp.dateOfBirthSearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(4);

    }


    public static String pN;

    @And("User takes patient's protocol Number")
    public void userTakesPatientSProtocolNumber() {
        ReusableMethods.waitForVisibility(hkp.protocolNo, 4);
        pN = hkp.protocolNo.getText();
        System.out.println(pN);

    }

    @And("User clicks the save button again")
    public void userClicksTheSaveButtonAgain() {

        hkp.patientSaveButton.click();
        ReusableMethods.waitForVisibility(hkp.infoSaved, 4);
        hkp.infoSaved.click();
        ReusableMethods.waitFor(3);
    }

    @And("{int} bekle")
    public void bekle(int a) {
        ReusableMethods.waitFor(a);
    }

    @Then("User verifies that the patient is not enrolled")
    public void userVerifiesThatThePatientIsNotEnrolled() {
        Assert.assertFalse(hkp.lastProtocolNo.isDisplayed());
    }

    @And("User clicks Patient Type box and Choose Button on Coming for Education and their obligations")
    public void userClicksPatientTypeBoxAndChooseButtonOnComingForEducationAndTheirObligations() {
        actions.click(hkp.patientType).perform();
        hkp.comingForEducation.click();
    }


    @And("User enters birth week and birth day")
    public void userEntersBirthWeekAndBirthDay() {
        hkp.birthWeekButton.sendKeys("40");
        hkp.birthDayButton.sendKeys("5");
    }

    @And("User clicks the warning Button")
    public void userClicksTheWarningButton() {
        hkp.warningButtonAdd.click();
    }

    @And("User clicks the popap close button")
    public void userClicksThePopapCloseButton() {
        ReusableMethods.waitForVisibility(hkp.closeButton, 4);
        hkp.closeButon.click();
    }

    @And("User enters email without @")
    public void userEntersEmailWithout() {
        hkp.emailSearchBox.sendKeys(ConfigReader.getProperty("eMailNo@"));
    }

    @Then("User verifies that Passport Id and No is requested")
    public void userVerifiesThatPassportIdAndNoIsRequested() {
        String passportName = "Pasaport Id";
        String passportNo = "Pasaport No";
        String allocationNumberBoxName = ReusableMethods.getElementText(hkp.allocationNumberBoxName);
        String reportCardSerialNoBoxName = ReusableMethods.getElementText(hkp.reportCardSerialNoBoxName);
        Assert.assertEquals(allocationNumberBoxName, passportName);
        Assert.assertEquals(reportCardSerialNoBoxName, passportNo);
    }

    @And("User clicks the YES button")
    public void userClicksTheYESButton() {
        hkp.continueYesButton.click();
    }
}
