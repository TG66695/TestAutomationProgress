@testSuite
@CartValidation

Feature: Cart validation

  Description: Validation of item added into cart

  @Test
  Scenario: item validation
    Given user opens webpage
    When user logged into system as standard_user with password secret_sauce
    Then user clicks "Add to cart" button for second product
    And user saves title for second product
    Then One product is added to the cart
    Then user clicks on cart button
    And user is in the cart
    Then user validates added item first in the list description