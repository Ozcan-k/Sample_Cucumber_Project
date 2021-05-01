@regression
Feature: user should add data
  Scenario: data tables1
    When user is on the editor page
    And user click on the new button
    And search for the first name
    And search for the last name
    And search for the position
    And search for the office
    And search for the extension
    And search for the startdate
    And search for the salary
    And user click on the create button
    And user search for the first name
    Then verify the name fields contains first name


