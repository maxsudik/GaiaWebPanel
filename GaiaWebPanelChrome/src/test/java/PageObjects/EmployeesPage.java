package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeesPage {

    public EmployeesPage clickAddNewEmployee(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button is-success is-pulled-right']")));
        WebElement element = driver.findElement(By.xpath("//a[@class='button is-success is-pulled-right']"));
        element.click();
        return this;
    }

    public EmployeesPage enterSearchField(WebDriver driver, String CompanyName) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        element.clear();
        element.sendKeys(CompanyName);
        return this;
    }

    public EmployeesPage clickEditButton(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody//tr[1]//td[5]//div[1]//button[1]")));
        WebElement element = driver.findElement(By.xpath("//tbody//tr[1]//td[5]//div[1]//button[1]"));
        element.click();
        return this;
    }
}
