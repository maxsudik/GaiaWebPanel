package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddNewEmployeePage {

    public AddNewEmployeePage clickCompanyName(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/p[1]/span[1]/select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[contains(text(),'July23LandscapeEdited')]"));
        element.click();
        return this;
    }

    public AddNewEmployeePage clickRoleManager(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//form//div[2]//p[1]//span[1]//select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='manager']"));
        element.click();
        return this;
    }

    public AddNewEmployeePage clickRoleSupervisor(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//form//div[2]//p[1]//span[1]//select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='supervisor']"));
        element.click();
        return this;
    }

    public AddNewEmployeePage clickRoleInstaller(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//form//div[2]//p[1]//span[1]//select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='installer']"));
        element.click();
        return this;
    }

    public AddNewEmployeePage clickRoleSalesPerson(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//form//div[2]//p[1]//span[1]//select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='salesperson']"));
        element.click();
        return this;
    }

    public AddNewEmployeePage enterFirstName(WebDriver driver, String FirstName) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        element.sendKeys(FirstName);
        return this;
    }

    public AddNewEmployeePage enterLastName(WebDriver driver, String LastName) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        element.sendKeys(LastName);
        return this;
    }

    public AddNewEmployeePage enterNotes(WebDriver driver, String Notes) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Notes']"));
        element.sendKeys(Notes);
        return this;
    }

    public AddNewEmployeePage enterEmail(WebDriver driver, String Email) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        element.sendKeys(Email);
        return this;
    }

    public AddNewEmployeePage enterPassword(WebDriver driver, String Password) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        element.sendKeys(Password);
        return this;
    }

    public AddNewEmployeePage enterRepeatPassword(WebDriver driver, String RepeatPassword) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Repeat Password']"));
        element.sendKeys(RepeatPassword);
        return this;
    }

    public AddNewEmployeePage clickRestrictedAccess(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Restricted Access')]"));
        element.click();
        return this;
    }

    public AddNewEmployeePage clickLicensedUser(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Licensed User')]"));
        element.click();
        return this;
    }

    public AddNewEmployeePage clickAbilityLogininMultipleDevices(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[@class='el-checkbox__label']"));
        element.click();
        return this;
    }

    public AddNewEmployeePage clickAdd(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[@class='button is-success']"));
        element.click();
        return this;
}

    public AddNewEmployeePage clickCancel(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//p[contains(text(),'Cancel')]"));
        element.click();
        return this;
    }
}

