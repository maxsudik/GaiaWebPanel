package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SitesPage {

    public SitesPage enterSearchField(WebDriver driver, String SiteName) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        element.sendKeys(SiteName);
        return this;
    }

    public SitesPage clickAddNewSite(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//a[@class='button is-success is-pulled-right']"));
        element.click();
        return this;
    }

    public SitesPage clickEdit(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/button[2]/span[1]"));
        element.click();
        return this;
    }



}
