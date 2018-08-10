package IOS.PageObjects;


import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static io.appium.java_client.touch.offset.PointOption.point;

public class LoginPage {

    public LoginPage waitForSystemPopUp(IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Always Allow")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public LoginPage waitForSystemPopUp2(IOSDriver mobiledriver) {

        try {
        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Allow")));
    } catch (Exception e) {
        e.printStackTrace();
    }
        return this;
    }

    public LoginPage clickAllowLocation(IOSDriver mobiledriver) {

        TouchAction action = new TouchAction(mobiledriver);
        action.tap(point(504, 740)).perform();
        return this;
    }

    public LoginPage clickAllowNotifications(IOSDriver mobiledriver) {

        TouchAction action = new TouchAction(mobiledriver);
        action.tap(point(584, 746)).perform();
        return this;
    }

    public LoginPage setName(IOSDriver mobiledriver, String LoginName) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField");
        element.click();
        element.sendKeys(LoginName);
        return this;
    }

    public LoginPage setPassword(IOSDriver mobiledriver, String PasswordName) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Gaia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField");
        element.click();
        element.sendKeys(PasswordName);
        return this;
    }

    public LoginPage clickRememberMe (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Remember Me")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Remember Me");
        element.click();
        return this;
    }

    public LoginPage clickForgotPassword (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Forgot Password")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Forgot Password");
        element.click();
        return this;
        }

    public LoginPage enterEmailPopUp (IOSDriver mobiledriver, String Email) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeOther[@name=\"SCLAlertView\"]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField")));
        MobileElement element = (MobileElement) mobiledriver.findElementByXPath("//XCUIElementTypeOther[@name=\"SCLAlertView\"]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
        element.click();
        element.sendKeys(Email);
        return this;
        }

    public LoginPage clickResetPopUp (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Reset")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Reset");
        element.click();
        return this;
        }

    public LoginPage clickClosePopUp (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Close")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Close");
        element.click();
        return this;
    }

    public LoginPage clickAuthenticate (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Authenticate")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Authenticate");
        element.click();
        return this;
    }

    public LoginPage clickGo (IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Go")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("Go");
        element.click();
        return this;
    }
}
