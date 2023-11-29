package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ProductsPage;

public class ProductPageSteps {
    @When("user clicks \"Add to cart\" button")
    public void userClicksAddButton() {
        Assert.assertTrue("Add to cart button is not displayed", ProductsPage.firstItemAddToCartBtn.isDisplayed());
        ProductsPage.firstItemAddToCartBtn.click();

    }

    @Then("product is added to the cart")
    public void productIsInTheCart() {
        int badgeValue = ProductsPage.cartBadge.getIntValue();
        Assert.assertEquals("Card badge doesn't have expected value",1  , badgeValue);
//        AwaitUtils.waitForSeconds(1);
    }

    @And("Remove button appears")
    public void removeButtonAppears() {
        Assert.assertTrue("Remove button is not displayed",ProductsPage.removeBtn.isDisplayed());
    }
}
