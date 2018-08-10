package Classes.ID1;

import Classes.ID1.ID1AdminLogin;
import Helper.GaiaHelper;
import PageObjects.AddNewEmployeePage;
import PageObjects.EmployeesPage;
import PageObjects.ManagerHomePage;
import dataProvider.EmployeeDataProvider;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class ID1EmployeeLogin {

    private WebDriver driver;

    @AfterTest

    public void closeBrowser(){
        driver.quit();
    }

    @Parameters({"browser"})
    @BeforeTest

    public void openBrowser(String browser) {

        try {
            if (browser.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/chromedriver");
                driver = new ChromeDriver();
                driver.manage().window().setSize(new Dimension(1280, 720));
                driver.manage().window().setPosition(new Point(0, 0));

            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/geckodriver");
                driver = new FirefoxDriver();
                driver.manage().window().setSize(new Dimension(1280, 720));
                driver.manage().window().setPosition(new Point(1280, 0));
            } else if (browser.equalsIgnoreCase("Safari")) {
                driver = new SafariDriver();
                driver.manage().window().setSize(new Dimension(1280, 720));
                driver.manage().window().setPosition(new Point(0, 1280));
            }

        } catch (WebDriverException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 2, dataProvider = "LoginEmployee", dataProviderClass = EmployeeDataProvider.class)
    public void loginAsManager2 (String LoginManagerName, String PasswordManagerName) {

        ID1AdminLogin login = new ID1AdminLogin();
        GaiaHelper gaiaHelper = new GaiaHelper();
        ManagerHomePage managerHomePage = new ManagerHomePage();

        gaiaHelper.Wait3();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiaHelper.Wait3();

        managerHomePage.clickLogout(driver);
    }
}
