package Classes.ID5;

import Classes.ID1.ID1AdminLogin;
import Helper.GaiaHelper;
import PageObjects.*;
import dataProvider.SiteDataProvider;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class ID5EditSite {

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

    @Test(dataProvider = "EditSite", dataProviderClass = SiteDataProvider.class)
    public void editSite (String LoginManagerName, String PasswordManagerName, String SiteName, String EditedSiteName, String EditedRadius, String EditedNotes,
                          String EditedAddress, String EditedCity, String ProvinceName, String EditedZipPostalCode) {

        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage companyPage = new CompanyPage();
        SitesPage sitesPage = new SitesPage();
        EditSitePage editSitePage = new EditSitePage();
        ID1AdminLogin login = new ID1AdminLogin();
        ManagerHomePage managerHomePage = new ManagerHomePage();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiaHelper.Wait3();

        managerHomePage.clickCompanyDDL(driver);

        managerHomePage.clickSitesDDMI(driver);

        sitesPage.enterSearchField(driver, SiteName);

        sitesPage.clickEdit(driver);

        editSitePage.enterNotes(driver, EditedNotes);

        editSitePage.clickBack(driver);

        editSitePage.clickStayPopUp(driver);

        gaiaHelper.Wait1();

        editSitePage.clickBack(driver);

        editSitePage.clickLeavePopUp(driver);

        gaiaHelper.Wait1();

        sitesPage.enterSearchField(driver, SiteName);

        sitesPage.clickEdit(driver);

        editSitePage.enterSiteName(driver, EditedSiteName);

        editSitePage.enterDetectRadius(driver, EditedRadius);

        editSitePage.enterNotes(driver, EditedNotes);

        editSitePage.enterAddress(driver, EditedAddress);

        editSitePage.enterCity(driver, EditedCity);

        editSitePage.clickStateProvince(driver, ProvinceName);

        editSitePage.enterZipPostalCode(driver, EditedZipPostalCode);

        editSitePage.clickCountry(driver);

        editSitePage.clickFetchGPSCoordinates(driver);

        gaiaHelper.Wait1();

        editSitePage.clickSave(driver);

        gaiaHelper.Wait1();

        managerHomePage.clickLogout(driver);

        driver.quit();
    }
}

