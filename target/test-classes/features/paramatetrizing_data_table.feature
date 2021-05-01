@dt
Feature: user should add data
  Scenario Outline: data tables1
   Given user is on the editor page
    And user click on the new button
    And search for the firstname "<firstname>"
    And search for the  lastname "<lastname>"
    And search for the  position "<position>"
    And search for the  office "<office>"
    And search for the  extension "<extension>"
    And search for the  startdata "<startdate>"
    And search for the salary "<salary>"
    And user click on the create button
    And user search for the firstname "<firstname>"
    Then verify the name fields contains firstname "<firstname>"

    Examples: This is used to pass the test data

    |firstname|lastname|position|office|extension|startdate|salary|
    |hakan    |can     |SDET    |newyork|123     |2021-01-20|120000|
    |cemil    |koc     |teacher |turkey |234     |2020-03-04|50000 |
    |cemile   |ipek    |tester  |canada |345     |2020-06-07|700000|
    |tom      |brous   |teacher |canada |456     |2019-02-03|700000|


