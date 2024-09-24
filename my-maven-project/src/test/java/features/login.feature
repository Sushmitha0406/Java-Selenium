@E2E
Feature: OrangeHRM Application Test

  Background:
    Given User navigate to the orangehrm application login

  # @smoke @reg
  Scenario: Login should be success
    Given User enter the username as Admin
    Given User enter the password as "admin123"
    When User clicks on Login button
    Then Login should be success

  # @reg @prod
  Scenario: Login should be not be success
    Given User enter the username as Admin
    Given User enter the password as "admin"
    When User clicks on Login button
    But Login should not be success
