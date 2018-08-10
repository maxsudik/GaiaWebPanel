package Classes.ID3.Admin;

import Classes.ID1.ID1AdminLogin;
import Helper.GaiaHelper;
import PageObjects.*;
import dataProvider.EmployeeDataProvider;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class ID3DeleteEmployee {

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

    @Test(dataProvider = "DeleteEmployee", dataProviderClass = EmployeeDataProvider.class)
    public void deleteEmployee (String LoginAdminName, String PasswordAdminName, String FirstName){

        ID1AdminLogin login = new ID1AdminLogin();
        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage companypage = new CompanyPage();
        EmployeesPage employeesPage = new EmployeesPage();
        EditEmployeePage editEmployeePage = new EditEmployeePage();

        gaiaHelper.Wait3();

        login.login(driver, LoginAdminName, PasswordAdminName);

        gaiaHelper.Wait3();

        companypage.clickCompanyDDL(driver);

        companypage.clickEmployeesDDMI(driver);

        employeesPage.enterSearchField(driver, FirstName);

        employeesPage.clickEditButton(driver);

        editEmployeePage.clickDeleteEmployee(driver);

        editEmployeePage.clickDeletePopUp(driver);

        companypage.clickLogout(driver);
    }


}
