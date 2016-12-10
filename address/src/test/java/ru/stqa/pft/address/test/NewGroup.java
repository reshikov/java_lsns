package ru.stqa.pft.address.test;

import org.testng.annotations.Test;
import ru.stqa.pft.address.model.GroupData;

public class NewGroup extends TestBase{

    @Test
    public void testNewGroup() {
        app.GoToGroupPage();
        app.initNewGroup();
        app.fillGroupCreation(new GroupData("test2", "test3", "test4"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
