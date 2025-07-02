package com.phonebook.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ApplicationManager {

    String brauser;
    WebDriver driver;
    UserHelper user;
    ContactHelper contact;
    HomePageHelper home;

    public ApplicationManager(String browser) {
        this.brauser = browser;
    }


    public void init() {
        if(brauser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }else if(brauser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }


        driver.get("https://telranedu.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user = new UserHelper(driver);
        contact = new ContactHelper(driver);
        home = new HomePageHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public UserHelper getUser() {
        return user;
    }

    public ContactHelper getContact() {
        return contact;
    }

    public HomePageHelper getHome() {
        return home;
    }
}

