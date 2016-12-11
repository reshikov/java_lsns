package ru.stqa.pft.newcustomer.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.newcustomer.model.TestBase;

public class newcustomer extends TestBase {

    @Test
    public void testNewCustomer() {
        app.GoToNewCustomerPage();
        app.AddFirstInfo("qaTest", "Specialist", "Middle", "Qa");
        app.AddSecondaryInfo("Nikolaev", "Camo", "Title");
        app.AddPhonesInfo(new PhonesData("123456789", "12345678", "1234567"));
        app.AddLastInfo();
        app.submitNewCustomer();
    }

}
