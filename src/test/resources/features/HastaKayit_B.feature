@probel_hastaKayit_B
Feature: probel_hastaKayit

  Background:
    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And Click the Hasta button
    And Enter Kurum, Kurum detay


  Scenario: TC0030 Patient registration should be done with valid patient data (Kimliksiz Hasta)
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


  Scenario: TC0076 Patient registration should be done with minimum required data about patient (Kimliksiz Hasta)
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

  Scenario: TC0077 Patient registration shouldnt be done with a future Birthday Date (Kimliksiz Hasta)
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Select a valid Doğum Tarihi on Hasta Kayıt Page
    And Select an invalid future  Doğum Tarihi on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And Write a valid Soyadı on Hasta Kayıt Page
    And Write a valid Adı on Hasta Kayıt Page
    And Click Kaydet button on Hasta Kayıt Page
    Then İşlem Başarılı   shouldnt be seen on popoup on Hasta Kayıt Page

  Scenario: TC? Patient registration shouldn't be done without a valid name and a lastname (Kimliksiz Hasta)
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And Click Kaydet button on Hasta Kayıt Page
    Then İşlem Başarılı   shouldnt be seen on popoup on Hasta Kayıt Page

  Scenario: TC0078 Newborn Patient registration to Yetiskin Poliklinik shouldnt be done (Kimliksiz Hasta).
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

  Scenario: TC0086 Only letters and space character should be written in the first and last name section (Kimliksiz Hasta)
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Select a valid Doğum Tarihi on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And Write a statement contains some numbers  as Soyadı  on Hasta Kayıt Page
    And Write a statement contains some numbers  as Adı  on Hasta Kayıt Page
    And Click Kaydet button on Hasta Kayıt Page
    Then İşlem Başarılı   shouldnt be seen on popoup on Hasta Kayıt Page

  Scenario: TC0079 Only women patients should be resgistered to (Kimliksiz Hasta)
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

  Scenario:  TC00? If Nationality is different from Türkiye,
  Passport Id and Passport number box shouldn't be active (Kimliksiz Hasta)
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Select country  from   Uyruğu drop down menu on Hasta Kayıt Page
      | country                    |
      | TÜRKMENISTAN               |
      | BELÇIKA                    |
      | RUSYA FED. / DAĞISTAN CUM. |
      | TOGO                       |


  Scenario: TC00?? If Nationality  is selected as Türkiye, Mavikart shouldn't be clickable (Kimliksiz Hasta)
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And click Mavikart checkbox on Hasta Kayıt Page
    And Select a valid Doğum Tarihi on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Click Kaydet button on Hasta Kayıt Page
    Then İşlem Başarılı   shouldnt be seen on popoup on Hasta Kayıt Page

  Scenario: TC001???  If Nationality  is selected as Türkiye, Mavikart shouldn't be clickable
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And click Yenidoğan checkbox  on Hasta Kayıt Page
    Then Only positive integers should be written to Doğumsırası on Hasta Kayıt Page
      | Number |
      | -5     |
      | 0      |
      | 4.7    |
      | -2.5   |

  Scenario: TC00102 If E-mail Gönderilebilir box is  checked  then
  E-mail box should be active and a valid email should be accepted (Kimliksiz Hasta)
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

  Scenario: TC0010?? newborn is not clicked for a patient whose age is older than 30 days (Kimliksiz Hasta)
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And click Yenidoğan checkbox  on Hasta Kayıt Page
    And write a valid value on Haftası for Bebeğin Doğum  on Hasta Kayıt Page
    And write a valid value on Günü for Bebeğin Doğum  on Hasta Kayıt Page
    And Only valid Birth Dates should be accepted on Hasta Kayıt Sayfası
      | Birth Date |
      | 10.08.2023 |
      | 15.07.2021 |
      | 15.07.2023 |
      | 14.07.2023 |
      | 16.07.2023 |
      | 02.01.2010 |
      | 25.08.2023 |
      | 02.08.2030 |
      | 15.08.2040 |

  Scenario: TC0010???  The Age of The Mother cannot be smaller than 15 (Kimliksiz Hasta)
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


  Scenario: TC0010???  If something except Kendisi is selected, then Kart Sahibi box should be active (Kimliksiz Hasta)
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Select Proximity from Yakınlığı drop down menu on Hasta Kayıt Page
    Then Kart Sahibi box should be active on Hasta Kayıt Page when If something except Kendisi is selected


  Scenario: TC0080 If something except Kendisi is selected
    When Select Mavi Kartlılar from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Write a valid Cep Telefonu on Hasta Kayıt Page
    And Select a valid Doğum Tarihi on Hasta Kayıt Page
    And Select Cinsiyeti on Hasta Kayıt Page
    And Write a valid T.C. Kimlik No on Hasta Kayıt Page
    Then If Id is valid then İşlem Başarılı   should be seen on popoup on Hasta Kayıt Page
      | Mobile Phone |
      | 01234567891  |
      | 45678912123  |
      | 60835323842  |
      | 33241633218  |
      | 7724         |


  Scenario:TC0080 Patient resgitration should be done with valid patient data
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

