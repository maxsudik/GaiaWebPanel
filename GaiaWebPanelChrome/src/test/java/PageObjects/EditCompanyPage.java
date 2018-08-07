package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditCompanyPage {

    public EditCompanyPage clickEditButton(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//span[@class='tag is-info']"));
        element.click();
        return this;
    }

    public EditCompanyPage clickCancelButton(WebDriver driver) {

        WebElement element =driver.findElement(By.xpath("//button[@class='button']"));
        element.click();
        return this;
    }

    public EditCompanyPage uploadNewLogo(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        element.sendKeys("src/Images/Test.png");
        return this;
    }

    public EditCompanyPage editCompanyName(WebDriver driver, String EditedCompanyName) {

        WebElement element = driver.findElement(By.xpath("//input[@id='company_name']"));
        element.click();
        element.clear();
        element.sendKeys(EditedCompanyName);
        return this;
    }

    public EditCompanyPage editCompanyEmail(WebDriver driver, String EditedCompanyEmail) {

        WebElement element = driver.findElement(By.xpath("//input[@id='company_email']"));
        element.click();
        element.clear();
        element.sendKeys(EditedCompanyEmail);
        return this;
    }

    public EditCompanyPage editCompanyWebSite(WebDriver driver, String EditedCompanyWebSite) {

        WebElement element = driver.findElement(By.xpath("//input[@id='website']"));
        element.click();
        element.clear();
        element.sendKeys(EditedCompanyWebSite);
        return this;
    }

    public EditCompanyPage editCompanyTaxNumber(WebDriver driver, String EditedCompanyTaxNumber) {

        WebElement element = driver.findElement(By.xpath("//input[@id='tax_number']"));
        element.click();
        element.clear();
        element.sendKeys(EditedCompanyTaxNumber);
        return this;
    }

    public EditCompanyPage clickCompanyTypeSupplier(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div[@class='card']/div[@class='card-content']/div[contains(@class,'columns')]/div[@class='column is-half']/div[@class='field']/p[1]/span[1]/select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='supplier']"));
        element.click();
        return this;
    }

    public EditCompanyPage clickCompanyTypeLandscape(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div[@class='card']/div[@class='card-content']/div[contains(@class,'columns')]/div[@class='column is-half']/div[@class='field']/p[1]/span[1]/select[1]"));
        element.click();
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='landscape']");
        element.click();
        return this;
    }

    public EditCompanyPage clickCurrencyUSD(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//div[@class='field']//p[2]//span[1]//select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='USD']"));
        element.click();
        return this;
    }

    public EditCompanyPage clickCurrencyMXN(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//div[@class='field']//p[2]//span[1]//select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='MXN']"));
        element.click();
        return this;
    }

    public EditCompanyPage clickCurrencyCAD(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//div[@class='field']//p[2]//span[1]//select[1]"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='CAD']"));
        element.click();
        return this;
    }

    public EditCompanyPage editLicenseLimit(WebDriver driver, String EditedLicenseLimit) {

        WebElement element = driver.findElement(By.xpath("//input[@id='admin_card_license_limit']"));
        element.click();
        element.clear();
        element.sendKeys(EditedLicenseLimit);
        return this;
    }

    public EditCompanyPage editProductSpreadProductionPercentage(WebDriver driver, String EditedProductSpreadProductionPercentage) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='20']"));
        element.click();
        element.clear();
        element.sendKeys(EditedProductSpreadProductionPercentage);
        return this;
}

    public EditCompanyPage editAddressLine1(WebDriver driver, String EditedAddressLine1) {

        WebElement element = driver.findElement(By.xpath("//input[@id='address_one']"));
        element.click();
        element.clear();
        element.sendKeys(EditedAddressLine1);
        return this;

    }

    public EditCompanyPage editAddressLine2(WebDriver driver, String EditedAddressLine2) {

        WebElement element = driver.findElement(By.xpath("//input[@id='address_two']"));
        element.click();
        element.clear();
        element.sendKeys(EditedAddressLine2);
        return this;
    }

    public EditCompanyPage editCity(WebDriver driver, String EditedCity) {

        WebElement element = driver.findElement(By.xpath("//input[@id='address_city']"));
        element.click();
        element.clear();
        element.sendKeys(EditedCity);
        return this;
    }

    public EditCompanyPage clickCountryUnitedStates(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//select[@id='address_country']"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='US']"));
        element.click();
        return this;
}

    public EditCompanyPage clickCountryMexico(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//select[@id='address_country']"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='MX']"));
        element.click();
        return this;
    }

    public EditCompanyPage clickCountryCanada(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//select[@id='address_country']"));
        element.click();
        element = driver.findElement(By.xpath("//option[contains(text(),'Canada')]"));
        element.click();
        return this;
    }

    public EditCompanyPage clickProvinceBritishColumbia(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//select[@id='address_state']"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='BC']"));
        element.click();
        return this;
    }

    public EditCompanyPage editZipPostalCode(WebDriver driver, String EditedZipPostalCode) {

        WebElement element = driver.findElement(By.xpath("//input[@id='address_postalcode']"));
        element.click();
        element.clear();
        element.sendKeys(EditedZipPostalCode);
        return this;
    }

    public EditCompanyPage editCompanyDescription(WebDriver driver, String EditedCompanyDescription) {

        WebElement element = driver.findElement(By.xpath("//textarea[@id='description']"));
        element.click();
        element.clear();
        element.sendKeys(EditedCompanyDescription);
        return this;
    }

    public EditCompanyPage clickSave(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[@id='address_submit']"));
        element.click();
        return this;
    }
}
