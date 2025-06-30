package com.ait.qa60.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
        private UserHelper user;
        private ProductHelper product;
        private CartHelper cart;

        public void init() {
            driver = new ChromeDriver(); // или другой драйвер
            user = new UserHelper(driver);
            product = new ProductHelper(driver);
            cart = new CartHelper(driver);
        }

        public UserHelper getUser() { return user; }
        public ProductHelper getProduct() { return product; }
        public CartHelper getCart() { return cart; }
