package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EditEmployeePage {

    public EditEmployeePage clickCompanyName(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/p[1]/span[1]/select[1]")));
        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/p[1]/span[1]/select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'July23Landscape')]")));
        element = driver.findElement(By.xpath("//option[contains(text(),'July23Landscape')]"));
        element.click();
        return this;
    }

    public EditEmployeePage clickRoleManager(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form//div[2]//p[1]//span[1]//select[1]")));
        WebElement element = driver.findElement(By.xpath("//form//div[2]//p[1]//span[1]//select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='manager']")));
        element = driver.findElement(By.xpath("//option[@value='manager']"));
        element.click();
        return this;
    }

    public EditEmployeePage clickRoleSupervisor(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form//div[2]//p[1]//span[1]//select[1]")));
        WebElement element = driver.findElement(By.xpath("//form//div[2]//p[1]//span[1]//select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/option[@value='supervisor']")));
        element = driver.findElement(By.xpath("//option[@value='supervisor']"));
        element.click();
        return this;
    }

    public EditEmployeePage clickRoleInstaller(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form//div[2]//p[1]//span[1]//select[1]")));
        WebElement element = driver.findElement(By.xpath("//form//div[2]//p[1]//span[1]//select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='installer']")));
        element = driver.findElement(By.xpath("//option[@value='installer']"));
        element.click();
        return this;
    }

    public EditEmployeePage clickRoleSalesPerson(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form//div[2]//p[1]//span[1]//select[1]")));
        WebElement element = driver.findElement(By.xpath("//form//div[2]//p[1]//span[1]//select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='salesperson']")));
        element = driver.findElement(By.xpath("//option[@value='salesperson']"));
        element.click();
        return this;
    }

    public EditEmployeePage enterFirstName(WebDriver driver, String EditedFirstName) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First Name']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        element.click();
        element.clear();
        element.sendKeys(EditedFirstName);
        return this;
    }

    public EditEmployeePage enterLastName(WebDriver driver, String EditedLastName) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Last Name']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        element.click();
        element.clear();
        element.sendKeys(EditedLastName);
        return this;
    }

    public EditEmployeePage enterNotes(WebDriver driver, String EditedNotes) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Notes']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Notes']"));
        element.click();
        element.clear();
        element.sendKeys(EditedNotes);
        return this;
    }

    public EditEmployeePage enterEmail(WebDriver driver, String EditedEmail) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Email']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        element.click();
        element.clear();
        element.sendKeys(EditedEmail);
        return this;
    }

    public EditEmployeePage clickEditPassword(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='tag is-info']")));
        WebElement element = driver.findElement(By.xpath("//span[@class='tag is-info']"));
        element.click();
        return this;
    }

    public EditEmployeePage clickClose(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='tag is-warning']")));
        WebElement element = driver.findElement(By.xpath("//span[@class='tag is-warning']"));
        element.click();
        return this;
    }

    public EditEmployeePage enterPassword(WebDriver driver, String EditedPassword) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        element.click();
        element.clear();
        element.sendKeys(EditedPassword);
        return this;
    }

    public EditEmployeePage enterRepeatPassword(WebDriver driver, String EditedRepeatPassword) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Repeat Password']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Repeat Password']"));
        element.click();
        element.clear();
        element.sendKeys(EditedRepeatPassword);
        return this;
    }

    public EditEmployeePage clickRestrictedAccess(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Restricted Access')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Restricted Access')]"));
        element.click();
        return this;
    }

    public EditEmployeePage clickLicensedUser(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Licensed User')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Licensed User')]"));
        element.click();
        return this;
    }

    public EditEmployeePage clickAbilityLogininMultipleDevices(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='el-checkbox__label']")));
        WebElement element = driver.findElement(By.xpath("//span[@class='el-checkbox__label']"));
        element.click();
        return this;
    }

    public EditEmployeePage clickUpdate(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button is-success']")));
        WebElement element = driver.findElement(By.xpath("//button[@class='button is-success']"));
        element.click();
        return this;
}

    public EditEmployeePage clickBack(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button']")));
        WebElement element = driver.findElement(By.xpath("//button[@class='button']"));
        element.click();
        return this;
    }

    public EditEmployeePage clickStayPopUpWarning(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Stay')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Stay')]"));
        element.click();
        return this;
    }

    public EditEmployeePage clickLeavePopUpWarning(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Leave')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Leave')]"));
        element.click();
        return this;
    }

    public EditEmployeePage clickDeleteEmployee(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button is-danger is-inverted']")));
        WebElement element = driver.findElement(By.xpath("//button[@class='button is-danger is-inverted']"));
        element.click();
        return this;
    }

    public EditEmployeePage clickCancelDeletePopUp(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Cancel')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
        element.click();
        return this;
    }

    public EditEmployeePage clickDeletePopUp(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Delete')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        element.click();
        return this;
    }
}

