package com.ait.qa60;

import com.ait.qa60.fw.ApplicationManager;
import org.testng.annotations.*;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();
//@BeforeMethod
    @BeforeSuite
    public void setUp() {
        app.init();
    }
//@AfterMethod
    @AfterSuite (enabled = false)
    public void tearDown() {
        app.stop();
    }
}

