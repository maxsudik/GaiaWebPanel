package WEB.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewSitePage {

    public AddNewSitePage enterSiteName(WebDriver driver, String SiteName) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Name']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        element.clear();
        element.sendKeys(SiteName);
        return this;
    }

    public AddNewSitePage enterDetectRadius(WebDriver driver, String Radius) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Detect radius']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Detect radius']"));
        element.clear();
        element.sendKeys(Radius);
        return this;
    }

    public AddNewSitePage clickCompany(WebDriver driver, String CompanyName) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p[1]/span[1]/select[1]")));
        Select DDLMI = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p[1]/span[1]/select[1]")));
        DDLMI.selectByVisibleText(CompanyName);
        return this;
    }

    public AddNewSitePage enterNotes(WebDriver driver, String Notes) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Add your notes for this site.']")));
        WebElement element = driver.findElement(By.xpath("//textarea[@placeholder='Add your notes for this site.']"));
        element.clear();
        element.sendKeys(Notes);
        return this;
    }

    public AddNewSitePage enterAddress(WebDriver driver, String Address) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Address']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Address']"));
        element.clear();
        element.sendKeys(Address);
        return this;
    }

    public AddNewSitePage enterCity(WebDriver driver, String City) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='City']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='City']"));
        element.clear();
        element.sendKeys(City);
        return this;
    }

    public AddNewSitePage clickStateProvince(WebDriver driver, String ProvinceName) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='state']")));
        Select DDLMI = new Select(driver.findElement(By.xpath("//select[@name='state']")));
        DDLMI.selectByVisibleText(ProvinceName);
        return this;
    }

    public AddNewSitePage enterZipPostalCode(WebDriver driver, String ZipPostalCode) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Zip/Postal']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal']"));
        element.clear();
        element.sendKeys(ZipPostalCode);
        return this;
    }

    public AddNewSitePage clickCountry(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='country']")));
        WebElement element = driver.findElement(By.xpath("//select[@name='country']"));
        element.click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'Canada')]")));
        element = driver.findElement(By.xpath("//option[contains(text(),'Canada')]"));
        element.click();
        return this;
    }

    public AddNewSitePage clickFetchGPSCoordinates(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='button']")));
        WebElement element = driver.findElement(By.xpath("//button[@name='button']"));
        element.click();
        return this;
    }

    public AddNewSitePage clickBack(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button']")));
        WebElement element = driver.findElement(By.xpath("//button[@class='button']"));
        element.click();
        return this;
    }

    public AddNewSitePage clickLeavePopUp(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/button[2]")));
        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/button[2]"));
        element.click();
        return this;
    }

    public AddNewSitePage clickStayPopUp(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/button[1]")));
        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/button[1]"));
        element.click();
        return this;
    }

    public AddNewSitePage clickAdd(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add')]")));
        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        element.click();
        return this;
    }

}
