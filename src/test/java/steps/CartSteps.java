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
        AwaitUtils.waitForConditionWithFluentWait("Cart button is not displayed", ProductsPage.cartBtn::isDisplayed, 2);
        ProductsPage.cartBtn.click();
    }

    @And("user is in the cart")
    public void userIsInTheCart() {
        Assert.assertTrue("Cart label is not displayed", CartPage.yourCartLabel.isDisplayed());
    }

    @Then("user validates added item description")
    public void userValidatesAddedItemDescription() {
        Assert.assertTrue("Cart item is not displayed", CartPage.cartItem.isDisplayed());
//        String productTitle = ProductsPage.firstProductTitle.getValue();
//        String cartItemTitle = CartPage.cartItem.getWebElement().getText();
        Assert.assertEquals(ProductsPage.firstProductTitle.getValue(), CartPage.cartItem.getWebElement().getText());
    }
}
