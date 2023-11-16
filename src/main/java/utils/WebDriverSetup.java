package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class WebDriverSetup {

    public static WebDriver setupWebDriver() {
        return WebDriverManager
                .chromedriver()
                .create();
    }
}
