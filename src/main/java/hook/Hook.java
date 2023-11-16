package hook;

import io.cucumber.java.Before;
import utils.WebDriverUtil;

public class Hook {
    @Before

    public static void driverSetup() {
        WebDriverUtil.getDriver();
    }


}
