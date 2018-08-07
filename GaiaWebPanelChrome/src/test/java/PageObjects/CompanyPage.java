package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompanyPage {

    public CompanyPage clickCompanyDDL(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//div[@class='web-style is-tab is-hidden-mobile web-style-active']"));
        element.click();
        return this;
    }

    public CompanyPage clickCompanyDDMI(WebDriver driver) {

        WebElement element = driver.findElement(By.id("navCompany"));
        element.click();
        return this;
    }

    public CompanyPage clickEmployeeDDMI(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//li[contains(text(),'Employees')]"));
        element.click();
        return this;
    }

    public CompanyPage clickSitesDDMI(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//li[@id='navSite']"));
        element.click();
        return this;
    }

    public CompanyPage clickAddANewCompanyButton(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//a[@class='button is-success is-pulled-right']"));
        element.click();
        return this;
    }

    public CompanyPage clickLogoutButton(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"));
        element.click();
        return this;
    }

    public CompanyPage enterSearchField(WebDriver driver, String CreatedCompanyName) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        element.sendKeys(CreatedCompanyName);
        return this;
    }

    public CompanyPage clickButtonEdit (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
        element.click();
        return this;
    }
}
