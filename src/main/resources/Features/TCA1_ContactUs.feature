@RegressionTest
Feature: Test Contact Us Page

  Scenario: Verify user can access Contact Us page and Complete his information
    Given User Navigates to HomePage
    When  User Click on Telephone Icon
    Then  You must be in Contact Us page
    When  User fill the required information "hhhh" , "h@h.c" , "Why does everything good have a short lifespan?"
    And   Click on submit button
    Then  The enquiry must be successfully sent to the store owner