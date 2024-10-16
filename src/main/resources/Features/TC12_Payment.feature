@RegressionTest
Feature: Test Successful Payment

  Scenario: User Choose Item and Checkout with successful Payment
    Given User Navigates to HomePage
    Then  User Clicks on My Account Icon
    And   User Click on Login
    And   User Enter Email and Password "qq@qq.q" "qqqq"
    And   User Clicks on HomePage
    And   User Add Product to Shipping List
    And   User Navigates to checkout page
    And   User Enters Valid Credentials in Billing Details "eee" , "eee" , "eee","eee","<Egypt>","<Aswan>"
    And   User Confirm Delivery Details
    And   User Select Delivery Method
    And   User Select Payment Method
    And   User Confirm Order Details
    Then  Order Confirmation message appear



