import Helper.GaiaHelper;
import PageObjects.AddNewSitePage;
import PageObjects.CompanyPage;
import PageObjects.EditSitePage;
import PageObjects.SitesPage;
import dataProvider.LoginDataProvider;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ID4Sites {
    private WebDriver driver;

    @Parameters({ "browser" })
    @BeforeTest

    public void openBrowser (String browser) {

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

    //SHOULD BE STARTED BEFORE EACH METHOD FOR ADMIN
    @Test(dataProvider = "LoginAdmin", dataProviderClass = LoginDataProvider.class)
    public void loginAsAdmin (WebDriver driver, String LoginAdminName, String PasswordAdminName) {

        ID1Login login = new ID1Login();
        GaiaHelper gaiHelper = new GaiaHelper();

        login.login(driver, LoginAdminName, PasswordAdminName);

        gaiHelper.Wait3();
    }

    //SHOULD BE STARTED BEFORE EACH METHOD FOR MANAGER
    @Test(dataProvider = "LoginManager", dataProviderClass = LoginDataProvider.class)
    public void loginAsManager (WebDriver driver, String LoginManagerName, String PasswordManagerName) {

        ID1Login login = new ID1Login();
        GaiaHelper gaiHelper = new GaiaHelper();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiHelper.Wait3();
    }



    @Test
    public void addSite (WebDriver driver, String SiteName, String Radius, String CompanyName, String Notes,
                         String Address, String City, String ZipPostalCode) {

        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage companyPage = new CompanyPage();
        SitesPage sitesPage = new SitesPage();
        AddNewSitePage addNewSitePage = new AddNewSitePage();

        companyPage.clickCompanyDDL(driver);

        companyPage.clickSitesDDMI(driver);

        gaiaHelper.Wait3();

        sitesPage.clickAddNewSite(driver);

        gaiaHelper.Wait3();

        addNewSitePage.enterNotes(driver, Notes);

        addNewSitePage.clickBack(driver);

        addNewSitePage.clickStayPopUp(driver);

        addNewSitePage.clickBack(driver);

        addNewSitePage.clickLeavePopUp(driver);

        gaiaHelper.Wait3();

        sitesPage.clickAddNewSite(driver);

        addNewSitePage.enterSiteName(driver, SiteName);

        addNewSitePage.enterDetectRadius(driver, Radius);

        addNewSitePage.clickCompany(driver, CompanyName);

        addNewSitePage.enterNotes(driver, Notes);

        addNewSitePage.enterAddress(driver, Address);

        addNewSitePage.enterCity(driver, City);

        addNewSitePage.clickStateProvince(driver);

        addNewSitePage.enterZipPostalCode(driver, ZipPostalCode);

        addNewSitePage.clickCountry(driver);

        addNewSitePage.clickFetchGPSCoordinates(driver);

        gaiaHelper.Wait3();

        addNewSitePage.clickAdd(driver);

        gaiaHelper.Wait3();

        addNewSitePage.clickBack(driver);

        companyPage.clickLogoutButton(driver);

        driver.quit();
    }

    @Test
    public void editSite (WebDriver driver) {

        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage companyPage = new CompanyPage();
        SitesPage sitesPage = new SitesPage();
        EditSitePage editSitePage = new EditSitePage();

        companyPage.clickCompanyDDL(driver);

        companyPage.clickSitesDDMI(driver);

        sitesPage.enterSearchField(driver);

        sitesPage.clickEdit(driver);

        editSitePage.


    }
}

