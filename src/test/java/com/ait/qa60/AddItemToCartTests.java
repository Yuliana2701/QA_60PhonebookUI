package com.ait.qa60;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

@Test
public void addSecondItemToCartTest() {
    app.getUser().login("yulia27@gmail.com", "Yuliana123!");
    Assert.assertTrue(app.getUser().isLoggedIn());

    app.getProduct().addSecondProductToCart();
    String productName = app.getProduct().getLastAddedProductName();

    Assert.assertTrue(app.getCart().isProductInCart(productName));
}






