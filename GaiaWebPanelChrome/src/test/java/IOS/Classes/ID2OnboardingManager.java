package IOS.Classes;

import Helper.GaiaHelper;
import IOS.DataProvider.OnboardingDataProvider;
import IOS.PageObjects.ManagerHomePage;
import IOS.PageObjects.OnboardingManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.touch.offset.PointOption.point;

public class ID2OnboardingManager {

    private IOSDriver mobiledriver;

    @BeforeTest

    public void beforeTest() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.8");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.4");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad Pro (12.9-inch)");
        capabilities.setCapability(MobileCapabilityType.APP, "/Volumes/Data/Xcode/DerivedData/Gaia-haumtjouswyfdxcabwdnrrxvcmiy/Build/Products/Debug-iphonesimulator/Gaia.app/");
        capabilities.setCapability("newCommandTimeout", 20);
        capabilities.setCapability("waitForQuiescence", false);
        capabilities.setCapability("useNewWDA", true);
        capabilities.setCapability("shouldUseSingletonTestManager", false);
        capabilities.setCapability("clearSystemFiles", true);
        capabilities.setCapability("shouldUseTestManagerForVisibilityDetection", true);
        mobiledriver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @AfterTest
    public void afterTest() {

        GaiaHelper gaiaHelper = new GaiaHelper();

        gaiaHelper.Wait3();

        mobiledriver.quit();
    }

    @Test(dataProvider = "OnboardingProcess", dataProviderClass = OnboardingDataProvider.class)
    public void OnboardingProcess (IOSDriver mobiledriver, String LoginName, String PasswordName, String CompanyAddressLine1, String CompanyAddressLine2, String CompanyCity,
                       String enterCompanyZipPostalCode,

                       String InstitutionNumber, String TransitNumber, String CreditCardNumber, String AccountHolderName,

                       String FirstName, String LastName, String AddressLine1, String AddressLine2, String City, String ZipPostalCode,

                       String CreditCardNumber2, String ExpirationDate, String CVV, String NameOnCard,
                       String CreditCardAddressLine1, String CreditCardAddressLine2, String CreditCardCity,
                       String CreditCardZipPostalCode) {

        ID1Login login = new ID1Login();
        GaiaHelper gaiaHelper = new GaiaHelper();
        OnboardingManager onboardingManager = new OnboardingManager();
        ManagerHomePage managerHomePage = new ManagerHomePage();

        login.loginPage(mobiledriver, LoginName, PasswordName);

        onboardingManager.clickScanId(mobiledriver);

        onboardingManager.clickSelectFromLibrary(mobiledriver);

        onboardingManager.clickMoments(mobiledriver);

        onboardingManager.clickPhoto(mobiledriver);

        onboardingManager.clickScanId(mobiledriver);

        onboardingManager.clickSkip(mobiledriver);

        gaiaHelper.Wait3();

        onboardingManager.enterCompanyAddressLine1(mobiledriver, CompanyAddressLine1);

        onboardingManager.enterCompanyAddressLine2(mobiledriver, CompanyAddressLine2);

        onboardingManager.enterCompanyCity(mobiledriver, CompanyCity);

        onboardingManager.clickCompanyCountry(mobiledriver);

        onboardingManager.clickCompanyStateProvince(mobiledriver);

        onboardingManager.enterCompanyZipPostalCode(mobiledriver, enterCompanyZipPostalCode);

        onboardingManager.clickConfirm(mobiledriver);

        gaiaHelper.Wait3();

        onboardingManager.enterInstitutionNumber(mobiledriver, InstitutionNumber);

        onboardingManager.enterTransitNumber(mobiledriver, TransitNumber);

        onboardingManager.enterCompanyCreditCardNumber(mobiledriver, CreditCardNumber);

        onboardingManager.enterAccountHolderName(mobiledriver, AccountHolderName);

        onboardingManager.clickCompany(mobiledriver);

        onboardingManager.clickAuthenticate(mobiledriver);

        gaiaHelper.Wait3();

        onboardingManager.enterFirstName(mobiledriver, FirstName);

        onboardingManager.enterLastName(mobiledriver, LastName);

        onboardingManager.setDateOfBirth(mobiledriver);

        gaiaHelper.Wait3();

        onboardingManager.enterAddressLine1(mobiledriver, AddressLine1);

        onboardingManager.enterAddressLine2(mobiledriver, AddressLine2);

        onboardingManager.enterCity(mobiledriver, City);

        onboardingManager.clickCountry(mobiledriver);

        onboardingManager.clickStateProvince(mobiledriver);

        onboardingManager.enterZipPostalCode(mobiledriver, ZipPostalCode);

        onboardingManager.clickAuthenticate2(mobiledriver);

        gaiaHelper.Wait3();

        onboardingManager.clickScanCreditCard(mobiledriver);

        onboardingManager.enterCreditCardNumber2(mobiledriver, CreditCardNumber2);

        onboardingManager.enterExpirationDate(mobiledriver, ExpirationDate);

        onboardingManager.enterCVV(mobiledriver, CVV);

        onboardingManager.enterNameOnCard(mobiledriver, NameOnCard);

        onboardingManager.enterCreditCardAddressLine1(mobiledriver, CreditCardAddressLine1);

        onboardingManager.enterCreditCardAddressLine2(mobiledriver, CreditCardAddressLine2);

        onboardingManager.enterCreditCardCity(mobiledriver, CreditCardCity);

        onboardingManager.clickCreditCardCountry(mobiledriver);

        onboardingManager.clickCreditCardStateProvince(mobiledriver);

        onboardingManager.enterCreditCardZipPostalCode(mobiledriver, CreditCardZipPostalCode);

        onboardingManager.clickRegister(mobiledriver);

        gaiaHelper.Wait3();

        managerHomePage.clickLogout(mobiledriver);
    }
}
