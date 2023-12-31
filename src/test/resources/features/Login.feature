@testSuite
@login

Feature: Login

  Description: Login into system

  @Test
    Scenario: Login into application
      When user is on login page
      Then user puts username 1 into username field
      Then user puts password secret_sauce into password field
      Then user clicks login button
      Then user successfully logged in

  @Test
    Scenario: Try login into application as locked user
      When user is on login page
      Then user puts username 2 into username field
      Then user puts password secret_sauce into password field
      Then user clicks login button
      Then user get the message about locked user