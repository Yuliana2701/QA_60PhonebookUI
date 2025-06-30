package com.ait.qa60.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        click(By.cssSelector("a[href='/login']"));
        type(By.id("Email"), email);
        type(By.name("Password"), password);
        click(By.xpath("//input[@value='Log in']"));
    }

    public boolean isLoggedIn() {
        return isElementPresent(By.xpath("//a[text()='Log out']"));
    }
}

