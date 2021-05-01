@dbread
Feature: Read Data
  Scenario: Reding Hotel Reservations
    Given user connect to the database
    Then user gets "Price" from  "tHOTELROOM" table
    And user reads all rows in the "Price" column
    And user gets the value in row 2 in "Price" column and verifies the value is"4000.0000"

