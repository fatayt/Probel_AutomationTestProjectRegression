@ServiceExaminationRegistration
@probel_hastaKayit
Feature: probel_hastaKayit
  Background:
    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And Click the Hasta button
    And Enter Kurum, Kurum detay
  @TC001
  Scenario: TC001 - "Tc" Kimlik no" error message verification
    Then click the Kaydet-F10- button
    And verify -Hasta Karti Düzenleme - T.C kimlik numarasi bos olamaz ...PROBEL!- message
  @TC002
  Scenario: TC002 - "Passport no" and "Passport id" verification on the registration page
    Then select nationality uyruk -ABD (Amerika Birleşik D.)-
    And Verify that -Pasaport ıd- and -pasaport no- are in the page
  @TC003
  Scenario: TC003 - Entering a future date of the newborn baby's baby birth week
    Then make patient type SAGLİK TURİZMİ
    And Enter TC no
    And Enter Adi
    And Enter soyadi
    And Enter dogum tarihi
    And Enter cinsiyet
    And Enter ana adi
    And Enter baba adi
    And doğum yeri
    And anne tc no
    And Yeni doğan button click
    And verify the text Bebegin dogum haftasi günü
    And Bebeğin dogum haftasi gunu enter a week and future days
    And enter mobile number cep telefonu and click sms gönderilebilir
    And Click the kaydet f10 box
    And Select a valid Poliklinik on Muayene Kayıt Page
    And Select a valid Gelis sekli on Muayene Kayit Page
    And Click Kaydet button on Muayene Kayıt Page
    Then Bilgiler Kaydedildi should be seen on Popup Alert on Muayene Kayıt Page
  @TC004
  Scenario: TC0116 - verification of "Tahsis no" and "karne seri no" on the registration page
    Then select nationality -uyruk- -Almanya-
    And Verify that -Tahsis no- and -karne seri no- are in the page
  @TC005
  Scenario: TC0059 - the patient's mother's date of birth is a later date
    Then -Anne doğum tarihi- enter a future date
    And select -Hasta türü- -Kimliksiz hasta-
    And Enter -Kişi bilgileri- -TC-,-Adı-,-Soyadı-,-cinsiyet-,-Baba Adı-,-Anne adi-,-Doğum yeri-,-Anne tc-
    And Hata message verifyy
  @TC006
  Scenario: TC0058 - Date of birth accepts a future date
    Then click the -Yeni Doğan- button
    And Enter -Kişi bilgileri- -TC-,-Adı-,-Soyadı-,-cinsiyet-,-Baba Adi-,-Anne adi-,-Dogum yeri-,-Anne tc-
    And -Doğum T.- enter a future date
    And -Kaydet- button click
    And -Hata- message verify
  @TC007
  Scenario: TC0043 - city_county_validation
    Then Type -47- in the -İl- box
    And Double click the -İlce- box and check the popup
    And  Verify -oge sayisi"
  @TC008
  Scenario: TC0134 - foreign national patient registration
    Then select nationality uyruk -ANDORRA-
    And enter patient type -T.C. SAĞLIK BAKANLIĞI SAĞLIK VE TIP ALANINDA İKİLİ İŞ BİRLİĞİ ANLAŞMALARI KAPSAMINDAKİ HASTALAR-
    And Enter -pasaport no- and -passport id-
    And -cinsiyet- enter
    And -cep telefonu- enter
    And Enter -adi- and -soyadi-
    And Enterr dogum Tarihi
    And -işlem başarılı- massage verify
    And -kapat- button click
    And Poliklinik enter
    And select -geliş nedeni-
    And -kaydett- button click
    When -Bilgiler kaydedildi- massage veryfy
  @TC009
  Scenario: TC0135 - "yenidoğan" and"doğum tarihi" check
    Given click the button Yeni Dogan
    When Enter a date beyond 30 days of birth
    And Enter anne tc no
    And Bebegin dogum haftasi and gunu enter
    And Enter -telefon no-
    And -Kaydet- button click
    And -Doğum tarihi 30 günü geçmiş hastalar için yenidoğan seçeneği işaretlenemez..!- veryfy