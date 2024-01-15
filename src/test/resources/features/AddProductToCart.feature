@testSuite
@AddToCart

Feature: Add product into cart

  Description: User adds product to cart

  @Test
  Scenario: User adds product to cart
    Given user opens webpage
    When user logged into system as standard_user with password secret_sauce
    Then user clicks "Add to cart" button for third product
    Then 1 product added to the cart
    And 1 Remove button appears


  @Test
  Scenario: User adds two products into cart
    Given user opens webpage
    When user logged into system as standard_user with password secret_sauce
    Then user clicks "Add to cart" button for third product
    Then user clicks "Add to cart" button for first product
    Then 2 product added to the cart
    And 2 Remove button appears