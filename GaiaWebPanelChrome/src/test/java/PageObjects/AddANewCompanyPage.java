package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddANewCompanyPage {

    public AddANewCompanyPage enterCompanyName (WebDriver driver, String CompanyName) {

        //Find Company name field
        WebElement element = driver.findElement(By.xpath("//input[@id='company_name']"));
        //Enter valid name
        element.sendKeys(CompanyName);
        return this;
    }

    public AddANewCompanyPage enterCompanyEmail (WebDriver driver, String CompanyEmail) {

        //Find Company email field
        WebElement element = driver.findElement(By.xpath("//input[@id='company_email']"));
        //Enter valid email
        element.sendKeys(CompanyEmail);
        return this;
    }

    public AddANewCompanyPage enterCompanyTaxNumber (WebDriver driver, String CompanyTaxNumber) {

        //Find Company tax number field
        WebElement element = driver.findElement(By.xpath("//input[@id='tax_number']"));
        //Enter Tax number
        element.sendKeys(CompanyTaxNumber);
        return this;
    }

    public AddANewCompanyPage clickCompanyTypeLandscape (WebDriver driver) {

        //Find Company type
        WebElement element = driver.findElement(By.xpath("//div[@class='card-content']//div[4]//p[1]//span[1]//select[1]"));
        //Click Company type DDL
        element.click();
        //Find Landscape DDL menu item
        element = driver.findElement(By.xpath("//option[@value='landscape']"));
        //Click Landscape DDL
        element.click();
        return this;
    }
    public AddANewCompanyPage clickCompanyTypeSupplier (WebDriver driver) {

        //Find Company type
        WebElement element = driver.findElement(By.xpath("//div[@class='card-content']//div[4]//p[1]//span[1]//select[1]"));
        //Click Company type DDL
        element.click();
        //Find Landscape DDL menu item
        element = driver.findElement(By.xpath("//option[@value='supplier']"));
        //Click Landscape DDL
        element.click();
        return this;
    }

    public AddANewCompanyPage clickCompanyCurrencyCAD (WebDriver driver) {

        //Find Currency DDL
        WebElement element = driver.findElement(By.xpath("//div[@class='card-content']//div[5]//p[1]//span[1]//select[1]"));
        //Click Currency DDL
        element.click();
        //Find Currency DDL menu item
        element = driver.findElement(By.xpath("//option[@value='CAD']"));
        //Click Currency DDL menu item
        element.click();
        return this;
    }

    public AddANewCompanyPage clickCompanyCurrencyUSD (WebDriver driver) {

        //Find Currency DDL
        WebElement element = driver.findElement(By.xpath("//div[@class='card-content']//div[5]//p[1]//span[1]//select[1]"));
        //Click Currency DDL
        element.click();
        //Find Currency DDL menu item
        element = driver.findElement(By.xpath("//option[@value='USD']"));
        //Click Currency DDL menu item
        element.click();
        return this;
    }
    public AddANewCompanyPage clickCompanyCurrencyMXN (WebDriver driver) {

        //Find Currency DDL
        WebElement element = driver.findElement(By.xpath("//div[@class='card-content']//div[5]//p[1]//span[1]//select[1]"));
        //Click Currency DDL
        element.click();
        //Find Currency DDL menu item
        element = driver.findElement(By.xpath("//option[@value='MXN']"));
        //Click Currency DDL menu item
        element.click();
        return this;
    }

    public AddANewCompanyPage enterCompanyProductSpread (WebDriver driver, String ProductSpread) {
        //Find Product Spread Reduction Percentage
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='20']"));
        //Enter Find Product Spread Reduction Percentage
        element.sendKeys(ProductSpread);
        return this;

    }

    public AddANewCompanyPage enterCompanyDescription (WebDriver driver, String CompanyDescription) {
        //Find Company description
        WebElement element = driver.findElement(By.xpath("//textarea[@id='description']"));
        //Enter Company description
        element.sendKeys(CompanyDescription);
        return this;
    }

    public AddANewCompanyPage clickButtonAdd (WebDriver driver) {

        //Find button Add
        WebElement element = driver.findElement(By.xpath("//button[@class='button is-success']"));
        //Click button Add
        element.click();
        return this;
    }
}
