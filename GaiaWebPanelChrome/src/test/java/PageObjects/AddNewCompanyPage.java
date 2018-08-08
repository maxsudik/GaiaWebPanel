package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewCompanyPage {

    public AddNewCompanyPage enterCompanyName (WebDriver driver, String CompanyName) {

        WebElement element = driver.findElement(By.xpath("//input[@id='company_name']"));
        element.clear();
        element.sendKeys(CompanyName);
        return this;
    }

    public AddNewCompanyPage enterCompanyEmail (WebDriver driver, String CompanyEmail) {

        WebElement element = driver.findElement(By.xpath("//input[@id='company_email']"));
        element.clear();
        element.sendKeys(CompanyEmail);
        return this;
    }

    public AddNewCompanyPage enterCompanyTaxNumber (WebDriver driver, String CompanyTaxNumber) {

        WebElement element = driver.findElement(By.xpath("//input[@id='tax_number']"));
        element.clear();
        element.sendKeys(CompanyTaxNumber);
        return this;
    }

    public AddNewCompanyPage clickCompanyTypeLandscape (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//div[@class='card-content']//div[4]//p[1]//span[1]//select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='landscape']"));
        element.click();
        return this;
    }

    public AddNewCompanyPage clickCompanyTypeSupplier (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//div[@class='card-content']//div[4]//p[1]//span[1]//select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='supplier']"));
        element.click();
        return this;
    }

    public AddNewCompanyPage clickCompanyCurrencyCAD (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//div[@class='card-content']//div[5]//p[1]//span[1]//select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='CAD']"));
        element.click();
        return this;
    }

    public AddNewCompanyPage clickCompanyCurrencyUSD (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//div[@class='card-content']//div[5]//p[1]//span[1]//select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='USD']"));
        element.click();
        return this;
    }

    public AddNewCompanyPage clickCompanyCurrencyMXN (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//div[@class='card-content']//div[5]//p[1]//span[1]//select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='MXN']"));
        element.click();
        return this;
    }

    public AddNewCompanyPage enterCompanyProductSpread (WebDriver driver, String ProductSpread) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='20']"));
        element.clear();
        element.sendKeys(ProductSpread);
        return this;

    }

    public AddNewCompanyPage enterCompanyDescription (WebDriver driver, String CompanyDescription) {

        WebElement element = driver.findElement(By.xpath("//textarea[@id='description']"));
        element.clear();
        element.sendKeys(CompanyDescription);
        return this;
    }

    public AddNewCompanyPage clickButtonAdd (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[@class='button is-success']"));

        element.click();
        return this;
    }
}
