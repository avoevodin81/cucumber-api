Feature: As a user I want to get ability to create new user

  Scenario: User can be created with valid credentials
    Given the user doesn't have an account
    When the user provides name, email, password
    Then the user receives 200 status code
    And the user receives id