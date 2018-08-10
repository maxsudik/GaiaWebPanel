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

public class ID5CreateSite {

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


    @Test(dataProvider = "AddSite", dataProviderClass = SiteDataProvider.class)
    public void addSite (String LoginManagerName, String PasswordManagerName, String SiteName, String Radius, String Notes,
                         String Address, String City, String ProvinceName, String ZipPostalCode) {

        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage companyPage = new CompanyPage();
        SitesPage sitesPage = new SitesPage();
        AddNewSitePage addNewSitePage = new AddNewSitePage();
        ID1AdminLogin login = new ID1AdminLogin();
        ManagerHomePage managerHomePage = new ManagerHomePage();


        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiaHelper.Wait3();

        managerHomePage.clickCompanyDDL(driver);

        managerHomePage.clickSitesDDMI(driver);

        sitesPage.clickAddNewSite(driver);

        addNewSitePage.enterNotes(driver, Notes);

        addNewSitePage.clickBack(driver);

        addNewSitePage.clickStayPopUp(driver);

        gaiaHelper.Wait1();

        addNewSitePage.clickBack(driver);

        addNewSitePage.clickLeavePopUp(driver);

        gaiaHelper.Wait1();

        sitesPage.clickAddNewSite(driver);

        addNewSitePage.enterSiteName(driver, SiteName);

        addNewSitePage.enterDetectRadius(driver, Radius);

        addNewSitePage.enterNotes(driver, Notes);

        addNewSitePage.enterAddress(driver, Address);

        addNewSitePage.enterCity(driver, City);

        addNewSitePage.clickStateProvince(driver, ProvinceName);

        addNewSitePage.enterZipPostalCode(driver, ZipPostalCode);

        addNewSitePage.clickCountry(driver);

        addNewSitePage.clickFetchGPSCoordinates(driver);

        gaiaHelper.Wait1();

        addNewSitePage.clickAdd(driver);

        gaiaHelper.Wait1();

        addNewSitePage.clickBack(driver);

        gaiaHelper.Wait1();

        managerHomePage.clickLogout(driver);

        driver.quit();
    }
}

