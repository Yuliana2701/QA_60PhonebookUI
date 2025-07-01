package com.ait.qa60;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase {

    @Test
    public void addSecondItemToCartTest() {

        if (!app.getUser().isLoggedIn()) {
            app.getUser().login("yulia27@gmail.com", "Yuliana123!");
        }

        Assert.assertTrue(app.getUser().isLoggedIn(), " Login failed!");

        // added second item
        app.getProduct().addSecondProductToCart();
        String productName = app.getProduct().getLastAddedProductName();

    }

    @AfterMethod
    public void tearDown() {

        if (app.getUser().isLoggedIn()) {
            app.getUser().logout();
        }
    }
}




