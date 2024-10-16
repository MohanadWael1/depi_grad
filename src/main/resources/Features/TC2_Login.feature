Feature: Test Login Feature

  Scenario: Validate Login Positive Scenario
    Given User Navigates to HomePage
    When  User Clicks on My Account Icon
    And   User Click on Login
    And   User Enter Email and Password "qq@qq.q" "qqqq"
    Then  Account Page appears

  Scenario Outline: Invalidate Login Negative Scenario
    Given User Navigates to HomePage
    When  User Clicks on My Account Icon
    And   User Click on Login
    And   User Enter Email and Password "<email>" "<password>"
    Then  Error message Should be displayed

    Examples:
      | email    | password |
      | qq@qq.q  | 051      |
      | inv@a.a  | qqqq     |
      | inv@a.a  | inv      |
      |          |          |
      | A        | A        |
      | @$#      | @$#      |

