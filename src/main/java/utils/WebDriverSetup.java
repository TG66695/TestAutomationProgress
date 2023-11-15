package utils;
import constants.PropertyConfigs;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class WebDriverSetup {

    public static WebDriver setupWebDriver(){
        WebDriver driver;
        driver = WebDriverManager
                .chromedriver()
                .create();
        return driver;
    }

    public void setImplicitWait(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PropertyConfigs.SELENIUM_IMPLICIT_WAIT));
    }


}
