import Helper.GaiaHelper;
import PageObjects.*;
import dataProvider.CompanyDataProvider;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ID2CreateCompany {

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

    @Test(priority = 1, dataProvider = "CreateLandscapeCompany", dataProviderClass = CompanyDataProvider.class)
    public void createLandscapeCompany(String LoginAdminName, String PasswordAdminName, String CompanyName, String CompanyEmail, String CompanyTaxNumber, String ProductSpread, String CompanyDescription) {

        CompanyPage companyPage = new CompanyPage();
        GaiaHelper gaiaHelper = new GaiaHelper();
        AddNewCompanyPage addNewCompanyPage = new AddNewCompanyPage();
        ID1Login login = new ID1Login();

        login.login(driver, LoginAdminName, PasswordAdminName);

        gaiaHelper.Wait3();

        companyPage.clickCompanyDDL(driver);

        companyPage.clickCompanyDDMI(driver);

        gaiaHelper.Wait3();

        companyPage.clickAddANewCompany(driver);

        gaiaHelper.Wait3();

        addNewCompanyPage.enterCompanyName(driver, CompanyName);

        addNewCompanyPage.enterCompanyEmail(driver, CompanyEmail);

        addNewCompanyPage.enterCompanyTaxNumber(driver, CompanyTaxNumber);

        addNewCompanyPage.clickCompanyTypeLandscape(driver);

        addNewCompanyPage.clickCompanyCurrencyCAD(driver);

        addNewCompanyPage.enterCompanyProductSpread(driver, ProductSpread);

        addNewCompanyPage.enterCompanyDescription(driver, CompanyDescription);

        addNewCompanyPage.clickButtonAdd(driver);

        companyPage.clickLogout(driver);

    }

    @Test(priority = 2, dataProvider = "CreateSupplierCompany", dataProviderClass = CompanyDataProvider.class)
    public void createSupplierCompany(String LoginAdminName, String PasswordAdminName, String CompanyName, String CompanyEmail, String CompanyTaxNumber, String ProductSpread, String CompanyDescription) {

        ID1Login login = new ID1Login();
        CompanyPage companyPage = new CompanyPage();
        GaiaHelper gaiaHelper = new GaiaHelper();
        AddNewCompanyPage addNewCompanyPage = new AddNewCompanyPage();

        gaiaHelper.Wait3();

        login.login(driver, LoginAdminName, PasswordAdminName);

        gaiaHelper.Wait3();

        companyPage.clickCompanyDDL(driver);

        companyPage.clickCompanyDDMI(driver);

        gaiaHelper.Wait3();

        companyPage.clickAddANewCompany(driver);

        gaiaHelper.Wait3();

        addNewCompanyPage.enterCompanyName(driver, CompanyName);

        addNewCompanyPage.enterCompanyEmail(driver, CompanyEmail);

        addNewCompanyPage.enterCompanyTaxNumber(driver, CompanyTaxNumber);

        addNewCompanyPage.clickCompanyTypeSupplier(driver);

        addNewCompanyPage.clickCompanyCurrencyCAD(driver);

        addNewCompanyPage.enterCompanyProductSpread(driver, ProductSpread);

        addNewCompanyPage.enterCompanyDescription(driver, CompanyDescription);

        addNewCompanyPage.clickButtonAdd(driver);

        companyPage.clickLogout(driver);
    }
}



