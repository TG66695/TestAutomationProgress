package pages;

import constants.PropertyConfigs;
import elements.Button;
import elements.TextBox;
import org.openqa.selenium.*;
import elements.Label;
import org.jsoup.Jsoup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class LoginPage {
    public static final TextBox userField = new TextBox(By.id("user-name"));
    public static final TextBox passwordField = new TextBox(By.id("password"));
    public static final Button loginBtn = new Button(By.id("login-button"));
    //    public static final Label userLogsList = new Label(By.id("login_credentials"));
    public static String userLoginsList = "//div[@class = 'login_credentials']";

//    public static String parseLogin(Integer row){
//        try{
//            var doc = Jsoup.connect(PropertyConfigs.APP_URL).get();
//            var loginElem = doc.selectXpath(String.valueOf(userLogsList));
//            if(!loginElem.isEmpty() && row>0 && row<=loginElem.size()){
//                return loginElem.get(row-1).text();
//            }else{
//                return "Element not found";
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//            return null;
//        }
//    }

    public static String detectLogin(int row) {
        Label log = new Label(By.xpath(userLoginsList));
        String valToSplit = "_user";
        String valToSplit2 = "Accepted usernames are:";
        List<String> logsList = new ArrayList<>(List.of(log.getValue().split(valToSplit)));
        List<String> result = new ArrayList<>();
        for (int i = 0; i < logsList.size(); i++) {
            if (row < logsList.size() && row > 0) {
                result.add(logsList.get(i) + "_user");
            } else {
                throw new IllegalArgumentException("Invalid row value " + row);
            }
        }
        return result.get(row - 1);
    }

    public static void userLogin(String username, String password) {
        userField.setValue(username);
        passwordField.setValue(password);
        loginBtn.click();
    }
}