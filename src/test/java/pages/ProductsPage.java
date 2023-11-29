package pages;

import elements.Button;
import elements.Form;
import elements.Label;
import org.openqa.selenium.By;

public class ProductsPage {
    public static final Button firstItemAddToCartBtn = new Button(By.xpath("//div[@class = 'inventory_item'][3]//button"));
    public static final Form productsList = new Form(By.xpath("//div[@class = 'inventory_list']"));
    public static final Button cartBtn = new Button(By.xpath("//a[@class = 'shopping_cart_link']"));
    public static final Label cartBadge = new Label(By.xpath("//span[@class = 'shopping_cart_badge']"));
    public static final Button removeBtn = new Button(By.xpath("//button[contains(text(), 'Remove')]"));
    public static final Label firstProductTitle = new Label(By.xpath("//div[@class ='inventory_item'][1]"));


    public static void getFirstProductTitle(){

    }
}
