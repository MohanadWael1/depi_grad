Feature: Test Home Page Slider


  Scenario: User Press Slider Arrow and change Items
    Given User Navigates to HomePage
    And User Hover to slider arrow and Click on It
    Then Slider Item is Changed
