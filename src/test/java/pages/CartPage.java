package pages;

import elements.Button;
import elements.Label;
import elements.TextBox;
import org.openqa.selenium.By;

public class CartPage {

    public static final Label yourCartLabel = new Label(By.xpath("//span[text() = 'Your Cart']"));
    public static final Label cartItem = new Label(By.xpath("//div[@class ='cart_item']"));
    public static String cartItemTitle = "//div[@class ='cart_item'][%s]//div[@class = 'inventory_item_name']";
    public static Button checkoutBtn = new Button(By.id("checkout"));
    public static Button continueShoppingBtn = new Button(By.id("continue-shopping"));

    public static String getCartItemTitle(Integer number) {
        TextBox cartTitle = new TextBox(By.xpath(String.format(cartItemTitle, number)));
        return cartTitle.getValue();
    }
}
