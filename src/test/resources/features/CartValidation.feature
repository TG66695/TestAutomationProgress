@testSuite
@CartValidation

Feature: Cart validation

  Description: Validation of item added into cart

  @Test
  Scenario: item validation
    Given user logged into system as standard_user with password secret_sauce
    When user clicks "Add to cart" button for 2 product
    Then product is added to the cart
    Then user clicks on cart button
    And user is in the cart
    Then user validates added item 2 description