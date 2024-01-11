package steps;

import constants.PropertyConfigs;
import converter.StringToIntConverter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.ProductsPage;
import utils.AwaitUtils;
import utils.WebDriverUtil;


public class LoginSteps {
    @Given("user opens webpage")
    public void userOpensWebpage() {
        WebDriverUtil.getDriver().navigate().to(PropertyConfigs.APP_URL);
    }
    @When("user is on login page")
    public void userIsOnLoginPage() {
        Assert.assertTrue("User field is not displayed", LoginPage.userField.isDisplayed());
        Assert.assertTrue("Password field is not displayed", LoginPage.passwordField.isDisplayed());
        Assert.assertTrue("Login button is not displayed", LoginPage.loginBtn.isDisplayed());
    }

    @When("user puts {} username from usernames list into username field")
    public void userPutsLogin(String row) {
        Assert.assertTrue("User field is not displayed", LoginPage.userField.isDisplayed());
        int line = StringToIntConverter.getIntFromString(row);
        LoginPage.userField.setValue(LoginPage.detectLogin(line));
    }

    @Then("user puts password {} into password field")
    public void userPutsPassword(String password) {
        Assert.assertTrue("Password field is not displayed", LoginPage.passwordField.isDisplayed());
        LoginPage.passwordField.setValue(password);
    }

    @Then("user clicks login button")
    public void userClicksLoginButton() {
        Assert.assertTrue("Login button is not displayed", LoginPage.loginBtn.isDisplayed());
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

    @Then("user get the message about locked user")
    public void userGetTheMessageAboutLockedUser() {
        String errorMsg = LoginPage.lockedUserMsg.getValue();
        Assert.assertEquals("Messages are not equal", "Epic sadface: Sorry, this user has been locked out.", errorMsg);
    }


}
