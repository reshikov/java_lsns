package ru.stqa.pft.newcustomer.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.newcustomer.model.TestBase;

public class newcustomer extends TestBase {

    @Test
    public void testNewCustomer() {
        app.getAccountHelper().GoToNewCustomerPage();
        app.getAccountHelper().AddFirstInfo("qaTest", "Specialist", "Middle", "Qa");
        app.getAccountHelper().AddSecondaryInfo("Nikolaev", "Camo", "Title");
        app.getAccountHelper().AddPhonesInfo(new PhonesData("123456789", "12345678", "1234567"));
        app.getAccountHelper().AddLastInfo();
        app.getAccountHelper().submitNewCustomer();
    }

}
