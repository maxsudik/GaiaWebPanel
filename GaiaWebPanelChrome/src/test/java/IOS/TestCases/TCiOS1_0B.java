package IOS.TestCases;

import Helper.GaiaHelper;
import IOS.Classes.ID1Login;
import IOS.Classes.ID2OnboardingManager;
import IOS.DataProvider.LoginManagerDataProvider;
import IOS.DataProvider.OnboardingDataProvider;
import IOS.PageObjects.LoginPage;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TCiOS1_0B {
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
    
    @Test(dataProvider = "ResetPassword", dataProviderClass = LoginManagerDataProvider.class)
    public void TCiOS1_0B(String Email) {

        LoginPage loginPage = new LoginPage();
        GaiaHelper gaiaHelper = new GaiaHelper();

        loginPage.waitForSystemPopUp(mobiledriver);

        loginPage.waitForSystemPopUp2(mobiledriver);

        gaiaHelper.AcceptAlerts(mobiledriver);

        gaiaHelper.Wait3();

        gaiaHelper.AcceptAlerts(mobiledriver);

        loginPage.clickForgotPassword(mobiledriver);

        loginPage.enterEmailPopUp(mobiledriver, Email);

        loginPage.clickResetPopUp(mobiledriver);

        loginPage.clickClosePopUp(mobiledriver);

    }
}
