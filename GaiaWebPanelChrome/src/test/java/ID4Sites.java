import Helper.GaiaHelper;
import PageObjects.AddNewSitePage;
import PageObjects.CompanyPage;
import PageObjects.EditSitePage;
import PageObjects.SitesPage;
import dataProvider.LoginAdminDataProvider;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ID4Sites {

    //SHOULD BE STARTED BEFORE EACH METHOD FOR ADMIN
    @Test(dataProvider = "LoginAdmin", dataProviderClass = LoginAdminDataProvider.class)
    public void loginAsAdmin (String LoginAdminName, String PasswordAdminName) {

        System.setProperty("webdriver.chrome.driver", "src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1280, 720));
        driver.manage().window().setPosition(new Point(0, 0));

        ID1Login login = new ID1Login();
        GaiaHelper gaiHelper = new GaiaHelper();

        login.login(driver, LoginAdminName, PasswordAdminName);

        gaiHelper.Wait3();
    }

    //SHOULD BE STARTED BEFORE EACH METHOD FOR MANAGER
    @Test(dataProvider = "LoginManager", dataProviderClass = LoginAdminDataProvider.class)
    public void loginAsManager (String LoginManagerName, String PasswordManagerName) {

        System.setProperty("webdriver.chrome.driver", "src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1280, 720));
        driver.manage().window().setPosition(new Point(0, 0));

        ID1Login login = new ID1Login();
        GaiaHelper gaiHelper = new GaiaHelper();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiHelper.Wait3();
    }

    @Test
    public void addSite (String SiteName, String Radius, String CompanyName, String Notes,
                         String Address, String City, String ZipPostalCode) {

        System.setProperty("webdriver.chrome.driver", "src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1280, 720));
        driver.manage().window().setPosition(new Point(0, 0));

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

        companyPage.clickLogout(driver);

        driver.quit();
    }

    @Test
    public void editSite (String EditedSiteName, String EditedRadius, String CompanyName, String EditedNotes,
                          String EditedAddress, String EditedCity, String EditedZipPostalCode) {

        System.setProperty("webdriver.chrome.driver", "src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1280, 720));
        driver.manage().window().setPosition(new Point(0, 0));

        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage companyPage = new CompanyPage();
        SitesPage sitesPage = new SitesPage();
        EditSitePage editSitePage = new EditSitePage();

        companyPage.clickCompanyDDL(driver);

        companyPage.clickSitesDDMI(driver);

        gaiaHelper.Wait3();

        sitesPage.enterSearchField(driver, CompanyName);

        sitesPage.clickEdit(driver);

        gaiaHelper.Wait3();

        editSitePage.enterNotes(driver, EditedNotes);

        editSitePage.clickBack(driver);

        gaiaHelper.Wait3();

        editSitePage.clickStayPopUp(driver);

        editSitePage.clickBack(driver);

        gaiaHelper.Wait3();

        editSitePage.clickLeavePopUp(driver);

        gaiaHelper.Wait3();

        sitesPage.enterSearchField(driver, CompanyName);

        sitesPage.clickEdit(driver);

        gaiaHelper.Wait3();

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

        gaiaHelper.Wait3();

        companyPage.clickLogout(driver);

        driver.quit();
    }

    @Test
    public void deleteSite (String SiteName) {

        System.setProperty("webdriver.chrome.driver", "src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1280, 720));
        driver.manage().window().setPosition(new Point(0, 0));

        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage companyPage = new CompanyPage();
        SitesPage sitesPage = new SitesPage();
        EditSitePage editSitePage = new EditSitePage();

        companyPage.clickCompanyDDL(driver);

        companyPage.clickSitesDDMI(driver);

        gaiaHelper.Wait3();

        sitesPage.enterSearchField(driver, SiteName);

        sitesPage.clickEdit(driver);

        gaiaHelper.Wait3();

        editSitePage.clickDelete(driver);

        editSitePage.clickCancelPopUp(driver);

        editSitePage.clickDelete(driver);

        editSitePage.clickDeletePopUp(driver);

        companyPage.clickLogout(driver);

        driver.quit();
    }
}

