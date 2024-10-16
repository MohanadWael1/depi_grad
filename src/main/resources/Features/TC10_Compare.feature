@RegressionTest
Feature: Test Compare List

   Scenario: User add Item to CompareList
     Given User Navigates to HomePage
     And   User Add Product to Compare List
     Then  Confirmation Message Appears
