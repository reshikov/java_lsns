package ru.stqa.pft.newcustomer;

import org.testng.annotations.Test;

public class deletecustomer extends TestBase{

    
    @Test
    public void deletecustomer() {
        selectAllContacts();
        deleteContacts();
        returnToHomePage();
    }

}
