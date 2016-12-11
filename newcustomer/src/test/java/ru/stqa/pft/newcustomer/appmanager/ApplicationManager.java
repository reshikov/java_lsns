package ru.stqa.pft.newcustomer.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by reshikov on 11.12.16.
 */
public class ApplicationManager{

    FirefoxDriver wd;

    private AccountHelper accountHelper;
    private SessionHelper sessionHelper;

    public void init() {
        System.setProperty("webdriver.gecko.driver", "/Applications/Firefox.app/Contents/MacOS/geckodriver");
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get  ("http://localhost/addressbook/index.php");
        accountHelper = new AccountHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        wd.quit();
    }

    public AccountHelper getAccountHelper() {
        return accountHelper;
    }
}
