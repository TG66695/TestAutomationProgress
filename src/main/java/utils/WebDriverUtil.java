package utils;

import constants.GlobalParams;
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
    public static void closeDriverSessionIfExists(String scope){
        if(drivers.get() !=null){
            closeDriverSession();
        }
    }

}
