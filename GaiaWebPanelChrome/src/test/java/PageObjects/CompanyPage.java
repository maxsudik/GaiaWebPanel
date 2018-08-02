package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompanyPage {

    public CompanyPage clickCompanyDDL(WebDriver driver) {

        //Find Company button
        WebElement element = driver.findElement(By.xpath("//div[@class='web-style is-tab is-hidden-mobile web-style-active']"));
        //Click Company button
        element.click();
        return this;
    }

    public CompanyPage clickCompanyDDMI(WebDriver driver) {

        //Find Company DDL menu item
        WebElement element = driver.findElement(By.id("navCompany"));
        //Click Company DDL menu item
        element.click();
        return this;
    }

    public CompanyPage clickAddANewCompanyButton(WebDriver driver) {

        //Find Add a new company
        WebElement element = driver.findElement(By.xpath("//a[@class='button is-success is-pulled-right']"));
        //Click Add a new company
        element.click();
        return this;
    }

    public CompanyPage clickLogoutButton(WebDriver driver) {
        //Find Log Out button
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"));
        element.click();
        return this;
    }

    public CompanyPage enterSearchField(WebDriver driver, String CreatedCompanyName) {

        //Find Search field
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        //Enter the name of just created company
        element.sendKeys(CreatedCompanyName);
        return this;
    }

    public CompanyPage clickButtonEdit (WebDriver driver) {

        //Find button Edit
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
        //Click button Edit
        element.click();
        return this;
    }
}
