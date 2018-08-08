package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditSitePage {

    public EditSitePage enterSiteName(WebDriver driver, String EditedSiteName) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        element.clear();
        element.sendKeys(EditedSiteName);
        return this;
    }

    public EditSitePage enterDetectRadius(WebDriver driver, String EditedRadius) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Detect radius']"));
        element.clear();
        element.sendKeys(EditedRadius);
        return this;
    }

    public EditSitePage clickCompany(WebDriver driver, String CompanyName) {

        Select DDLMI = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p[1]/span[1]/select[1]")));
        DDLMI.selectByVisibleText(CompanyName);
        return this;
    }

    public EditSitePage enterNotes(WebDriver driver, String EditedNotes) {

        WebElement element = driver.findElement(By.xpath("//textarea[@placeholder='Add your notes for this site.']"));
        element.clear();
        element.sendKeys(EditedNotes);
        return this;
    }

    public EditSitePage enterAddress(WebDriver driver, String EditedAddress) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Address']"));
        element.clear();
        element.sendKeys(EditedAddress);
        return this;
    }

    public EditSitePage enterCity(WebDriver driver, String EditedCity) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='City']"));
        element.clear();
        element.sendKeys(EditedCity);
        return this;
    }

    public EditSitePage clickStateProvince(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//select[@name='state']"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='BC']"));
        element.click();
        return this;
    }

    public EditSitePage enterZipPostalCode(WebDriver driver, String EditedZipPostalCode) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal']"));
        element.clear();
        element.sendKeys(EditedZipPostalCode);
        return this;
    }

    public EditSitePage clickCountry(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//select[@name='country']"));
        element.click();
        element = driver.findElement(By.xpath("//option[contains(text(),'Canada')]"));
        element.click();
        return this;
    }

    public EditSitePage clickFetchGPSCoordinates(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[@name='button']"));
        element.click();
        return this;
    }

    public EditSitePage clickBack(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[@class='button']"));
        element.click();
        return this;
    }

    public EditSitePage clickLeavePopUp(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/button[2]"));
        element.click();
        return this;
    }

    public EditSitePage clickStayPopUp(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/button[1]"));
        element.click();
        return this;
    }

    public EditSitePage clickSave(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
        element.click();
        return this;
    }

    public EditSitePage clickDelete(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[@class='button is-danger is-inverted']"));
        element.click();
        return this;
    }

    public EditSitePage clickCancelPopUp(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
        element.click();
        return this;
    }

    public EditSitePage clickDeletePopUp(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        element.click();
        return this;
    }
}
