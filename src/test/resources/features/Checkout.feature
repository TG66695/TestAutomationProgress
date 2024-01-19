@testSuite
@Checkout

Feature: Checkout process

  Description: Validation of checkout process

  @Test
  Scenario: Add product to the cart and proceed with checkout process
    Given user opens webpage
    When user logged into system as standard_user with password secret_sauce
    Then user clicks "Add to cart" button for second product
    And user saves title for second product
    Then 1 product added to the cart
    Then user clicks on cart button
    And user is in the cart
    Then user validates added item first in the list description
    And user clears controlTitle
    When user click on checkout button
    Then user is on checkout page
    And user puts first name John into first name field
    And user puts last name Smith into last name field
    And user puts postal code 888 into postal code field
    When user clicks continue button
    Then user is in checkout overview page
    And user verifies payment information
    And user verifies shipping information
    And user verifies price information
    When user clicks on finish button
    Then user is on complete page