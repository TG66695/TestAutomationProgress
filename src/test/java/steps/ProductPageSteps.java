package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ProductsPage;
import utils.AwaitUtils;

public class ProductPageSteps {
    @When("user clicks \"Add to cart\" button")
    public void userClicksAddButton() {
        Assert.assertTrue(ProductsPage.addToCartBtn.isDisplayed());
        ProductsPage.addToCartBtn.click();

    }

    @Then("product is added to the cart")
    public void productIsInTheCart() {
        int badgeValue = ProductsPage.cartBadge.getIntValue();
        Assert.assertEquals(1, badgeValue);
        AwaitUtils.waitForSeconds(1);
    }

    @And("Remove button appears")
    public void removeButtonAppears() {
        Assert.assertTrue(ProductsPage.removeBtn.isDisplayed());
    }
}
