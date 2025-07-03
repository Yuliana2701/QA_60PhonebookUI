package com.ait.qa60.homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork_25_06_25 {
    WebDriver driver;
    @BeforeMethod
    public  void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void findElementByXpathTest(){
        // tag-> xpath
        driver.findElement(By.xpath("//div"));

        // id -> xpath
        driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));

        //by class name -> xpath
        driver.findElement(By.xpath("//div[@class='header']"));

        //equal
        driver.findElement(By.xpath("//a[text()='Register']"));

        //contains
        driver.findElement(By.xpath("//a[contains(text(), 'Reg')]"));

        //start-with
        driver.findElement(By.xpath("//a[starts-with(text(), 'Lo')]"));

        // move up
        driver.findElement(By.xpath("//div[@class='bar-notification']/.."));

        //parent
        driver.findElement(By.xpath("//div/parent::*"));
        driver.findElement(By.xpath("//div/.."));

        //ancestor
        driver.findElement(By.xpath("//div/ancestor::*"));


        //following-sibling
        driver.findElement(By.xpath("//div/following-sibling::span"));

        //preceding-sibling
        driver.findElement(By.xpath("//div/preceding-sibling::*"));

    }
}
