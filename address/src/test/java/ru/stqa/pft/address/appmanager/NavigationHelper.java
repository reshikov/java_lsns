package ru.stqa.pft.address.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by reshikov on 11.12.16.
 */
public class NavigationHelper extends HelperBase{

    public NavigationHelper(FirefoxDriver wd) {

        super(wd);
    }

    public void GoToGroupPage() {

        click(By.linkText("groups"));
    }
}
