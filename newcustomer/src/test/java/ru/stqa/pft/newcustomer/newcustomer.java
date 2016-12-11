package ru.stqa.pft.newcustomer;

import org.testng.annotations.Test;

public class newcustomer extends TestBase {

    @Test
    public void testNewCustomer() {
        GoToNewCustomerPage();
        AddFirstInfo("qaTest", "Specialist", "Middle", "Qa");
        AddSecondaryInfo("Nikolaev", "Camo", "Title");
        AddPhonesInfo(new PhonesData("123456789", "12345678", "1234567"));
        AddLastInfo();
        submitNewCustomer();
    }

}
