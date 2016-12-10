package ru.stqa.pft.address;

import org.testng.annotations.Test;

public class NewGroup extends TestBase{

    @Test
    public void testNewGroup() {
        GoToGroupPage();
        initNewGroup();
        fillGroupCreation(new GroupData("test2", "test3", "test4"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
