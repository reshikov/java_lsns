import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class newcustomer {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "/Applications/Firefox.app/Contents/MacOS/geckodriver");
        wd = new FirefoxDriver();
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/index.php");

    }
    
    @Test
    public void testNewCustomer() {
        login("admin", "secret");
        GoToNewCustomerPage();
        AddFirstInfo("qaTest", "Specialist", "Middle", "Qa");
        AddSecondaryInfo("Nikolaev", "Camo", "Title");
        AddPhonesInfo("123456789", "12345678", "1234567");
        AddLastInfo();
        submitNewCustomer();
    }

    private void submitNewCustomer() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    private void AddLastInfo() {
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys("qates@qates.com");
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[5]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[5]")).click();
        }
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[6]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[6]")).click();
        }
        wd.findElement(By.name("byear")).click();
        wd.findElement(By.name("byear")).clear();
        wd.findElement(By.name("byear")).sendKeys("1999");
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[10]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[10]")).click();
        }
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[3]")).click();
        }
        wd.findElement(By.name("ayear")).click();
        wd.findElement(By.name("ayear")).clear();
        wd.findElement(By.name("ayear")).sendKeys("1002");
    }

    private void AddPhonesInfo(String workphone, String mobile, String homephone) {
        wd.findElement(By.name("home")).click();
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys(homephone);
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(mobile);
        wd.findElement(By.name("work")).click();
        wd.findElement(By.name("work")).clear();
        wd.findElement(By.name("work")).sendKeys(workphone);
    }

    private void AddSecondaryInfo(String address, String company, String title) {
        wd.findElement(By.name("title")).click();
        wd.findElement(By.name("title")).clear();
        wd.findElement(By.name("title")).sendKeys(title);
        wd.findElement(By.name("company")).click();
        wd.findElement(By.name("company")).clear();
        wd.findElement(By.name("company")).sendKeys(company);
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(address);
    }

    private void AddFirstInfo(String nickname, String lastname, String middlename, String firstname) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(firstname);
        wd.findElement(By.name("middlename")).click();
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys(middlename);
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(lastname);
        wd.findElement(By.name("nickname")).click();
        wd.findElement(By.name("nickname")).clear();
        wd.findElement(By.name("nickname")).sendKeys(nickname);
    }

    private void GoToNewCustomerPage() {
        wd.findElement(By.linkText("add new")).click();
    }

    private void login(String user, String password) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(user);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
