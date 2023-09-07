@ServiceExaminationRegistration
@PatientRegistration
@Regression
Feature: probel_hastaKayit
  Background:
    Given The user logs in
    And The user goes Hasta Islemleri, Ayaktan Hasta Islemleri and then click Poliklinik Muayene Kayit
    And Click the Hasta button

  @TC0001 @Bug @Smoke
  Scenario: TC0001 - The user must not be able to enter a later date for your mother's date of birth
    Given Enter Kurum, Kurum detay
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

  @TC0002 @Bug
  Scenario: TC0002 - Received an error "Passport No/Id" when the user entered an incorrect "Tahsis No/Id"
    Given Enter Kurum, Kurum detay
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


  @TC0005 @Bug
  Scenario: TC0005 - Armutlu was chosen as the district of Izmir.
    Given Enter Kurum, Kurum detay
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

  @TC0006 @Bug
  Scenario: TC0006 - User can write their private names such as Mother Name, Father Name, Place of Birth in lower case
    Given Enter Kurum, Kurum detay
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

  @TC0007 @Bug @Smoke
  Scenario:TC0007 - The user can register in the Foreign patient type "Tourist's Health" option on the Home page
    Given Enter Kurum, Kurum detay
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
    Given Enter Kurum, Kurum detay
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
    Given Enter Kurum, Kurum detay
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
  Scenario:TC0047 - The user registers a patient in the type "TÜRK SOYLU YABANCILAR"
    Given Enter Kurum, Kurum detay
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

  @TC0048 @Bug
  Scenario:TC0048 - User registers with phone number in correct format
    Given Enter Kurum, Kurum detay
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

  @TC0049 @Bug @Smoke
  Scenario:TC0049 - User registers with name and surname in the appropriate format
    Given Enter Kurum, Kurum detay
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


  @TC0050 @Bug @Smoke
  Scenario:TC0050 - User registers with baba adı, anne adı and dogum yeri in the appropriate format
    Given Enter Kurum, Kurum detay
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

  @TC0064
  Scenario: TC0064 - 13_17_99 Person Information data entry by Patient Type and nationality of countries other than Turkey
    Given Enter Kurum, Kurum detay
    And user selects the Uyruk
    And user click hasta Turu
    And user select multeci kisiler
    And user selects the date of birth
    And user selects a gender
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone
    And user clicks on the save button
    And user assert the registration
    And user click Islem Kapat button
    And user click Kayit Kapat button
    And user select Gelis sekli
    And user click Kaydet button
    And user click TAMAM button in the popup
    And user click Kaydet button
    And user close the message bilgiler kaydedildi
    And user registration verifies
    Then user closes the application

  @TC0064_D0025
  Scenario: TC0064 - D0025 - There is no such country as Seysel
    Given Enter Kurum, Kurum detay
    And user selects the Uyruk as Seysel
    And user click hasta Turu
    And user select multeci kisiler
    And user selects the date of birth
    And user selects a gender
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone
    And user clicks on the save button
    And user assert the registration
    And user click Islem Kapat button
    And user click Kayit Kapat button
    And user select Gelis sekli
    And user click Kaydet button
    And user click TAMAM button in the popup
    And user click Kaydet button
    And user close the message bilgiler kaydedildi
    And user registration verifies
    Then user closes the application
    Then user closes the application

  @TC0064_D0026
  Scenario:TR0064 - D0026 - In September 2018, Svaziland changed its name to Eswatini. Estawani not on the new list
    Given Enter Kurum, Kurum detay
    And user selects the Uyruk as Svaziland
    And user click hasta Turu
    And user select multeci kisiler
    And user selects the date of birth
    And user selects a gender
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone
    And user clicks on the save button
    And user assert the registration
    And user click Islem Kapat button
    And user click Kayit Kapat button
    And user select Gelis sekli
    And user click Kaydet button
    And user click TAMAM button in the popup
    And user click Kaydet button
    And user close the message bilgiler kaydedildi
    And user registration verifies
    Then user closes the application


  @TC0064_D0027
  Scenario:TR0064 - D0027 - The Tahsis No ve Karne Seri No required for Syrian refugees, but also for Germany and Argentina
    Given Enter Kurum, Kurum detay
    And user selects the Uyruk as Almanya
    And user click hasta Turu
    And user select multeci kisiler
    And user selects the date of birth
    And user selects a gender
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone
    And user clicks on the save button
    And user assert the registration
    And user click Islem Kapat button
    And user click Kayit Kapat button
    And user select Gelis sekli
    And user click Kaydet button
    And user click TAMAM button in the popup
    And user click Kaydet button
    And user close the message bilgiler kaydedildi
    And user registration verifies
    Then user closes the application
    Then user closes the application

  @TC0064_D0024
  Scenario:TR0064 - D0024 - There is a meaningless country name in the country option under the Uyrugu
    Given Enter Kurum, Kurum detay
    And user selects the Uyruk as ??L?
    And user click hasta Turu
    And user select multeci kisiler
    And user selects the date of birth
    And user selects a gender
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone
    And user clicks on the save button
    And user assert the registration
    And user click Islem Kapat button
    And user click Kayit Kapat button
    And user select Gelis sekli
    And user click Kaydet button
    And user click TAMAM button in the popup
    And user click Kaydet button
    And user close the message bilgiler kaydedildi
    And user registration verifies
    Then user closes the application
    Then user closes the application

  @TC0065
  Scenario:TR0065 - data entry according to Patient Type 13_17_99 by clicking yeni dogan checkbox
    Given Enter Kurum, Kurum detay
    And user selects the Uyruk as arnavutluk
    And user click hasta Turu
    And user select stateless persons
    And user selects the date of birth
    And user selects a gender
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone
    And user click newborn
    And user selects the date of birth newborn
    And user selects the date of birth mother
    And user enters the TC number of mother
    And user enters the baby birthweek
    And user enters the baby birthday
    And user clicks on the save button
    And user assert issue message
    Then user closes the application

  @TC0069
  Scenario: TR0069 - D0028 - There is more than one of the same options in the "Basvuru sekli" drop-down box
    Given Enter Kurum, Kurum detay
    And user click Basvuru sekli
    And user select Basvuru sekli
    And user assert that the options in the list are unique

  @TR0073
  Scenario: TR0073 - when you first click on the phone textbox and then enter the institution information, the process gives a successful message
    Given Enter Kurum, Kurum detay
    And user selects the Uyruk
    And user click hasta Turu
    And user select multeci kisiler
    And user selects the date of birth
    And user selects a gender
    And user writes Passport Id
    And user writes Passport No
    And user enters the mobile phone
     # And Enter Kurum, Kurum detay
    And user clicks on the save button
    And user assert the registration
    And user click Islem Kapat button
    And user click Kayit Kapat button
    And user select Gelis sekli
    And user click Kaydet button
    And user click TAMAM button in the popup
    And user click Kaydet button
    And user close the message bilgiler kaydedildi
    And user registration verifies
    Then user closes the application

  @TC0118
  Scenario: TC0118 - "Tc" Kimlik no" error message verification
    Given Enter Kurum, Kurum detay
    Then click the Kaydet-F10- button
    And verify -Hasta Karti Düzenleme - T.C kimlik numarasi bos olamaz ...PROBEL!- message

  @TC0117
  Scenario: TC0117 - "Passport no" and "Passport id" verification on the registration page
    Given Enter Kurum, Kurum detay
    Then select nationality uyruk -ABD (Amerika Birleşik D.)-
    And Verify that -Pasaport ıd- and -pasaport no- are in the page

  @TC0100
  Scenario: TC0100 - Entering a future date of the newborn baby's baby birth week
    Given Enter Kurum, Kurum detay
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

  @TC0116
  Scenario: TC0116 - verification of "Tahsis no" and "karne seri no" on the registration page
    Given Enter Kurum, Kurum detay
    Then select nationality -uyruk- -Almanya-
    And Verify that -Tahsis no- and -karne seri no- are in the page

  @TC0059
  Scenario: TC0059 - the patient's mother's date of birth is a later date
    Given Enter Kurum, Kurum detay
    Then -Anne doğum tarihi- enter a future date
    And select -Hasta türü- -Kimliksiz hasta-
    And Enter -Kişi bilgileri- -TC-,-Adı-,-Soyadı-,-cinsiyet-,-Baba Adı-,-Anne adi-,-Doğum yeri-,-Anne tc-
    And Hata message verifyy

  @TC0058
  Scenario: TC0058 - Date of birth accepts a future date
    Given Enter Kurum, Kurum detay
    Then click the -Yeni Doğan- button
    And Enter -Kişi bilgileri- -TC-,-Adı-,-Soyadı-,-cinsiyet-,-Baba Adi-,-Anne adi-,-Dogum yeri-,-Anne tc-
    And -Doğum T.- enter a future date
    And -Kaydet- button click
    And -Hata- message verify

  @TC0043
  Scenario: TC0043 - city_county_validation
    Given Enter Kurum, Kurum detay
    Then Type -47- in the -İl- box
    And Double click the -İlce- box and check the popup
    And  Verify -oge sayisi"

  @TC0134
  Scenario: TC0134 - foreign national patient registration
    Given Enter Kurum, Kurum detay
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

  @TC0135
  Scenario: TC0135 - "yenidoğan" and"doğum tarihi" check
    Given Enter Kurum, Kurum detay
    Given click the button Yeni Dogan
    When Enter a date beyond 30 days of birth
    And Enter anne tc no
    And Bebegin dogum haftasi and gunu enter
    And Enter -telefon no-
    And -Kaydet- button click
    And -Doğum tarihi 30 günü geçmiş hastalar için yenidoğan seçeneği işaretlenemez..!- veryfy

  @TC0030
  Scenario: TC0030 Patient registration should be done with valid patient data (Kimliksiz Hasta)
    Given Enter Kurum, Kurum detay
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Select a valid Doğum Tarihi on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And Write a valid Soyadı on Hasta Kayıt Page
    And Write a valid Adı on Hasta Kayıt Page
    And Select a valid Yakınlığı on Hasta Kayıt Page
    And Click Kaydet button on Hasta Kayıt Page
    And Click the Bilgi button on Hasta Kayıt Page
    And Click the Kapat button on Hasta Kayıt Page
    And Select a valid Poliklinik  from on Muayene Kayıt Page
    And Select a valid Geliş Şekli  from on Muayene Kayıt Page
    And Click Kaydet button from on Muayene Kayıt Page
    And Bilgiler Kaydedildi alert should be seen on Popup Alert on Muayene Kayıt Page
    Then Registered patient should be seen on Detaylı Hasta Arama Page

  @TC0076
  Scenario: TC0076 Patient registration should be done with minimum required data about patient (Kimliksiz Hasta)
    Given Enter Kurum, Kurum detay
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Select a valid Doğum Tarihi on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And Write a valid Soyadı on Hasta Kayıt Page
    And Write a valid Adı on Hasta Kayıt Page
    And Click Kaydet button on Hasta Kayıt Page
    And Click the Bilgi button on Hasta Kayıt Page
    And Click the Kapat button on Hasta Kayıt Page
    And Select a valid Poliklinik  from on Muayene Kayıt Page
    And Select a valid Geliş Şekli  from on Muayene Kayıt Page
    And Click Kaydet button from on Muayene Kayıt Page
    Then Bilgiler Kaydedildi alert should be seen on Popup Alert on Muayene Kayıt Page

  @TC0077
  Scenario: TC0077 Patient registration shouldnt be done with a future Birthday Date (Kimliksiz Hasta)
    Given Enter Kurum, Kurum detay
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Select a valid Doğum Tarihi on Hasta Kayıt Page
    And Select an invalid future  Doğum Tarihi on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And Write a valid Soyadı on Hasta Kayıt Page
    And Write a valid Adı on Hasta Kayıt Page
    And Click Kaydet button on Hasta Kayıt Page
    Then İşlem Başarılı   shouldnt be seen on popoup on Hasta Kayıt Page

  @TC0136
  Scenario: TC0136 Patient registration shouldn't be done without a valid name and a lastname (Kimliksiz Hasta)
    Given Enter Kurum, Kurum detay
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Select a valid Doğum Tarihi on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And Click Kaydet button on Hasta Kayıt Page
    Then İşlem Başarılı   shouldnt be seen on popoup on Hasta Kayıt Page

  @TC0078
  Scenario: TC0078 Newborn Patient registration to Yetiskin Poliklinik shouldnt be done (Kimliksiz Hasta).
    Given Enter Kurum, Kurum detay
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And click Yenidoğan checkbox  on Hasta Kayıt Page
    And Select a valid date within one month at the latest as Doğum Tarihi on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And write a valid value on Haftası for Bebeğin Doğum  on Hasta Kayıt Page
    And write a valid value on Günü for Bebeğin Doğum  on Hasta Kayıt Page
    And Click Kaydet button on Hasta Kayıt Page
    And Click the Bilgi button on Hasta Kayıt Page
    And Click the Kapat button on Hasta Kayıt Page
    And Select Acil Erişkin Müşahade on Poliklinik on Muayene Kayıt Page
    And Select a valid Geliş Şekli  from on Muayene Kayıt Page
    And Click Kaydet button from on Muayene Kayıt Page
    Then Bilgiler Kaydedildi shouldnt be seen on Popup Alert on Muayene Kayıt Page

  @TC0086
  Scenario: TC0086 Only letters and space character should be written in the first and last name section (Kimliksiz Hasta)
    Given Enter Kurum, Kurum detay
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Select a valid Doğum Tarihi on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And Write a statement contains some numbers  as Soyadı  on Hasta Kayıt Page
    And Write a statement contains some numbers  as Adı  on Hasta Kayıt Page
    And Click Kaydet button on Hasta Kayıt Page
    Then İşlem Başarılı   shouldnt be seen on popoup on Hasta Kayıt Page

  @TC0079
  Scenario:  TC0079 Only women patients can be registered to KADIN DOGUM POLIKLINIK
    Given Enter Kurum, Kurum detay
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Select a valid Doğum Tarihi on Hasta Kayıt Page
    And Select Cinsiyeti as Erkek on Hasta Kayıt Page
    And Click Kaydet button on Hasta Kayıt Page
    And Click the Bilgi button on Hasta Kayıt Page
    And Click the Kapat button on Hasta Kayıt Page
    And Select a valid Geliş Şekli  from on Muayene Kayıt Page
    When Select  Poliklinik as KADIN DOĞUM on Muayene Kayıt Page
    Then An alert should be seen on Muayene Kayıt Page

  @TC0137
  Scenario: TC0137 If nationality is different from Türkiye,
  then Passport Id and Passport Number box shouldn't be active
    Given Enter Kurum, Kurum detay
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Select country  from   Uyruğu drop down menu on Hasta Kayıt Page
      | country                    |
      | TÜRKMENISTAN               |
      | BELÇIKA                    |
      | RUSYA FED. / DAĞISTAN CUM. |
      | TOGO                       |


  @TC0138
  Scenario: TC0138 If Nationality  is selected as Türkiye, Mavikart shouldn't be clickable (Kimliksiz Hasta)
    Given Enter Kurum, Kurum detay
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And click Mavikart checkbox on Hasta Kayıt Page
    And Select a valid Doğum Tarihi on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Click Kaydet button on Hasta Kayıt Page
    Then İşlem Başarılı   shouldnt be seen on popoup on Hasta Kayıt Page

  @TC0139
  Scenario: TC0139 If Yenidogan checkbox is selected then only positive integers should be written to Dogumsirasi
    Given Enter Kurum, Kurum detay
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Select a valid Doğum Tarihi on Hasta Kayıt Page
    And click Yenidoğan checkbox  on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    Then Only positive integers should be written to Doğumsırası on Hasta Kayıt Page
      | Number |
      | -5     |
      | 0      |
      | -2     |
      | 3      |

  @TC0102
  Scenario: TC0102 If E-mail Gönderilebilir box is  checked  then
  E-mail box should be active and a valid email should be accepted (Kimliksiz Hasta)
    Given Enter Kurum, Kurum detay
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And click  E-mail Gönderilebilir button   on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Select a valid Doğum Tarihi on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And E-mail box should be active on Hasta Kayıt Page
    Then only valid emails should be accepted
      | E-mail           |
      | asd@com          |
      | asd12.com@       |
      | sderf@gmail@.com |
      | abcds@gmail.com  |
      | tyrd.com@outlook |
      | @gmail.com       |
      | a     @gmail.com |

  @TC0140
  Scenario: TC0140 newborn  cannot be clicked for a patient whose age is older than 30 days (Kimliksiz Hasta)
    Given Enter Kurum, Kurum detay
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And click Yenidoğan checkbox  on Hasta Kayıt Page
    And write a valid value on Haftası for Bebeğin Doğum  on Hasta Kayıt Page
    And write a valid value on Günü for Bebeğin Doğum  on Hasta Kayıt Page
    And Only valid Birth Dates should be accepted on Hasta Kayıt Sayfası
      | Birth Date |
      | 20.08.2023 |
      | 15.07.2021 |
      | 24.07.2023 |
      | 25.07.2023 |
      | 26.07.2023 |
      | 02.01.2010 |
      | 25.08.2023 |
      | 02.08.2030 |
      | 15.08.2040 |

  @TC0141
  Scenario: TC0141  The Age of The Mother cannot be smaller than 15 (Kimliksiz Hasta)
    Given Enter Kurum, Kurum detay
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And click Yenidoğan checkbox  on Hasta Kayıt Page
    And write a valid value on Haftası for Bebeğin Doğum  on Hasta Kayıt Page
    And write a valid value on Günü for Bebeğin Doğum  on Hasta Kayıt Page
    And Select a valid date within one month at the latest as Doğum Tarihi on Hasta Kayıt Page
    Then  The Age of The Mother shouldn't be smaller than fifteen on Hasta Kayıt Page
      | Birth Date |
      | 10.08.2023 |
      | 15.08.2040 |
      | 15.08.2000 |
      | 15.08.1990 |

  @TC142
  Scenario: TC142  If something except Kendisi is selected, then Kart Sahibi box should be active (Kimliksiz Hasta)
    Given Enter Kurum, Kurum detay
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Select Proximity from Yakınlığı drop down menu on Hasta Kayıt Page
    Then Kart Sahibi box should be active on Hasta Kayıt Page when If something except Kendisi is selected

  @TC0143
  Scenario: TC0143 If Mavi Kartlilar is selected then patient resgistration should be done with a valid ID
    Given Enter Kurum, Kurum detay
    When Select Mavi Kartlılar from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Select a valid Doğum Tarihi on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And Write a valid T.C. Kimlik No on Hasta Kayıt Page
    Then If Id is valid then İşlem Başarılı   should be seen on popoup on Hasta Kayıt Page
      | Mobile Phone |
      | 01234567891  |
      | 45678912123  |
      | 30874870302  |
      | 33241633218  |
      | 7724         |

  @TC0080
  Scenario:TC0080 Patient resgitration should be done with valid patient data
    Given Enter Kurum, Kurum detay
    When Select Mavi Kartlılar from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Write a valid T.C. Kimlik No on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Select a valid Doğum Tarihi on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And Write a valid Soyadı on Hasta Kayıt Page
    And Write a valid Adı on Hasta Kayıt Page
    And Select a valid Yakınlığı on Hasta Kayıt Page
    And Click Kaydet button on Hasta Kayıt Page
    And Click the Bilgi button on Hasta Kayıt Page
    And Click the Kapat button on Hasta Kayıt Page
    And Select a valid Poliklinik  from on Muayene Kayıt Page
    And Select a valid Geliş Şekli  from on Muayene Kayıt Page
    And Click Kaydet button from on Muayene Kayıt Page
    And Bilgiler Kaydedildi alert should be seen on Popup Alert on Muayene Kayıt Page
    Then Registered patient should be seen on Detaylı Hasta Arama Page

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
    And User enters "name_4" in name box
    And User clicks Gender box and chooses the "gender_2"
    And User enters date Of Birth in date of birth box
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User enters validTCID in TC ID box
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
    And User clicks the popap close button
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

  @TC0093 @Bug
  Scenario: TC0093 The pasport Number should be requested for the registiration of patients whose nationality is outside of Turkey
    Given User chooses the "nationality_2"
    And User clicks Patient Type box and Choose Button on dual citizens
    Then User verifies that Passport Id and No is requested

  @TC0094
  Scenario: TC0094 User should enter mother T.C. Number whose age is less than 6 months and nationality is outside of Turkey
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on dual citizens
    And User chooses the "nationality_1"
    And User clicks Gender box and chooses the "gender_1"
    And User enters the date of birth less than alti months old in date of birth box
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

  @TC0107 @Bug
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

  @TC0108 @Bug
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

  @TC0115 @Bug
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
    And User enters birth week and birth day
    And User clicks the Save button
    And User clicks the succes close button
    And User clicks the page close button
    And User clicks the warning Button
    And User selects the polyclinic on Inspection Registration Page
    And User selects the arrival type
    And User clicks the Save button on Inspection Registration Page
    And User clicks the save button again
    And User takes patient's protocol Number
    And User clicks Detailed patient search button
    And User enters the patient's protocol number
    And Users clicks the query button
    Then User verifies that the patient is not enrolled

  @TC0123
  Scenario: TC0123  User should be able to register with Passport Id and Passport No whose nationality is outside of Turkey
    Given Enter Kurum, Kurum detay
    And User chooses the "nationality_1"
    And User clicks Patient Type box and Choose Button on Coming for Education and their obligations
    And User enters "surname_2" in surname box
    And User enters "name_2" in name box
    And User clicks Gender box and chooses the "gender_1"
    And User enters date Of Birth in date of birth box
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User enters "validPassportId" and "validPassportNo"
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
    Then User verifies that the patient is enrolled

  @TC0124 @Bug
  Scenario: TC0124 The pasport Number should be requested for the registiration of patients whose nationality is outside of Turkey
    Given User chooses the "nationality_2"
    And User clicks Patient Type box and Choose Button on Coming for Education and their obligations
    Then User verifies that Passport Id and No is requested

  @TC0125
  Scenario: TC0125 When the "Yenidoğan" checkbox is checked , the fields of "Doğum Sırası" , "Haftası","Günü" are becomes active
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on Coming for Education and their obligations
    And User ticks the newborn checkedbox
    Then Assert that birtDay and birthOrder searchBoxes are display

  @TC0127
  Scenario: TC0127 When "SMS Gönderilebilir" checkbox is checked, it should warn if mobile phone information is not entered
    Given User clicks Patient Type box and Choose Button on Coming for Education and their obligations
    And User chooses the "nationality_1"
    And User enters "validPassportId" and "validPassportNo"
    And User clicks Gender box and chooses the "gender_2"
    And User enters date Of Birth in date of birth box
    And User clicks the Save button
    And User clicks the pop ap close button
    And Enter Kurum, Kurum detay
    And User clicks the Save button
    And User clicks the succes close button
    And User clicks the page close button
    And User clicks the YES button
    And User clicks the Save button
    Then User verifies that the message "phoneNumberWarningMessage" is displayed

  @TC0128
  Scenario: TC0128 If T.C. Number is invalid , application should give the message of "Geçerli bir kimlik numarası giriniz "
    Given User clicks Patient Type box and Choose Button on Coming for Education and their obligations
    And User enters "inValidTCID" in TC ID box
    And User clicks the Save button
    Then User verifies that the message "ValidTCWarningMessage" is displayed

  @TC0129
  Scenario: TC0129 Email information should contain " @ "
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on Coming for Education and their obligations
    And User chooses the "nationality_1"
    And User enters "validPassportId" and "validPassportNo"
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User clicks Gender box and chooses the "gender_2"
    And User enters date Of Birth in date of birth box
    And User enters email without @
    And User clicks the Save button
    Then User verifies that the message "ValidEmailWarningMessage" is displayed

  @TC0130
  Scenario: TC0130 "Kart Sahibi" field becomes active When something other than itself is selected in the "Yakınlığı" tab
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on Coming for Education and their obligations
    And User clicks yakinligi and chooses mother
    Then Assert that cardOwner searchBox is display

  @TC0131 @Bug
  Scenario: TC0131 The patient's date of birth cannot be later than today.
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on Coming for Education and their obligations
    And User chooses the "nationality_5"
    And User enters "validPassportId" and "validPassportNo"
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User clicks Gender box and chooses the "gender_2"
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

  @TC0132
  Scenario: TC0132 User should not enter The pasaport Id and Pasaport No less than 5 characters for the registiration of patients whose nationality is outside of Turkey
    Given Enter Kurum, Kurum detay
    And User clicks Patient Type box and Choose Button on Coming for Education and their obligations
    And User chooses the "nationality_5"
    And User enters "inValidPassportId" and "inValidPassportNo"
    And User enters "MobilePhoneNumber" in mobile phone number box
    And User clicks the Save button
    Then User verifies that the message "fiveChrWarningMessage" is displayed