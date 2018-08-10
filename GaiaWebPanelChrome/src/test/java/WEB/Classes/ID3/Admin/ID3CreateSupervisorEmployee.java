package WEB.Classes.ID3.Admin;

import WEB.Classes.ID1.ID1AdminLogin;
import WEB.Helper.GaiaHelper;
import WEB.PageObjects.AddNewEmployeePage;
import WEB.PageObjects.CompanyPage;
import WEB.PageObjects.EmployeesPage;
import WEB.DataProvider.EmployeeDataProvider;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class ID3CreateSupervisorEmployee {

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

    @Test(dataProvider = "CreateSupervisor", dataProviderClass = EmployeeDataProvider.class)
    public void createSupervisor (String LoginAdminName, String PasswordAdminName, String FirstName, String LastName, String Notes, String Email,
                               String Password, String RepeatPassword){

        ID1AdminLogin login = new ID1AdminLogin();
        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage company = new CompanyPage();
        EmployeesPage employeesPage = new EmployeesPage();
        AddNewEmployeePage addNewEmployeePage = new AddNewEmployeePage();

        gaiaHelper.Wait3();

        login.login(driver, LoginAdminName, PasswordAdminName);

        gaiaHelper.Wait3();

        company.clickCompanyDDL(driver);

        company.clickEmployeesDDMI(driver);

        gaiaHelper.Wait1();

        employeesPage.clickAddNewEmployee(driver);

        addNewEmployeePage.clickCancel(driver);

        employeesPage.clickAddNewEmployee(driver);

        addNewEmployeePage.clickCompanyName(driver);

        addNewEmployeePage.clickRoleSupervisor(driver);

        addNewEmployeePage.enterFirstName(driver, FirstName);

        addNewEmployeePage.enterLastName(driver, LastName);

        addNewEmployeePage.enterNotes(driver, Notes);

        addNewEmployeePage.enterEmail(driver, Email);

        addNewEmployeePage.enterPassword(driver, Password);

        addNewEmployeePage.enterRepeatPassword(driver, RepeatPassword);

        addNewEmployeePage.clickRestrictedAccess(driver);

        addNewEmployeePage.clickLicensedUser(driver);

        addNewEmployeePage.clickAbilityLogininMultipleDevices(driver);

        addNewEmployeePage.clickAdd(driver);

        addNewEmployeePage.enterLicenseLimit(driver);

        addNewEmployeePage.clickUpdatePopUp(driver);

        gaiaHelper.Wait1();

        company.clickLogout(driver);
    }
}
