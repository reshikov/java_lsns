package ru.stqa.pft.address.test;

import org.testng.annotations.Test;

public class DeleteGroup extends TestBase {

    @Test
    public void testDeleteGroups() {
        app.GoToGroupPage();
        app.groupSelect();
        app.groupsDelete();
        app.returnToGroupPage();
    }

}
