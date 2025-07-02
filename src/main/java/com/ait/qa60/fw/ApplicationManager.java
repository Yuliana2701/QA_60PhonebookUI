package com.ait.qa60.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    private WebDriver driver;
    private UserHelper user;
    private ProductHelper product;


    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com");

        user = new UserHelper(driver);
        product = new ProductHelper(driver);

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


}