package com.ait.qa60;

import com.ait.qa60.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
        int i = (int) ((System.currentTimeMillis() / 1000) % 3600);
        User user = new User("Shmahailo", "Yulia", "yulia27" + i + "@gmail.com", "Yuliana123!", "female");

        app.getUser().register(user);

        Assert.assertTrue(app.getUser().isLoggedIn(), "User should be logged in after registration");
    }
}