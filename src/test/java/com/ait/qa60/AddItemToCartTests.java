package com.ait.qa60;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase {

    @Test
    public void addSecondItemToCartTest() {

        app.getUser().login("yulia27@gmail.com", "Yuliana123!");
        Assert.assertTrue(app.getUser().isLoggedIn(), "User should be logged in");


        app.getProduct().addSecondProductToCart();
        String productName = app.getProduct().getLastAddedProductName();


        Assert.assertTrue(app.getCart().isProductInCart(productName),
                "Product '" + productName + "' should be in the cart");
    }
}






