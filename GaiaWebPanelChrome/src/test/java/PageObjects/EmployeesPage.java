package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeesPage {

    public EmployeesPage clickAddNewEmployee(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//a[@class='button is-success is-pulled-right']"));
        element.click();
        return this;
    }

    public EmployeesPage enterSearchField(WebDriver driver, String CompanyName) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        element.clear();
        element.sendKeys(CompanyName);
        return this;
    }

    public EmployeesPage clickEditButton(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//tbody//tr[1]//td[5]//div[1]//button[1]"));
        element.click();
        return this;
    }
}
