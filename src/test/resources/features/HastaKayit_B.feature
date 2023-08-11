@probel_hastaKayit
Feature: probel_hastaKayit

  Background:
    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And Click the Hasta button
    And Enter Kurum, Kurum detay

  Scenario: TC0030 Patient registration should be done with valid patient data
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu
    And Write a valid Cep Telefonu
    And Select a valid Doğum Tarihi
    And Select Cinsiyeti
   #And Write a valid "Soyadı"
   #And Write a valid "Adı"
   #And Click "Kaydet" button
   #And Click the "Kapat" button
   #And Click the "Kapat" button
   #And Select a valid "Poliklinik"
   #And Select a valid "Geliş Şekli"
   #And Click "Kaydet" button
   #Then Registred patient should be seen in "Hasta Listesi"