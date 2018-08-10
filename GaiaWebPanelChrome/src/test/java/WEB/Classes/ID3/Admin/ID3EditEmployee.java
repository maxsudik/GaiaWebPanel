package WEB.Classes.ID3.Admin;

import WEB.Classes.ID1.ID1AdminLogin;
import WEB.Helper.GaiaHelper;
import WEB.PageObjects.*;
import WEB.DataProvider.EmployeeDataProvider;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import org.testng.annotations.*;

public class ID3EditEmployee {

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

    @Test(dataProvider = "EditEmployee", dataProviderClass = EmployeeDataProvider.class)
    public void editEmployee (String LoginAdminName, String PasswordAdminName, String CreatedEmployeeName, String EditedFirstName,
                              String EditedLastName, String EditedNotes, String EditedEmail, String EditedPassword,
                              String EditedRepeatPassword){

        ID1AdminLogin login = new ID1AdminLogin();
        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage company = new CompanyPage();
        EmployeesPage employeesPage = new EmployeesPage();
        EditEmployeePage editEmployeePage = new EditEmployeePage();

        gaiaHelper.Wait3();

        login.login(driver, LoginAdminName, PasswordAdminName);

        gaiaHelper.Wait3();

        company.clickCompanyDDL(driver);

        company.clickEmployeesDDMI(driver);

        gaiaHelper.Wait1();

        employeesPage.enterSearchField(driver, CreatedEmployeeName);

        employeesPage.clickEditButton(driver);

        editEmployeePage.enterNotes(driver, EditedNotes);

        editEmployeePage.clickBack(driver);

        editEmployeePage.clickLeavePopUpWarning(driver);

        employeesPage.enterSearchField(driver,CreatedEmployeeName);

        employeesPage.clickEditButton(driver);

        editEmployeePage.enterNotes(driver, EditedNotes);

        editEmployeePage.clickBack(driver);

        editEmployeePage.clickStayPopUpWarning(driver);

        gaiaHelper.Wait1();

        editEmployeePage.clickCompanyName(driver);

        editEmployeePage.clickRoleSalesPerson(driver);

        editEmployeePage.enterFirstName(driver, EditedFirstName);

        editEmployeePage.enterLastName(driver, EditedLastName);

        editEmployeePage.enterNotes(driver, EditedNotes);

        editEmployeePage.enterEmail(driver, EditedEmail);

        editEmployeePage.clickEditPassword(driver);

        editEmployeePage.clickClose(driver);

        editEmployeePage.clickEditPassword(driver);

        editEmployeePage.enterPassword(driver, EditedPassword);

        editEmployeePage.enterRepeatPassword(driver, EditedRepeatPassword);

        editEmployeePage.clickRestrictedAccess(driver);

        editEmployeePage.clickLicensedUser(driver);

        editEmployeePage.clickAbilityLogininMultipleDevices(driver);

        editEmployeePage.clickAbilityLogininMultipleDevices(driver);

        editEmployeePage.clickUpdate(driver);

        gaiaHelper.Wait1();

        editEmployeePage.clickBack(driver);

        gaiaHelper.Wait1();

        employeesPage.enterSearchField(driver, EditedFirstName);

        //Verify Employee Was Updated

        company.clickLogout(driver);
    }
}
