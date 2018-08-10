package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditCompanyPage {

    public EditCompanyPage clickEditButton(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='tag is-info']")));
        WebElement element = driver.findElement(By.xpath("//span[@class='tag is-info']"));
        element.click();
        return this;
    }

    public EditCompanyPage clickCancelButton(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button']")));
        WebElement element =driver.findElement(By.xpath("//button[@class='button']"));
        element.click();
        return this;
    }

    public EditCompanyPage uploadNewLogo(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='company_picture']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='company_picture']"));
        element.sendKeys("/Users/maxsudik/IdeaProjects/GaiaWebPanel/GaiaWebPanelChrome/src/Images/Test.png");
        return this;
    }

    public EditCompanyPage editCompanyName(WebDriver driver, String EditedCompanyName) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='company_name']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='company_name']"));
        element.click();
        element.clear();
        element.sendKeys(EditedCompanyName);
        return this;
    }

    public EditCompanyPage editCompanyEmail(WebDriver driver, String EditedCompanyEmail) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='company_email']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='company_email']"));
        element.click();
        element.clear();
        element.sendKeys(EditedCompanyEmail);
        return this;
    }

    public EditCompanyPage editCompanyWebSite(WebDriver driver, String EditedCompanyWebSite) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='website']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='website']"));
        element.click();
        element.clear();
        element.sendKeys(EditedCompanyWebSite);
        return this;
    }

    public EditCompanyPage editCompanyTaxNumber(WebDriver driver, String EditedCompanyTaxNumber) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='tax_number']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='tax_number']"));
        element.click();
        element.clear();
        element.sendKeys(EditedCompanyTaxNumber);
        return this;
    }

    public EditCompanyPage clickCompanyTypeSupplier(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='app']/div/div/div/div[@class='card']/div[@class='card-content']/div[contains(@class,'columns')]/div[@class='column is-half']/div[@class='field']/p[1]/span[1]/select[1]")));
        WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div[@class='card']/div[@class='card-content']/div[contains(@class,'columns')]/div[@class='column is-half']/div[@class='field']/p[1]/span[1]/select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='supplier']")));
        element = driver.findElement(By.xpath("//option[@value='supplier']"));
        element.click();
        return this;
    }

    public EditCompanyPage clickCompanyTypeLandscape(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='app']/div/div/div/div[@class='card']/div[@class='card-content']/div[contains(@class,'columns')]/div[@class='column is-half']/div[@class='field']/p[1]/span[1]/select[1]")));
        WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div[@class='card']/div[@class='card-content']/div[contains(@class,'columns')]/div[@class='column is-half']/div[@class='field']/p[1]/span[1]/select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='landscape']")));
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='landscape']");
        element.click();
        return this;
    }

    public EditCompanyPage clickCurrencyUSD(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='field']//p[2]//span[1]//select[1]")));
        WebElement element = driver.findElement(By.xpath("//div[@class='field']//p[2]//span[1]//select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='USD']")));
        element = driver.findElement(By.xpath("//option[@value='USD']"));
        element.click();
        return this;
    }

    public EditCompanyPage clickCurrencyMXN(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='field']//p[2]//span[1]//select[1]")));
        WebElement element = driver.findElement(By.xpath("//div[@class='field']//p[2]//span[1]//select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='MXN']")));
        element = driver.findElement(By.xpath("//option[@value='MXN']"));
        element.click();
        return this;
    }

    public EditCompanyPage clickCurrencyCAD(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='field']//p[2]//span[1]//select[1]")));
        WebElement element = driver.findElement(By.xpath("//div[@class='field']//p[2]//span[1]//select[1]"));
        element.click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='CAD']")));
        element = driver.findElement(By.xpath("//option[@value='CAD']"));
        element.click();
        return this;
    }

    public EditCompanyPage editLicenseLimit(WebDriver driver, String EditedLicenseLimit) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='admin_card_license_limit']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='admin_card_license_limit']"));
        element.click();
        element.clear();
        element.sendKeys(EditedLicenseLimit);
        return this;
    }

    public EditCompanyPage editProductSpreadProductionPercentage(WebDriver driver, String EditedProductSpreadProductionPercentage) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='20']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='20']"));
        element.click();
        element.clear();
        element.sendKeys(EditedProductSpreadProductionPercentage);
        return this;
}

    public EditCompanyPage editAddressLine1(WebDriver driver, String EditedAddressLine1) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='address_one']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='address_one']"));
        element.click();
        element.clear();
        element.sendKeys(EditedAddressLine1);
        return this;

    }

    public EditCompanyPage editAddressLine2(WebDriver driver, String EditedAddressLine2) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='address_two']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='address_two']"));
        element.click();
        element.clear();
        element.sendKeys(EditedAddressLine2);
        return this;
    }

    public EditCompanyPage editCity(WebDriver driver, String EditedCity) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='address_city']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='address_city']"));
        element.click();
        element.clear();
        element.sendKeys(EditedCity);
        return this;
    }

    public EditCompanyPage clickCountryUnitedStates(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='address_country']")));
        WebElement element = driver.findElement(By.xpath("//select[@id='address_country']"));
        element.click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='US']")));
        element = driver.findElement(By.xpath("//option[@value='US']"));
        element.click();
        return this;
}

    public EditCompanyPage clickCountryMexico(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='address_country']")));
        WebElement element = driver.findElement(By.xpath("//select[@id='address_country']"));
        element.click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='MX']")));
        element = driver.findElement(By.xpath("//option[@value='MX']"));
        element.click();
        return this;
    }

    public EditCompanyPage clickCountryCanada(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='address_country']")));
        WebElement element = driver.findElement(By.xpath("//select[@id='address_country']"));
        element.click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'Canada')]")));
        element = driver.findElement(By.xpath("//option[contains(text(),'Canada')]"));
        element.click();
        return this;
    }

    public EditCompanyPage clickProvinceBritishColumbia(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='address_state']")));
        WebElement element = driver.findElement(By.xpath("//select[@id='address_state']"));
        element.click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='BC']")));
        element = driver.findElement(By.xpath("//option[@value='BC']"));
        element.click();
        return this;
    }

    public EditCompanyPage editZipPostalCode(WebDriver driver, String EditedZipPostalCode) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='address_postalcode']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='address_postalcode']"));
        element.click();
        element.clear();
        element.sendKeys(EditedZipPostalCode);
        return this;
    }

    public EditCompanyPage editCompanyDescription(WebDriver driver, String EditedCompanyDescription) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='description']")));
        WebElement element = driver.findElement(By.xpath("//textarea[@id='description']"));
        element.click();
        element.clear();
        element.sendKeys(EditedCompanyDescription);
        return this;
    }

    public EditCompanyPage clickSave(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='address_submit']")));
        WebElement element = driver.findElement(By.xpath("//button[@id='address_submit']"));
        element.click();
        return this;
    }
}
