
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import static io.appium.java_client.touch.offset.PointOption.point;

public class LoginPage {

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
        //capabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, Boolean.TRUE);
        capabilities.setCapability("newCommandTimeout", 20);
        mobiledriver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @AfterTest
    public void afterTest() {
        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mobiledriver.quit();
    }

    @Test
    public void loginPage() {

        TouchAction action = new TouchAction(mobiledriver);
        action.tap(point(504, 740)).perform();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        action.tap(point(584, 746)).perform();

        WebDriverWait wait = new WebDriverWait(mobiledriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")));
        MobileElement el1 = (MobileElement) mobiledriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField");
        el1.click();
        el1.sendKeys("manager.august.02");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField")));
        MobileElement el2 = (MobileElement) mobiledriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField");
        el2.click();
        el2.sendKeys("password11");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Remember Me")));
        MobileElement el3 = (MobileElement) mobiledriver.findElementByAccessibilityId("Remember Me");
        el3.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Authenticate")));
        MobileElement el4 = (MobileElement) mobiledriver.findElementByAccessibilityId("Authenticate");
        el4.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Go")));
        MobileElement el5 = (MobileElement) mobiledriver.findElementByAccessibilityId("Go");
        el5.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void scanID() {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("scanId")));
        MobileElement el6 = (MobileElement) mobiledriver.findElementByAccessibilityId("scanId");
        el6.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Select from Library")));
        MobileElement el7 = (MobileElement) mobiledriver.findElementByAccessibilityId("Select from Library");
        el7.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Moments")));
        MobileElement el8 = (MobileElement) mobiledriver.findElementByAccessibilityId("Moments");
        el8.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Photo, Landscape, October 09, 2009, 2:09 PM")));
        MobileElement el9 = (MobileElement) mobiledriver.findElementByAccessibilityId("Photo, Landscape, October 09, 2009, 2:09 PM");
        el9.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("scanId")));
        MobileElement el10 = (MobileElement) mobiledriver.findElementByAccessibilityId("scanId");
        el10.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Skip")));
        MobileElement el11 = (MobileElement) mobiledriver.findElementByAccessibilityId("Skip");
        el11.click();
        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void completeYourCompanyAddress() {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Address Field")));
        MobileElement el12 = (MobileElement) mobiledriver.findElementByAccessibilityId("Address Field");
        el12.click();
        el12.sendKeys("Suite 111");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[1]")));
        MobileElement el13 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[1]");
        el13.click();
        el13.sendKeys("1st St");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[2]")));
        MobileElement el14 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[2]");
        el14.click();
        MobileElement el15 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[2]");
        el15.sendKeys("Vancouver");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[1]")));
        MobileElement el16 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[1]");
        el16.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Canada")));
        MobileElement el17 = (MobileElement) mobiledriver.findElementById("Canada");
        el17.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[2]")));
        MobileElement el18 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[2]");
        el18.click();

        //!!!!!!!!!!!!!!! can't pick british columbia InSPECT 'id British Columbia' should be used have to find out how to swipe
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Alberta")));
        MobileElement el19 = (MobileElement) mobiledriver.findElementByAccessibilityId("Alberta");
        el19.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[3]")));
        MobileElement el20 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[3]");
        el20.click();
        el20.sendKeys("V0V0V0");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Confirm")));
        MobileElement el21 = (MobileElement) mobiledriver.findElementByAccessibilityId("Confirm");
        el21.click();

        //Add delay 5 sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void completeCompanysBankInformation(){

        WebDriverWait wait = new WebDriverWait(mobiledriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Address Field")));
        MobileElement el2 = (MobileElement) mobiledriver.findElementByAccessibilityId("Address Field");
        el2.click();
        el2.sendKeys("000");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[1]")));
        MobileElement el3 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[1]");
        el3.click();
        el3.sendKeys("11000");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[2]")));
        MobileElement el4 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[2]");
        el4.click();
        el4.sendKeys("000123456789");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[3]")));
        MobileElement el5 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[3]");
        el5.click();
        el5.sendKeys("AccountHolderName");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CurrencyDropDown")));
        MobileElement el6 = (MobileElement) mobiledriver.findElementByAccessibilityId("CurrencyDropDown");
        el6.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Company")));
        MobileElement el7 = (MobileElement) mobiledriver.findElementByAccessibilityId("Company");
        el7.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Authenticate")));
        MobileElement el8 = (MobileElement) mobiledriver.findElementByAccessibilityId("Authenticate");
        el8.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void legalEntityVerification(){

        WebDriverWait wait = new WebDriverWait(mobiledriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[1]")));
        MobileElement el1 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[1]");
        el1.click();
        el1.sendKeys("FirstName");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[2]")));
        MobileElement el2 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[2]");
        el2.click();
        el2.sendKeys("LastName");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[3]")));
        MobileElement el3 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[3]");
        el3.click();

        //Add delay 1.5 sec
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        TouchAction action = new TouchAction(mobiledriver);
                action.press(point(609,1340));
                action.moveTo(point(607,1160));
                action.release();
                action.perform();

        //Add delay 1.5 sec
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

                action.press(point(530,1340));
                action.moveTo(point(530,1160));
                action.release();
                action.perform();

        //Add delay 1.5 sec
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

                action.press(point(410,1340));
                action.moveTo(point(410,1160));
                action.release();
                action.perform();

        //Add delay 1.5 sec
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        action.tap(point(973, 1065));
        action.perform();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Address Field")));
        MobileElement el4 = (MobileElement) mobiledriver.findElementByAccessibilityId("Address Field");
        el4.click();
        el4.sendKeys("Suite 111");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[4]")));
        MobileElement el5 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[4]");
        el5.click();
        el5.sendKeys("1st ST");
        ////!!!!!!!!!!!
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[5]")));
        MobileElement el6 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[5]");
        el6.click();
        el6.sendKeys("Vancouver");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[1]")));
        MobileElement el7 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[1]");
        el7.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Canada")));
        MobileElement el10 = (MobileElement) mobiledriver.findElementByAccessibilityId("Canada");
        el10.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[2]")));
        MobileElement el11 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[2]");
        el11.click();

        action.tap(point(973, 1065));
        action.perform();

        //Invisible DDLMI - BC! check how to scroll to it!!!!!!!!!!!!!!!!!
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Alberta")));
        MobileElement el12 = (MobileElement) mobiledriver.findElementByAccessibilityId("Alberta");
        el12.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[6]")));
        MobileElement el13 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[6]");
        el13.click();
        el13.sendKeys("V0V0V0");

        //Add delay 3 sec
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        action.tap(point(980, 958));
        action.perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Authenticate")));
        MobileElement el14 = (MobileElement) mobiledriver.findElementByAccessibilityId("Authenticate");
        el14.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void scanCreditCard(){

        WebDriverWait wait = new WebDriverWait(mobiledriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Button")));
        MobileElement el1 = (MobileElement) mobiledriver.findElementByAccessibilityId("Button");
        el1.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField")));
        MobileElement el2 = (MobileElement) mobiledriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField");
        el2.click();
        el2.sendKeys("4111111111111111");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField[2]")));
        MobileElement el3 = (MobileElement) mobiledriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField[2]");
        el3.click();
        el3.sendKeys("1229");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField[1]")));
        MobileElement el4 = (MobileElement) mobiledriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField[1]");
        el4.click();
        el4.sendKeys("123");

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            //CHECK DONE BUTTON!!!!!!!!!
            TouchAction action = new TouchAction(mobiledriver);
            action.tap(point(738, 393));
            action.perform();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[1]")));
        MobileElement el0 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[1]");
        el0.click();
        el0.sendKeys("NameOnCard");

        //There is no line for LICENSES because it's not trackable!!!!!!!!!!!!!!!

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Address Field")));
        MobileElement el22 = (MobileElement) mobiledriver.findElementByAccessibilityId("Address Field");
        el22.click();
        el3.sendKeys("Suite 111");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[4]")));
        MobileElement el23 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[4]");
        el23.click();
        el4.sendKeys("1st ST");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[5]")));
        MobileElement el5 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[5]");
        el5.click();
        el5.sendKeys("Vancouver");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[4]")));
        MobileElement el6 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[4]");
        el6.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Canada")));
        MobileElement el7 = (MobileElement) mobiledriver.findElementByAccessibilityId("Canada");
        el7.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[5]")));
        MobileElement el8 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[5]");
        el8.click();

        action.tap(point(980, 958));
        action.perform();

        //Invisible BC. Check scrolling. ID - British Columbia
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Alberta")));
        MobileElement el9 = (MobileElement) mobiledriver.findElementByAccessibilityId("Alberta");
        el9.click();

        action.tap(point(980, 958));
        action.perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[6]")));
        MobileElement el10 = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[6]");
        el10.click();
        el10.sendKeys("V0V0V0");

        action.tap(point(980, 958));
        action.perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Register")));
        MobileElement el11 = (MobileElement) mobiledriver.findElementByAccessibilityId("Register");
        el11.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void gaiaHomePage() {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gaia logo")));
        MobileElement el1 = (MobileElement) mobiledriver.findElementByAccessibilityId("gaia logo");
        el1.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Yes")));
        MobileElement el2 = (MobileElement) mobiledriver.findElementByAccessibilityId("Yes");
        el2.click();
    }
}
