@regression @login
Feature: Clicking today's date
  Background:
    Given I am on home page of Hotels

    @hotels-login
    Scenario: Selecting today's date
      When I click Check in box
      Then I see today's date picked
