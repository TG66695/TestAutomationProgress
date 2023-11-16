package pages;

import elements.Label;
import org.openqa.selenium.By;

public class CartPage {

    public static final Label yourCartLabel = new Label(By.xpath("//span[text() = 'Your Cart']"));
    public static final Label itemTitle = new Label(By.xpath("//div[@class = 'inventory_item_name']"));


}
