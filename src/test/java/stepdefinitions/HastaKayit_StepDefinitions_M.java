package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.Hasta_Kayit_Page_M;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HastaKayit_StepDefinitions_M {
    Actions actions = new Actions(Driver.getDriver());
    Hasta_Kayit_Page_M mPage = new Hasta_Kayit_Page_M();


    @And("User chooses the {string}")
    public void userChoosesThe(String nationality) {
        Select select = new Select(mPage.nationalityDropdown);
        select.selectByVisibleText(ConfigReader.getProperty(nationality));
    }

    @And("User clicks Patient Type box and Choose Button on dual citizens")
    public void userClicksPatientTypeBoxAndChooseButtonOnDualCitizens() {
        actions.click(mPage.patientType).perform();
        mPage.dualCitizensChooseButton.click();
    }

    @And("User clicks Gender box and chooses the {string}")
    public void userClicksGenderBoxAndChoosesThe(String gender) {
        Select select = new Select(mPage.genderDropdown);
        select.selectByVisibleText(ConfigReader.getProperty(gender));
    }

    @And("User enters {string} and {string}")
    public void userEntersAnd(String passportId, String passportNo) {
        ReusableMethods.waitForVisibility(mPage.pasaportIdSearchBox, 15);
        actions.moveToElement(mPage.pasaportIdSearchBox)
                .click()
                .sendKeys(ConfigReader.getProperty(passportId))
                .click(mPage.pasaportNoSearchBox2)
                .sendKeys(ConfigReader.getProperty(passportNo)).perform();
    }

    @And("User clicks the Save button")
    public void userClicksTheSaveButton() {
        mPage.saveButton.click();
    }


    @Then("User verifies that the institution Information Warning Message is displayed")
    public void userVerifiesThatTheInstitutionInformationWarningMessageIsDisplayed() {
        ReusableMethods.waitForVisibility(mPage.WarningMessage, 10);
        ReusableMethods.getElementText(mPage.WarningMessage);
        Assert.assertTrue(mPage.WarningMessage.isDisplayed());
    }


    @And("User enters {string} in name box")
    public void userEntersInNameBox(String name) {
        mPage.nameSearchBox.sendKeys(ConfigReader.getProperty(name));
    }

    @And("User enters {string} in surname box")
    public void userEntersInSurnameBox(String surname) {
        actions.
                click(mPage.surnameSearchBox).
                sendKeys(ConfigReader.getProperty(surname)).
                perform();
    }

    @And("User enters {string} in mobile phone number box")
    public void userEntersInMobilePhoneNumberBox(String mobilePhoneNumber) {
        ReusableMethods.waitForVisibility(mPage.mobilePhoneNumber, 10);
        mPage.mobilePhoneNumber.click();
        mPage.mobilePhoneNumber.sendKeys(ConfigReader.getProperty(mobilePhoneNumber));
    }

    @And("User enters {string} in TC ID box")
    public void userEntersInTCIDBox(String TC) {
        mPage.TCsearchBox.sendKeys(ConfigReader.getProperty(TC));
    }

    @And("User clicks the pop ap close button")
    public void userClicksThePopApCloseButton() {
        mPage.close.click();
    }

    @And("User clicks the page close button")
    public void userClicksThePageCloseButton() {
        mPage.kapatButton.click();
    }

    @And("User selects the polyclinic on Inspection Registration Page")
    public void userSelectsThepolyclinicOnInspectionRegistrationPage() {
        ReusableMethods.waitForVisibility(mPage.policnicSearchBox, 4);
        mPage.policnicSearchBox.click();
        mPage.policnicSearchBox.sendKeys("1" + Keys.ENTER);

    }


    @And("User selects the arrival type")
    public void userSelectsTheArrivalType() {
        Select select = new Select(mPage.arrivalType);
        select.selectByVisibleText("Ayaktan");


    }

    @And("User clicks the Save button on Inspection Registration Page")
    public void userClicksTheSaveButtonOnInspectionRegistrationPage() {
        mPage.patientSaveButton.click();
        ReusableMethods.waitForVisibility(mPage.readAuthorizationCloseButton,5);
        mPage.readAuthorizationCloseButton.click();
        ReusableMethods.waitFor(4);
    }

    @And("User clicks Detailed patient search button")
    public void userClicksDetailedPatientSearchButton() {
        mPage.detailedPatientSearch.click();
    }

    @And("User enters the patient's protocol number")
    public void userEntersThePatientSProtocolNumber() {
        actions.moveToElement(mPage.detayliOrotokolNo).click().sendKeys(pN).perform();
        // mPage.detayliOrotokolNo.sendKeys(pN);
    }

    @And("Users clicks the query button")
    public void usersClicksTheQueryButton() {
        mPage.queryButton.click();
    }

    @Then("User verifies that the patient is enrolled")
    public void userVerifiesThatThePatientIsEnrolled() {
        Assert.assertEquals(mPage.lastProtocolNo.getText(), pN);
    }


    @Then("User verifies that Passport Id is requested")
    public void userVerifiesThatPassportIdIsRequested() {
        String passportName = "Pasaport Id";
        String passportNo = "Pasaport No";
        String allocationNumberBoxName = ReusableMethods.getElementText(mPage.allocationNumberBoxName);
        String reportCardSerialNoBoxName = ReusableMethods.getElementText(mPage.reportCardSerialNoBoxName);
        Assert.assertEquals(allocationNumberBoxName, passportName);


    }

    @Then("User verifies that Passport No is requested")
    public void userVerifiesThatPassportNoIsRequested() {
        String passportName = "Pasaport Id";
        String passportNo = "Pasaport No";
        String allocationNumberBoxName = ReusableMethods.getElementText(mPage.allocationNumberBoxName);
        String reportCardSerialNoBoxName = ReusableMethods.getElementText(mPage.reportCardSerialNoBoxName);
        Assert.assertEquals(reportCardSerialNoBoxName, passportNo);
    }

    @Then("User Logs out")
    public void userLogsOut() {
        mPage.closeButton.click();
        System.out.println("close buttona tıklanıd");
        //  mPage.noItem.click();
        //  System.out.println("no item tıklandı");
        // actions.moveToElement(mPage.user).perform();
        // ReusableMethods.waitFor(3);

    }

    @Then("User verifies that the message {string} is displayed")
    public void userVerifiesThatTheMessageIsDisplayed(String message) {
        ReusableMethods.waitForVisibility(mPage.WarningMessage,10);
        String m = mPage.WarningMessage.getText();
        System.out.println(m);
        Assert.assertTrue(m.contains(ConfigReader.getProperty(message)));
    }



    @And("User tick the E-mail Gonderilebilir checkbox")
    public void userTickTheEMailGonderilebilirCheckbox() {
        mPage.eMailCheckBox.click();

    }

    @And("User ticks the newborn checkedbox")
    public void userTicksTheNewbornCheckedbox() {
        mPage.newbornCheckbox.click();
    }

    @And("User enters the date of birth less than {int} months old in date of birth box")
    public void userEntersTheDateOfBirthLessThanMonthsOldInDateOfBirthBox(int month) {
        LocalDate tarih = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy");
        tarih = tarih.minusMonths(6);
        String data = format.format(tarih);
        ReusableMethods.waitForVisibility(mPage.dateOfBirthSearchBox, 5);
        ReusableMethods.waitFor(4);
        mPage.dateOfBirthSearchBox.click();
        mPage.dateOfBirthSearchBox.sendKeys(data);
        mPage.dateOfBirthSearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(4);
    }

    @And("User enters ID in mother's TC ID box")
    public void userEntersIDInMotherSTCIDBox() {
        mPage.motherTCNoSearchBox.sendKeys(ConfigReader.getProperty("MotherId"));
    }

    @And("User enters the date of birth over than thirty days old in date of birth box")
    public void userEntersTheDateOfBirthOverThanThirtyDaysOldInDateOfBirthBox() {
        LocalDate tarih = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy");
        tarih = tarih.minusYears(30);
        String date = format.format(tarih);
        System.out.println(date);
        ReusableMethods.waitForVisibility(mPage.dateOfBirthSearchBox, 5);
        ReusableMethods.waitFor(4);
        mPage.dateOfBirthSearchBox.click();
        mPage.dateOfBirthSearchBox.sendKeys(date);
        mPage.dateOfBirthSearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(4);
    }

    @And("User enters the date of birth")
    public void userEntersTheDateOfBirth() {
        LocalDate tarih = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy");
        tarih = tarih.plusDays(1);
        String date = format.format(tarih);
        System.out.println(date);
        ReusableMethods.waitForVisibility(mPage.dateOfBirthSearchBox, 5);
        ReusableMethods.waitFor(4);
        mPage.dateOfBirthSearchBox.click();
        mPage.dateOfBirthSearchBox.sendKeys(date);
        mPage.dateOfBirthSearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(4);
    }

    @And("User clicks the succes close button")
    public void userClicksTheSuccesCloseButton() {
        mPage.succesButton.click();
    }

    @And("User ticks Bluecard checkbox")
    public void userTicksBluecardCheckbox() {
        mPage.bluecardButton.click();
    }

    @Then("Assert that birtDay and birthOrder searchBoxes are display")
    public void assertThatBirtDayAndBirthOrderSearchBoxesAreDisplay() {
        Assert.assertEquals(mPage.birthOrder.getText(), "Doğum Sırası");
    }

    @And("User clicks yakinligi and chooses mother")
    public void userClicksYakinligiAndChoosesMother() {
        Select select = new Select(mPage.yakinligiDropdown);
        select.selectByValue("2");
    }

    @Then("Assert that cardOwner searchBox is display")
    public void assertThatCardOwnerSearchBoxIsDisplay() {
        Assert.assertTrue(mPage.cardOwnerSearchBox.isDisplayed());
    }

    @And("User clicks the clean button")
    public void userClicksTheCleanButton() {
        mPage.clearButton.click();
    }

    @Then("Assert that the page is clear")
    public void assertThatThePageIsClear() {
        Assert.assertTrue(mPage.clearButton.isDisplayed());
    }

    @And("User enters birth order")
    public void userEntersBirthOrder() {
        mPage.birthOrderSearchBox.sendKeys("-2");
    }


    @And("User enters date Of Birth Less Than thirty Days in date of birth box")
    public void userEntersDateOfBirthLessThanThirtyDaysInDateOfBirthBox() {
        LocalDate tarih = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy");
        tarih = tarih.minusDays(10);
        String date = format.format(tarih);
        System.out.println(date);
        ReusableMethods.waitForVisibility(mPage.dateOfBirthSearchBox, 5);
        ReusableMethods.waitFor(4);
        mPage.dateOfBirthSearchBox.click();
        mPage.dateOfBirthSearchBox.sendKeys(date);
        mPage.dateOfBirthSearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(4);

    }


    @And("User enters the date of birth over than thirtyone days old in date of birth box")
    public void userEntersTheDateOfBirthOverThanThirtyoneDaysOldInDateOfBirthBox() {
        LocalDate tarih = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy");
        tarih = tarih.minusDays(31);
        String date = format.format(tarih);
        System.out.println(date);
        ReusableMethods.waitForVisibility(mPage.dateOfBirthSearchBox, 5);
        ReusableMethods.waitFor(4);
        mPage.dateOfBirthSearchBox.click();
        mPage.dateOfBirthSearchBox.sendKeys(date);
        mPage.dateOfBirthSearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(4);
    }

    @And("User enters date Of Birth in date of birth box")
    public void userEntersDateOfBirthInDateOfBirthBox() {
        LocalDate tarih = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy");
        tarih = tarih.minusMonths(15);
        String data = format.format(tarih);
        ReusableMethods.waitForVisibility(mPage.dateOfBirthSearchBox, 5);
        ReusableMethods.waitFor(4);
        mPage.dateOfBirthSearchBox.click();
        mPage.dateOfBirthSearchBox.sendKeys(data);
        mPage.dateOfBirthSearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(4);

    }


    public static String pN;

    @And("User takes patient's protocol Number")
    public void userTakesPatientSProtocolNumber() {
        ReusableMethods.waitForVisibility(mPage.protocolNo, 4);
        pN = mPage.protocolNo.getText();
        System.out.println(pN);

    }

    @And("User clicks the save button again")
    public void userClicksTheSaveButtonAgain() {

        mPage.patientSaveButton.click();
        mPage.infoSaved.click();
        ReusableMethods.waitFor(3);
    }

    @And("{int} bekle")
    public void bekle(int a) {
        ReusableMethods.waitFor(a);
    }

    @Then("User verifies that the patient is not enrolled")
    public void userVerifiesThatThePatientIsNotEnrolled() {
        Assert.assertFalse(mPage.lastProtocolNo.isDisplayed());
    }

    @And("User clicks Patient Type box and Choose Button on Coming for Education and their obligations")
    public void userClicksPatientTypeBoxAndChooseButtonOnComingForEducationAndTheirObligations() {
        actions.click(mPage.patientType).perform();
        mPage.comingForEducation.click();
    }

}
