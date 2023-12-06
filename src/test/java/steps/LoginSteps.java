package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.ProductsPage;


public class LoginSteps {
    @When("user is on login page")
    public void userIsOnLoginPage() {
    }

    @When("user puts username {} into username field")
    public void userPutsLogin(Integer row) {
        Assert.assertTrue("User field is not displayed", LoginPage.userField.isDisplayed());
        LoginPage.userField.setValue(LoginPage.detectLogin(row));
    }

    @Then("user puts password {} into password field")
    public void userPutsPassword(String password) {
        Assert.assertTrue("Password field is not displayed", LoginPage.passwordField.isDisplayed());
        LoginPage.passwordField.setValue(password);
//        AwaitUtils.waitForSeconds(2);
    }

    @Then("user clicks login button")
    public void userClicksLoginButton() {
        Assert.assertTrue("Login button is not displayed",LoginPage.loginBtn.isDisplayed());
        LoginPage.loginBtn.click();
    }

    @Then("user successfully logged in")
    public void userSuccessfullyLoggedIn() {
        Assert.assertTrue("List of products is not displayed", ProductsPage.productsList.isDisplayed());
    }

    @Given("user logged into system as {} with password {}")
    public void userLoggedIntoSystem(String username, String password) {
        LoginPage.userLogin(username, password);
    }
}
