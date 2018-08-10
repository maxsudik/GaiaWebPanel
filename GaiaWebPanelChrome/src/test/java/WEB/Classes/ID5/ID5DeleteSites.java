package WEB.Classes.ID5;

import WEB.Classes.ID1.ID1AdminLogin;
import WEB.Helper.GaiaHelper;
import WEB.PageObjects.*;
import WEB.DataProvider.SiteDataProvider;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class ID5DeleteSites {

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

    @Test(dataProvider = "DeleteSite", dataProviderClass = SiteDataProvider.class)
    public void deleteSite (String LoginManagerName, String PasswordManagerName, String SiteName) {

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

        editSitePage.clickDelete(driver);

        editSitePage.clickCancelPopUp(driver);

        gaiaHelper.Wait1();

        editSitePage.clickDelete(driver);

        editSitePage.clickDeletePopUp(driver);

        gaiaHelper.Wait1();

        managerHomePage.clickLogout(driver);

        driver.quit();
    }
}

