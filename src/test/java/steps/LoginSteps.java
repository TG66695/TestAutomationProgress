package steps;

import constants.PropertyConfigs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.ProductsPage;
import utils.WebDriverSetup;
import utils.WebDriverUtil;

import java.time.Duration;


public class LoginSteps {
//    public WebDriver driver;
    private LoginPage loginPage;

//    @Before
//    public void setUp() {
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to(PropertyConfigs.APP_URL);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PropertyConfigs.SELENIUM_IMPLICIT_WAIT));
//        driver.manage().window().maximize();
//    }
    @When("user logs in as {} with password {}")
    public void userLogin(String user, String password) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(PropertyConfigs.APP_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PropertyConfigs.SELENIUM_IMPLICIT_WAIT));
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername(user);
        loginPage.setPassword(password);
        loginPage.clickLoginBtn();
        ProductsPage products = new ProductsPage(driver);
        Assert.assertTrue(products.logoIsDisplayed());

    }

    @Then("user successfully logged in")
    public void userSuccessfullyLoggedIn() {


    }
    @After
    public void tearDown() {
        WebDriverUtil.closeDriverSessionIfExists();
    }
}
