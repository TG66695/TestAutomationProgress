@testSuite
@CartValidation

Feature: Cart validation

  Description: Validation of item added into cart

  @Test
  Scenario: One item addition into cart validation
    Given user opens webpage
    When user logged into system as standard_user with password secret_sauce
    Then user clicks "Add to cart" button for first product
    And user saves title for first product
    Then 1 product added to the cart
    Then user clicks on cart button
    And user is in the cart
    Then user validates added item first in the list description
    And user clears controlTitle

  @Test
  Scenario: Few items addition into cart validation
    Given user opens webpage
    When user logged into system as standard_user with password secret_sauce
    Then user clicks "Add to cart" button for first product
    And user saves title for first product
    Then user clicks "Add to cart" button for third product
    And user saves title for third product
    Then user clicks "Add to cart" button for fourth product
    And user saves title for fourth product
    Then 3 product added to the cart
    Then user clicks on cart button
    And user is in the cart
    Then user validates added item first in the list description
    Then user validates added item second in the list description
    Then user validates added item third in the list description
    And user clears controlTitle
