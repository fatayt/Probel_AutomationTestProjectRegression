@MuayeneKayit
Feature: The Home Page of Patient Register

  Background:
    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt

  @TC0008 @Smoke
  Scenario: The user can display the registered patient
    When insert the TC Identity Number in TC ID box
    And press enter
    And check TC ID warning popup
    And assert the patient's TC ID
    And click on clean button
    And insert the Patient Number in Patient number box
    And press enter
    And check TC ID warning popup
    And assert the Patient number

  @TC0009
  Scenario: When user insert the invalid TC identity number, user got the warning popup message
    When insert the invalid TC ID number to TC ID box
    And press enter
    And assert the invalid TC ID number warning message
    And close the warning message
    And click on clean button
    And insert the second TC Identity Number in TC ID box
    And press enter
    And assert the second TC Identity Number warning message

  @TC0010
  Scenario: When user insert the invalid Patient Number, user got the warning popup message
    When insert the invalid Patient Number number to patient number box
    And press enter
    Then assert the invalid patient number warning message
    And close the warning message
    And click on clean button
    When insert the second invalid Patient Number number to patient number box
    And press enter
    Then assert the second invalid patient number warning message

  @TC0012 @Smoke
  Scenario: The user can display the registered patient with protocol number
    When click on query button
    And insert the protocol number in the protocol box
    And press enter
    And assert the patient's the protocol number
    And assert the patient's TC ID
    And click on clean button
    And click on query button
    And insert the protocol number in the protocol box
    And click on run button
    And assert the patient's the protocol number
    And click on clean button
    Then assert the all page is clean

  @TC0013
  Scenario: When user insert the invalid protocol number, user got the warning popup message
    When click on query button
    And insert the invalid protocol number in the protocol box
    And press enter
    Then assert the invalid protocol number
    Then close the warning message
    And click on clean button
    And click on query button
    And insert the second invalid protocol number in the protocol box
    And press enter
    Then assert the second invalid protocol number

  @TC0026
  Scenario: The user can clean the patient information page by click on “new" (Yeni) button
    When insert the TC Identity Number in TC ID box
    And press enter
    And check TC ID warning popup
    And assert the patient's TC ID
    And click on new button
    Then assert the all page is clean

  @TC0027
  Scenario: The user can clean the patient information page by click on “delete" (Sil) button
    When insert the TC Identity Number in TC ID box
    And press enter
    And check TC ID warning popup
    And assert the patient's TC ID
    And click on delete button
    Then assert the all page is clean

  @TC0029
  Scenario: The user can print the patient's information out by click on “print" (Yazdır) button
    When insert the TC Identity Number in TC ID box
    And press enter
    And assert the patient's TC ID
    And click on print button
    Then assert the popup for print out

  @TC0033
  Scenario: The user can go to Detailed Patient Search page (Detaylı Hasta Arama)
    When click on Detailed Patient Search button
    Then assert the Detailed Patient Search page

  @TC0034
  Scenario: The user can go to Report Transactions page (Rapor İşlemleri)
    When click on Reports button
    And assert the warning message of reports button
    And close the warning message
    And insert the TC Identity Number in TC ID box
    And press enter
    And check TC ID warning popup
    And click on Reports button
    And assert the warning message of reports button
    And close the warning message
    And click on clean button
    And insert the Patient Number in Patient number box
    And press enter
    And check TC ID warning popup
    And click on Reports button
    And assert the warning message of reports button
    And close the warning message
    And click on clean button
    And click on query button
    And insert the protocol number in the protocol box
    And press enter
    And click on Reports button
    Then assert the Report Transactions pop up

  @TC0035
  Scenario: The user can go to Health Council page (Sağlık Kurulu)
    When click on Health Council button
    And assert the health council warning message
    And close the warning message
    And click on query button
    And insert the protocol number in the protocol box
    And click on Health Council button
    And assert the health council warning message
    And close the warning message
    And click on clean button
    And click on query button
    And insert the protocol number in the protocol box
    And press enter
    And click on Health Council button
    Then assert the Health Council page

  @TC0040
  Scenario: The user can go to Utility Operations page (Yardımcı İşlemler)
    When click on Utility Operations button
    Then assert the Utility Operations pop up

  @TC0041
  Scenario: The user can go to the RIS Acceptance Procedures (Ris Kabul İşlemleri) page
    When click on RIS button
    And assert the RIS warning message
    And close the warning message
    And click on query button
    And insert the protocol number in the protocol box
    And press enter
    And assert the patient's the protocol number
    And click on RIS button
    Then assert the RIS Acceptance Procedures page

  @TC0042
  Scenario: The user can go to the Lab. Pre-acceptance (Lab. Ön Kabul) page
    When click on Lab button
    And assert the Lab warning message
    And close the warning message
    And click on query button
    And insert the protocol number in the protocol box
    And press enter
    And assert the patient's the protocol number
    And click on Lab button
    Then assert the Lab. Pre-acceptance page

  @TC0066
  Scenario: The user can go to the information section (Kabul Bilgileri) section
    When click on acceptance information button
    Then assert the acceptance information section

  @TC0067
  Scenario: The user can go to the account (Hesap) section
    When click on account button
    Then assert the account section

  @TC0068
  Scenario: The user can go to the advance payment (Avans) section
    When click on advance payment button
    Then assert the advance payment section

  @TC0070
  Scenario: The user can confirm the patient TC ID by confirm button
    When click on confirm button
    And assert the confirm button warning message
    And close the warning message
    And insert the TC Identity Number in TC ID box
    And click on confirm button
    Then assert the confirmation popup

  @TC0071 @Smoke
  Scenario: The user can go to the page of patient search page
    When click on search button
    Then assert the patient search page

  @TC0072
  Scenario: The user can go to the popup section of patient register
    When click on patient button
    Then assert the patient register popup page

  @TC0074
  Scenario: The user can change the service (Poliklinik)
    When insert the TC Identity Number in TC ID box
    And press enter
    And check TC ID warning popup
    And scroll down
    And choose click the first of history of patient's service
    And assert the service name
    And assert the doctor name
    And click on change button
    Then assert the service list popup page

  @TC0085 @Smoke
  Scenario: The user can create the new service request
    When insert the TC Identity Number in TC ID box for service
    And press enter
    And click continue button
    And click the check box of HstTer
    And double click on service ID box
    And select service
    And double click the doctor ID box
    And select the first doctor
    And double click on assistant ID box
    And select the first assistant
    And double click CgrTipiNo box
    And select the control
    And insert the description "abeyis automation test"
    And click save button
    And assert the saved message
    And assert the KLN warning message
    And close the warning message
    And click on clean button
    And insert the TC Identity Number in TC ID box for service
    And press enter
    And assert record popup page
    And click continue button
    Then assert the new record in service's list

  @TC0087
  Scenario: The user can display and update additional information about patient (Gelisine Ait Bilgiler)
    When click on query button
    And insert the protocol number in the protocol box
    And press enter
    Then assert the patient's the protocol number
    When double click in GSSIlk Takip box
    Then assert the GSS warning message
    And close the warning message
    When click on HakSahTipi
    Then assert the list of HakSahTipi
    When click on TakipAra button
    Then assert the TakipAra page
    And close the TakipAra page
    When click on HakSahipligi button
    Then assert the HakSahipligi warning message
    And close the warning message
    When click on GssCOO button
    Then assert the "Gss C00" popup section
    And close GssCOO popup page
    When click on GelisSekli drop down list
    Then assert the GelisSekli drop down
    When click on TedaviTipi drop down list
    Then assert the TedaviTipi drop down list
    When click on CariBekTarih
    Then assert the calendar
    When click on check box KimligiKontrolEdildi
    Then assert the KimligiKontrolEdildi check box was checked
    When click on check box KimligiFotokopisiAlindi
    Then assert the KimligiFotokopisiAlindi check box was checked
    When click on check box HESKoduDogrulandi
    Then assert the HESKoduDogrulandi check box was checked
    When click on check box DosyaIstemiYap
    Then assert the DosyaIstemiYap check box was checked
    When click on check box SaglikKuruluSevk
    Then assert the SaglikKuruluSevk check box was checked

  @TC0088
  Scenario: The user can display and update additional information about patient (Kabul Bilgileri)
    When click on acceptance information button
    Then assert the acceptance information section
    When click on acceptance information describing button
    And assert the details describing page
    Then close the details describing page
    When click on foreign patient registration form button
    And assert the foreign patient warning message
    And close the warning message
    And insert the TC Identity Number in TC ID box
    And press enter
    And check TC ID warning popup
    And click on foreign patient registration form button
    Then assert the foreign patient registration form page
    Then close the foreign patient registration form page
    When click on acceptance criteria drop down list
    Then assert the acceptance criteria drop down list
    When click on reason for application drop down list
    Then assert the reason for application drop down list
    When click on reason for application second drop down list
    Then assert the reason for application second drop down list
    When click on reason for preference drop down list
    Then assert the reason for preference drop down list
    When insert the description "abeyis" in reason for preference box
    When insert the description "abeyis test automation" in complaint box
    When double click in relationship box
    Then assert the relationship popup page
    And select the relationship
    When insert the TC ID of relationship
    And click on relation's birthday calendar
    And assert relation's birthday calendar
    When click on transfer button
    And assert the transfer popup page
    Then close the transfer popup page
    When insert the name lastname of relationship
    And insert the phone number of relationship
    And insert the passport number of relationship
    And insert the email of relationship
    And insert the address relationship
    When click the received on approve radio button
    And assert the received on approve radio button selected
    And click the not received on approve radio button
    Then assert the not received on approve radio button selected
    When click the check box dressing process
    And assert the check box dressing process selected
    And click the check box no Id card
    And assert the check box no Id card selected
    And click the check box prescriptions
    Then assert the check box prescriptions selected
    When click on disability situation drop down list
    And assert the disability situation drop down list
    And click on social care drop down list
    And assert the social care drop down list
    And click on needs assessment drop down list
    And assert the needs assessment drop down list
    And assert the description "abeyis test automation" in complaint box
    And assert the description "abeyis" in reason for preference box
    And assert the TC ID of relationship
    And assert the name lastname of relationship
    And assert the phone number of relationship
    And assert the passport number of relationship
    And assert the email of relationship
    Then assert the address of relationship

  @TC0089
  Scenario: The user can check the details about patient record
    When insert the TC Identity Number in TC ID box
    And press enter
    And check TC ID warning popup
    And scroll down
    And assert the all services that patient got
    And click on inspect button for first service
    And click on services button
    Then assert the patient's services page

  @TC0089_b
  Scenario: The user can delete or cancel the appointment
    When insert the TC Identity Number in TC ID box
    And press enter
    And check TC ID warning popup
    And scroll down
    And assert the all services that patient got
    And click on inspect button for first service
    And click on service settings button
    And click on delete service button
    And click yes button for delete
    Then assert the service record is deleted

  ##@hasta_button
  ##Scenario: The user can click hasta button
  ##  When The user can click hasta button
  ##  Then hasta page