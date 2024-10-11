@RegressionTest
Feature: Test Search and change Currencies  Feature

  Scenario: User Search For Any Product and Change Currencies
    Given User Navigates to HomePage
    When  User Clicks on My Account Icon
    And   User Click on Login
    And   User Enter Email and Password "h@h.c" "hhhh"
    And   User Enter Product in search "Iphone"
    And   Assert Search Page Appearance
    Then  User Can Change Currencies from $ US Dollar To € Euro