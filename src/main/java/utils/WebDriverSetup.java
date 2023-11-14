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


}
