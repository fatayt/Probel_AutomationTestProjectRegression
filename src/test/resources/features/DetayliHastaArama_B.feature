Feature: jsjs
  Scenario: TC0000000001
    When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
    And Select Proximity from Yakınlığı drop down menu on Hasta Kayıt Page
    Then Kart Sahibi box should be active on Hasta Kayıt Page when If something except Kendisi is selected
