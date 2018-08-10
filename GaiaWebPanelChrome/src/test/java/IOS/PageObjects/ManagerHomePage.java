package IOS.PageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagerHomePage {

    public ManagerHomePage clickLogout(IOSDriver mobiledriver) {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gaia logo")));
        MobileElement element = (MobileElement) mobiledriver.findElementByAccessibilityId("gaia logo");
        element.click();
        wait = new WebDriverWait(mobiledriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Yes")));
        element = (MobileElement) mobiledriver.findElementByAccessibilityId("Yes");
        element.click();
        return this;
        }
}