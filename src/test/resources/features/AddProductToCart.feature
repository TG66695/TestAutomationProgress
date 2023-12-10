@testSuite
@AddToCart

Feature: Add product into cart

  Description: User adds product to cart

  @Test
  Scenario: User adds product to cart
    Given user logged into system as standard_user with password secret_sauce
    When user clicks "Add to cart" button for 2 product
    And user saves title for 2 product
    Then product is added to the cart
    And Remove button appears
