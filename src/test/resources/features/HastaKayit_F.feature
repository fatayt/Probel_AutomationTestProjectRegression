Feature: fatih01

  Background:
    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And Click the Hasta button
    And Enter Kurum, Kurum detay

  @Other_Countries
  Scenario: TC0064 - 13_17_99 Person Information data entry by Patient Type and nationality of countries other than Turkey

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

  @Countries_Seysel
  Scenario: TC0064 - D0025 - There is no such country as Seysel


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

  @Countries_Svaziland
  Scenario:TR0064 - D0026 - In September 2018, Svaziland changed its name to Eswatini. Estawani not on the new list

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



  @Countries_Tahsis_Karne_No
  Scenario:TR0064 - D0027 - The Tahsis No ve Karne Seri No required for Syrian refugees, but also for Germany and Argentina

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

  @Meaningless_country_name
  Scenario:TR0064 - D0024 - There is a meaningless country name in the country option under the Uyrugu

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

  @yeni_dogan_checkbox2
  Scenario:TR0065 - data entry according to Patient Type 13_17_99 by clicking yeni dogan checkbox

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

  @single_option
  Scenario: TR0069 - D0028 - There is more than one of the same options in the "Basvuru sekli" drop-down box

    And user click Basvuru sekli
    And user select Basvuru sekli
    And user assert that the options in the list are unique

  @first_phone
  Scenario: TR0073 - when you first click on the phone textbox and then enter the institution information, the process gives a successful message

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