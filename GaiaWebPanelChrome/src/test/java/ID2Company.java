import Helper.GaiaHelper;
import PageObjects.AddNewCompanyPage;
import PageObjects.CompanyPage;
import PageObjects.EditCompanyPage;
import dataProvider.CompanyDataProvider;
import dataProvider.LoginDataProvider;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ID2Company {

    private WebDriver driver;

    @Parameters({ "browser" })
    @BeforeTest

    public void openBrowser (String browser) {

    try {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().setSize(new Dimension(1280,720));
            driver.manage().window().setPosition(new Point(0,0));

        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().window().setSize(new Dimension(1280,720));
            driver.manage().window().setPosition(new Point(1280,0));
        }

        else if (browser.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
            driver.manage().window().setSize(new Dimension(1280,720));
            driver.manage().window().setPosition(new Point(0,1280));
        }

    } catch (WebDriverException e) {
        System.out.println(e.getMessage());
    }
}

    //SHOULD BE STARTED BEFORE EACH METHOD
    @Test(dataProvider = "LoginAdmin", dataProviderClass = LoginDataProvider.class)
    public void loginAsAdmin (WebDriver driver, String LoginAdminName, String PasswordAdminName) {

        ID1Login login = new ID1Login();
        GaiaHelper gaiHelper = new GaiaHelper();

        login.login(driver, LoginAdminName, PasswordAdminName);

        gaiHelper.Wait3();
    }

    @Test(dataProvider = "CreateLandscapeCompany", dataProviderClass = CompanyDataProvider.class)
    public void createLandscapeCompany (WebDriver driver, String CompanyName, String CompanyEmail, String CompanyTaxNumber, String ProductSpread, String CompanyDescription) {

        CompanyPage companyPage = new CompanyPage();
        GaiaHelper gaiHelper = new GaiaHelper();
        AddNewCompanyPage addNewCompanyPage = new AddNewCompanyPage();

        companyPage.clickCompanyDDL(driver);

        companyPage.clickCompanyDDMI(driver);

        gaiHelper.Wait3();

        companyPage.clickAddANewCompanyButton(driver);

        gaiHelper.Wait3();

        addNewCompanyPage.enterCompanyName(driver, CompanyName);

        addNewCompanyPage.enterCompanyEmail(driver, CompanyEmail);

        addNewCompanyPage.enterCompanyTaxNumber(driver, CompanyTaxNumber);

        addNewCompanyPage.clickCompanyTypeLandscape(driver);

        addNewCompanyPage.clickCompanyCurrencyCAD(driver);

        addNewCompanyPage.enterCompanyProductSpread(driver, ProductSpread);

        addNewCompanyPage.enterCompanyDescription(driver, CompanyDescription);

        addNewCompanyPage.clickButtonAdd(driver);

        companyPage.clickLogoutButton(driver);

        driver.quit();

    }

    @Test(dataProvider = "CreateSupplierCompany", dataProviderClass = CompanyDataProvider.class)
    public void createSupplierCompany (WebDriver driver, String CompanyName, String CompanyEmail, String CompanyTaxNumber, String ProductSpread, String CompanyDescription) {

        CompanyPage companyPage = new CompanyPage();
        GaiaHelper gaiHelper = new GaiaHelper();
        AddNewCompanyPage addNewCompanyPage = new AddNewCompanyPage();

        companyPage.clickCompanyDDL(driver);

        companyPage.clickCompanyDDMI(driver);

        gaiHelper.Wait3();

        companyPage.clickAddANewCompanyButton(driver);

        gaiHelper.Wait3();

        addNewCompanyPage.enterCompanyName(driver, CompanyName);

        addNewCompanyPage.enterCompanyEmail(driver, CompanyEmail);

        addNewCompanyPage.enterCompanyTaxNumber(driver, CompanyTaxNumber);

        addNewCompanyPage.clickCompanyTypeSupplier(driver);

        addNewCompanyPage.clickCompanyCurrencyCAD(driver);

        addNewCompanyPage.enterCompanyProductSpread(driver, ProductSpread);

        addNewCompanyPage.enterCompanyDescription(driver, CompanyDescription);

        addNewCompanyPage.clickButtonAdd(driver);

        companyPage.clickLogoutButton(driver);

        driver.quit();
    }

    @Test(dataProvider = "EditCompany", dataProviderClass = CompanyDataProvider.class)
    public void editCompany (WebDriver driver, String CreatedCompanyName, String EditedCompanyName, String EditedCompanyEmail,
                             String EditedCompanyWebSite, String EditedCompanyTaxNumber, String EditedLicenseLimit,
                             String EditedProductSpreadProductionPercentage, String EditedAddressLine1, String EditedAddressLine2,
                             String EditedCity, String EditedZipPostalCode, String EditedCompanyDescription) {

        CompanyPage companyPage = new CompanyPage();
        GaiaHelper gaiHelper = new GaiaHelper();
        EditCompanyPage editCompanyPage = new EditCompanyPage();

        companyPage.clickCompanyDDL(driver);

        companyPage.clickSitesDDMI(driver);

        companyPage.enterSearchField(driver, CreatedCompanyName);

        companyPage.clickButtonEdit(driver);

        gaiHelper.Wait5();

        editCompanyPage.clickEditButton(driver);

        editCompanyPage.clickCancelButton(driver);

        editCompanyPage.clickEditButton(driver);

        editCompanyPage.uploadNewLogo(driver);

        editCompanyPage.editCompanyName(driver, EditedCompanyName);

        editCompanyPage.editCompanyEmail(driver,EditedCompanyEmail);

        editCompanyPage.editCompanyWebSite(driver, EditedCompanyWebSite);

        editCompanyPage.editCompanyTaxNumber(driver, EditedCompanyTaxNumber);

        editCompanyPage.clickCompanyTypeSupplier(driver);

        editCompanyPage.clickCurrencyCAD(driver);

        editCompanyPage.editLicenseLimit(driver, EditedLicenseLimit);

        editCompanyPage.editProductSpreadProductionPercentage(driver, EditedProductSpreadProductionPercentage);

        editCompanyPage.editAddressLine1(driver, EditedAddressLine1);

        editCompanyPage.editAddressLine2(driver, EditedAddressLine2);

        editCompanyPage.editCity(driver, EditedCity);

        editCompanyPage.clickCountryCanada(driver);

        editCompanyPage.clickProvinceBritishColumbia(driver);

        editCompanyPage.editZipPostalCode(driver, EditedZipPostalCode);

        editCompanyPage.editCompanyDescription(driver, EditedCompanyDescription);

        editCompanyPage.clickSave(driver);

        companyPage.clickLogoutButton(driver);

        driver.quit();

    }
}



