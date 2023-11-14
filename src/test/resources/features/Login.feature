@testSuite
@login

Feature: Login

  Description: Login into system

  @Test
    Scenario: Login into application
      When user logs in as standard_user with password secret_sauce
      Then user successfully logged in