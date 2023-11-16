package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.ProductsPage;
import utils.AwaitUtils;


public class LoginSteps {
    @When("user is on login page")
    public void userIsOnLoginPage() {
    }

    @When("user puts username {} into username field")
    public void userPutsLogin(String user) {
        Assert.assertTrue(LoginPage.userField.isDisplayed());
        LoginPage.userField.setValue(user);
//        String loginFromList = LoginPage.detectLogin(row);
//        LoginPage.userField.setValue(loginFromList);
    }

    @Then("user puts password {} into password field")
    public void userPutsPassword(String password) {
        Assert.assertTrue(LoginPage.passwordField.isDisplayed());
        LoginPage.passwordField.setValue(password);
        AwaitUtils.waitForSeconds(2);
    }

    @Then("user clicks login button")
    public void userClicksLoginButton() {
        Assert.assertTrue(LoginPage.loginBtn.isDisplayed());
        LoginPage.loginBtn.click();
    }

    @Then("user successfully logged in")
    public void userSuccessfullyLoggedIn() {
        Assert.assertTrue(ProductsPage.productsList.isDisplayed());
    }

    @Given("user logged into system as {} with password {}")
    public void userLoggedIntoSystem(String username, String password) {
        LoginPage.userLogin(username, password);
    }
}
