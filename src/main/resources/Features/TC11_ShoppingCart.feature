  Feature: Test Shopping Cart

    Scenario: User Adds Item To Shopping Cart
      Given User Navigates to HomePage
      And User Add Product to Shipping List
      Then Confirmation Message Appears
