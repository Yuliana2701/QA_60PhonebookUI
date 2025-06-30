package com.ait.qa60.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartHelper extends BaseHelper {

    public CartHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isProductInCart(String name) {
        List<WebElement> items = driver.findElements(By.cssSelector(".cart-item-row"));
        for (WebElement item : items) {
            if (item.getText().contains(name)) {
                return true;
            }
        }
        return false;
    }
}

