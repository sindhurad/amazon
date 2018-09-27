Feature: appointment booking
  This feature deals with booking an appointment for visa

  Scenario: Sign in with correct password
    Given I navigate to sign in page
    And I enter the password as "Sucess@14"
    And I click on sign in button
    Then I should see the choose an appointment page

