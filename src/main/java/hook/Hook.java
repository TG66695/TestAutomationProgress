package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.WebDriverUtil;

public class Hook {
    @Before

    public static void driverSetup() {
        WebDriverUtil.getDriver();
    }

    @After
    public void driverTearDown(){
        WebDriverUtil.closeDriverSession();
//        if(WebDriverUtil.getDriver()!= null){
//            WebDriverUtil.closeDriverSession();
        }
    }
