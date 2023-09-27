Feature: Register
  I as user, I need to register me

  Background:
    Given the user enter to the web page

  Scenario Outline: Succesful register
    And the user clicks on the 'hazte una cuenta' button
    When the user enter his data
      | email   | password   |
      | <email> | <password> |
    Then the user should see the succesful register

    Examples:
      | email                  | password      |
      | Josefergo8999@gmail.com | Joselito23-2  |
