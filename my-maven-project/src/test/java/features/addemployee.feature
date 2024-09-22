Feature: OrangeHRM Application Test

  Background:
    Given User navigate to the orangehrm application

  Scenario Outline: Adding Employee
    And user login to the application with "<username>" and "<password>"
    And User navigate to the PIM and Add Employee page
    And User enter employee details with "<firstname>" and "<lastname>"
    When User clicks on save button
    Then User should be added successfully

    Examples:
      | username | password | firstname | lastname |
      | Admin    | admin123 | sushmitha | thoutam  |
