Feature: Currency exchange
  I as user, I need to change from COP to USD

  Scenario:  Successful currency exchange
    Given the user is on the web page
    When the user clicks on the currency icon to change it
    Then the user should see the succesful currency exchange