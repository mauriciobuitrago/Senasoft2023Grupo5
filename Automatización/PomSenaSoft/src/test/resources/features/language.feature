Feature: Change language
  I as user, I need to change the language from spanish to Deutsch

  Scenario: Succesful language change
    Given that the user in on the page
    When he clicks on the language icon
    And clicks on Deutsch
    Then He shoud see the page in Deutsch