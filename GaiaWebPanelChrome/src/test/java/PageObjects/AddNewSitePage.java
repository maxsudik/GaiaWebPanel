package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddNewSitePage {

    public AddNewSitePage enterSiteName(WebDriver driver, String SiteName) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        element.clear();
        element.sendKeys(SiteName);
        return this;
    }

    public AddNewSitePage enterDetectRadius(WebDriver driver, String Radius) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Detect radius']"));
        element.clear();
        element.sendKeys(Radius);
        return this;
    }

    public AddNewSitePage clickCompany(WebDriver driver, String CompanyName) {

        Select DDLMI = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p[1]/span[1]/select[1]")));
        DDLMI.selectByVisibleText(CompanyName);
        return this;
    }

    public AddNewSitePage enterNotes(WebDriver driver, String Notes) {

        WebElement element = driver.findElement(By.xpath("//textarea[@placeholder='Add your notes for this site.']"));
        element.clear();
        element.sendKeys(Notes);
        return this;
    }

    public AddNewSitePage enterAddress(WebDriver driver, String Address) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Address']"));
        element.clear();
        element.sendKeys(Address);
        return this;
    }

    public AddNewSitePage enterCity(WebDriver driver, String City) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='City']"));
        element.clear();
        element.sendKeys(City);
        return this;
    }

    public AddNewSitePage clickStateProvince(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//select[@name='state']"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='BC']"));
        element.click();
        return this;
    }

    public AddNewSitePage enterZipPostalCode(WebDriver driver, String ZipPostalCode) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal']"));
        element.clear();
        element.sendKeys(ZipPostalCode);
        return this;
    }

    public AddNewSitePage clickCountry(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//select[@name='country']"));
        element.click();
        element = driver.findElement(By.xpath("//option[contains(text(),'Canada')]"));
        element.click();
        return this;
    }

    public AddNewSitePage clickFetchGPSCoordinates(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[@name='button']"));
        element.click();
        return this;
    }

    public AddNewSitePage clickBack(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[@class='button']"));
        element.click();
        return this;
    }

    public AddNewSitePage clickLeavePopUp(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/button[2]"));
        element.click();
        return this;
    }

    public AddNewSitePage clickStayPopUp(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/button[1]"));
        element.click();
        return this;
    }

    public AddNewSitePage clickAdd(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        element.click();
        return this;
    }

}
