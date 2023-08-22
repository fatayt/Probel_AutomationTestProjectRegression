Feature:Detaylı Hasta Arama
  Background:
    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And The user clicks Detayli Hasta arama Button

  Scenario: Protokol No Sorgulama
    And The user enters ProtokolNO
    And The user clicks sorgulama button
    And The user Verifies that the patient displays

  @TC0053
  Scenario: TC0053 - Ability to select "Kullanıcı"
    And Double click on the User tab
    And Enter user name
    And Enter ID
    And Click on the UserSec
    And Verify that the user's list of patients is displayed

  @TC0054
  Scenario:TC0054 - *"Patient Registration Query should be possible with "TC Kimlik No" "Patient Registration Query should be possible with "TC Kimlik No"
    And The user enters TcKimlikNo
    And The user clicks sorgulama button
    And Visibility is checked with the patient's TC Kimlik No

  Scenario:TC0055 - Inquiry should be possible with "Hasta No"
    And The user enters Hasta No
    And The patient number called and the patient number received must be verified

  Scenario: TC0056 - Patients should be listed with Yatış Tarihi
    And Detaylı Tarih Seçimi tab is clicked.
    And Last Three Months tab is clicked.
    And Select tab is clicked.
    And Query tab is clicked.
    And Verify that patients registered in the Last Three Months can be listed

  Scenario: TC0057 - *Patients should be listed with "Geliş Tarihi"
    And Gelis Detayli Tarih Seçimitab is clicked
    And Son Three Months tab is clicked
    And Seçtab is clicked
    And Query tab is clicked.
    And Verify that patients registered in the Last Three Months can be listed two