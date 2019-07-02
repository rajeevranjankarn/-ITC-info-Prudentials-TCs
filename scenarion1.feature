Feature: Verify that all important information is present.

  Scenario: Important information is present
    Given Logins
    When Enter valid username and password
    Then Home get display
    Then logout
