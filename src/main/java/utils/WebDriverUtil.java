package utils;

import constants.PropertyConfigs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverUtil {
    public static final ThreadLocal<WebDriver> drivers = ThreadLocal.withInitial(() -> null);

    public static WebDriver getDriver(){
        return drivers.get();
    }
    public static void setDriver(WebDriver driver){
        drivers.set(driver);
    }
    public static void closeDriverSession(){
        drivers.get().quit();
        drivers.set(null);
    }
    public static void closeDriverSessionIfExists() {
        if (drivers.get() != null) {
            closeDriverSession();
        }
    }
    public static WebElement getElement(By locator) {
        AwaitUtils.waitUntil(() -> getDriver().findElements(locator).size() > 0, PropertyConfigs.SELENIUM_IMPLICIT_WAIT);
        return getDriver().findElement(locator);
    }


}
