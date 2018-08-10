package WEB.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditSitePage {

    public EditSitePage enterSiteName(WebDriver driver, String EditedSiteName) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Name']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        element.clear();
        element.sendKeys(EditedSiteName);
        return this;
    }

    public EditSitePage enterDetectRadius(WebDriver driver, String EditedRadius) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Detect radius']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Detect radius']"));
        element.clear();
        element.sendKeys(EditedRadius);
        return this;
    }

    public EditSitePage clickCompany(WebDriver driver, String CompanyName) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p[1]/span[1]/select[1]")));
        Select DDLMI = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p[1]/span[1]/select[1]")));
        DDLMI.selectByVisibleText(CompanyName);
        return this;
    }

    public EditSitePage enterNotes(WebDriver driver, String EditedNotes) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Add your notes for this site.']")));
        WebElement element = driver.findElement(By.xpath("//textarea[@placeholder='Add your notes for this site.']"));
        element.clear();
        element.sendKeys(EditedNotes);
        return this;
    }

    public EditSitePage enterAddress(WebDriver driver, String EditedAddress) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Address']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Address']"));
        element.clear();
        element.sendKeys(EditedAddress);
        return this;
    }

    public EditSitePage enterCity(WebDriver driver, String EditedCity) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='City']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='City']"));
        element.clear();
        element.sendKeys(EditedCity);
        return this;
    }

    public EditSitePage clickStateProvince(WebDriver driver, String ProvinceName) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='state']")));
        Select DDLMI = new Select(driver.findElement(By.xpath("//select[@name='state']")));
        DDLMI.selectByVisibleText(ProvinceName);
        return this;
    }

    public EditSitePage enterZipPostalCode(WebDriver driver, String EditedZipPostalCode) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Zip/Postal']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal']"));
        element.clear();
        element.sendKeys(EditedZipPostalCode);
        return this;
    }

    public EditSitePage clickCountry(WebDriver driver) {

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

    public EditSitePage clickFetchGPSCoordinates(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='button']")));
        WebElement element = driver.findElement(By.xpath("//button[@name='button']"));
        element.click();
        return this;
    }

    public EditSitePage clickBack(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button']")));
        WebElement element = driver.findElement(By.xpath("//button[@class='button']"));
        element.click();
        return this;
    }

    public EditSitePage clickLeavePopUp(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/button[2]")));
        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/button[2]"));
        element.click();
        return this;
    }

    public EditSitePage clickStayPopUp(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/button[1]")));
        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/button[1]"));
        element.click();
        return this;
    }

    public EditSitePage clickSave(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Save')]")));
        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
        element.click();
        return this;
    }

    public EditSitePage clickDelete(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button is-danger is-inverted']")));
        WebElement element = driver.findElement(By.xpath("//button[@class='button is-danger is-inverted']"));
        element.click();
        return this;
    }

    public EditSitePage clickCancelPopUp(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Cancel')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
        element.click();
        return this;
    }

    public EditSitePage clickDeletePopUp(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Delete')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        element.click();
        return this;
    }
}
