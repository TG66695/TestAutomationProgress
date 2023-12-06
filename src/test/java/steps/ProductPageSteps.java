package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ProductsPage;

public class ProductPageSteps {
    @When("user clicks \"Add to cart\" button for {} product")
    public void userClicksAddButton(Integer num) {
        ProductsPage.clickAddToCartButton(num);
    }

    @Then("product is added to the cart")
    public void productIsInTheCart() {
        int badgeValue = ProductsPage.cartBadge.getIntValue();
        Assert.assertEquals("Card badge doesn't have expected value",1  , badgeValue);
    }

    @And("Remove button appears")
    public void removeButtonAppears() {
        Assert.assertTrue("Remove button is not displayed",ProductsPage.removeBtn.isDisplayed());
    }

}
