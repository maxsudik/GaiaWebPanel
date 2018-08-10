package IOS.PageObjects;

import WEB.Helper.GaiaHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static io.appium.java_client.touch.offset.PointOption.point;

public class OnboardingManager {


    public OnboardingManager clickScanId (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("scanId")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("scanId");
        element.click();
        return this;
    }

    public OnboardingManager clickSelectFromLibrary (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Select from Library")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Select from Library");
        element.click();
        return this;
    }

    public OnboardingManager clickMoments (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Moments")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Moments");
        element.click();
        return this;
    }

    public OnboardingManager clickPhoto (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Photo, Landscape, October 09, 2009, 2:09 PM")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Photo, Landscape, October 09, 2009, 2:09 PM");
        element.click();
        return this;
    }

    public OnboardingManager clickSkip (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Skip")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Skip");
        element.click();
        return this;
    }

    public OnboardingManager enterCompanyAddressLine1 (IOSDriver mobiledriver, String ComapanyAddressLine1) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Address Field")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Address Field");
        element.click();
        element.sendKeys(ComapanyAddressLine1);
        return this;
}

    public OnboardingManager enterCompanyAddressLine2 (IOSDriver mobiledriver, String CompanyAddressLine2) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[1]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[1]");
        element.click();
        element.sendKeys(CompanyAddressLine2);
        return this;
        }

    public OnboardingManager enterCompanyCity (IOSDriver mobiledriver, String CompanyCity) {

    WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[2]")));
    MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[2]");
    element.click();
    element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[2]");
    element.sendKeys(CompanyCity);
    return this;
    }

    public OnboardingManager clickCompanyCountry (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[1]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[1]");
        element.click();
        wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Canada")));
        element = (MobileElement) mobiledriver.findElementById("Canada");
        element.click();
        return this;
        }

    public OnboardingManager clickCompanyStateProvince (IOSDriver mobiledriver) {
        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[2]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[2]");
        element.click();
        //!!!!!!!!!!!!!!! can't pick british columbia InSPECT 'id British Columbia' should be used have to find out how to swipe
        wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Alberta")));
        element = (MobileElement) mobiledriver.findElementByAccessibilityId("Alberta");
        element.click();
        return this;
        }

    public OnboardingManager enterCompanyZipPostalCode (IOSDriver mobiledriver, String CompanyZipPostalCode) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[3]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[3]");
        element.click();
        element.sendKeys(CompanyZipPostalCode);
        return this;
        }

    public OnboardingManager clickConfirm (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Confirm")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Confirm");
        element.click();
        return this;
        }

    public OnboardingManager enterInstitutionNumber (IOSDriver mobiledriver, String InstitutionNumber) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Address Field")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Address Field");
        element.click();
        element.sendKeys(InstitutionNumber);
        return this;
        }

    public OnboardingManager enterTransitNumber (IOSDriver mobiledriver, String TransitNumber) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[1]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[1]");
        element.click();
        element.sendKeys(TransitNumber);
        return this;
        }

    public OnboardingManager enterCompanyCreditCardNumber (IOSDriver mobiledriver, String CreditCardNumber) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[2]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[2]");
        element.click();
        element.sendKeys(CreditCardNumber);
        return this;
        }

    public OnboardingManager enterAccountHolderName (IOSDriver mobiledriver, String AccountHolderName) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[3]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[3]");
        element.click();
        element.sendKeys(AccountHolderName);
        return this;
        }

    public OnboardingManager clickCompany (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CurrencyDropDown")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("CurrencyDropDown");
        element.click();
        wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Company")));
        element = (MobileElement) mobiledriver.findElementByAccessibilityId("Company");
        element.click();
        return this;
        }

    public OnboardingManager clickAuthenticate (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Authenticate")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Authenticate");
        element.click();
        return this;
        }

    public OnboardingManager enterFirstName (IOSDriver mobiledriver, String FirstName) {
        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[1]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[1]");
        element.click();
        element.sendKeys(FirstName);
        return this;
        }

    public OnboardingManager enterLastName (IOSDriver mobiledriver, String LastName) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[2]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[2]");
        element.click();
        element.sendKeys(LastName);
        return this;
        }

    public OnboardingManager setDateOfBirth (IOSDriver mobiledriver) {

        GaiaHelper gaiaHelper = new GaiaHelper();

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[3]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[3]");
        element.click();
        gaiaHelper.Wait3();
        TouchAction action = new TouchAction(mobiledriver);
        action.press(point(609,1340));
        action.moveTo(point(607,1160));
        action.release();
        action.perform();
        gaiaHelper.Wait3();
        action.press(point(530,1340));
        action.moveTo(point(530,1160));
        action.release();
        action.perform();
        gaiaHelper.Wait3();
        action.press(point(410,1340));
        action.moveTo(point(410,1160));
        action.release();
        action.perform();
        gaiaHelper.Wait3();
        action.tap(point(973, 1065));
        action.perform();
        return this;
        }

    public OnboardingManager enterAddressLine1 (IOSDriver mobiledriver, String AddressLine1) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Address Field")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Address Field");
        element.click();
        element.sendKeys(AddressLine1);
        return this;
        }

    public OnboardingManager enterAddressLine2 (IOSDriver mobiledriver, String AddressLine2) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[4]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[4]");
        element.click();
        element.sendKeys(AddressLine2);
        return this;
        }

    public OnboardingManager enterCity (IOSDriver mobiledriver, String City) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        ////!!!!!!!!!!!
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[5]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[5]");
        element.click();
        element.sendKeys(City);
        return this;
        }

    public OnboardingManager clickCountry (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[1]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[1]");
        element.click();
        wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Canada")));
        element = (MobileElement) mobiledriver.findElementByAccessibilityId("Canada");
        element.click();
        return this;
        }

    public OnboardingManager clickStateProvince (IOSDriver mobiledriver) {
        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[2]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[2]");
        element.click();
        TouchAction action = new TouchAction(mobiledriver);
        action.tap(point(973, 1065));
        action.perform();
        wait = new WebDriverWait(mobiledriver, 10);
        //Invisible DDLMI - BC! check how to scroll to it!!!!!!!!!!!!!!!!!
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Alberta")));
        element = (MobileElement) mobiledriver.findElementByAccessibilityId("Alberta");
        element.click();
        return this;
        }

    public OnboardingManager enterZipPostalCode (IOSDriver mobiledriver, String ZipPostalCode) {

        GaiaHelper gaiaHelper = new GaiaHelper();

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[6]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[6]");
        element.click();
        element.sendKeys(ZipPostalCode);
        gaiaHelper.Wait3();
        TouchAction action = new TouchAction(mobiledriver);
        action.tap(point(980, 958));
        action.perform();
        return this;
        }

    public OnboardingManager clickAuthenticate2 (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Authenticate")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Authenticate");
        element.click();
        return this;
        }

    public OnboardingManager clickScanCreditCard (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Button")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Button");
        element.click();
        return this;
        }

    public OnboardingManager enterCreditCardNumber2 (IOSDriver mobiledriver, String CreditCardNumber2) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField");
        element.click();
        element.sendKeys(CreditCardNumber2);
        return this;
        }

    public OnboardingManager enterExpirationDate (IOSDriver mobiledriver, String ExpirationDate) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField[2]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField[2]");
        element.click();
        element.sendKeys(ExpirationDate);
        return this;
        }

    public OnboardingManager enterCVV (IOSDriver mobiledriver, String CVV) {

        GaiaHelper gaiaHelper = new GaiaHelper();

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField[1]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField[1]");
        element.click();
        element.sendKeys(CVV);
        gaiaHelper.Wait3();
        //CHECK DONE BUTTON!!!!!!!!!
        TouchAction action = new TouchAction(mobiledriver);
        action.tap(point(738, 393));
        action.perform();
        gaiaHelper.Wait3();
        return this;
        }

    public OnboardingManager enterNameOnCard (IOSDriver mobiledriver, String NameOnCard) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[1]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[1]");
        element.click();
        element.sendKeys(NameOnCard);
        return this;
        }

    //There is no line for LICENSES because it's not trackable!!!!!!!!!!!!!!!

    public OnboardingManager enterCreditCardAddressLine1 (IOSDriver mobiledriver, String CreditCardAddressLine1) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Address Field")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Address Field");
        element.click();
        element.sendKeys(CreditCardAddressLine1);
        return this;
        }

    public OnboardingManager enterCreditCardAddressLine2 (IOSDriver mobiledriver, String CreditCardAddressLine2) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[4]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[4]");
        element.click();
        element.sendKeys(CreditCardAddressLine2);
        return this;
        }

    public OnboardingManager enterCreditCardCity (IOSDriver mobiledriver, String CreditCardCity) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[5]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[5]");
        element.click();
        element.sendKeys(CreditCardCity);
        return this;
        }

    public OnboardingManager clickCreditCardCountry (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[4]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[4]");
        element.click();
        wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Canada")));
        element = (MobileElement) mobiledriver.findElementByAccessibilityId("Canada");
        element.click();
        return this;
        }

    public OnboardingManager clickCreditCardStateProvince (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[5]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeButton[@name=\"CurrencyDropDown\"])[5]");
        element.click();
        TouchAction action = new TouchAction(mobiledriver);
        action.tap(point(980, 958));
        action.perform();
        wait = new WebDriverWait(mobiledriver, 10);
        //Invisible BC. Check scrolling. ID - British Columbia
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Alberta")));
        element = (MobileElement) mobiledriver.findElementByAccessibilityId("Alberta");
        element.click();
        action.tap(point(980, 958));
        action.perform();
        return this;
        }

    public OnboardingManager enterCreditCardZipPostalCode (IOSDriver mobiledriver, String CreditCardZipPostalCode) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[6]")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("(//XCUIElementTypeTextField[@name=\"Product Name Field\"])[6]");
        element.click();
        element.sendKeys(CreditCardZipPostalCode);
        TouchAction action = new TouchAction(mobiledriver);
        action.tap(point(980, 958));
        action.perform();
        return this;
        }

    public OnboardingManager clickRegister (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Register")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Register");
        element.click();
        return this;
        }
}
