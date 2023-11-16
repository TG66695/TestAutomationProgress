package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CartPage;
import pages.ProductsPage;
import utils.AwaitUtils;

public class CartSteps {
    @Then("user clicks on cart button")
    public void userClicksOnCartButton() {
        AwaitUtils.waitForConditionWithFluentWait(ProductsPage.cartBtn::isDisplayed, 5);
        ProductsPage.cartBtn.click();
    }

    @And("user is in the cart")
    public void userIsInTheCart() {
        Assert.assertTrue(CartPage.yourCartLabel.isDisplayed());
    }

    @Then("user validates added item description")
    public void userValidatesAddedItemDescription() {
        Assert.assertTrue(CartPage.itemTitle.isDisplayed());
        Assert.assertEquals(ProductsPage.productTitle.getValue(), CartPage.itemTitle.getValue());
    }
}
