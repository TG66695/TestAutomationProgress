package elements.base;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import utils.WebDriverUtil;

abstract public class BaseField {
    public final By locator;

    public BaseField(By locator) {
        this.locator = locator;
    }

    public WebElement getWebElement() {
        return WebDriverUtil.getElement(locator);
    }

    public void setValue(String value) {
        WebElement element = getWebElement();
        element.sendKeys(value);
    }

    public void click() {
        WebDriverUtil.click(getWebElement());
    }

    public String getValue() {
        return WebDriverUtil.getValue(getWebElement());
    }

    public Integer getIntValue() {
        return WebDriverUtil.getIntValue(getWebElement());
    }

    public Boolean isDisplayed() {
        try {
            WebElement element = getWebElement();
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

}
