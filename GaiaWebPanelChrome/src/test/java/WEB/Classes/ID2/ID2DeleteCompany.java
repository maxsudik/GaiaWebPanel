package WEB.Classes.ID2;

import WEB.Classes.ID1.ID1AdminLogin;
import WEB.Helper.GaiaHelper;
import WEB.PageObjects.CompanyPage;
import WEB.DataProvider.CompanyDataProvider;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class ID2DeleteCompany {

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

    @Test (dataProvider = "DeleteCompany", dataProviderClass = CompanyDataProvider.class)
    public void deleteCompany(String LoginAdminName, String PasswordAdminName, String CreatedCompanyName) {

        ID1AdminLogin login = new ID1AdminLogin();
        CompanyPage companyPage = new CompanyPage();
        GaiaHelper gaiaHelper = new GaiaHelper();

        gaiaHelper.Wait3();

        login.login(driver, LoginAdminName, PasswordAdminName);

        gaiaHelper.Wait3();

        companyPage.clickCompanyDDL(driver);

        companyPage.clickCompanyDDMI(driver);

        companyPage.enterSearchField(driver, CreatedCompanyName);

        companyPage.clickDelete(driver);

        companyPage.clickCancelPopUp(driver);

        gaiaHelper.Wait1();

        companyPage.clickDelete(driver);

        companyPage.clickDeletePopUp(driver);

        companyPage.clickLogout(driver);

    }
}



