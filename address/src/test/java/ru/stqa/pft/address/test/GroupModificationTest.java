package ru.stqa.pft.address.test;

import org.junit.Test;
import ru.stqa.pft.address.model.GroupData;

/**
 * Created by reshikov on 11.12.16.
 */
public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().GoToGroupPage();
        app.getGroupHelper().groupSelect();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupCreation(new GroupData("test4", "test5", "test6"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();

    }

}
