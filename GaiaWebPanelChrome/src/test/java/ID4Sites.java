import Helper.GaiaHelper;
import PageObjects.AddNewSitePage;
import PageObjects.CompanyPage;
import PageObjects.EditSitePage;
import PageObjects.SitesPage;
import dataProvider.LoginAdminDataProvider;
import dataProvider.SiteDataProvider;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ID4Sites {

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


    @Test(priority = 1,dataProvider = "AddSite", dataProviderClass = SiteDataProvider.class)
    public void addSite (String LoginManagerName, String PasswordManagerName, String SiteName, String Radius, String CompanyName, String Notes,
                         String Address, String City, String ZipPostalCode) {

        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage companyPage = new CompanyPage();
        SitesPage sitesPage = new SitesPage();
        AddNewSitePage addNewSitePage = new AddNewSitePage();
        ID1Login login = new ID1Login();


        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiaHelper.Wait3();

        companyPage.clickCompanyDDL(driver);

        companyPage.clickSitesDDMI(driver);

        sitesPage.clickAddNewSite(driver);

        addNewSitePage.enterNotes(driver, Notes);

        addNewSitePage.clickBack(driver);

        addNewSitePage.clickStayPopUp(driver);

        addNewSitePage.clickBack(driver);

        addNewSitePage.clickLeavePopUp(driver);

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

        addNewSitePage.clickAdd(driver);

        addNewSitePage.clickBack(driver);

        companyPage.clickLogout(driver);

        driver.quit();
    }

    @Test(priority = 2, dataProvider = "AddSite", dataProviderClass = SiteDataProvider.class)
    public void editSite (String LoginManagerName, String PasswordManagerName, String EditedSiteName, String EditedRadius, String CompanyName, String EditedNotes,
                          String EditedAddress, String EditedCity, String EditedZipPostalCode) {

        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage companyPage = new CompanyPage();
        SitesPage sitesPage = new SitesPage();
        EditSitePage editSitePage = new EditSitePage();
        ID1Login login = new ID1Login();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiaHelper.Wait3();

        companyPage.clickCompanyDDL(driver);

        companyPage.clickSitesDDMI(driver);

        sitesPage.enterSearchField(driver, CompanyName);

        sitesPage.clickEdit(driver);

        editSitePage.enterNotes(driver, EditedNotes);

        editSitePage.clickBack(driver);

        editSitePage.clickStayPopUp(driver);

        editSitePage.clickBack(driver);

        editSitePage.clickLeavePopUp(driver);

        sitesPage.enterSearchField(driver, CompanyName);

        sitesPage.clickEdit(driver);

        editSitePage.enterSiteName(driver, EditedSiteName);

        editSitePage.enterDetectRadius(driver, EditedRadius);

        editSitePage.clickCompany(driver, CompanyName);

        editSitePage.enterNotes(driver, EditedNotes);

        editSitePage.enterAddress(driver, EditedAddress);

        editSitePage.enterCity(driver, EditedCity);

        editSitePage.clickStateProvince(driver);

        editSitePage.enterZipPostalCode(driver, EditedZipPostalCode);

        editSitePage.clickCountry(driver);

        editSitePage.clickFetchGPSCoordinates(driver);

        editSitePage.clickSave(driver);

        companyPage.clickLogout(driver);

        driver.quit();
    }

    @Test(priority = 3, dataProvider = "AddSite", dataProviderClass = SiteDataProvider.class)
    public void deleteSite (String LoginManagerName, String PasswordManagerName, String SiteName) {

        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage companyPage = new CompanyPage();
        SitesPage sitesPage = new SitesPage();
        EditSitePage editSitePage = new EditSitePage();
        ID1Login login = new ID1Login();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiaHelper.Wait3();

        companyPage.clickCompanyDDL(driver);

        companyPage.clickSitesDDMI(driver);

        sitesPage.enterSearchField(driver, SiteName);

        sitesPage.clickEdit(driver);

        editSitePage.clickDelete(driver);

        editSitePage.clickCancelPopUp(driver);

        editSitePage.clickDelete(driver);

        editSitePage.clickDeletePopUp(driver);

        companyPage.clickLogout(driver);

        driver.quit();
    }
}

