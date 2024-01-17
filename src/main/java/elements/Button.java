package elements;

import com.fasterxml.jackson.databind.ser.Serializers;
import elements.base.BaseField;
import org.openqa.selenium.By;

public class Button extends BaseField {
    public Button(BaseField parent, By locator) {
        super(parent, locator);
    }

    public Button(By locator) {
        super(locator);
    }
}
