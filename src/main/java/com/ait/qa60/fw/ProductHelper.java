package com.ait.qa60.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductHelper extends BaseHelper {

    private String lastAddedProductName;

    public ProductHelper(WebDriver driver) {
        super(driver);
    }

    public void addSecondProductToCart() {
        List<WebElement> products = driver.findElements(By.cssSelector(".product-item"));
        if (products.size() >= 2) {
            WebElement secondProduct = products.get(1);
            lastAddedProductName = secondProduct.findElement(By.cssSelector("h2.product-title > a")).getText();
            secondProduct.findElement(By.cssSelector(".product-box-add-to-cart-button")).click();
        }
    }

    public String getLastAddedProductName() {
        return lastAddedProductName;
    }
}
