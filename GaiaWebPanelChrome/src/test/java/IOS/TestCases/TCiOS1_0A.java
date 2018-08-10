package IOS.TestCases;

import WEB.Helper.GaiaHelper;
import IOS.Classes.ID2OnboardingManager;
import IOS.DataProvider.OnboardingDataProvider;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TCiOS1_0A {
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
    public void TCiOS1_0A(String LoginName, String PasswordName, String CompanyAddressLine1, String CompanyAddressLine2, String CompanyCity,
                          String enterCompanyZipPostalCode,

                          String InstitutionNumber, String TransitNumber, String CreditCardNumber, String AccountHolderName,

                          String FirstName, String LastName, String AddressLine1, String AddressLine2, String City, String ZipPostalCode,

                          String CreditCardNumber2, String ExpirationDate, String CVV, String NameOnCard,
                          String CreditCardAddressLine1, String CreditCardAddressLine2, String CreditCardCity,
                          String CreditCardZipPostalCode) {

        ID2OnboardingManager id2OnboardingManager = new ID2OnboardingManager();

        id2OnboardingManager.OnboardingProcess(mobiledriver, LoginName,  PasswordName,  CompanyAddressLine1,  CompanyAddressLine2,  CompanyCity,
                 enterCompanyZipPostalCode,

                 InstitutionNumber,  TransitNumber,  CreditCardNumber,  AccountHolderName,

                 FirstName,  LastName,  AddressLine1,  AddressLine2,  City,  ZipPostalCode,

                 CreditCardNumber2,  ExpirationDate,  CVV,  NameOnCard,
                 CreditCardAddressLine1,  CreditCardAddressLine2,  CreditCardCity,
                 CreditCardZipPostalCode);
        
    }
}
