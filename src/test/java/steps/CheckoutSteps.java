package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CartPage;
import pages.CheckoutPage;

public class CheckoutSteps {

    @When("^user click on checkout button$")
    public void userClicksOnCheckoutBtn() {
        Assert.assertTrue("Button is not exists", CartPage.checkoutBtn.isDisplayed());
        CartPage.checkoutBtn.click();
    }

    @Then("user is on checkout page")
    public void userIsOnCheckoutPage() {
        Assert.assertTrue("Page title is not displayed", CheckoutPage.pageTitle.isDisplayed());
        Assert.assertTrue("First name field is not displayed", CheckoutPage.firstName.isDisplayed());
        Assert.assertTrue("Last name field is not displayed", CheckoutPage.lastName.isDisplayed());
        Assert.assertTrue("Zip/Postal field is not displayed", CheckoutPage.zipPostal.isDisplayed());
        Assert.assertTrue("Continue button is not displayed", CheckoutPage.continueBtn.isDisplayed());
        Assert.assertTrue("Cancel button is not displayed", CheckoutPage.cancelBtn.isDisplayed());
        String title = CheckoutPage.pageTitle.getValue();
        Assert.assertEquals("Values are not equal", "Checkout: Your Information", title);

    }

    @And("user puts first name {} into first name field")
    public void userPutsFirstNameJohnIntoFirstNameField(String fName) {
        CheckoutPage.firstName.setValue(fName);
    }

    @And("user puts last name {} into last name field")
    public void userPutsLastNameSmithIntoLastNameField(String lName) {
        CheckoutPage.lastName.setValue(lName);
    }

    @And("user puts postal code {} into postal code field")
    public void userPutsPostalCodeIntoPostalCodeField(int number) {
        CheckoutPage.zipPostal.setValue(String.valueOf(number));
    }

    @When("user clicks continue button")
    public void userClicksContinueButton() {
        CheckoutPage.continueBtn.click();
    }

    @Then("user is in checkout overview page")
    public void userIsInCheckoutOverviewPage() {
        Assert.assertTrue("No item in the cart", CartPage.cartItem.isDisplayed());
        Assert.assertTrue("Payment info label is not displayed", CheckoutPage.paymentInfoTxt.isDisplayed());
        Assert.assertTrue("Payment info value is not displayed", CheckoutPage.paymentInfoValue.isDisplayed());
        Assert.assertTrue("Shipping info label is not displayed", CheckoutPage.shippingInfoTxt.isDisplayed());
        Assert.assertTrue("Shipping info value is not displayed", CheckoutPage.shippingInfoValue.isDisplayed());
        Assert.assertTrue("Price label is not displayed", CheckoutPage.priceTotalTxt.isDisplayed());
        Assert.assertTrue("Sub-total info is not displayed", CheckoutPage.subtotalValue.isDisplayed());
        Assert.assertTrue("Tax info is not displayed", CheckoutPage.taxValue.isDisplayed());
        Assert.assertTrue("Cancel button is not displayed", CheckoutPage.cancelBtn.isDisplayed());
        Assert.assertTrue("Finish button is not displayed", CheckoutPage.finishBtn.isDisplayed());
    }

    @And("user verifies payment information")
    public void userVerifiesPaymentInformation() {
        String paymentInfo = CheckoutPage.paymentInfoValue.getValue();
        Assert.assertEquals("Values are not equal", "SauceCard #31337", paymentInfo);
    }

    @And("user verifies shipping information")
    public void userVerifiesShippingInformation() {
        String shipInfo = CheckoutPage.shippingInfoValue.getValue();
        Assert.assertEquals("Values are not equal", "Free Pony Express Delivery!", shipInfo);
    }

    @And("user verifies price information")
    public void userVerifiesPriceInformation() {
        double totalPriceOfItems = CheckoutPage.calculatePricePlusTax();
        double totalPriceOnThePage = CheckoutPage.cutTheTotalPrice();
        double delta = 0.001;
        Assert.assertEquals("Values are not equal", totalPriceOfItems, totalPriceOnThePage, delta);
    }

    @When("user clicks on finish button")
    public void userClicksOnFinishButton() {
        CheckoutPage.finishBtn.click();
    }

    @Then("user is on complete page")
    public void userIsOnCompletePage() {
        Assert.assertTrue("Completion container is not exists", CheckoutPage.checkoutCompleteContainer.isDisplayed());
        Assert.assertTrue("Button is not displayed", CheckoutPage.backHomeBtn.isDisplayed());
    }
}
