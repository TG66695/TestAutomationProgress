package hook;

import constants.PropertyConfigs;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.WebDriverSetup;
import utils.WebDriverUtil;

import java.time.Duration;

public class Hook {
    @Before
    public void driverSetup () {
//        WebDriverUtil.setDriver(WebDriverSetup.setupWebDriver());
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(PropertyConfigs.APP_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PropertyConfigs.SELENIUM_IMPLICIT_WAIT));
        }

        @After
        public void closeDriver () {
//            driver.quit();
        }

    }
