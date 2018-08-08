package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewCompanyPage {

    public AddNewCompanyPage enterCompanyName (WebDriver driver, String CompanyName) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='company_name']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='company_name']"));
        element.clear();
        element.sendKeys(CompanyName);
        return this;
    }

    public AddNewCompanyPage enterCompanyEmail (WebDriver driver, String CompanyEmail) {


        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='company_email']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='company_email']"));
        element.clear();
        element.sendKeys(CompanyEmail);
        return this;
    }

    public AddNewCompanyPage enterCompanyTaxNumber (WebDriver driver, String CompanyTaxNumber) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='tax_number']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='tax_number']"));
        element.clear();
        element.sendKeys(CompanyTaxNumber);
        return this;
    }

    public AddNewCompanyPage clickCompanyTypeLandscape (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-content']//div[4]//p[1]//span[1]//select[1]")));
        WebElement element = driver.findElement(By.xpath("//div[@class='card-content']//div[4]//p[1]//span[1]//select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='landscape']")));
        element = driver.findElement(By.xpath("//option[@value='landscape']"));
        element.click();
        return this;
    }

    public AddNewCompanyPage clickCompanyTypeSupplier (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-content']//div[4]//p[1]//span[1]//select[1]")));
        WebElement element = driver.findElement(By.xpath("//div[@class='card-content']//div[4]//p[1]//span[1]//select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='supplier']")));
        element = driver.findElement(By.xpath("//option[@value='supplier']"));
        element.click();
        return this;
    }

    public AddNewCompanyPage clickCompanyCurrencyCAD (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-content']//div[5]//p[1]//span[1]//select[1]")));
        WebElement element = driver.findElement(By.xpath("//div[@class='card-content']//div[5]//p[1]//span[1]//select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='CAD']")));
        element = driver.findElement(By.xpath("//option[@value='CAD']"));
        element.click();
        return this;
    }

    public AddNewCompanyPage clickCompanyCurrencyUSD (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-content']//div[5]//p[1]//span[1]//select[1]")));
        WebElement element = driver.findElement(By.xpath("//div[@class='card-content']//div[5]//p[1]//span[1]//select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='USD']")));
        element = driver.findElement(By.xpath("//option[@value='USD']"));
        element.click();
        return this;
    }

    public AddNewCompanyPage clickCompanyCurrencyMXN (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-content']//div[5]//p[1]//span[1]//select[1]")));
        WebElement element = driver.findElement(By.xpath("//div[@class='card-content']//div[5]//p[1]//span[1]//select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='MXN']")));
        element = driver.findElement(By.xpath("//option[@value='MXN']"));
        element.click();
        return this;
    }

    public AddNewCompanyPage enterCompanyProductSpread (WebDriver driver, String ProductSpread) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='20']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='20']"));
        element.clear();
        element.sendKeys(ProductSpread);
        return this;

    }

    public AddNewCompanyPage enterCompanyDescription (WebDriver driver, String CompanyDescription) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='description']")));
        WebElement element = driver.findElement(By.xpath("//textarea[@id='description']"));
        element.clear();
        element.sendKeys(CompanyDescription);
        return this;
    }

    public AddNewCompanyPage clickButtonAdd (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button is-success']")));
        WebElement element = driver.findElement(By.xpath("//button[@class='button is-success']"));
        element.click();
        return this;
    }
}
