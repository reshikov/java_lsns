package ru.stqa.pft.newcustomer.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.newcustomer.model.TestBase;

public class deletecustomer extends TestBase {

    
    @Test
    public void deletecustomer() {
        app.getAccountHelper().selectAllContacts();
        app.getAccountHelper().deleteContacts();
        app.getAccountHelper().returnToHomePage();
    }

}
