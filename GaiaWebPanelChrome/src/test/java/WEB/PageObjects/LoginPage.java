package WEB.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public LoginPage setName (WebDriver driver, String LoginName) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        element.clear();
        element.sendKeys(LoginName);
        return this;
    }

    public LoginPage setPassword (WebDriver driver, String PasswordName) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        element.clear();
        element.sendKeys(PasswordName);
        return this;
    }

    public LoginPage clickLogin (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button is-success']")));
        WebElement element = driver.findElement(By.xpath("//button[@class='button is-success']"));
        element.click();
        return this;
    }

    public LoginPage clickMainSite (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button is-light main-site']")));
        WebElement element = driver.findElement(By.xpath("//button[@class='button is-light main-site']"));
        element.click();
        return this;
    }

    public LoginPage clickLanguage (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("///a[@class='button is-success is-outlined']")));
        WebElement element = driver.findElement(By.xpath("///a[@class='button is-success is-outlined']"));
        element.click();
        return this;
    }

    public LoginPage clickForgotPassword (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Forgot Password')]")));
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password')]"));
        element.click();
        return this;
    }

    public LoginPage clickOkPopUpErrorInvalidLoginOrPassword (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'OK')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'OK')]"));
        element.click();
        return this;
    }

    public LoginPage clickContinueButton (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button is-success']")));
        WebElement element = driver.findElement(By.xpath("//button[@class='button is-success']"));
        element.click();
        return this;
    }
}
