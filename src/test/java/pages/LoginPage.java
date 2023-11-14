package pages;

import constants.PropertyConfigs;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;


public class LoginPage {
    @FindBy(id = "user-name")
    public static WebElement usernameField;

    @FindBy(id = "password")
    public static WebElement passwordField;

    @FindBy(id = "login-button")
    public static WebElement loginBtn;

    @FindBy(id = "login_credentials")
    public static WebElement userCredentials;

    @FindBy(xpath = "//div[@class = 'login_password']")
    public static WebElement userPass;


    public static void login(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }
    public static void clickLoginBtn(){
        loginBtn.click();
    }
}
