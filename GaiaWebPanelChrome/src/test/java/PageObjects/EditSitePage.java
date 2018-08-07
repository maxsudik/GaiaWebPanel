package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditSitePage {

    public EditSitePage enterSiteName(WebDriver driver, String SiteName) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        element.sendKeys(SiteName);
        return this;
    }

    public EditSitePage enterDetectRadius(WebDriver driver, String Radius) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Detect radius']"));
        element.clear();
        element.sendKeys(Radius);
        return this;
    }

    public EditSitePage clickCompany(WebDriver driver, String CompanyName) {

        Select DDLMI = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p[1]/span[1]/select[1]")));
        DDLMI.selectByVisibleText(CompanyName);
        return this;
    }

    public EditSitePage enterNotes(WebDriver driver, String Notes) {

        WebElement element = driver.findElement(By.xpath("//textarea[@placeholder='Add your notes for this site.']"));
        element.sendKeys(Notes);
        return this;
    }

    public EditSitePage enterAddress(WebDriver driver, String Address) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Address']"));
        element.sendKeys(Address);
        return this;
    }

    public EditSitePage enterCity(WebDriver driver, String City) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='City']"));
        element.sendKeys(City);
        return this;
    }

    public EditSitePage clickStateProvince(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//select[@name='state']"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='BC']"));
        element.click();
        return this;
    }

    public EditSitePage enterZipPostalCode(WebDriver driver, String ZipPostalCode) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal']"));
        element.sendKeys(ZipPostalCode);
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
}
