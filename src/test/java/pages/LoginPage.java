package pages;

import constants.PropertyConfigs;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(By.id("user-name")).sendKeys(username);
    }
    public void setPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }
    public void clickLoginBtn() {
        driver.findElement(By.id("login-button")).click();
    }
}