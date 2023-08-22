package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Muayene_Kayit_Page {
    WebDriver driver;
    Actions actions = new Actions(Driver.getDriver());


    public Muayene_Kayit_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='Sorgula(F11)']")
    WebElement query_button;

    @FindBy(id = "protokol_ara")
    WebElement protokolSearch_box;

    @FindBy(xpath = "//a[@class='hem_button hem_ok_pro cmdGreen cmd_SorgulaCalistir']")
    WebElement run_button;

    @FindBy(xpath = "//a[@title='Kaydet(F10)']")
    WebElement save_button;

    @FindBy(xpath = "//a[@title='Yeni(F5)']")
    WebElement new_button;

    @FindBy(xpath = "//a[@title='Sil(F8)']")
    WebElement delete_button;

    @FindBy(xpath = "//a[@title='Temizle(F5)']")
    WebElement clean_button;

    @FindBy(xpath = "//a[@title='Yazdır']")
    WebElement print_button;

    @FindBy(linkText = "Detaylı Hasta Arama")
    WebElement detailedPatientSearch_button;

    @FindBy(xpath = "//div[@class='PopupTitle']")
    WebElement popUpPage_Title;

    @FindBy(linkText = "Raporlar")
    WebElement reports_button;

    @FindBy(linkText = "Sağlık Kurulu")
    WebElement healthCouncil_button;

    @FindBy(xpath = "//div[@class='PopupTitle']")
    WebElement healthCouncil_title;

    @FindBy(linkText = "Yardımcı İşlemler")
    WebElement utilityOperations_button;

    @FindBy(linkText = "Ris")
    WebElement ris_button;

    @FindBy(linkText = "Lab")
    WebElement lab_button;

    @FindBy(id = "TC_KIMLIK_NO")
    WebElement tcIdNo_box;

    @FindBy(xpath = "//a[@class='btnTcDogrulaPop  text_btn text_btn_ok pBtn']")
    WebElement confirm_button;

    @FindBy(id = "HASTA_NO")
    WebElement patientNumber_box;

    @FindBy(xpath = "//a[@class='btnHastaAraPop wpx50  text_btn text_btn_bul pBtn']")
    WebElement search_button;

    @FindBy(xpath = "//a[@title='Hasta Kayıt(F6)']")
    WebElement patient_button;

    @FindBy(xpath = "//a[@class='PopupCloseButton PopupButton']")
    WebElement closePopupPage_button;

    @FindBy(xpath = "(//input[@class='inpt tacnt wpx50'])[1]")
    WebElement serviceID_box;

    @FindBy(xpath = "(//input[@class='inpt tacnt wpx50'])[2]")
    WebElement doctorID_box;

    @FindBy(xpath = "(//input[@class='inpt tacnt wpx50'])[3]")
    WebElement assistant_box;

    @FindBy(xpath = "(//input[@class='inpt wpx50 tacnt'])[2]")
    WebElement cgrTipiNo_box;

    @FindBy(id = "KIMLIK_KONTROL")
    WebElement kimlikKontrol_checkBox;

    @FindBy(id = "KIMLIK_FOTOKOPISI")
    WebElement kimlikFotokopisi_checkBox;

    @FindBy(id = "HES_DOGRULAMA")
    WebElement hesKoduDogrula_checkBox;

    @FindBy(id = "ADLI_VAKA")
    List<WebElement> hakSahTipi_dropDown_list;

    @FindBy(id = "ADLI_VAKA")
    WebElement hakSahTipi_dropDown;

    @FindBy(id = "GSS_SORGU_TURU")
    WebElement tedaviTipi_dropDown;

    @FindBy(id = "GSS_SORGU_TURU")
    List<WebElement> tedaviTipi_dropDown_list;

    @FindBy(xpath = "(//input[@class='tacnt'])[6]")
    WebElement gssIlkTakip_box;

    @FindBy(xpath = "//a[@class='btnTakipAra text_btn_bul text_btn  pBtn']")
    WebElement takipAra_button;

    @FindBy(xpath = "//a[@class='btnHakSah text_btn_devam text_btn  pBtn']")
    WebElement hakSahipligi_button;

    @FindBy(id = "btnfGSS_C00Ac")
    WebElement gssC00_button;

    @FindBy(id = "GELIS_SEKLI_KODU")
    WebElement gelisSekli_dropDown;

    @FindBy(id = "GELIS_SEKLI_KODU")
    List<WebElement> gelisSekli_dropDown_list;

    @FindBy(id = "DOSYA_ISTEM")
    WebElement dosyaIstem_checkBox;

    @FindBy(id = "SAGLIK_KURULU_SEVK")
    WebElement saglikKuruluSevk_checkBox;

    @FindBy(id = "CARI_BEKLENECEK_TARIH")
    WebElement cariBekTarih_calender;

    @FindBy(xpath = "//span[@title='pazartesi']")
    WebElement day_monday;

    @FindBy(xpath = "//label[@data-target='pKabul']")
    WebElement acceptanceInformation_section;

    @FindBy(id = "KABUL_SEKLI_ID")
    WebElement acceptanceCriteria_dropDown;

    @FindBy(id = "KABUL_SEKLI_ID")
    List<WebElement> acceptanceCriteria_dropDown_list;

    @FindBy(id = "BASVURU_NEDEN_ID")
    WebElement reasonForApplication_dropDown;

    @FindBy(id = "BASVURU_NEDEN_ID")
    List<WebElement> reasonForApplication_dropDown_list;

    @FindBy(id = "BASVURU_NEDEN_ACIKLAMA")
    WebElement reasonForApplication_secondDropDown;

    @FindBy(id = "BASVURU_NEDEN_ACIKLAMA")
    List<WebElement> reasonForApplication_secondDropDown_list;

    @FindBy(id = "TERCIH_NEDEN_ID")
    WebElement reasonForPreference_dropDown;

    @FindBy(id = "TERCIH_NEDEN_ID")
    List<WebElement> reasonForPreference_dropDown_list;

    @FindBy(id = "TERCIH_NEDEN_ACIKLAMA")
    WebElement reasonForPreference_box;

    @FindBy(id = "YAKINMA_SIKAYET")
    WebElement complaint_box;

    @FindBy(xpath = "//input[@class='inpt wpx75 tacnt']")
    WebElement relationshipBox_box;

    @FindBy(id = "YAKIN_TC_NO")
    WebElement relationTC_box;

    @FindBy(id = "YAKIN_DOGUM_TARIHI")
    WebElement relationSBirthday_Calendar;

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
    WebElement transfer_button;

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

    @FindBy(id = "ENGEL_DURUMU")
    List<WebElement> engelDurumu_dropDown_list;

    @FindBy(id = "SOSYAL_DESTEK")
    WebElement sosyalDestek_dropDown;

    @FindBy(id = "SOSYAL_DESTEK")
    List<WebElement> sosyalDestek_dropDown_list;

    @FindBy(id = "IHTIYAC_DEGERLENDIRME")
    WebElement ihtiyacDegerlendirme_dropDown;

    @FindBy(id = "IHTIYAC_DEGERLENDIRME")
    List<WebElement> ihtiyacDegerlendirme_dropDown_list;

    @FindBy(xpath = "//a[@class='btnPolMuayeneDetayTanim   text_btn_border pBtn']")
    WebElement acceptanceInformationDescribing_button;
    @FindBy(xpath = "(//label[@class=\"fb500\"])[13]")
    WebElement acceptanceInformationTitle;

    @FindBy(xpath = "//a[@class='btnYabanciHastaKayit   text_btn_border pBtn']")
    WebElement foreignPatientRegistrationForm_button;

    @FindBy(xpath = "//label[@data-target='pHesap']")
    WebElement account_section;

    @FindBy(xpath = "(//td[@class='dx-ellipsis'])[1]")
    WebElement process_title;

    @FindBy(xpath = "//label[@data-target='pAvans']")
    WebElement advancePayment_section;

    @FindBy(id = "TELEFON")
    WebElement phone;

    @FindBy(xpath = "//p")
    WebElement warningPopUp;

    @FindBy(xpath = "(//td[@class='dxgv dx-ellipsis dx-ar'])[2]")
    WebElement assertProtocolNumber;

    @FindBy(id = "PRINTOUT POPUP")
    WebElement printOutPopUp;

    @FindBy(id = "UtilityOperations POPUP")
    WebElement utilityOperationsPopUp;

    @FindBy(xpath = "//span[@class='no item']")
    WebElement closeWarningPopUp_button;

    @FindBy(xpath = "//span[@class='warning item']")
    WebElement okeyWarningPopUp_button;

    @FindBy(xpath = "(//a[@class='text_btn text_btn_bul backWhite btnGelisIncele'])[1]")
    WebElement inspectFirstService_button;

    @FindBy(id = "POLIKLINIK_ADI")
    WebElement serviceName;

    @FindBy(id = "DOKTOR_ADI")
    WebElement doctorName;

    @FindBy(xpath = "//a[@class='btnPolDegistir text_btn_border pBtn padleftpx5']")
    WebElement serviceChange_button;

    @FindBy(id = "HASTA_DR_TERCIHI")
    WebElement hstTrch_checkBox;

    @FindBy(xpath = "(//a[@class='LookupSelectButton text_btn text_btn_ok backWhite'])[41]")
    WebElement disPol1_select;
    @FindBy(xpath = "(//a[@class='LookupSelectButton text_btn text_btn_ok backWhite'])[13]")
    WebElement beyinCerPol1_select;
    @FindBy(xpath = "(//a[@class='LookupSelectButton text_btn text_btn_ok backWhite'])[27]")
    WebElement dahiliyePol1_select;
    @FindBy(xpath = "(//a[@class='LookupSelectButton text_btn text_btn_ok backWhite'])[70]")
    WebElement gozPol1_select;
    @FindBy(xpath = "(//a[@class='LookupSelectButton text_btn text_btn_ok backWhite'])[87]")
    WebElement kbbPol1_select;
    @FindBy(xpath = "(//a[@class='LookupSelectButton text_btn text_btn_ok backWhite'])[85]")
    WebElement kardiyoPol1_select;

    @FindBy(xpath = "(//a[@class='LookupSelectButton text_btn text_btn_ok backWhite'])[1]")
    WebElement doctor_select;

    @FindBy(xpath = "(//a[@class='LookupSelectButton text_btn text_btn_ok backWhite'])[1]")
    WebElement assistant_select;

    @FindBy(xpath = "(//a[@class='LookupSelectButton text_btn text_btn_ok backWhite'])[10]")
    WebElement cgrTipiControl_select;

    @FindBy(id = "ACIKLAMA")
    WebElement description_box;

    @FindBy(xpath = "(//td[@class='dxgv dx-ellipsis'])[1]")
    WebElement firstServiceInServiceList;

    @FindBy(id = "btn3")
    WebElement continue_button;

    @FindBy(xpath = "(//a[@class='LookupSelectButton text_btn text_btn_ok backWhite'])[4]")
    WebElement father;

    @FindBy(xpath = "//a[@class='text_btn text_btn_devam backWhite btnGelisHizmetler']")
    WebElement services_button;

    @FindBy(xpath = "//td[@class='dxgv dx-ellipsis']")
    List<WebElement> patientsAllServices_list;
    @FindBy(xpath = "//a[@class='hem_button hem_islem hem_border backWhite btnVakaIslemler']")
    WebElement serviceSettings_button;
    @FindBy(xpath = "(//a[@onclick='VakaSil()'])[2]")
    WebElement deleteServiceRecord_button;
    @FindBy(xpath = "//span[@class='yes item']")
    WebElement yes_button;

    String tcID = ConfigReader.getProperty("TC");
    String tcID2 = ConfigReader.getProperty("TC2");
    String invalidTCID1 = ConfigReader.getProperty("invalidTCID1");
    String invalidTCID2 = ConfigReader.getProperty("invalidTCID2");
    String invalidTCIDWarningMessage = "Geçerli bir kimlik numarası giriniz.";
    String patientNo = ConfigReader.getProperty("PatientNo");
    String invalidPatientNo1 = ConfigReader.getProperty("invalidPatientNo1");
    String invalidPatientNo2 = ConfigReader.getProperty("invalidPatientNo2");
    String invalidPatientNoDWarningMessage2 = "Hasta No veya T.C. Kimlik No alanlarını doldurmadınız.";
    String protocolNo = ConfigReader.getProperty("ProtocolNo");
    String invalidProtocolNo1 = ConfigReader.getProperty("invalidProtocolNo1");
    String invalidProtocolNo2 = ConfigReader.getProperty("invalidProtocolNo2");
    String invalidProtocolNoMessage1 = "Aradığınız protokol numarası kayıtlı değil.";
    String invalidProtocolNoMessage2 = "Lütfen protokol numarasını giriniz.";
    String reportsButtonWarningMessage = "Lütfen hasta seçiniz!";
    String healthCouncilWarningMessage = "Protokol numarası olmadan bu işlemi yapamazsınız";
    String confirmButtonWarningMessage = "T.C. Kimlik no giriniz!";
    String relationTC = ConfigReader.getProperty("relationTC");
    String relationsNameLastName = ConfigReader.getProperty("relationsNameLastName");
    String relationsPhoneNumber = ConfigReader.getProperty("relationsPhoneNumber");
    String relationsPassportNumber = ConfigReader.getProperty("relationsPassportNumber");
    String relationsEmailAddress = ConfigReader.getProperty("relationsEmailAddress");
    String relationsAddress = ConfigReader.getProperty("relationsAddress");


    public void insertTCID() {
        tcIdNo_box.sendKeys(tcID);
    }

    public void goToPatientRegisterSection() {
        patient_button.click();
    }

    public void closePatientRegisterSection() {
        closePopupPage_button.click();
    }

    public void assertTCID() {
        System.out.println("tcIdNo_box.getAttribute(value) = " + tcIdNo_box.getAttribute("value"));
        Assert.assertEquals(tcIdNo_box.getAttribute("value"), tcID);
    }

    public void assertPatientNo() {
        System.out.println("patientNumber_box.getAttribute(\"value\") = " + patientNumber_box.getAttribute("value"));
        Assert.assertEquals(patientNumber_box.getAttribute("value"), patientNo);
    }

    public void clickClean() {
        clean_button.click();
    }

    public void insertPatientNo() {
        patientNumber_box.sendKeys(patientNo);
    }

    public void clickQuery() {
        query_button.click();
    }

    public void clickEnter() {
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void insertProtocolNumber() {
        protokolSearch_box.sendKeys(protocolNo);
    }

    public void assertProtocolNo() {
        Assert.assertEquals(assertProtocolNumber.getText(), protocolNo);
    }

    public void clickRun() {
        run_button.click();
    }

    public void assertPageClean() {
        System.out.println("tcIdNo_box.getAttribute(value) = " + tcIdNo_box.getAttribute("value"));
        Assert.assertEquals(tcIdNo_box.getAttribute("value"), "");

        //patient_button.click();
        //Assert.assertEquals(assert_tcIdNo.getAttribute("value"), "");
    }

    public void pressEnter() {
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void clickNewButton() {
        new_button.click();
    }

    public void clickDeleteButton() {
        delete_button.click();
    }

    public void clickPrint() {
        print_button.click();
    }

    public void assertPopUpPrintOut() {
        Assert.assertTrue(printOutPopUp.isDisplayed());
    }

    public void goToDetailedPatientSearchPage() {
        detailedPatientSearch_button.click();
    }

    public void assertTheDetailedPatientSearchPage() {
        Assert.assertTrue(popUpPage_Title.isDisplayed());
    }

    public void clickOnReportsButton() {
        reports_button.click();
    }

    public void closeWarningPopUp() {
        closeWarningPopUp_button.click();
    }

    public void assertTheReportTransactionsPopUp() {
        String reportTransactionsPopupTitle = "Rapor İşlemleri";
        String reportTransactionsPopupLocateTitle = popUpPage_Title.getText();
        System.out.println("reportTransactionsPopupTitle = " + reportTransactionsPopupTitle);
        System.out.println("reportTransactionsPopupLocateTitle = " + reportTransactionsPopupLocateTitle);
        Assert.assertTrue(reportTransactionsPopupLocateTitle.contains(reportTransactionsPopupTitle));
    }

    public void clickOnHealthCouncilButton() {
        healthCouncil_button.click();
    }

    public void assertTheHealthCouncilPage() {
        String healthCouncilPageTitle = "Sağlık Kurulu";
        Assert.assertEquals(healthCouncil_title.getText(), healthCouncilPageTitle);
    }

    public void goToUtilityOperationsPage() {
        utilityOperations_button.click();
    }

    public void assertUtilityOperationsPage() {
        Assert.assertTrue(utilityOperationsPopUp.isDisplayed());
    }

    public void clickOnRISButton() {
        ris_button.click();
    }

    public void assertTheRISAcceptanceProceduresPage() {
        String risPageTitle = "Ris Kabul İşlemleri";
        Assert.assertEquals(popUpPage_Title.getText(), risPageTitle);
    }

    public void clickOnLabButton() {
        lab_button.click();
    }

    public void assertTheLabPreAcceptancePage() {
        String labPageTitle = "Lab. Ön Kabul";
        Assert.assertEquals(popUpPage_Title.getText(), labPageTitle);
    }

    public void goToAcceptanceInformationSection() {
        acceptanceInformation_section.click();
    }

    public void asserAcceptanceInformationSection() {
        System.out.println("acceptanceInformationTitle.getAttribute(\"textContent\") = " + acceptanceInformationTitle.getAttribute("textContent"));
        Assert.assertTrue(acceptanceInformationTitle.getAttribute("textContent").contains("Kabul Şekli"));
    }

    public void goToAccountSection() {
        account_section.click();
    }

    public void asserAccountSection() {
        Assert.assertTrue(process_title.isDisplayed());

    }

    public void goToAdvancePaymentSection() {
        advancePayment_section.click();
    }

    public void assertAdvancePaymentSection() {
        Assert.assertTrue(advancePayment_section.isDisplayed());
    }

    public void clickOnConfirmButton() {
        confirm_button.click();
    }

    public void clickOnSearchButton() {
        search_button.click();
    }

    public void assertThePatientSearchPage() {
        String patientSearchPageTitle = "Hasta Arama Ekranı";
        Assert.assertEquals(popUpPage_Title.getText(), patientSearchPageTitle);
    }

    public void assertThePatientRegisterPopupPage() {
        String patientRegisterPopupPagePageTitle = "Hasta Kayıt";
        Assert.assertEquals(popUpPage_Title.getText(), patientRegisterPopupPagePageTitle);
    }

    public void chooseClickTheFirstOfHistoryOfPatientSService() {
        inspectFirstService_button.click();
    }

    public void assertTheServiceName() {
        Assert.assertTrue(serviceName.isDisplayed());
    }

    public void assertTheDoctorName() {
        Assert.assertTrue(doctorName.isDisplayed());
    }

    public void clickOnChangeButton() {
        serviceChange_button.click();
    }

    public void assertTheServiceListPopupPage() {
        String serviceSListPopupPageTitle = "Seçilen kayıt sayısı:0";
        Assert.assertEquals(popUpPage_Title.getText(), serviceSListPopupPageTitle);
    }

    public void clickTheCheckBoxOfHstTer() {
        hstTrch_checkBox.click();
    }

    public void doubleClickOnServiceIDBox() {
        actions.doubleClick(serviceID_box).perform();
    }

    public void selectService() {
        disPol1_select.click();
    }

    public void doubleClickTheDoctorIDBox() {
        actions.doubleClick(doctorID_box).perform();
    }

    public void selectTheFirstDoctor() {
        doctor_select.click();
    }

    public void doubleClickOnAssistantIDBox() {
        actions.doubleClick(assistant_box).perform();
    }

    public void selectTheFirstAssistant() {
        assistant_select.click();
    }

    public void doubleClickCgrTipiNoBox() {
        actions.doubleClick(cgrTipiNo_box).perform();
    }

    public void selectTheControl() {
        cgrTipiControl_select.click();
    }

    public void insertTheDescription(String arg0) {
        description_box.sendKeys(arg0);
    }

    public void clickSaveButton() {
        save_button.click();
    }

    public void assertRecordPopupPage() {
        String serviceRecordPopupTitle = "Hastanın bugüne ait geliş kayıtları bulunmaktadır!";
        Assert.assertTrue(popUpPage_Title.getText().contains(serviceRecordPopupTitle));
    }

    public void assertTheNewRecordInServiceSList() {
        String serviceName = "KBB.1";
        Assert.assertEquals(firstServiceInServiceList.getText(), serviceName);
    }

    public void clickContinueButton() {
        ReusableMethods.clickWithTimeOut(continue_button,3);
//        continue_button.click();
    }

    public void assertTheSavedMessage() {
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains("Bilgiler kaydedildi"));
        //Assert.assertNotNull(warningPopUp);
        ReusableMethods.waitFor(3);
    }

    public void clickOnHakSahTipi() {
        hakSahTipi_dropDown.click();
    }

    public void assertTheListOfHakSahTipi() {
        Assert.assertFalse(hakSahTipi_dropDown_list.isEmpty());
        phone.click();
    }

    public void doubleClickInGSSIlkTakipBox() {
        actions.doubleClick(gssIlkTakip_box).perform();
    }

    public void clickOnTakipAraButton() {
        takipAra_button.click();
    }

    public void assertTheTakipAraPage() {
        String takipAraPageTitle = "GSS'den Takip Ara";
        Assert.assertEquals(popUpPage_Title.getText(), takipAraPageTitle);
    }

    public void closeTheTakipAraPage() {
        closePopupPage_button.click();
    }

    public void clickOnHakSahipligiButton() {
        hakSahipligi_button.click();
    }

    public void clickOnGssCButton() {
        gssC00_button.click();
    }

    public void assertThePopupSection(String arg0) {
        Assert.assertEquals(popUpPage_Title.getText(), arg0);
    }

    public void clickOnGelisSekliDropDownList() {
        gelisSekli_dropDown.click();
    }

    public void assertTheGelisSekliDropDown() {
        Assert.assertFalse(gelisSekli_dropDown_list.isEmpty());
        phone.click();
    }

    public void clickOnTedaviTipiDropDownList() {
        tedaviTipi_dropDown.click();
    }

    public void assertTheTedaviTipiDropDownList() {
        Assert.assertFalse(tedaviTipi_dropDown_list.isEmpty());
        phone.click();
    }

    public void closeGssCOOPopupPage() {
        closePopupPage_button.click();
    }

    public void clickOnCariBekTarih() {
        cariBekTarih_calender.click();
    }

    public void assertTheCalendar() {
        Assert.assertTrue(day_monday.isDisplayed());
    }

    public void clickOnCheckBoxKimligiKontrolEdildi() {
        kimlikKontrol_checkBox.click();
    }

    public void assertTheKimligiKontrolEdildiCheckBoxWasChecked() {
        Assert.assertTrue(kimlikKontrol_checkBox.isSelected());
    }

    public void clickOnCheckBoxKimligiFotokopisiAlindi() {
        kimlikFotokopisi_checkBox.click();
    }

    public void assertTheKimligiFotokopisiAlindiCheckBoxWasChecked() {
        Assert.assertTrue(kimlikKontrol_checkBox.isSelected());
    }

    public void clickOnCheckBoxHESKoduDogrulandi() {
        hesKoduDogrula_checkBox.click();
    }

    public void assertTheHESKoduDogrulandiCheckBoxWasChecked() {
        Assert.assertTrue(hesKoduDogrula_checkBox.isSelected());
    }

    public void clickOnCheckBoxDosyaIstemiYap() {
        dosyaIstem_checkBox.click();
    }

    public void assertTheDosyaIstemiYapCheckBoxWasChecked() {
        Assert.assertTrue(dosyaIstem_checkBox.isSelected());
    }

    public void clickOnCheckBoxSaglikKuruluSevk() {
        saglikKuruluSevk_checkBox.click();
    }

    public void assertTheSaglikKuruluSevkCheckBoxWasChecked() {
        Assert.assertTrue(saglikKuruluSevk_checkBox.isSelected());
    }

    public void clickOnAcceptanceInformationDescribingButton() {
        acceptanceInformationDescribing_button.click();
    }

    public void assertTheDetailsDescribingPage() {
        String detailsDescribingPage_title = "Detay Tanımları";
        Assert.assertEquals(popUpPage_Title.getText(), detailsDescribingPage_title);
    }

    public void closeTheDetailsDescribingPage() {
        closePopupPage_button.click();
    }

    public void clickOnForeignPatientRegistrationFormButton() {
        foreignPatientRegistrationForm_button.click();
    }

    public void assertTheForeignPatientRegistrationFormPage() {
        String foreignPatientRegistrationForm_title = "Yabancı Hasta Kayıt Formu";
        Assert.assertEquals(popUpPage_Title.getText(), foreignPatientRegistrationForm_title);
    }

    public void closeTheForeignPatientRegistrationFormPage() {
        closePopupPage_button.click();
    }

    public void checkDailyServiceAppointment() {
        if (popUpPage_Title.isDisplayed()) {
            continue_button.click();
        }
    }

    public void checkTCIDWarningPopup() {
        if (okeyWarningPopUp_button.isEnabled()) {
            ReusableMethods.waitForClickablility(okeyWarningPopUp_button,5);
            okeyWarningPopUp_button.click();
        }
    }

    public void clickOnAcceptanceCriteriaDropDownList() {
        acceptanceCriteria_dropDown.click();
    }

    public void assertTheAcceptanceCriteriaDropDownList() {
        Assert.assertFalse(acceptanceCriteria_dropDown_list.isEmpty());
        phone.click();
    }

    public void clickOnReasonForApplicationDropDownList() {
        reasonForApplication_dropDown.click();
    }

    public void assertTheReasonForApplicationDropDownList() {
        Assert.assertFalse(reasonForApplication_dropDown_list.isEmpty());
        phone.click();
    }

    public void clickOnReasonForPreferenceDropDownList() {
        reasonForPreference_dropDown.click();
    }

    public void assertTheReasonForPreferenceDropDownList() {
        Assert.assertFalse(reasonForPreference_dropDown_list.isEmpty());
        phone.click();
    }

    public void clickOnReasonForApplicationSecondDropDownList() {
        reasonForApplication_secondDropDown.click();
    }

    public void assertTheReasonForApplicationSecondDropDownList() {
        Assert.assertFalse(reasonForApplication_secondDropDown_list.isEmpty());
        phone.click();
    }

    public void insertTheDescriptionInComplaintBox(String arg0) {
        complaint_box.sendKeys(arg0);
    }

    public void insertTheDescriptionInReasonForPreferenceBox(String arg0) {
        reasonForPreference_box.sendKeys(arg0);
    }

    public void doubleClickInRelationshipBox() {
        actions.doubleClick(relationshipBox_box).perform();
    }

    public void assertTheRelationshipPopupPage() {
        Assert.assertTrue(popUpPage_Title.isDisplayed());
    }

    public void closeTheRelationshipPopupPage() {
        closePopupPage_button.click();
    }

    public void insertTheTCIDOfRelationship() {
        relationTC_box.sendKeys(relationTC);
    }

    public void assertTheTCIDOfRelationship() {
        Assert.assertEquals(relationTC_box.getAttribute("value"), relationTC);
    }

    public void clickOnRelationSBirthdayCalendar() {
        relationSBirthday_Calendar.click();
    }

    public void assertRelationSBirthdayCalendar() {
        Assert.assertTrue(day_monday.isDisplayed());
        phone.click();
    }

    public void clickOnTransferButton() {
        transfer_button.click();
    }

    public void assertTheTransferPopupPage() {
        Assert.assertTrue(popUpPage_Title.isDisplayed());
    }

    public void closeTheTransferPopupPage() {
        closePopupPage_button.click();
    }

    public void insertTheNameLastnameOfRelationship() {
        yakinAdSoyad_box.sendKeys(relationsNameLastName);
    }

    public void insertThePhoneNumberOfRelationship() {
        yakinTelNo_box.sendKeys(relationsPhoneNumber);
    }

    public void insertThePassportNumberOfRelationship() {
        yakinPasaportNo_box.sendKeys(relationsPassportNumber);
    }

    public void insertTheEmailOfRelationship() {
        yakinEPosta_box.sendKeys(relationsEmailAddress);
    }

    public void insertTheAddressRelationship() {
        yakinAdres_box.sendKeys(relationsAddress);
    }

    public void clickTheReceivedOnApproveRadioButton() {
        alindi_radioButton.click();
    }

    public void assertTheReceivedOnApproveRadioButtonSelected() {
        Assert.assertTrue(alindi_radioButton.isSelected());
    }

    public void clickTheNotReceivedOnApproveRadioButton() {
        alinmadi_radioButton.click();
    }

    public void assertTheNotReceivedOnApproveRadioButtonSelected() {
        Assert.assertTrue(alinmadi_radioButton.isSelected());
    }

    public void clickTheCheckBoxDressingProcess() {
        pansuman_box.click();
    }

    public void assertTheCheckBoxDressingProcessSelected() {
        Assert.assertTrue(pansuman_box.isSelected());
    }

    public void clickTheCheckBoxNoIdCard() {
        kimlikYaninda_box.click();
    }

    public void assertTheCheckBoxNoIdCardSelected() {
        Assert.assertTrue(kimlikYaninda_box.isSelected());
    }

    public void clickTheCheckBoxPrescriptions() {
        receteIcinGeldi_box.click();
    }

    public void assertTheCheckBoxPrescriptionsSelected() {
        Assert.assertTrue(receteIcinGeldi_box.isSelected());
    }

    public void clickOnDisabilitySituationDropDownList() {
        engelDurumu_dropDown.click();
    }

    public void assertTheDisabilitySituationDropDownList() {
        Assert.assertFalse(engelDurumu_dropDown_list.isEmpty());
    }

    public void clickOnSocialCareDropDownList() {
        sosyalDestek_dropDown.click();
    }

    public void assertTheSocialCareDropDownList() {
        Assert.assertFalse(sosyalDestek_dropDown_list.isEmpty());
    }

    public void clickOnNeedsAssessmentDropDownList() {
        ihtiyacDegerlendirme_dropDown.click();
    }

    public void assertTheNeedsAssessmentDropDownList() {
        Assert.assertFalse(ihtiyacDegerlendirme_dropDown_list.isEmpty());
    }

    public void selectTheRelationship() {
        father.click();
    }

    public void assertThePassportNumberOfRelationship() {
        Assert.assertEquals(yakinPasaportNo_box.getAttribute("value"), relationsPassportNumber);
    }

    public void assertTheEmailOfRelationship() {
        Assert.assertEquals(yakinEPosta_box.getAttribute("value"), relationsEmailAddress);
    }

    public void assertTheAddressOfRelationship() {
        Assert.assertEquals(yakinAdres_box.getAttribute("value"), relationsAddress);
    }

    public void assertTheDescriptionInComplaintBox(String arg0) {
        Assert.assertEquals(complaint_box.getAttribute("value"), arg0);
    }

    public void assertTheDescriptionInReasonForPreferenceBox(String arg0) {
        Assert.assertEquals(reasonForPreference_box.getAttribute("value"), arg0);
    }

    public void assertTheAllServicesThatPatientGot() {
        Assert.assertFalse(patientsAllServices_list.isEmpty());
    }

    public void clickOnInspectButtonForFirstService() {
        inspectFirstService_button.click();
    }

    public void clickOnServicesButton() {
        services_button.click();
    }

    public void assertThePatientSServicesPage() {
        String patientsServicesPageTitle = "Hastanın Hizmetleri";
        Assert.assertEquals(popUpPage_Title.getText(), patientsServicesPageTitle);
    }

    public void assertTheConfirmationPopup() {
        Assert.assertTrue(popUpPage_Title.isDisplayed());
    }

    public void closeDailyServiceAppointmentPopupPage() {
        closePopupPage_button.click();
    }


    public void insertTheInvalidTCIDNumberToTCIDBox() {
        tcIdNo_box.sendKeys(invalidTCID1);
    }

    public void insertTheSecondTCIdentityNumberInTCIDBox() {
        tcIdNo_box.sendKeys(invalidTCID2);
    }

    public void insertTheInvalidPatientNumberNumberToPatientNumberBox() {
        patientNumber_box.sendKeys(invalidPatientNo1);
    }

    public void insertTheSecondInvalidPatientNumberNumberToPatientNumberBox() {
        patientNumber_box.sendKeys(invalidPatientNo2);
    }

    public void insertTheInvalidProtocolNumberInTheProtocolBox() {
        protokolSearch_box.sendKeys(invalidProtocolNo1);
    }

    public void insertTheSecondInvalidProtocolNumberInTheProtocolBox() {
        protokolSearch_box.sendKeys(invalidProtocolNo2);
    }

    public void assertTheInvalidTCIDNumberWarningMessage() {
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains(invalidTCIDWarningMessage));
    }

    public void assertTheSecondTCIdentityNumberWarningMessage() {
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains(invalidTCIDWarningMessage));
    }

    public void assertTheInvalidPatientNumberWarningMessage() {
        System.out.println("warningPopUp.getAttribute(\"textContent\") = " + warningPopUp.getAttribute("textContent"));
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains(invalidPatientNo1));
    }

    public void assertTheSecondInvalidPatientNumberWarningMessage() {
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains(invalidPatientNoDWarningMessage2));
    }

    public void assertTheInvalidProtocolNumber() {
        System.out.println("warningPopUp.getAttribute(\"textContent\") = " + warningPopUp.getAttribute("textContent"));
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains(invalidProtocolNoMessage1));
    }

    public void assertTheSecondInvalidProtocolNumber() {
        System.out.println("warningPopUp.getAttribute(\"textContent\") = " + warningPopUp.getAttribute("textContent"));
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains(invalidProtocolNoMessage2));
    }

    public void assertTheWarningMessageOfReportsButton() {
        System.out.println("warningPopUp.getAttribute(\"textContent\") = " + warningPopUp.getAttribute("textContent"));
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains(reportsButtonWarningMessage));
    }

    public void assertTheHealthCouncilWarningMessage() {
        System.out.println("warningPopUp.getAttribute(\"textContent\") = " + warningPopUp.getAttribute("textContent"));
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains(healthCouncilWarningMessage));
    }

    public void assertTheRISWarningMessage() {
        System.out.println("warningPopUp.getAttribute(\"textContent\") = " + warningPopUp.getAttribute("textContent"));
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains(healthCouncilWarningMessage));
    }

    public void assertTheLabWarningMessage() {
        System.out.println("warningPopUp.getAttribute(\"textContent\") = " + warningPopUp.getAttribute("textContent"));
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains(healthCouncilWarningMessage));
    }

    public void assertTheConfirmButtonWarningMessage() {
        System.out.println("warningPopUp.getAttribute(\"textContent\") = " + warningPopUp.getAttribute("textContent"));
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains(confirmButtonWarningMessage));
    }

    public void insertTheTCIdentityNumberInTCIDBoxForService() {
        tcIdNo_box.sendKeys(tcID2);
    }

    public void assertTheKLNWarningMessage() {
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains("KLN/KLN"));
    }

    public void assertTheGSSWarningMessage() {
        System.out.println("warningPopUp.getAttribute(\"textContent\") = " + warningPopUp.getAttribute("textContent"));
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains("GSS numarası olmadan bu işlemi yapamazsınız."));
    }

    public void assertTheHakSahipligiWarningMessage() {
        System.out.println("warningPopUp.getAttribute(\"textContent\") = " + warningPopUp.getAttribute("textContent"));
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains("Devredilen Kurum Bilgisi Boş Gönderilemez"));
    }

    public void assertTheForeignPatientWarningMessage() {
        System.out.println("warningPopUp.getAttribute(\"textContent\") = " + warningPopUp.getAttribute("textContent"));
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains("Hasta numarası olmadan bu işlemi yapamazsınız."));
    }

    public void goToHastaButton() {
        patient_button.click();
    }

    public void closeHastaButton() {
        closePopupPage_button.click();
    }

    public void scrollDown() {
        actions.scrollByAmount(0,80).perform();
    }

    public void clickOnServiceSettingsButton() {
        serviceSettings_button.click();
    }

    public void clickOnDeleteServiceButton() {
        deleteServiceRecord_button.click();
    }

    public void clickYesButtonForDelete() {
        yes_button.click();
    }

    public void assertTheServiceRecordIsDeleted() {
        System.out.println("warningPopUp.getAttribute(\"textContent\") = " + warningPopUp.getAttribute("textContent"));
        Assert.assertTrue(warningPopUp.getAttribute("textContent").contains("Muayene kaydı silindi!"));
    }
}
