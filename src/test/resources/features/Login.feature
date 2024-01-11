@testSuite
@login

Feature: Login

  Description: Login into system

  @Test
  Scenario: Login into application
    Given user opens webpage
    When user is on login page
    Then user puts first username from usernames list into username field
    Then user puts password secret_sauce into password field
    Then user clicks login button
    Then user successfully logged in

  @Test
  Scenario: Try login into application as locked user
    Given user opens webpage
    When user is on login page
    Then user puts second username from usernames list into username field
    Then user puts password secret_sauce into password field
    Then user clicks login button
    Then user get the message about locked user