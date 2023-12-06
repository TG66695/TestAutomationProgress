package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static utils.WebDriverUtil.getDriver;

public class Hook {
    @Before

    public static void driverSetup() {
        getDriver();
    }

    @After
    public void driverTearDown(){
        getDriver().quit();
        }
    }
