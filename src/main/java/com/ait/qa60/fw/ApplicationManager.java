package com.ait.qa60.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ApplicationManager {
     String browser;
     WebDriver driver;
     UserHelper user;
     ProductHelper product;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }
    public void init() {
        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }

        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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