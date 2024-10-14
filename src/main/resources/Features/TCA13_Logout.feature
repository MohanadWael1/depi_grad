
Feature: Test Logout

  Scenario: User Login the Logout
    Given   User Navigates to HomePage
    When    User Clicks on My Account Icon
    And     User Click on Login
    And     User Enter Email and Password "h@h.c" "hhhh"
    And     User Clicks on My Account Icon
    And     User Clicks on Logout
    Then    Account Logout Page Apeears