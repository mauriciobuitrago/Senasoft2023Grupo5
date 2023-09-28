Feature: Hotel reservation

 Scenario: hotel reservation succesful
   Given the user enter to the web page
   When the user applies the search filters
   And the user clicks the search button
   And the user apply more specific filters in search results
   And the user selects a hotel
   And the user makes the reservation
   Then the user should see a confirmation message