Feature: Login
  I as user, I need to login

  Background:
    Given the user enter to the web page

  Scenario Outline: Successful login
    And the user clicks on the 'iniciar sesion' button
    When the user enter his login data
      | email2   | password2   |
      | <email2> | <password2> |
    Then the user should see the successful login

    Examples:
      | email2                 | password2      |
      | Josefergo89@gmail.com | Joselito262005  |