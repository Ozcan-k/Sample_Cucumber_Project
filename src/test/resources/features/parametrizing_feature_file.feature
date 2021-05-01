@regression
Feature: User should find related product on google search
  Background: going to the google home page
    Given  user is on the google page

    Scenario: TC_01_iphone search
      When user search for "iphone"
      Then  verify the result has "iphone"

      Scenario: TC_02_apple search
        When user search for "apple"
        Then verify the result has "apple"

  Scenario: TC_03_apple search
    When user search for "flower"
    Then verify the result has "flower"

  Scenario: TC_02_apple search
    When user search for "orange"
    Then verify the result has "orange"