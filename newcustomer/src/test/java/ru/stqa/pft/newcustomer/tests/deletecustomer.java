package ru.stqa.pft.newcustomer.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.newcustomer.model.TestBase;

public class deletecustomer extends TestBase {

    
    @Test
    public void deletecustomer() {
        app.selectAllContacts();
        app.deleteContacts();
        app.returnToHomePage();
    }

}
