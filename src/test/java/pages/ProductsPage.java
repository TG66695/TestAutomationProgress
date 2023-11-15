package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }
    public boolean logoIsDisplayed(){
        return driver.findElement(By.xpath("//div[@class = 'app_logo']")).isDisplayed();
    }
    public void clickAddToCartButton(){
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

}
