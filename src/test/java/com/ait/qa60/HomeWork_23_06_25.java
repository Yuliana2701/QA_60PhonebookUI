package com.ait.qa60;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork_23_06_25 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
    }

    @Test
    public void openPageTest(){
        System.out.println("Open Page");
    }

    @AfterMethod(enabled = false)
    public void testDown(){
        driver.quit();
    }
}
