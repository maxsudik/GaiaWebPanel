package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public LoginPage setAdminName (WebDriver driver, String LoginName) {

        //Find the username field
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        //Enter username
        element.sendKeys(LoginName);
        return this;
    }

    public LoginPage setAdminPassword (WebDriver driver, String PasswordName) {

        //Find the password field
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        //Enter password
        element.sendKeys(PasswordName);
        return this;
    }

    public LoginPage clickLoginButton (WebDriver driver) {

        //Find Login button
        WebElement element = driver.findElement(By.xpath("//button[@class='button is-success']"));
        //Click Login button
        element.click();
        return this;
    }
    public LoginPage clickMainSiteButton (WebDriver driver) {

        //Find Main Site button
        WebElement element = driver.findElement(By.xpath("//button[@class='button is-light main-site']"));
        //Click Main Site button
        element.click();
        return this;
    }

    public LoginPage clickLanguageButton (WebDriver driver) {

        //Find Language button
        WebElement element = driver.findElement(By.xpath("///a[@class='button is-success is-outlined']"));
        //Click Language button
        element.click();
        return this;
    }

    public LoginPage forgotPasswordButton (WebDriver driver) {

        //Find Forgot Password button
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password')]"));
        //Click Forgot Password button
        element.click();
        return this;
    }

    public LoginPage clickContinueButton (WebDriver driver) {

        //Find Continue button
        WebElement element = driver.findElement(By.xpath("//button[@class='button is-success']"));
        //Click Continue button
        element.click();
        return this;
    }
}
