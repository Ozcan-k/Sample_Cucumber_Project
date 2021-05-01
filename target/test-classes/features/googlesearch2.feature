@smoke
Feature: search for multiple data
  Background:

  Scenario Outline: searching the worlds capitals
    Given user is on the google page
    And user search for "<world capitals>"
    Then verify the result has "<world capitals>"

    Examples: capitals
    |world capitals|
    |London       |
    |paris         |
    |Madrid        |
    |Vienna        |


