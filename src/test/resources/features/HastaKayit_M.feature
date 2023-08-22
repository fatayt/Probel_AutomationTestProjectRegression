@TC
Feature: probel_hastaKayit

  Background:
    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And Click the Hasta button

  @TC0090
  Scenario:TC0090 User should enter "Kurumu" and "Kurum Detay" information for registration
    Given User chooses the "nationality_1"
    And User clicks Patient Type box and Choose Button on dual citizens
    And User clicks Gender box and chooses the "gender_1"
    And User enters "validPassportId" and "validPassportNo"
    And User clicks the Save button
    Then User verifies that the message "institutionInformationWarningMessage" is displayed

  @TC0091
  Scenario: TC0091 the User should be able to register the patient whose nationality is Turkey with TC information
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on dual citizens
    And User enters "surname" in surname box
    And User enters "name" in name box
    And User clicks Gender box and chooses the "gender_1"
    And User enters date Of Birth in date of birth box
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User enters "validTCID" in TC ID box
    And User clicks the Save button
    And User clicks the pop ap close button
    And User clicks the page close button
    And User selects the polyclinic on Inspection Registration Page
    And User selects the arrival type
    And User clicks the Save button on Inspection Registration Page
    And User clicks the save button again
    And User takes patient's protocol Number
    And User clicks Detailed patient search button
    And User enters the patient's protocol number
    And Users clicks the query button
    Then User verifies that the patient is enrolled

  @TC0092
  Scenario: TC0092 User should be able to register with Pasport Id and Pasport No whose nationality is outside of Turkey
    Given Enter Kurum, Kurum detay
    And User chooses the "nationality_1"
    And User clicks Patient Type box and Choose Button on dual citizens
    And User enters "surname" in surname box
    And User enters "name" in name box
    And User clicks Gender box and chooses the "gender_1"
    And User enters date Of Birth in date of birth box
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User enters "validPassportId" and "validPassportNo"
    And User clicks the Save button
    And User clicks the pop ap close button
    And User clicks the page close button
    And User selects the polyclinic on Inspection Registration Page
    And User selects the arrival type
    And User clicks the Save button on Inspection Registration Page
    And User clicks the save button again
    And User takes patient's protocol Number
    And User clicks Detailed patient search button
    And User enters the patient's protocol number
    And Users clicks the query button
    Then User verifies that the patient is enrolled

  @M_test4     # yeni nationality ekle confige ve logout kodu yaz negatif
  Scenario Outline: TC0093 The pasport Number should be requested for the registiration of patients whose nationality is outside of Turkey
    Given User chooses the "<nationality>"
    And User clicks Patient Type box and Choose Button on dual citizens
    Then User verifies that Passport Id is requested
    Then User Logs out

    Examples:
      | nationality   | ulke     |
      | nationality_2 | ARJANTIN |
      | nationality_3 | BAHREYN  |
      | nationality_4 | CANADA   |

  @M_test4     # yeni nationality ekle confige ve logout kodu yaz pozitif
  Scenario Outline: TC0093 The pasport Number should be requested for the registiration of patients whose nationality is outside of Turkey
    Given User chooses the "<nationality>"
    And User clicks Patient Type box and Choose Button on dual citizens
    Then User verifies that Passport Id is requested
    Then User Logs out

    Examples:
      | nationality   | ulke     |
      | nationality_2 | ARJANTIN |
      | nationality_3 | BAHREYN  |
      | nationality_4 | CANADA   |

  @TC0094
  Scenario: TC0094 User should enter mother T.C. Number whose age is less than 6 months and nationality is outside of Turkey
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on dual citizens
    And User chooses the "nationality_1"
    And User clicks Gender box and chooses the "gender_1"
    And User enters the date of birth less than 6 months old in date of birth box
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User enters "validPassportId" and "validPassportNo"
    And User clicks the Save button
    Then User verifies that the message "motherTCWarningMessage" is displayed

  @TC0095
  Scenario:TC0095 User should enter "Cep Telefonu" information for registration whose nationality is Turkey
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on dual citizens
    And User enters "surname" in surname box
    And User enters "name" in name box
    And User clicks Gender box and chooses the "gender_1"
    And User enters date Of Birth in date of birth box
    And User clicks the Save button
    Then User verifies that the message "phoneNumberWarningMessage" is displayed

  @TC0096
  Scenario: TC0096 User should not enter The pasaport Id and Pasaport No less than 5 characters for the registiration of patients whose nationality is outside of Turkey
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on dual citizens
    And User chooses the "nationality_1"
    And User enters "inValidPassportId" and "inValidPassportNo"
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User clicks the Save button
    Then User verifies that the message "fiveChrWarningMessage" is displayed

  @TC0097
  Scenario: TC0097 User should enter "Doğum T." information for registration whose nationality is outside of Turkey
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on dual citizens
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User chooses the "nationality_1"
    And User enters "validPassportId" and "validPassportNo"
    And User clicks the Save button
    Then User verifies that the message "dateBirthWarningMessage" is displayed

  @TC0098
  Scenario: TC0098 User should enter "Cinsiyeti" information for registration whose nationality is outside of Turkey
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on dual citizens
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User chooses the "nationality_1"
    And User enters "validPassportId" and "validPassportNo"
    And User enters date Of Birth in date of birth box
    And User clicks the Save button
    Then User verifies that the message "genderWarningMessage" is displayed


  @TC0099
  Scenario: TC0099 User should enter "E-mail" when "E-mail Gönderilebilir" checkbox is ticked
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on dual citizens
    And User chooses the "nationality_1"
    And User enters "validPassportId" and "validPassportNo"
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User tick the E-mail Gonderilebilir checkbox
    And User clicks the Save button
    Then User verifies that the message "emailWarningMessage" is displayed

  @TC0105
  Scenario: TC0105 "Yenidoğan" check box cannot be ticked for dual citizen type patients whose date of birth is past 30 days
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on dual citizens
    And User chooses the "nationality_1"
    And User enters "validPassportId" and "validPassportNo"
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User enters the date of birth over than thirtyone days old in date of birth box
    And User enters ID in mother's TC ID box
    And User ticks the newborn checkedbox
    And User clicks the Save button
    Then User verifies that the message "newbornWarningMessage" is displayed

  @TC0106
  Scenario: TC0106 For the newborn dual citizen patient, It is obligatory to enter birth week and birth day
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on dual citizens
    And User chooses the "nationality_1"
    And User enters "validPassportId" and "validPassportNo"
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User enters date Of Birth Less Than thirty Days in date of birth box
    And User ticks the newborn checkedbox
    And User enters ID in mother's TC ID box
    And User clicks the Save button
    Then User verifies that the message "birthWeekWarningMessage" is displayed

  @TC0107
  Scenario: TC0107 The patient's date of birth cannot be later than today
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on dual citizens
    And User chooses the "nationality_1"
    And User enters "validPassportId" and "validPassportNo"
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User clicks Gender box and chooses the "gender_1"
    And User enters "surname_2" in surname box
    And User enters "name_2" in name box
    And User enters the date of birth
    And User enters ID in mother's TC ID box
    And User clicks the Save button
    And User clicks the succes close button
    And User clicks the page close button
    And User selects the polyclinic on Inspection Registration Page
    And User selects the arrival type
    And User clicks the Save button on Inspection Registration Page
    And User clicks the save button again
    And User takes patient's protocol Number
    And User clicks Detailed patient search button
    And User enters the patient's protocol number
    And Users clicks the query button
    Then User verifies that the patient is not enrolled

  @TC0108
  Scenario: TC0108 User cannot register a patient by ticked bluecardButton who is dual citizen
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on dual citizens
    And User chooses the "nationality_1"
    And User enters "validPassportId" and "validPassportNo"
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User clicks Gender box and chooses the "gender_1"
    And User enters "surname_3" in surname box
    And User enters "name_3" in name box
    And User enters date Of Birth in date of birth box
    And User ticks Bluecard checkbox
    And User clicks the Save button
    And User clicks the succes close button
    And User clicks the page close button
    And User selects the polyclinic on Inspection Registration Page
    And User selects the arrival type
    And User clicks the Save button on Inspection Registration Page
    And User clicks the save button again
    And User takes patient's protocol Number
    And User clicks Detailed patient search button
    And User enters the patient's protocol number
    And Users clicks the query button
    Then User verifies that the patient is not enrolled

  @TC0109
  Scenario: TC0109 When the newborn checkbox is checked , the fields of "Dogum Sırası" , "Haftasi","Gunu" are becomes active
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on dual citizens
    And User ticks the newborn checkedbox
    Then Assert that birtDay and birthOrder searchBoxes are display

  @TC0110
  Scenario: TC0110 Card owner field becomes active When something other than itself is selected in the "Yakınlığı" tab
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on dual citizens
    And User clicks yakinligi and chooses mother
    Then Assert that cardOwner searchBox is display

  @TC0114
  Scenario: TC0114 User should be able to clear the patient's information by ckick on "Ekranı Temizle" button
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on dual citizens
    And User enters "surname" in surname box
    And User enters "name" in name box
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User clicks Gender box and chooses the "gender_1"
    And User clicks the clean button
    Then Assert that the page is clear

  Scenario: TC0115 When "yenidoğan" is ticked The tab of "Doğum Sırası" should be at least 1 whose nationality is outside of Turkey
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on dual citizens
    And User chooses the "nationality_1"
    And User enters "validPassportId" and "validPassportNo"
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User enters date Of Birth Less Than thirty Days in date of birth box
    And User clicks Gender box and chooses the "gender_1"
    And User ticks the newborn checkedbox
    And User enters ID in mother's TC ID box
    And User enters birth order
    And User clicks the Save button
    And User clicks the succes close button
    And User selects the polyclinic on Inspection Registration Page
    And User selects the arrival type
    And User clicks the Save button on Inspection Registration Page
    And User clicks the save button again
    And User takes patient's protocol Number
    And User clicks Detailed patient search button
    And User enters the patient's protocol number
    And Users clicks the query button
    Then User verifies that the patient is enrolled


  Scenario: TC0123  User should be able to register with Passport Id and Passport No whose nationality is outside of Turkey
    Given Enter Kurum, Kurum detay
    And User chooses the "nationality_1"
    And User clicks Patient Type box and Choose Button on Coming for Education and their obligations
    And User enters "surname" in surname box
    And User enters "name" in name box
    And User clicks Gender box and chooses the "gender_1"
    And User enters date Of Birth in date of birth box
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User enters "validPassportId" and "validPassportNo"
    And User clicks the Save button
    And User clicks the pop ap close button
    And User clicks the page close button
    And User selects the polyclinic on Inspection Registration Page
    And User selects the arrival type
    And User clicks the Save button on Inspection Registration Page
    And User clicks the save button again
    And User takes patient's protocol Number
    And User clicks Detailed patient search button
    And User enters the patient's protocol number
    And Users clicks the query button
    Then User verifies that the patient is enrolled

  Scenario: TC0124 The pasaport Number should be requested for the registiration of patients whose nationality is outside of Turkey


  Scenario: TC0125 When the "Yenidoğan" checkbox is checked , the fields of "Doğum Sırası" , "Haftası","Günü" are becomes active
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on Coming for Education and their obligations
    And User chooses the "nationality_1"
    And User enters "validPassportId" and "validPassportNo"
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User enters the date of birth over than thirty days old in date of birth box
    And User ticks the newborn checkedbox
    And User enters ID in mother's TC ID box
    And User clicks the Save button


  Scenario: TC0127 When "SMS Gönderilebilir" checkbox is checked, it should warn if mobile phone information is not entered
    Given User clicks Patient Type box and Choose Button on Coming for Education and their obligations
    And User chooses the "nationality_1"
    And User enters "validPassportId" and "validPassportNo"
    And User clicks Gender box and chooses the "gender_1"
    And User enters date Of Birth in date of birth box
    And User clicks the Save button
    And User clicks the pop ap close button
    Given Enter Kurum, Kurum detay
    And User clicks the Save button



  Scenario: TC0128 If T.C. Number is invalid , application should give the message of "Geçerli bir kimlik numarası giriniz "

  Scenario: TC0129 Email information should contain " @ "

  Scenario: TC0130 "Kart Sahibi" field becomes active When something other than itself is selected in the "Yakınlığı" tab
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on Coming for Education and their obligations
    And User clicks yakinligi and chooses mother
    Then Assert that cardOwner searchBox is display

  Scenario: TC0131 The patient's date of birth cannot be later than today.
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on Coming for Education and their obligations
    And User chooses the "nationality_1"
    And User enters "validPassportId" and "validPassportNo"
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User clicks Gender box and chooses the "gender_1"
    And User enters the date of birth
    And User enters ID in mother's TC ID box
    And User clicks the Save button
    And User clicks the succes close button
    And User clicks the page close button
    And User selects the polyclinic on Inspection Registration Page
    And User selects the arrival type
    And User clicks the Save button on Inspection Registration Page
    And User clicks the save button again
    And User takes patient's protocol Number
    And User clicks Detailed patient search button
    And User enters the patient's protocol number
    And Users clicks the query button
    Then User verifies that the patient is not enrolled

  Scenario: TC0132 User should not enter The pasaport Id and Pasaport No less than 5 characters for the registiration of patients whose nationality is outside of Turkey
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on Coming for Education and their obligations
    And User chooses the "nationality_1"
    And User enters "inValidPassportId" and "inValidPassportNo"
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User clicks the Save button