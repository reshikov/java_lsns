package ru.stqa.pft.newcustomer.model;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.newcustomer.appmanager.ApplicationManager;

/**
 * Created by reshikov on 11.12.16.
 */
public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();


    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
