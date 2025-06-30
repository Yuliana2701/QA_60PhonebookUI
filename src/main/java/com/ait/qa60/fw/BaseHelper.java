package com.ait.qa60.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseHelper {
    protected WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    protected void type(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    protected String getText(By locator) {
        return driver.findElement(locator).getText();
    }
}

