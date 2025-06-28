package com.ait.qa60;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class AddItemToCartTests extends TestBase {

    @BeforeMethod
    public void ensureLoggedIn() {
        click(By.cssSelector("a[href='/login']"));
        typing(By.id("Email"), "yulia27@gmail.com");
        typing(By.name("Password"), "Yuliana123!");
        click(By.xpath("//input[@value='Log in']"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[text()='Log out']")));
    }

    @Test
    public void addSecondItemToCartTest() {
        // Find all items
        List<WebElement> products = driver.findElements(By.cssSelector(".product-item"));
        Assert.assertTrue(products.size() >= 2, "Less than two products on the main page");

        // get second item
        WebElement secondProduct = products.get(1);

        // find second item of the name
        String productName = secondProduct.findElement(By.cssSelector("h2.product-title > a")).getText();

        // find and click  button "Add to cart"
        WebElement addToCartButton = secondProduct.findElement(By.cssSelector(".product-box-add-to-cart-button"));
        addToCartButton.click();

        // go to the cart
        click(By.cssSelector("a[href='/cart']"));

        // find all items in the cart
        List<WebElement> cartItems = driver.findElements(By.cssSelector(".cart-item-row"));

        // Check that the product name is present in the cart
        boolean found = cartItems.stream().anyMatch(item -> item.getText().contains(productName));
        Assert.assertTrue(found, "Item'" + productName + "' not find in the cart!");
    }
}





