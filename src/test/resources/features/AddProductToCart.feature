@testSuite
@AddToCart

Feature: Add product into cart

  Description: User adds product to cart

  @Test
  Scenario: User adds product to cart
    Given user opens webpage
    When user logged into system as standard_user with password secret_sauce
    Then user clicks "Add to cart" button for third product
    And user saves title for third product
    Then One product is added to the cart
    And Remove button appears
