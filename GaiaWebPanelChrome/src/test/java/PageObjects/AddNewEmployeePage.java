package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AddNewEmployeePage {

    public AddNewEmployeePage clickCompanyName(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/p[1]/span[1]/select[1]")));
        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/p[1]/span[1]/select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'July23Landscape')]")));
        element = driver.findElement(By.xpath("//option[contains(text(),'July23Landscape')]"));
        element.click();
        return this;
    }

    public AddNewEmployeePage clickRoleManager(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form//div[2]//p[1]//span[1]//select[1]")));
        WebElement element = driver.findElement(By.xpath("//form//div[2]//p[1]//span[1]//select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='manager']")));
        element = driver.findElement(By.xpath("//option[@value='manager']"));
        element.click();
        return this;
    }

    public AddNewEmployeePage clickRoleManager2(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='select']//select")));
        WebElement element = driver.findElement(By.xpath("//span[@class='select']//select"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='manager']")));
        element = driver.findElement(By.xpath("//option[@value='manager']"));
        element.click();
        return this;
    }

    public AddNewEmployeePage clickRoleSupervisor(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form//div[2]//p[1]//span[1]//select[1]")));
        WebElement element = driver.findElement(By.xpath("//form//div[2]//p[1]//span[1]//select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='supervisor']")));
        element = driver.findElement(By.xpath("//option[@value='supervisor']"));
        element.click();
        return this;
    }

    public AddNewEmployeePage clickRoleInstaller(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form//div[2]//p[1]//span[1]//select[1]")));
        WebElement element = driver.findElement(By.xpath("//form//div[2]//p[1]//span[1]//select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='installer']")));
        element = driver.findElement(By.xpath("//option[@value='installer']"));
        element.click();
        return this;
    }

    public AddNewEmployeePage clickRoleSalesPerson(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form//div[2]//p[1]//span[1]//select[1]")));
        WebElement element = driver.findElement(By.xpath("//form//div[2]//p[1]//span[1]//select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='salesperson']")));
        element = driver.findElement(By.xpath("//option[@value='salesperson']"));
        element.click();
        return this;
    }

    public AddNewEmployeePage enterFirstName(WebDriver driver, String FirstName) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First Name']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        element.clear();
        element.sendKeys(FirstName);
        return this;
    }

    public AddNewEmployeePage enterLastName(WebDriver driver, String LastName) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Last Name']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        element.clear();
        element.sendKeys(LastName);
        return this;
    }

    public AddNewEmployeePage enterNotes(WebDriver driver, String Notes) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Notes']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Notes']"));
        element.clear();
        element.sendKeys(Notes);
        return this;
    }

    public AddNewEmployeePage enterEmail(WebDriver driver, String Email) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Email']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        element.clear();
        element.sendKeys(Email);
        return this;
    }

    public AddNewEmployeePage enterPassword(WebDriver driver, String Password) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        element.clear();
        element.sendKeys(Password);
        return this;
    }

    public AddNewEmployeePage enterRepeatPassword(WebDriver driver, String RepeatPassword) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Repeat Password']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Repeat Password']"));
        element.clear();
        element.sendKeys(RepeatPassword);
        return this;
    }

    public AddNewEmployeePage clickRestrictedAccess(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Restricted Access')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Restricted Access')]"));
        element.click();
        return this;
    }

    public AddNewEmployeePage clickLicensedUser(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Licensed User')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Licensed User')]"));
        element.click();
        return this;
    }

    public AddNewEmployeePage clickAbilityLogininMultipleDevices(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='el-checkbox__label']")));
        WebElement element = driver.findElement(By.xpath("//span[@class='el-checkbox__label']"));
        element.click();
        return this;
    }

    public AddNewEmployeePage clickAdd(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button is-success']")));
        WebElement element = driver.findElement(By.xpath("//button[@class='button is-success']"));
        element.click();
        return this;
}

    public AddNewEmployeePage clickCancel(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Cancel')]")));
        WebElement element = driver.findElement(By.xpath("//p[contains(text(),'Cancel')]"));
        element.click();
        return this;
    }

    public AddNewEmployeePage enterLicenseLimit(WebDriver driver) {

        for (int i=0; i<8; i++) {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='arrow-top']")));
            WebElement element = driver.findElement(By.xpath("//img[@class='arrow-top']"));
            element.click();
            //Add delay 1 sec
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return this;
    }

    public AddNewEmployeePage clickUpdatePopUp(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='input is-success button']")));
        WebElement element = driver.findElement(By.xpath("//button[@class='input is-success button']"));
        element.click();
        return this;
    }
}

