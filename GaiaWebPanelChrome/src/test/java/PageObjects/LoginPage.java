package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public LoginPage setName (WebDriver driver, String LoginName) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        element.clear();
        element.sendKeys(LoginName);
        return this;
    }

    public LoginPage setPassword (WebDriver driver, String PasswordName) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        element.clear();
        element.sendKeys(PasswordName);
        return this;
    }

    public LoginPage clickLogin (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[@class='button is-success']"));
        element.click();
        return this;
    }

    public LoginPage clickMainSite (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[@class='button is-light main-site']"));
        element.click();
        return this;
    }

    public LoginPage clickLanguage (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("///a[@class='button is-success is-outlined']"));
        element.click();
        return this;
    }

    public LoginPage clickForgotPassword (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password')]"));
        element.click();
        return this;
    }

    public LoginPage clickOkPopUpErrorInvalidLoginOrPassword (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'OK')]"));
        element.click();
        return this;
    }

    public LoginPage clickContinueButton (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[@class='button is-success']"));
        element.click();
        return this;
    }
}
