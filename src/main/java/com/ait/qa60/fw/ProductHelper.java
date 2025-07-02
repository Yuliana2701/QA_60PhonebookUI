package com.ait.qa60.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ProductHelper extends BaseHelper {

    public String lastAddedProductName;

    public ProductHelper(WebDriver driver) {
        super(driver);
    }

    public void addSecondProductToCart() {
        List<WebElement> products = findElements(By.cssSelector(".product-item"));
        for (WebElement product : products) {
            List<WebElement> nameElements = product.findElements(By.cssSelector(".product-name"));
            if (nameElements.size() > 1) {
                WebElement nameElement = nameElements.get(1);
                if (nameElement.getText().trim().equals("14.1-inch Laptop")) {
                    lastAddedProductName = nameElement.getText().trim();
                    WebElement addToCartBtn = product.findElement(By.cssSelector("input[value='Add to cart']"));
                    wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
                    break;
                }
            }
        }
    }


}