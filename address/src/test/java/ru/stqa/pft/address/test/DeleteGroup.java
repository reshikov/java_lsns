package ru.stqa.pft.address.test;

import org.testng.annotations.Test;

public class DeleteGroup extends TestBase {

    @Test
    public void testDeleteGroups() {
        app.getNavigationHelper().GoToGroupPage();
        app.getGroupHelper().groupSelect();
        app.getGroupHelper().groupsDelete();
        app.getGroupHelper().returnToGroupPage();
    }

}
