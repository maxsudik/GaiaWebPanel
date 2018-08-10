package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagerHomePage {

    public ManagerHomePage clickCompanyDDL(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='nav-center']//div[1]//div[1]")));
        WebElement element = driver.findElement(By.xpath("//div[@class='nav-center']//div[1]//div[1]"));
        element.click();
        return this;
    }

    public ManagerHomePage clickCompanyProfileDDMI(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("navCompany")));
        WebElement element = driver.findElement(By.id("navCompany"));
        element.click();
        return this;
    }

    public ManagerHomePage clickEmployeesDDMI(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("navEmployee")));
        WebElement element = driver.findElement(By.id("navEmployee"));
        element.click();
        return this;
    }

    public ManagerHomePage clickSitesDDMI(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("navSite")));
        WebElement element = driver.findElement(By.id("navSite"));
        element.click();
        return this;
    }

    public ManagerHomePage clickLogout(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Log Out')]")));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"));
        element.click();
        return this;
    }
}
