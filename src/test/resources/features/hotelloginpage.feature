@regression
Feature: user enter valid data
  Scenario: user enter valid data in login page
    Given user is on the login page
    And enter valid username
    And enter valid password
    Then click login button