package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class EditEmployeePage {

    public EditEmployeePage clickCompanyName(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/p[1]/span[1]/select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[contains(text(),'July23Landscape')]"));
        element.click();
        return this;
    }

    public EditEmployeePage clickRoleManager(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//form//div[2]//p[1]//span[1]//select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='manager']"));
        element.click();
        return this;
    }

    public EditEmployeePage clickRoleSupervisor(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//form//div[2]//p[1]//span[1]//select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='supervisor']"));
        element.click();
        return this;
    }

    public EditEmployeePage clickRoleInstaller(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//form//div[2]//p[1]//span[1]//select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='installer']"));
        element.click();
        return this;
    }

    public EditEmployeePage clickRoleSalesPerson(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//form//div[2]//p[1]//span[1]//select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='salesperson']"));
        element.click();
        return this;
    }

    public EditEmployeePage enterFirstName(WebDriver driver, String EditedFirstName) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        element.click();
        element.clear();
        element.sendKeys(EditedFirstName);
        return this;
    }

    public EditEmployeePage enterLastName(WebDriver driver, String EditedLastName) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        element.click();
        element.clear();
        element.sendKeys(EditedLastName);
        return this;
    }

    public EditEmployeePage enterNotes(WebDriver driver, String EditedNotes) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Notes']"));
        element.click();
        element.clear();
        element.sendKeys(EditedNotes);
        return this;
    }

    public EditEmployeePage enterEmail(WebDriver driver, String EditedEmail) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        element.click();
        element.clear();
        element.sendKeys(EditedEmail);
        return this;
    }

    public EditEmployeePage clickEditPassword(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[@class='tag is-info']"));
        element.click();
        return this;
    }

    public EditEmployeePage clickClose(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[@class='tag is-warning']"));
        element.click();
        return this;
    }

    public EditEmployeePage enterPassword(WebDriver driver, String EditedPassword) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        element.click();
        element.clear();
        element.sendKeys(EditedPassword);
        return this;
    }

    public EditEmployeePage enterRepeatPassword(WebDriver driver, String EditedRepeatPassword) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Repeat Password']"));
        element.click();
        element.clear();
        element.sendKeys(EditedRepeatPassword);
        return this;
    }

    public EditEmployeePage clickRestrictedAccess(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Restricted Access')]"));
        element.click();
        return this;
    }

    public EditEmployeePage clickLicensedUser(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Licensed User')]"));
        element.click();
        return this;
    }

    public EditEmployeePage clickAbilityLogininMultipleDevices(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[@class='el-checkbox__label']"));
        element.click();
        return this;
    }

    public EditEmployeePage clickUpdate(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[@class='button is-success']"));
        element.click();
        return this;
}

    public EditEmployeePage clickBack(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[@class='button']"));
        element.click();
        return this;
    }

    public EditEmployeePage clickStayPopUpWarning(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Stay')]"));
        element.click();
        return this;
    }

    public EditEmployeePage clickLeavePopUpWarning(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Leave')]"));
        element.click();
        return this;
    }

    public EditEmployeePage clickDeleteEmployee(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[@class='button is-danger is-inverted']"));
        element.click();
        return this;
    }

    public EditEmployeePage clickCancelDeletePopUp(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
        element.click();
        return this;
    }

    public EditEmployeePage clickDeletePopUp(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        element.click();
        return this;
    }
}

