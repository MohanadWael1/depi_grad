Feature: Test Register Feature
  Scenario:Validate Registry Positive Scenario
    Given User Navigates to HomePage
    When User Clicks on My Account Icon
    And User Click on Register
    And User Enters Credentials "h" , "h" ,"h@h.c" , "1234" ,"hhhh"
    And User Click Continue
    Then Successfully Creation should be displayed

  @RegressionTest
  Scenario Outline: Invalidate Registry Negative Scenario
    Given User Navigates to HomePage
    When User Clicks on My Account Icon
    And User Click on Register
    And User Enters Credentials "<Fname>" , "<Lname>" ,"<mail>" , "<phone>" ,"<password>"
    And User Click Continue
    Then Unsuccessfull Registry Message appears

    Examples:
      | Fname | Lname | mail | phone | password |
      |       |       |      |       |          |
      | a     | a     | a@a.a| 1     | 1111     |
      | b     | b     | b@b.b| 123   | 2        |








