package com.ait.qa60;

import org.openqa.selenium.By;
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
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void findElementsByCssSelectorTest(){
        //by id
        driver.findElement(By.cssSelector("#small-searchterms"));
        driver.findElement(By.cssSelector("#dialog-notifications-success"));

        //by first img
        driver.findElement(By.cssSelector("img"));

        //by src
        driver.findElement(By.cssSelector("img[src*='logo.png']"));
        //find element by tag name -> ==css
        driver.findElement(By.cssSelector("input"));

        //by class name -> css (.)
        driver.findElement(By.cssSelector(".header"));

        // [attr = 'value']
        driver.findElement(By.cssSelector("[name='q']"));

        // contains -> *
        driver.findElement(By.cssSelector("[href*='login']"));

        //start -> ^
        driver.findElement(By.cssSelector("[href^='/register']"));

        // end on ->$
        driver.findElement(By.cssSelector("[href$='/cart']"));


    }

}
