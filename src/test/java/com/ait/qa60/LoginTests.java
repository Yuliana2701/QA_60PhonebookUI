package com.ait.qa60;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
@Test
    public void loginPositiveTest(){
    // click on login link
    click(By.cssSelector("a[href='/login']"));


    // enter email
    typing(By.xpath("//input[@id='Email']"), "yulia27@gmail.com");

    // enter password
    typing(By.name("Password"), "Yuliana123!");


    // click on Log in button
    click(By.xpath("//input[@class='button-1 login-button' and @type='submit' and @value='Log in']"));
    // verify Log out link is displayed
    Assert.assertTrue(isElementPresent(By.xpath("//a[text()='Log out']")));

}

}

