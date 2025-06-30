package com.ait.qa60.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    private WebDriver driver;
    private UserHelper user;
    private ProductHelper product;
    private CartHelper cart;

    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com");

        user = new UserHelper(driver);
        product = new ProductHelper(driver);
        cart = new CartHelper(driver);
    }

    public void stop() {
        if (driver != null) {
            driver.quit();
        }
    }

    public UserHelper getUser() {
        return user;
    }

    public ProductHelper getProduct() {
        return product;
    }

    public CartHelper getCart() {
        return cart;
    }
}