package Classes.ID2;

import Classes.ID1.ID1AdminLogin;
import Helper.GaiaHelper;
import PageObjects.CompanyPage;
import PageObjects.EditCompanyPage;
import dataProvider.CompanyDataProvider;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class ID2EditCompany {

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

    @Test(dataProvider = "EditCompany", dataProviderClass = CompanyDataProvider.class)
    public void editCompany(String LoginAdminName, String PasswordAdminName, String CreatedCompanyName, String EditedCompanyName, String EditedCompanyEmail,
                            String EditedCompanyWebSite, String EditedCompanyTaxNumber, String EditedLicenseLimit,
                            String EditedProductSpreadProductionPercentage, String EditedAddressLine1, String EditedAddressLine2,
                            String EditedCity, String EditedZipPostalCode, String EditedCompanyDescription) {

        ID1AdminLogin login = new ID1AdminLogin();
        CompanyPage companyPage = new CompanyPage();
        GaiaHelper gaiaHelper = new GaiaHelper();
        EditCompanyPage editCompanyPage = new EditCompanyPage();

        gaiaHelper.Wait3();

        login.login(driver, LoginAdminName, PasswordAdminName);

        gaiaHelper.Wait3();

        companyPage.clickCompanyDDL(driver);

        companyPage.clickCompanyDDL(driver);

        companyPage.enterSearchField(driver, CreatedCompanyName);

        companyPage.clickEdit(driver);

        editCompanyPage.clickEditButton(driver);

        editCompanyPage.clickCancelButton(driver);

        editCompanyPage.clickEditButton(driver);

        editCompanyPage.uploadNewLogo(driver);

        editCompanyPage.editCompanyName(driver, EditedCompanyName);

        editCompanyPage.editCompanyEmail(driver, EditedCompanyEmail);

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

        companyPage.clickLogout(driver);
    }
}



