Feature: Test Search Feature

  Scenario: User Search For Any Product
    Given User Navigates to HomePage
    When  User Clicks on My Account Icon
    And   User Click on Login
    And   User Enter Email and Password "h@h.c" "hhhh"
    And   User Enter Product in search "Iphone"
    Then  Assert Search Page Appearance