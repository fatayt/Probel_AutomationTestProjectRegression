package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.Muayene_Kayit_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class MuayeneKayit_StepDefinitions {

    Muayene_Kayit_Page mkp = new Muayene_Kayit_Page(Driver.getDriver());
    BasePage bp = new BasePage();



    @When("insert the TC Identity Number in TC ID box")
    public void insertTheTCIdentityNumberInTCIDBox() {
        mkp.insertTCID();
    }

    @And("assert the patient's TC ID")
    public void assertThePatientSTCID() {
        mkp.assertTCID();
    }

    @And("click on clean button")
    public void clickOnCleanButton() {
        mkp.clickClean();
    }

    @And("insert the Patient Number in Patient number box")
    public void insertThePatientNumberInPatientNumberBox() {
        mkp.insertPatientNo();
    }

    @Then("assert the Patient number")
    public void assertThePatientNumber() {
        mkp.assertPatientNo();
    }

    @When("click on query button")
    public void clickOnQueryButton() {
        mkp.clickQuery();
    }

    @And("insert the protocol number in the box and press enter")
    public void insertTheProtocolNumberInTheBoxAndPressEnter() {
        mkp.insertProtocolNumber();
        mkp.clickEnter();
    }

    @And("assert the patient information")
    public void assertThePatientInformation() {
        mkp.goToPatientRegisterSection();
        mkp.assertPatientNo();
        mkp.closePatientRegisterSection();
        mkp.clickClean();
    }

    @And("assert the patient's the protocol number")
    public void assertThePatientSTheProtocolNumber() {
        mkp.assertProtocolNo();
    }

    @And("insert the protocol number in the protocol box")
    public void insertTheProtocolNumberInTheProtocolBox() {
        mkp.insertProtocolNumber();
    }

    @And("click on run button")
    public void clickOnRunButton() {
        mkp.clickRun();
    }

    @Then("assert the all page is clean")
    public void assertTheAllPageIsClean() {
        mkp.assertPageClean();
    }

    @And("press enter")
    public void pressEnter() {
        mkp.pressEnter();
    }

    @And("click on new button")
    public void clickOnNewButton() {
        mkp.clickNewButton();
    }

    @And("click on delete button")
    public void clickOnDeleteButton() {
        mkp.clickDeleteButton();
    }

    @And("close patient information popup")
    public void closePatientRegisterPopup() {
        mkp.closePatientRegisterSection();
    }

    @And("click on print button")
    public void clickOnPrintButton() {
        mkp.clickPrint();
    }

    @Then("assert the popup for print out")
    public void assertThePopupForPrintOut() {
        mkp.assertPopUpPrintOut();
    }

    @When("click on Detailed Patient Search button")
    public void clickOnDetailedPatientSearchButton() {
        mkp.goToDetailedPatientSearchPage();
    }

    @Then("assert the Detailed Patient Search page")
    public void assertTheDetailedPatientSearchPage() {
        mkp.assertTheDetailedPatientSearchPage();
    }

    @When("click on Reports button")
    public void clickOnReportsButton() {
        mkp.clickOnReportsButton();
    }

    @And("close the warning message")
    public void closeTheWarningMessage() {
        mkp.closeWarningPopUp();
    }

    @Then("assert the Report Transactions pop up")
    public void assertTheReportTransactionsPopUp() {
        mkp.assertTheReportTransactionsPopUp();
    }

    @When("click on Health Council button")
    public void clickOnHealthCouncilButton() {
        mkp.clickOnHealthCouncilButton();
    }

    @Then("assert the Health Council page")
    public void assertTheHealthCouncilPage() {
        mkp.assertTheHealthCouncilPage();
    }

    @When("click on Utility Operations button")
    public void clickOnUtilityOperationsButton() {
        mkp.goToUtilityOperationsPage();
    }

    @Then("assert the Utility Operations pop up")
    public void assertTheUtilityOperationsPopUp() {
        mkp.assertUtilityOperationsPage();
    }

    @When("click on RIS button")
    public void clickOnRISButton() {
        mkp.clickOnRISButton();
    }

    @Then("assert the RIS Acceptance Procedures page")
    public void assertTheRISAcceptanceProceduresPage() {
        mkp.assertTheRISAcceptanceProceduresPage();
    }

    @When("click on Lab button")
    public void clickOnLabButton() {
        mkp.clickOnLabButton();
    }

    @Then("assert the Lab. Pre-acceptance page")
    public void assertTheLabPreAcceptancePage() {
        mkp.assertTheLabPreAcceptancePage();
    }

    @When("click on acceptance information button")
    public void clickOnAcceptanceInformationButton() {
        mkp.goToAcceptanceInformationSection();
    }

    @Then("assert the acceptance information section")
    public void assertTheAcceptanceInformationSection() {
        mkp.asserAcceptanceInformationSection();
    }

    @When("click on account button")
    public void clickOnAccountButton() {
        mkp.goToAccountSection();
    }

    @Then("assert the account section")
    public void assertTheAccountSection() {
        mkp.asserAccountSection();
    }

    @When("click on advance payment button")
    public void clickOnAdvancePaymentButton() {
        mkp.goToAdvancePaymentSection();
    }

    @Then("assert the advance payment section")
    public void assertTheAdvancePaymentSection() {
        mkp.assertAdvancePaymentSection();
    }

    @When("click on confirm button")
    public void clickOnConfirmButton() {
        mkp.clickOnConfirmButton();
    }


    @Then("assert the confirmation popup")
    public void assertTheConfirmationPopup() {
        mkp.assertTheConfirmationPopup();
    }

    @When("click on search button")
    public void clickOnSearchButton() {
        mkp.clickOnSearchButton();
    }

    @Then("assert the patient search page")
    public void assertThePatientSearchPage() {
        mkp.assertThePatientSearchPage();
    }

    @When("click on patient button")
    public void clickOnPatientButton() {
        mkp.goToPatientRegisterSection();
    }

    @Then("assert the patient register popup page")
    public void assertThePatientRegisterPopupPage() {
        mkp.assertThePatientRegisterPopupPage();
    }

    @And("choose click the first of history of patient's service")
    public void chooseClickTheFirstOfHistoryOfPatientSService() {
        mkp.chooseClickTheFirstOfHistoryOfPatientSService();
    }

    @And("assert the service name")
    public void assertTheServiceName() {
        mkp.assertTheServiceName();
    }

    @And("assert the doctor name")
    public void assertTheDoctorName() {
        mkp.assertTheDoctorName();
    }

    @And("click on change button")
    public void clickOnChangeButton() {
        mkp.clickOnChangeButton();
    }

    @Then("assert the service list popup page")
    public void assertTheServiceListPopupPage() {
        mkp.assertTheServiceListPopupPage();
    }

    @And("click the check box of HstTer")
    public void clickTheCheckBoxOfHstTer() {
        mkp.clickTheCheckBoxOfHstTer();
    }

    @And("double click on service ID box")
    public void doubleClickOnServiceIDBox() {
        mkp.doubleClickOnServiceIDBox();
    }

    @And("select service")
    public void selectService() {
        mkp.selectService();
    }

    @And("double click the doctor ID box")
    public void doubleClickTheDoctorIDBox() {
        mkp.doubleClickTheDoctorIDBox();
    }

    @And("select the first doctor")
    public void selectTheFirstDoctor() {
        mkp.selectTheFirstDoctor();
    }

    @And("double click on assistant ID box")
    public void doubleClickOnAssistantIDBox() {
        mkp.doubleClickOnAssistantIDBox();
    }

    @And("select the first assistant")
    public void selectTheFirstAssistant() {
        mkp.selectTheFirstAssistant();
    }

    @And("double click CgrTipiNo box")
    public void doubleClickCgrTipiNoBox() {
        mkp.doubleClickCgrTipiNoBox();
    }

    @And("select the control")
    public void selectTheControl() {
        mkp.selectTheControl();
    }

    @And("insert the description {string}")
    public void insertTheDescription(String arg0) {
        mkp.insertTheDescription(arg0);
    }

    @And("click save button")
    public void clickSaveButton() {
        mkp.clickSaveButton();
    }

    @And("assert record popup page")
    public void assertRecordPopupPage() {
        mkp.assertRecordPopupPage();
    }

    @Then("assert the new record in service's list")
    public void assertTheNewRecordInServiceSList() {
        mkp.assertTheNewRecordInServiceSList();
    }

    @And("click continue button")
    public void clickContinueButton() {
        mkp.clickContinueButton();
    }

    @And("assert the saved message")
    public void assertTheSavedMessage() {
        mkp.assertTheSavedMessage();
    }

    @When("click on HakSahTipi")
    public void clickOnHakSahTipi() {
        mkp.clickOnHakSahTipi();
    }

    @Then("assert the list of HakSahTipi")
    public void assertTheListOfHakSahTipi() {
        mkp.assertTheListOfHakSahTipi();
    }

    @When("double click in GSSIlk Takip box")
    public void doubleClickInGSSIlkTakipBox() {
        mkp.doubleClickInGSSIlkTakipBox();
    }

    @When("click on TakipAra button")
    public void clickOnTakipAraButton() {
        mkp.clickOnTakipAraButton();
    }

    @Then("assert the TakipAra page")
    public void assertTheTakipAraPage() {
        mkp.assertTheTakipAraPage();
    }

    @And("close the TakipAra page")
    public void closeTheTakipAraPage() {
        mkp.closeTheTakipAraPage();
    }

    @When("click on HakSahipligi button")
    public void clickOnHakSahipligiButton() {
        mkp.clickOnHakSahipligiButton();
    }

    @When("click on GssCOO button")
    public void clickOnGssCButton() {
        mkp.clickOnGssCButton();
    }

    @Then("assert the {string} popup section")
    public void assertThePopupSection(String arg0) {
        mkp.assertThePopupSection(arg0);
    }

    @And("close GssCOO popup page")
    public void closeGssCOOPopupPage() {
        mkp.closeGssCOOPopupPage();
    }

    @When("click on GelisSekli drop down list")
    public void clickOnGelisSekliDropDownList() {
        mkp.clickOnGelisSekliDropDownList();
    }

    @Then("assert the GelisSekli drop down")
    public void assertTheGelisSekliDropDown() {
        mkp.assertTheGelisSekliDropDown();
    }

    @When("click on TedaviTipi drop down list")
    public void clickOnTedaviTipiDropDownList() {
        mkp.clickOnTedaviTipiDropDownList();
    }

    @Then("assert the TedaviTipi drop down list")
    public void assertTheTedaviTipiDropDownList() {
        mkp.assertTheTedaviTipiDropDownList();
    }

    @When("click on CariBekTarih")
    public void clickOnCariBekTarih() {
        mkp.clickOnCariBekTarih();
    }

    @Then("assert the calendar")
    public void assertTheCalendar() {
        mkp.assertTheCalendar();
    }

    @When("click on check box KimligiKontrolEdildi")
    public void clickOnCheckBoxKimligiKontrolEdildi() {
        mkp.clickOnCheckBoxKimligiKontrolEdildi();
    }

    @Then("assert the KimligiKontrolEdildi check box was checked")
    public void assertTheKimligiKontrolEdildiCheckBoxWasChecked() {
        mkp.assertTheKimligiKontrolEdildiCheckBoxWasChecked();
    }

    @When("click on check box KimligiFotokopisiAlindi")
    public void clickOnCheckBoxKimligiFotokopisiAlindi() {
        mkp.clickOnCheckBoxKimligiFotokopisiAlindi();
    }

    @Then("assert the KimligiFotokopisiAlindi check box was checked")
    public void assertTheKimligiFotokopisiAlindiCheckBoxWasChecked() {
        mkp.assertTheKimligiFotokopisiAlindiCheckBoxWasChecked();
    }

    @When("click on check box HESKoduDogrulandi")
    public void clickOnCheckBoxHESKoduDogrulandi() {
        mkp.clickOnCheckBoxHESKoduDogrulandi();
    }

    @Then("assert the HESKoduDogrulandi check box was checked")
    public void assertTheHESKoduDogrulandiCheckBoxWasChecked() {
        mkp.assertTheHESKoduDogrulandiCheckBoxWasChecked();
    }

    @When("click on check box DosyaIstemiYap")
    public void clickOnCheckBoxDosyaIstemiYap() {
        mkp.clickOnCheckBoxDosyaIstemiYap();
    }

    @Then("assert the DosyaIstemiYap check box was checked")
    public void assertTheDosyaIstemiYapCheckBoxWasChecked() {
        mkp.assertTheDosyaIstemiYapCheckBoxWasChecked();
    }

    @When("click on check box SaglikKuruluSevk")
    public void clickOnCheckBoxSaglikKuruluSevk() {
        mkp.clickOnCheckBoxSaglikKuruluSevk();
    }

    @Then("assert the SaglikKuruluSevk check box was checked")
    public void assertTheSaglikKuruluSevkCheckBoxWasChecked() {
        mkp.assertTheSaglikKuruluSevkCheckBoxWasChecked();
    }

    @When("click on acceptance information describing button")
    public void clickOnAcceptanceInformationDescribingButton() {
        mkp.clickOnAcceptanceInformationDescribingButton();
    }

    @And("assert the details describing page")
    public void assertTheDetailsDescribingPage() {
        mkp.assertTheDetailsDescribingPage();
    }

    @Then("close the details describing page")
    public void closeTheDetailsDescribingPage() {
        mkp.closeTheDetailsDescribingPage();
    }

    @When("click on foreign patient registration form button")
    public void clickOnForeignPatientRegistrationFormButton() {
        mkp.clickOnForeignPatientRegistrationFormButton();
    }

    @Then("assert the foreign patient registration form page")
    public void assertTheForeignPatientRegistrationFormPage() {
        mkp.assertTheForeignPatientRegistrationFormPage();
    }

    @Then("close the foreign patient registration form page")
    public void closeTheForeignPatientRegistrationFormPage() {
        mkp.closeTheForeignPatientRegistrationFormPage();
    }

    @And("check daily service appointment")
    public void checkDailyServiceAppointment() {
        mkp.checkDailyServiceAppointment();
    }

    @And("check TC ID warning popup")
    public void checkTCIDWarningPopup() {
        mkp.checkTCIDWarningPopup();
    }

    @When("click on acceptance criteria drop down list")
    public void clickOnAcceptanceCriteriaDropDownList() {
        mkp.clickOnAcceptanceCriteriaDropDownList();
    }

    @Then("assert the acceptance criteria drop down list")
    public void assertTheAcceptanceCriteriaDropDownList() {
        mkp.assertTheAcceptanceCriteriaDropDownList();
    }

    @When("click on reason for application drop down list")
    public void clickOnReasonForApplicationDropDownList() {
        mkp.clickOnReasonForApplicationDropDownList();
    }

    @Then("assert the reason for application drop down list")
    public void assertTheReasonForApplicationDropDownList() {
        mkp.assertTheReasonForApplicationDropDownList();
    }

    @When("click on reason for application second drop down list")
    public void clickOnReasonForApplicationSecondDropDownList() {
        mkp.clickOnReasonForApplicationSecondDropDownList();
    }

    @Then("assert the reason for application second drop down list")
    public void assertTheReasonForApplicationSecondDropDownList() {
        mkp.assertTheReasonForApplicationSecondDropDownList();
    }

    @When("click on reason for preference drop down list")
    public void clickOnReasonForPreferenceDropDownList() {
        mkp.clickOnReasonForPreferenceDropDownList();
    }

    @Then("assert the reason for preference drop down list")
    public void assertTheReasonForPreferenceDropDownList() {
        mkp.assertTheReasonForPreferenceDropDownList();
    }

    @When("insert the description {string} in complaint box")
    public void insertTheDescriptionInComplaintBox(String arg0) {
        mkp.insertTheDescriptionInComplaintBox(arg0);
    }

    @When("insert the description {string} in reason for preference box")
    public void insertTheDescriptionInReasonForPreferenceBox(String arg0) {
        mkp.insertTheDescriptionInReasonForPreferenceBox(arg0);
    }

    @When("double click in relationship box")
    public void doubleClickInRelationshipBox() {
        mkp.doubleClickInRelationshipBox();
    }

    @Then("assert the relationship popup page")
    public void assertTheRelationshipPopupPage() {
        mkp.assertTheRelationshipPopupPage();
    }

    @When("insert the TC ID of relationship")
    public void insertTheTCIDOfRelationship() {
        mkp.insertTheTCIDOfRelationship();
    }

    @And("assert the TC ID of relationship")
    public void assertTheTCIDOfRelationship() {
        mkp.assertTheTCIDOfRelationship();
    }

    @And("click on relation's birthday calendar")
    public void clickOnRelationSBirthdayCalendar() {
        mkp.clickOnRelationSBirthdayCalendar();
    }

    @And("assert relation's birthday calendar")
    public void assertRelationSBirthdayCalendar() {
        mkp.assertRelationSBirthdayCalendar();
    }

    @When("click on transfer button")
    public void clickOnTransferButton() {
        mkp.clickOnTransferButton();
    }

    @And("assert the transfer popup page")
    public void assertTheTransferPopupPage() {
        mkp.assertTheTransferPopupPage();
    }

    @Then("close the transfer popup page")
    public void closeTheTransferPopupPage() {
        mkp.closeTheTransferPopupPage();
    }

    @When("insert the name lastname of relationship")
    public void insertTheNameLastnameOfRelationship() {
        mkp.insertTheNameLastnameOfRelationship();
    }

    @And("assert the name lastname of relationship")
    public void assertTheNameLastnameOfRelationship() {
    }

    @And("insert the phone number of relationship")
    public void insertThePhoneNumberOfRelationship() {
        mkp.insertThePhoneNumberOfRelationship();
    }

    @And("assert the phone number of relationship")
    public void assertThePhoneNumberOfRelationship() {
    }

    @And("insert the passport number of relationship")
    public void insertThePassportNumberOfRelationship() {
        mkp.insertThePassportNumberOfRelationship();
    }

    @And("assert the passport number of relationship")
    public void assertThePassportNumberOfRelationship() {
        mkp.assertThePassportNumberOfRelationship();
    }

    @And("insert the email of relationship")
    public void insertTheEmailOfRelationship() {
        mkp.insertTheEmailOfRelationship();
    }

    @And("assert the email of relationship")
    public void assertTheEmailOfRelationship() {
        mkp.assertTheEmailOfRelationship();
    }

    @And("insert the address relationship")
    public void insertTheAddressRelationship() {
        mkp.insertTheAddressRelationship();
    }

    @Then("assert the address of relationship")
    public void assertTheAddressOfRelationship() {
        mkp.assertTheAddressOfRelationship();
    }

    @When("click the received on approve radio button")
    public void clickTheReceivedOnApproveRadioButton() {
        mkp.clickTheReceivedOnApproveRadioButton();
    }

    @And("assert the received on approve radio button selected")
    public void assertTheReceivedOnApproveRadioButtonSelected() {
        mkp.assertTheReceivedOnApproveRadioButtonSelected();
    }

    @And("click the not received on approve radio button")
    public void clickTheNotReceivedOnApproveRadioButton() {
        mkp.clickTheNotReceivedOnApproveRadioButton();
    }

    @Then("assert the not received on approve radio button selected")
    public void assertTheNotReceivedOnApproveRadioButtonSelected() {
        mkp.assertTheNotReceivedOnApproveRadioButtonSelected();
    }

    @When("click the check box dressing process")
    public void clickTheCheckBoxDressingProcess() {
        mkp.clickTheCheckBoxDressingProcess();
    }

    @And("assert the check box dressing process selected")
    public void assertTheCheckBoxDressingProcessSelected() {
        mkp.assertTheCheckBoxDressingProcessSelected();
    }

    @And("click the check box no Id card")
    public void clickTheCheckBoxNoIdCard() {
        mkp.clickTheCheckBoxNoIdCard();
    }

    @And("assert the check box no Id card selected")
    public void assertTheCheckBoxNoIdCardSelected() {
        mkp.assertTheCheckBoxNoIdCardSelected();
    }

    @And("click the check box prescriptions")
    public void clickTheCheckBoxPrescriptions() {
        mkp.clickTheCheckBoxPrescriptions();
    }

    @Then("assert the check box prescriptions selected")
    public void assertTheCheckBoxPrescriptionsSelected() {
        mkp.assertTheCheckBoxPrescriptionsSelected();
    }

    @When("click on disability situation drop down list")
    public void clickOnDisabilitySituationDropDownList() {
        mkp.clickOnDisabilitySituationDropDownList();
    }

    @And("assert the disability situation drop down list")
    public void assertTheDisabilitySituationDropDownList() {
        mkp.assertTheDisabilitySituationDropDownList();
    }

    @And("click on social care drop down list")
    public void clickOnSocialCareDropDownList() {
        mkp.clickOnSocialCareDropDownList();
    }

    @And("assert the social care drop down list")
    public void assertTheSocialCareDropDownList() {
        mkp.assertTheSocialCareDropDownList();
    }

    @And("click on needs assessment drop down list")
    public void clickOnNeedsAssessmentDropDownList() {
        mkp.clickOnNeedsAssessmentDropDownList();
    }

    @And("assert the needs assessment drop down list")
    public void assertTheNeedsAssessmentDropDownList() {
        mkp.assertTheNeedsAssessmentDropDownList();
    }

    @And("select the relationship")
    public void selectTheRelationship() {
        mkp.selectTheRelationship();
    }

    @And("assert the description {string} in complaint box")
    public void assertTheDescriptionInComplaintBox(String arg0) {
        mkp.assertTheDescriptionInComplaintBox(arg0);
    }

    @And("assert the description {string} in reason for preference box")
    public void assertTheDescriptionInReasonForPreferenceBox(String arg0) {
        mkp.assertTheDescriptionInReasonForPreferenceBox(arg0);
    }

    @And("assert the all services that patient got")
    public void assertTheAllServicesThatPatientGot() {
        mkp.assertTheAllServicesThatPatientGot();
    }

    @And("click on inspect button for first service")
    public void clickOnInspectButtonForFirstService() {
        mkp.clickOnInspectButtonForFirstService();
    }

    @And("click on services button")
    public void clickOnServicesButton() {
        mkp.clickOnServicesButton();
    }

    @Then("assert the patient's services page")
    public void assertThePatientSServicesPage() {
        mkp.assertThePatientSServicesPage();
    }

    @And("close daily service appointment popup page")
    public void closeDailyServiceAppointmentPopupPage() {
        mkp.closeDailyServiceAppointmentPopupPage();
    }

    @When("insert the invalid TC ID number to TC ID box")
    public void insertTheInvalidTCIDNumberToTCIDBox() {
        mkp.insertTheInvalidTCIDNumberToTCIDBox();
    }

    @And("insert the second TC Identity Number in TC ID box")
    public void insertTheSecondTCIdentityNumberInTCIDBox() {
        mkp.insertTheSecondTCIdentityNumberInTCIDBox();
    }

    @When("insert the invalid Patient Number number to patient number box")
    public void insertTheInvalidPatientNumberNumberToPatientNumberBox() {
        mkp.insertTheInvalidPatientNumberNumberToPatientNumberBox();
    }

    @When("insert the second invalid Patient Number number to patient number box")
    public void insertTheSecondInvalidPatientNumberNumberToPatientNumberBox() {
        mkp.insertTheSecondInvalidPatientNumberNumberToPatientNumberBox();
    }

    @And("insert the invalid protocol number in the protocol box")
    public void insertTheInvalidProtocolNumberInTheProtocolBox() {
        mkp.insertTheInvalidProtocolNumberInTheProtocolBox();
    }

    @And("insert the second invalid protocol number in the protocol box")
    public void insertTheSecondInvalidProtocolNumberInTheProtocolBox() {
        mkp.insertTheSecondInvalidProtocolNumberInTheProtocolBox();
    }

    @And("assert the invalid TC ID number warning message")
    public void assertTheInvalidTCIDNumberWarningMessage() {
        mkp.assertTheInvalidTCIDNumberWarningMessage();
    }

    @And("assert the second TC Identity Number warning message")
    public void assertTheSecondTCIdentityNumberWarningMessage() {
        mkp.assertTheSecondTCIdentityNumberWarningMessage();
    }

    @Then("assert the invalid patient number warning message")
    public void assertTheInvalidPatientNumberWarningMessage() {
        mkp.assertTheInvalidPatientNumberWarningMessage();
    }

    @Then("assert the second invalid patient number warning message")
    public void assertTheSecondInvalidPatientNumberWarningMessage() {
        mkp.assertTheSecondInvalidPatientNumberWarningMessage();
    }

    @Then("assert the invalid protocol number")
    public void assertTheInvalidProtocolNumber() {
        mkp.assertTheInvalidProtocolNumber();
    }

    @Then("assert the second invalid protocol number")
    public void assertTheSecondInvalidProtocolNumber() {
        mkp.assertTheSecondInvalidProtocolNumber();
    }

    @And("assert the warning message of reports button")
    public void assertTheWarningMessageOfReportsButton() {
        mkp.assertTheWarningMessageOfReportsButton();
    }

    @And("assert the health council warning message")
    public void assertTheHealthCouncilWarningMessage() {
        mkp.assertTheHealthCouncilWarningMessage();
    }

    @And("assert the RIS warning message")
    public void assertTheRISWarningMessage() {
        mkp.assertTheRISWarningMessage();
    }

    @And("assert the Lab warning message")
    public void assertTheLabWarningMessage() {
        mkp.assertTheLabWarningMessage();
    }

    @And("assert the confirm button warning message")
    public void assertTheConfirmButtonWarningMessage() {
        mkp.assertTheConfirmButtonWarningMessage();
    }


    @When("insert the TC Identity Number in TC ID box for service")
    public void insertTheTCIdentityNumberInTCIDBoxForService() {
        mkp.insertTheTCIdentityNumberInTCIDBoxForService();
    }

    @And("assert the KLN warning message")
    public void assertTheKLNWarningMessage() {
        mkp.assertTheKLNWarningMessage();
    }

    @Then("assert the GSS warning message")
    public void assertTheGSSWarningMessage() {
        mkp.assertTheGSSWarningMessage();
    }

    @Then("assert the HakSahipligi warning message")
    public void assertTheHakSahipligiWarningMessage() {
        mkp.assertTheHakSahipligiWarningMessage();
    }

    @And("assert the foreign patient warning message")
    public void assertTheForeignPatientWarningMessage() {
        mkp.assertTheForeignPatientWarningMessage();
    }

    @And("go to Hasta Button")
    public void goToHastaButton() {
        mkp.goToHastaButton();
    }

    @And("close Hasta button")
    public void closeHastaButton() {
        mkp.closeHastaButton();
    }

    @And("scroll down")
    public void scrollDown() {
        mkp.scrollDown();


    }

    @And("click on service settings button")
    public void clickOnServiceSettingsButton() {
        mkp.clickOnServiceSettingsButton();
    }

    @And("click on delete service button")
    public void clickOnDeleteServiceButton() {
        mkp.clickOnDeleteServiceButton();
    }

    @And("click yes button for delete")
    public void clickYesButtonForDelete() {
        mkp.clickYesButtonForDelete();
    }

    @Then("assert the service record is deleted")
    public void assertTheServiceRecordIsDeleted() {
        mkp.assertTheServiceRecordIsDeleted();
    }

   //@When("The user can click hasta button")
   //public void theUserCanClickHastaButton() {
   //    // bp.hastaButton.click();
   //    bp.theUserCanClickHastaButton();

   //}

   //@Then("hasta page")
   //public void hastaPage() {
    //    bp.hastaPage();
   // }
}
