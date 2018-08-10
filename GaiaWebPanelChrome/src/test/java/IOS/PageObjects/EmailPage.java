package IOS.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailPage {

    public EmailPage setName (WebDriver driver, String LoginName) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rcmloginuser']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='rcmloginuser']"));
        element.clear();
        element.sendKeys(LoginName);
        return this;
    }

    public EmailPage setPassword (WebDriver driver, String PasswordName) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rcmloginpwd']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='rcmloginpwd']"));
        element.clear();
        element.sendKeys(PasswordName);
        return this;
    }

    public EmailPage clickLogin (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rcmloginsubmit")));
        WebElement element = driver.findElement(By.id("rcmloginsubmit"));
        element.click();
        return this;
    }

    public EmailPage clickEmail (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='./?_task=mail&_mbox=INBOX&_uid=520&_action=show']//span[contains(text(),'Reset your Gaia password')]")));
        WebElement element = driver.findElement(By.xpath("//a[@href='./?_task=mail&_mbox=INBOX&_uid=520&_action=show']//span[contains(text(),'Reset your Gaia password')]"));
        element.click();
        element.click();
        return this;
    }

    public EmailPage clickResetPassword (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='hc-button']")));
        WebElement element = driver.findElement(By.xpath("//a[@class='hc-button']"));
        element.click();
        return this;
    }

    //Locators are not visible!!!!!!!!!!!!
    public EmailPage setNewPassword (WebDriver driver, String NewPassword) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[2]/br[1]")));
        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[2]/br[1]"));
        element.click();
        element.sendKeys(NewPassword);
        return this;
    }
    //Locators are not visible!!!!!!!!!!!!
    public EmailPage confirmNewPassword (WebDriver driver, String ConfirmNewPassword) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Confirm Password")));
        WebElement element = driver.findElement(By.name("Confirm Password"));
        element.clear();
        element.sendKeys(ConfirmNewPassword);
        return this;
    }

    public EmailPage clickReset (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button is-primary is-medium']")));
        WebElement element = driver.findElement(By.xpath("//button[@class='button is-primary is-medium']"));
        element.click();
        return this;
    }

    public EmailPage clickHereToLogin (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Click here to login')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Click here to login')]"));
        element.click();
        return this;
    }

}