package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginSteps {

    @When("user logs in as {} with password {}")
        public void userLogin(String user, String password){

        LoginPage.login(user, password);
    }

    @Then("user successfully logged in")
    public void userSuccessfullyLoggedIn() {

    }
}
