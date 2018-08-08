package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompanyPage {

    public CompanyPage clickCompanyDDL(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='web-style is-tab is-hidden-mobile web-style-active']")));
        WebElement element = driver.findElement(By.xpath("//div[@class='web-style is-tab is-hidden-mobile web-style-active']"));
        element.click();
        return this;
    }

    public CompanyPage clickCompanyDDMI(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("navCompany")));
        WebElement element = driver.findElement(By.id("navCompany"));
        element.click();
        return this;
    }

    public CompanyPage clickEmployeesDDMI(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("navEmployee")));
        WebElement element = driver.findElement(By.id("navEmployee"));
        element.click();
        return this;
    }

    public CompanyPage clickSitesDDMI(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("navSite")));
        WebElement element = driver.findElement(By.id("navSite"));
        element.click();
        return this;
    }

    public CompanyPage clickAddANewCompany(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button is-success is-pulled-right']")));
        WebElement element = driver.findElement(By.xpath("//a[@class='button is-success is-pulled-right']"));
        element.click();
        return this;
    }

    public CompanyPage clickLogout(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Log Out')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"));
        element.click();
        return this;
    }

    public CompanyPage enterSearchField(WebDriver driver, String CreatedCompanyName) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        element.clear();
        element.sendKeys(CreatedCompanyName);
        return this;
    }

    public CompanyPage clickEdit (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Edit')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
        element.click();
        return this;
    }

    public CompanyPage clickDelete (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody//tr[1]//td[6]//div[1]//button[2]")));
        WebElement element = driver.findElement(By.xpath("//tbody//tr[1]//td[6]//div[1]//button[2]"));
        element.click();
        return this;
    }

    public CompanyPage clickCancelPopUp (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Cancel')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
        element.click();
        return this;
    }

    public CompanyPage clickDeletePopUp (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Delete')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        element.click();
        return this;
    }


}
