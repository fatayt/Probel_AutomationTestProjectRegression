@probel_hastaKayit
Feature: probel_hastaKayit
  Background:
    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And Click the Hasta button
    And Enter Kurum, Kurum detay



  @TC0001
  Scenario: TC0001 - The user must not be able to enter a later date for your mother's date of birth

    And user selects the Uyruk
    And user writes the name of the mother
    And user writes the name of the father
    And user selects the date of birth mother
    And user writes the place of birth
    And user selects the date of birth
    And user click hasta Turu
    And user click tika tarafindan getirilen hastalar
    And user enters the surname
    And enter the user name
    And user selects the proximity
    And user selects a gender
    And user chooses a marital status
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone
    And user writes E-mail
    And user chooses a profession
    And user selects the status
    And user selects the learning
    And user selects the blood type
    And user clicks on the save button
    And user assert the registration
    And user clicks the papup close button
    And user clicks the patient registration KAPAT button
    And user selects an poliklinik
    And user selects the mode of arrival
    And user click kaydet
    And user verifies the message "Bilgiler kaydedildi."
    And  user breaks down the popup to the TAMAM button
    Then user closes the application


  @TC0002
  Scenario: TC0002 - Received an error "Passport No/Id" when the user entered an incorrect "Tahsis No/Id"
    And user selects the Uyruk
    And user click hasta Turu
    And user click tika tarafindan getirilen hastalar
    And user selects the date of birth
    And user enters the surname
    And enter the user name
    And user selects a gender
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone
    And user clicks on the save button
    And user assert the registration
    And user clicks the papup close button
    And user clicks the patient registration KAPAT button
    And user selects an poliklinik
    And user selects the mode of arrival
    And user click kaydet
    And user verifies the message "Bilgiler kaydedildi."
    And  user breaks down the popup to the TAMAM button
    Then user closes the application


  @TC0005
  Scenario: TC0005 - Armutlu was chosen as the district of Izmir.
    And user selects the Uyruk
    And user click hasta Turu
    And user click Turk Soylu Yabancilar
    And user selects the date of birth
    And user enters the surname
    And enter the user name
    And user selects a gender
    And user writes Passport Id
    And user writes Passport No
    And user selects a gender
    And user chooses ilçe
    And user enters the mobile phone
    And user clicks on the save button
    And user assert the registration
    And user clicks the papup close button
    And user clicks the patient registration KAPAT button
    And user selects an poliklinik
    And user selects the mode of arrival
    And user click kaydet
    And user verifies the message "Bilgiler kaydedildi."
    And  user breaks down the popup to the TAMAM button
    Then user closes the application





  @TC0006
  Scenario: TC0006 - User can write their private names such as Mother Name, Father Name, Place of Birth in lower case

    When user selects the Uyruk
    And user click hasta Turu
    And user click tika tarafindan getirilen hastalar
    And user writes the name of the mother
    And user writes the name of the father
    And user selects the date of birth mother
    And user selects the date of birth
    And user selects a gender
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone
    And user clicks on the save button
    And user assert the registration
    And user clicks the papup close button
    And user clicks the patient registration KAPAT button
    And user selects an poliklinik
    And user selects the mode of arrival
    And user click kaydet
    And user verifies the message "Bilgiler kaydedildi."
    And  user breaks down the popup to the TAMAM button
    Then user closes the application



  @TC0007
  Scenario:TC0007 - The user can register in the Foreign patient type "Tourist's Health" option on the Home page

    And user selects the Uyruk
    And user click hasta Turu
    And user click turistin sagligi
    And user writes the name of the mother
    And user writes the name of the father
    And user selects the date of birth mother
    And user selects the date of birth
    And user selects a gender
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone
    And user clicks on the save button
    And user clicks the papup close button
    And user clicks the patient registration KAPAT button
    And user clicks on home page foreign patient type
    And user writes on the popup  health of the tourist
    And user assert the registration
    Then user closes the application



  @TC0045
  Scenario:TC0045 - The user registers a patient in the type "TİKA TARAFINDAN GETİRİLEN HASTALAR"

    And user selects the Uyruk SURİYE
    And user click hasta Turu
    And user click tika tarafindan getirilen hastalar
    And user writes the name of the mother
    And user writes the name of the father
    And user selects the date of birth mother
    And user writes the place of birth
    And user selects the date of birth
    And user enters the surname
    And enter the user name
    And user selects the proximity
    And user selects a gender
    And user chooses a marital status
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone
    And user writes E-mail
    And user chooses a profession
    And user selects the learning
    And user selects the blood type
    And user chooses ilçe Aliaga
    And user clik Email button
    And user click kimlik fotokopisi alindi button
    And user click KVKK button
    And user clicks on the save button
    And user clicks the papup close button
    And user clicks the patient registration KAPAT button
    And user assert the registration
    And user selects an poliklinik
    And user selects the mode of arrival
    And user click kaydet
    And user verifies the message "Bilgiler kaydedildi."
    And  user breaks down the popup to the TAMAM button
    Then user closes the application



  @TC0046
  Scenario:TC0046 - The user registers a patient in the type " TURİSTİN SAĞLIĞI"
    And user selects the Uyruk ALMANYA
    And user click hasta Turu
    And user click turistin sagligi
    And user writes the name of the mother
    And user writes the name of the father
    And user selects the date of birth mother
    And user writes the place of birth
    And user selects the date of birth
    And user enters the surname
    And enter the user name
    And user selects the proximity
    And user selects a gender
    And user chooses a marital status
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone
    And user writes E-mail
    And user chooses a profession
    And user selects the learning
    And user selects the blood type
    And user chooses ilçe Aliaga
    And user clik Email button
    And user click kimlik fotokopisi alindi button
    And user click KVKK button
    And user clicks on the save button
    And user clicks the papup close button
    And user clicks the patient registration KAPAT button
    And user assert the registration
    And user selects an poliklinik
    And user selects the mode of arrival
    And user click kaydet
    And user verifies the message "Bilgiler kaydedildi."
    And  user breaks down the popup to the TAMAM button
    Then user closes the application


  @TC0047
  Scenario:TC0047 - The user registers a patient in the type " TÜRK SOYLU YABANCILAR"
    And user selects the Uyruk AZERBEYCAN
    And user click hasta Turu
    And user click Turk Soylu Yabancilar
    And user writes the name of the mother
    And user writes the name of the father
    And user selects the date of birth mother
    And user writes the place of birth
    And user selects the date of birth
    And user enters the surname
    And enter the user name
    And user selects the proximity
    And user selects a gender
    And user chooses a marital status
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone
    And user writes E-mail
    And user chooses a profession
    And user selects the learning
    And user selects the blood type
    And user chooses ilçe Aliaga
    And user clik Email button
    And user click kimlik fotokopisi alindi button
    And user click KVKK button
    And user clicks on the save button
    And user clicks the papup close button
    And user clicks the patient registration KAPAT button
    And user assert the registration
    And user selects an poliklinik
    And user selects the mode of arrival
    And user click kaydet
    And user verifies the message "Bilgiler kaydedildi."
    And  user breaks down the popup to the TAMAM button
    Then user closes the application



  @TC0048
  Scenario:TC0048 - User registers with phone number in correct format
    And user selects the Uyruk AZERBEYCAN
    And user click hasta Turu
    And user click Turk Soylu Yabancilar
    And user writes the name of the mother
    And user writes the name of the father
    And user selects the date of birth mother
    And user writes the place of birth
    And user selects the date of birth
    And user enters the surname
    And enter the user name
    And user selects the proximity
    And user selects a gender
    And user chooses a marital status
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone number in the wrong format
    And user writes E-mail
    And user chooses a profession
    And user selects the learning
    And user selects the blood type
    And user chooses ilçe Aliaga
    And user clik Email button
    And user click kimlik fotokopisi alindi button
    And user click KVKK button
    And user clicks on the save button

    And user clicks the papup close button
    And user clicks the patient registration KAPAT button
    And user assert the registration
    And user selects an poliklinik
    And user selects the mode of arrival
    And user click kaydet
    And user verifies the message "Bilgiler kaydedildi."
    And  user breaks down the popup to the TAMAM button
    Then user closes the application

  @TC0049
  Scenario:TC0049 - User registers with name and surname in the appropriate format
    And user selects the Uyruk AZERBEYCAN
    And user click hasta Turu
    And user click Turk Soylu Yabancilar
    And user selects the date of birth
    And user enters the surname wrong format
    And enter the user name wrong format
    And user selects the proximity
    And user selects a gender
    And user chooses a marital status
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone
    And user clicks on the save button
    And user clicks the papup close button
    And user clicks the patient registration KAPAT button
    And user assert the registration
    And user selects an poliklinik
    And user selects the mode of arrival
    And user click kaydet
    And user verifies the message "Bilgiler kaydedildi."
    And  user breaks down the popup to the TAMAM button
    Then user closes the application


  @TC0050
  Scenario:TC0050 - User registers with baba adı, anne adı and dogum yeri in the appropriate format
    And user selects the Uyruk AZERBEYCAN
    And user click hasta Turu
    And user click Turk Soylu Yabancilar
    And user selects the date of birth
    And user enters the baba adi wrong format
    And enter the user anne adi wrong format
    And enter the user dogum yeri wrong format
    And user enters the surname
    And enter the user name
    And user selects the proximity
    And user selects a gender
    And user chooses a marital status
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone
    And user clicks on the save button
    And user clicks the papup close button
    And user clicks the patient registration KAPAT button
    And user assert the registration
    And user selects an poliklinik
    And user selects the mode of arrival
    And user click kaydet
    And user verifies the message "Bilgiler kaydedildi."
    And  user breaks down the popup to the TAMAM button
    Then user closes the application
