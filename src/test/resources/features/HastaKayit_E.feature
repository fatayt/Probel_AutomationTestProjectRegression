@probel_hastaKayit
Feature: probel_hastaKayit

  Background:
    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And Click the Hasta button
    And Enter Kurum, Kurum detay

  @test1
  Scenario: TC001 - "Tc" Kimlik no" error message verification
    Then click the Kaydet-F10- button
    And verify -Hasta Karti Düzenleme - T.C kimlik numarasi bos olamaz ...PROBEL!- message

  @test2
  Scenario: TC002 - "Passport no" and "Passport id" verification on the registration page
    Then select nationality uyruk -ABD (Amerika Birleşik D.)-
    And Verify that -Pasaport ıd- and -pasaport no- are in the page

  @test3
  Scenario: TC003 - Entering a future date of the newborn baby's baby birth week
    Then make patient type -SAĞLIK TURİZMİ-
    And Enter -TC no- -Adi -soyadi- -doğum tarihi- -cinsiyet- -ana adi- -baba adi- -doğum yeri- -anne tc no-
    And -Yeni doğan- button click
    And verify the text -Bebeğin doğum haftası günü-
    And -Bebeğin doğum- -haftasi--günü- enter a week and future days
    And enter mobile number -cep telefonu- and click -sms gönderilebilir-
    And Click the -kaydet f10- boxxx
    And Select a valid Poliklinik on Muayene Kayıt Page
    And Select a valid Geliş Şekli on Muayene Kayıt Page
    And Click Kaydet button on Muayene Kayıt Page
    Then Bilgiler Kaydedildi should be seen on Popup Alert on Muayene Kayıt Page


    @test4
    Scenario: TC0116 - verification of "Tahsis no" and "karne seri no" on the registration page
    Then select nationality -uyruk- -Almanya-
    And Verify that -Tahsis no- and -karne seri no- are in the page

    @test5
    Scenario: TC0059 - the patient's mother's date of birth is a later date
    Then -Anne doğum tarihi- enter a future date
    And select -Hasta türü- -Kimliksiz hasta-
    And Enter -Kişi bilgileri- -TC-,-Adı-,-Soyadı-,-cinsiyet-,-Baba Adı-,-Anne adi-,-Doğum yeri-,-Anne tc-
    And Hata message verifyy


    @test6
    Scenario: TC0058 - Date of birth accepts a future date
   Then click the -Yeni Doğan- button
    And Enter -Kişi bilgileri- -TC-,-Adı-,-Soyadı-,-cinsiyet-,-Baba Adi-,-Anne adi-,-Dogum yeri-,-Anne tc-
    And -Doğum T.- enter a future date
    And -Kaydet- button click
    And -Hata- message verify

    @test7
    Scenario: TC0043 - city_county_validation
    Then Type -47- in the -İl- box
    And Double click the -İlce- box and check the popup
    And  Verify -oge sayisi"

      @test8
      Scenario: ts
        Then select nationality uyruk -ANDORRA-
        And enter patient type -T.C. SAĞLIK BAKANLIĞI SAĞLIK VE TIP ALANINDA İKİLİ İŞ BİRLİĞİ ANLAŞMALARI KAPSAMINDAKİ HASTALAR-
        And Enter -pasaport no- and -passport id-
        And -cinsiyet- enter
        And -cep telefonu- enter
        And Enter -adi- and -soyadi-
        And Enter -dogum Tarihi-
        And -işlem başarılı- massage verify
        And -kapat- button click
        And Poliklinik enter
        And select -geliş nedeni-
        And -kaydett- button click
        When -Bilgiler kaydedildi- massage veryfy

