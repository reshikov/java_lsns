package ru.stqa.pft.address.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.address.model.GroupData;

/**
 * Created by reshikov on 11.12.16.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupCreation(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initNewGroup() {
        click(By.name("new"));
    }

    public void groupsDelete() {
        click(By.name("delete"));
    }

    public void groupSelect() {
        click(By.name("selected[]"));
    }
}
