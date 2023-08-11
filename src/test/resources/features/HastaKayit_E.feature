@probel_hastaKayit
Feature: probel_hastaKayit

  Background:
    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And Click the Hasta button
    And Enter Kurum, Kurum detay

  @e_test1
  Scenario: TC001 - "Tc" Kimlik no" error message verification
    Then click the Kaydet-F10- button
    And verify -Hasta Karti Düzenleme - T.C kimlik numarasi bos olamaz ...PROBEL!- message

  @e_test2
  Scenario: TC002 - "Passport no" and "Passport id" verification on the registration page
    Then select nationality uyruk -ABD (Amerika Birleşik D.)-
    And Verify that -Pasaport ıd- and -pasaport no- are in the page

  @e_test3
  Scenario: TC003 - Entering a future date of the newborn baby's baby birth week
    Then make patient type -SAĞLIK TURİZMİ-
    And Enter -TC no- -Adi -soyadi- -doğum tarihi- -cinsiyet- -ana adi- -baba adi- -doğum yeri- -anne tc no-
    And -Yeni doğan- button click
    And verify the text -Bebeğin doğum haftası günü-
    And -Bebeğin doğum- -haftasi--günü- enter a week and future days
    And enter mobile number -cep telefonu- and click -sms gönderilebilir-
    And Click the -kaydet f10- boxxx