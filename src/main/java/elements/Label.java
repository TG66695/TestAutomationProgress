package elements;

import elements.base.BaseField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.WebDriverUtil;

import java.util.ArrayList;
import java.util.List;

public class Label extends BaseField {
    public Label(By locator) {
        super(locator);
    }

}
