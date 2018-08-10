package WEB.Classes.ID3.Manager;

import WEB.Classes.ID1.ID1AdminLogin;
import WEB.Helper.GaiaHelper;
import WEB.PageObjects.*;
import WEB.DataProvider.EmployeeDataProvider;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class ID3CreateManagerEmployee {

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

    @Test(priority = 1, dataProvider = "CreateManager2", dataProviderClass = EmployeeDataProvider.class)
    public void createManager2 (String LoginManagerName, String PasswordManagerName, String FirstName, String LastName, String Notes, String Email,
                                String Password, String RepeatPassword){

        ID1AdminLogin login = new ID1AdminLogin();
        GaiaHelper gaiaHelper = new GaiaHelper();
        ManagerHomePage managerHomePage = new ManagerHomePage();
        EmployeesPage employeesPage = new EmployeesPage();
        AddNewEmployeePage addNewEmployeePage = new AddNewEmployeePage();

        gaiaHelper.Wait3();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiaHelper.Wait3();

        managerHomePage.clickCompanyDDL(driver);

        managerHomePage.clickEmployeesDDMI(driver);

        employeesPage.clickAddNewEmployee(driver);

        addNewEmployeePage.clickCancel(driver);

        employeesPage.clickAddNewEmployee(driver);

        addNewEmployeePage.clickRoleManager2(driver);

        addNewEmployeePage.enterFirstName(driver, FirstName);

        addNewEmployeePage.enterLastName(driver, LastName);

        addNewEmployeePage.enterNotes(driver, Notes);

        addNewEmployeePage.enterEmail(driver, Email);

        addNewEmployeePage.enterPassword(driver, Password);

        addNewEmployeePage.enterRepeatPassword(driver, RepeatPassword);

        addNewEmployeePage.clickRestrictedAccess(driver);

        addNewEmployeePage.clickLicensedUser(driver);

        addNewEmployeePage.clickAdd(driver);

        managerHomePage.clickLogout(driver);
    }
}
