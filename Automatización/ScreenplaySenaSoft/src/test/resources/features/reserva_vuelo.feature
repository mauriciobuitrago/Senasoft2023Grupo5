Feature: Flight reservation
  I as user, I need to book a flight

  Scenario: Succesful flight reservation
    Given the user enter to the web page
    When he goes to the flight section
    And search for a flight
    And the user enter his data for the flight
    Then he should see the payment gateway
