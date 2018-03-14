@hotels-regression
Feature: Clicking today's date
  Background:
    Given I am on home page of Hotels


    @hotels-destination
      Scenario: Entering destination
      When I enter Paris in Where To box
      And I click Check in box
      And I click Search button
      Then I see Paris, France selected
      And I'm on Paris, France destination page



