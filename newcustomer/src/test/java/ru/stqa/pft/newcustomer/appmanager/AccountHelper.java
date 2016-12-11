package ru.stqa.pft.newcustomer.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.newcustomer.tests.PhonesData;

/**
 * Created by reshikov on 11.12.16.
 */
public class AccountHelper extends HelperBase{

    public AccountHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void submitNewCustomer() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void AddLastInfo() {
        type(By.name("email"), "qates@qates.com");
        type(By.name("ayear"), "1002");
    }

    public void AddPhonesInfo(PhonesData phonesData) {
        type(By.name("home"), phonesData.getHomephone());
        type(By.name("mobile"), phonesData.getMobile());
        type(By.name("work"), phonesData.getWorkphone());
    }

    public void AddSecondaryInfo(String address, String company, String title) {
        type(By.name("title"), title);
        type(By.name("company"), company);
        type(By.name("address"), address);
    }

    public void AddFirstInfo(String nickname, String lastname, String middlename, String firstname) {
        type(By.name("firstname"), firstname);
        type(By.name("middlename"), middlename);
        type(By.name("lastname"), lastname);
        type(By.name("nickname"), nickname);
    }

    public void GoToNewCustomerPage() {
        click(By.linkText("add new"));
    }

    public void returnToHomePage() {
        click(By.linkText("home"));
    }

    public void deleteContacts() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }

    public void selectAllContacts() {
        click(By.id("MassCB"));
    }
}
