package pages;

import elements.Button;
import elements.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public static final TextBox userField = new TextBox(By.id("user-name"));
    public static final TextBox passwordField = new TextBox(By.id("password"));
    public static final Button loginBtn = new Button(By.id("login-button"));
//    public static String userLoginsList = "//div[@class = 'login_credentials']/text()[%s]";

    /* public static String detectLogin(int row){
         String newXpath = String.format(userLoginsList, row);
         Label logins = new Label(By.xpath(newXpath));
         return logins.getWebElement().getText();
     } */
    public static void userLogin(String username, String password) {
        userField.setValue(username);
        passwordField.setValue(password);
        loginBtn.click();
    }
}