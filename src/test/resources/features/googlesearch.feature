@smoke
Feature: user should find the related products on google search
 Background:going to the google home page
   Given user is on the google page

  @iphone
  Scenario: TC_01_iphone search
    When user search for ipone
    Then verify the result has iphone

    Scenario: TC_02_tea pot search
      When user search for tea pot
      Then verify the result has tea pot

      @flower
      Scenario:TC_03_flower search
        When user search for flower
        Then verify the result has flower

      Scenario:TC_03_bmw search
        When user search for bmw
        Then verify the result has bmw

