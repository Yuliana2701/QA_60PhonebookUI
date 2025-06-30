package com.ait.qa60;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    @Test
    public void newUserRegistrationPositiveTest() {
        int i = (int)((System.currentTimeMillis()/1000)%3600);
        // click on login link
        click(By.cssSelector("a[href='/register']"));

        // enter Gender
        click(By.xpath("//input[@id='gender-female']"));

        // enter First name
        typing(By.xpath("//input[@id='FirstName']"), "Shmahailo");

        // enter Last name
        typing(By.xpath("//input[@id='LastName']"), "Yulia");


        // enter email
        typing(By.xpath("//input[@id='Email']"), "yulia27"+i+"@gmail.com");

        // enter password
        typing(By.name("Password"), "Yuliana123!");

        // enter Confirm password
        typing(By.name("ConfirmPassword"), "Yuliana123!");

        // click on Register button
        click(By.xpath("//input[@value='Register']"));
        // verify Log out link is displayed
        Assert.assertTrue(isElementPresent(By.xpath("//a[text()='Log out']")));

    }

}