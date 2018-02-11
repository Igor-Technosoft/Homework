@regression @login
Feature: Hover over and login

Background:
Given I am on home page of Amazon

@amazon-login
Scenario: Verify user should not be able to login using invalid credentials
  When I Hover over to Accounts & List
  And I enter invalid email address
  And I enter invalid password
  And I click on Sign in button
  Then I verify invalid error message
