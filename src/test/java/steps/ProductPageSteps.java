package steps;

import converter.StringToIntConverter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ProductsPage;

import java.util.ArrayList;
import java.util.List;

public class ProductPageSteps {
    public static List<String> controlTitle = new ArrayList<>();

    @When("user clicks \"Add to cart\" button for {} product")
    public void userClicksAddButton(String number) {
        int line = StringToIntConverter.getIntFromString(number);
        ProductsPage.clickAddToCartButton(line);
    }

    @And("user saves title for {} product")
    public void userSavesTheTitle(String number) {
        int line = StringToIntConverter.getIntFromString(number);
        controlTitle.add(ProductsPage.getItemTitleOnProductPage(line));
    }

    @Then("{} product added to the cart")
    public void productIsInTheCart(int amount) {
        int badgeValue = ProductsPage.cartBadge.getIntValue();
        Assert.assertEquals("Card badge doesn't have expected value", amount, badgeValue);
    }

    @And("{} Remove button appears")
    public void removeButtonAppears(int amount) {
        Assert.assertTrue("Remove button is not displayed", ProductsPage.removeBtn.isDisplayed());
        int amountOfRemoveButtons = ProductsPage.findAmountOfRemoveButtons();
        Assert.assertEquals("Amount is different", amount, amountOfRemoveButtons);
    }

    @And("user clears controlTitle")
    public void userClearsControlTitle() {
        controlTitle.clear();
    }
}
