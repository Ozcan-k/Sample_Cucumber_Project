@capitals
Feature: user enter data on login page


  Scenario Outline:user enter invalid data login page
    When user is on the login page
    And user enter invalid username "<username>"
    And user enter invalid password "<password>"
    And  click the login button
    Then verify error message

    Examples: pass the data
    |username|password|
    |Manager |Manager2!|
    |ManaGer |manager1!|


