package Classes.ID4;

import Classes.ID1.ID1AdminLogin;
import Helper.GaiaHelper;
import PageObjects.CompanyPage;
import PageObjects.OnboardingProcess;
import dataProvider.OnboardingDataProvider;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class ID3OnboardingProcess {

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

    @Test(dataProvider = "onboardingEnterCompanyAddress", dataProviderClass = OnboardingDataProvider.class)
    public void onboardingEnterCompanyAddress (String LoginManagerName, String PasswordManagerName, String CompanyAddressLine1, String CompanyAddressLine2,
                                   String CompanyCity, String CompanyZipPostalCode, String InstitutionNumber, String TransitNumber, String AccountNumber, String AccountHolderName, String FirstName, String LastName, String DateOfBirth,
                                               String AddressLine1, String AddressLine2, String City, String ZipPostalCode, String CreditCardNumber, String NameOnCard, String CVV,
                                               String CreditCardAddressLine1, String CreditCardAddressLine2,
                                               String CreditCardCity, String CreditCardZipPostalCode, String LicenseNumber) {

        ID1AdminLogin login = new ID1AdminLogin();
        GaiaHelper gaiaHelper = new GaiaHelper();
        OnboardingProcess onboardingProcess = new OnboardingProcess();
        CompanyPage companyPage = new CompanyPage();

        gaiaHelper.Wait3();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiaHelper.Wait3();

        onboardingProcess.enterCompanyAddressLine1(driver, CompanyAddressLine1);

        onboardingProcess.enterCompanyAddressLine2(driver, CompanyAddressLine2);

        onboardingProcess.enterCompanyCity(driver, CompanyCity);

        onboardingProcess.clickCompanyCountry(driver);

        onboardingProcess.clickCompanyStateProvince(driver);

        onboardingProcess.enterCompanyZipPostalCode(driver, CompanyZipPostalCode);

        onboardingProcess.clickSave1(driver);

        onboardingProcess.enterInstitutionNumber(driver, InstitutionNumber);

        onboardingProcess.enterTransitNumber(driver, TransitNumber);

        onboardingProcess.enterAccountNumber(driver, AccountNumber);

        onboardingProcess.enterAccountHolderName(driver, AccountHolderName);

        onboardingProcess.clickAccountTypeCompany(driver);

        onboardingProcess.clickSave2(driver);

        onboardingProcess.enterFirstName(driver, FirstName);

        onboardingProcess.enterLastName(driver, LastName);

        onboardingProcess.enterDateOfBirth(driver, DateOfBirth);

        onboardingProcess.enterAddressLine1(driver, AddressLine1);

        onboardingProcess.enterAddressLine2(driver, AddressLine2);

        onboardingProcess.enterCity(driver,City);

        onboardingProcess.clickCountry(driver);

        onboardingProcess.clickStateProvinceDDL(driver);

        onboardingProcess.enterZipPostalCode(driver, ZipPostalCode);

        onboardingProcess.uploadID(driver);

        onboardingProcess.clickSave3(driver);

        onboardingProcess.enterCreditCardNumber(driver, CreditCardNumber);

        onboardingProcess.enterNameOnCard(driver, NameOnCard);

        onboardingProcess.clickExpirationMM(driver);

        onboardingProcess.clickExpirationYY(driver);

        onboardingProcess.enterCVV(driver, CVV);

        onboardingProcess.enterCreditCardAddressLine1(driver, CreditCardAddressLine1);

        onboardingProcess.enterCreditCardAddressLine2(driver, CreditCardAddressLine2);

        onboardingProcess.enterCreditCardCity(driver, CreditCardCity);

        onboardingProcess.clickCreditCardCountry(driver);

        onboardingProcess.clickCreditCardStateProvince(driver);

        onboardingProcess.enterCreditCardZipPostalCode(driver, CreditCardZipPostalCode);

        onboardingProcess.enterLicenseNumber(driver, LicenseNumber);

        onboardingProcess.clickUpdate(driver);

        companyPage.clickLogout(driver);
    }
}
