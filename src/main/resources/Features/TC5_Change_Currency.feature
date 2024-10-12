@RegressionTest

Feature: Change Currency

    Scenario Outline: User Switch Currencies
      Given User Navigates to HomePage
      When   User Change Currency "<currency>"
      Then  User Can Change Currencies from $ US Dollar To € Euro

      Examples:
      |currency |
      |Euro     |
      |Dollar   |
      |Pound    |
