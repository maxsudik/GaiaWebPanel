package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

public class OnboardingProcess {

    public OnboardingProcess enterCompanyAddressLine1(WebDriver driver, String CompanyAddressLine1) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='address_one']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='address_one']"));
        element.clear();
        element.sendKeys(CompanyAddressLine1);
        return this;
    }

    public OnboardingProcess enterCompanyAddressLine2(WebDriver driver, String CompanyAddressLine2) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='address_two address-line2']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='address_two address-line2']"));
        element.clear();
        element.sendKeys(CompanyAddressLine2);
        return this;
    }

    public OnboardingProcess enterCompanyCity(WebDriver driver, String CompanyCity) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='address_city']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='address_city']"));
        element.clear();
        element.sendKeys(CompanyCity);
        return this;
    }

    public OnboardingProcess clickCompanyCountry(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='address_country']")));
        WebElement element = driver.findElement(By.xpath("//select[@id='address_country']"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'Canada')]")));
        element = driver.findElement(By.xpath("//option[contains(text(),'Canada')]"));
        element.click();
        return this;
    }

    public OnboardingProcess clickCompanyStateProvince(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='address_state']")));
        WebElement element = driver.findElement(By.xpath("//select[@id='address_state']"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='BC']")));
        element = driver.findElement(By.xpath("//option[@value='BC']"));
        element.click();
        return this;
    }

    public OnboardingProcess enterCompanyZipPostalCode(WebDriver driver, String CompanyZipPostalCode) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='address_postalcode']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='address_postalcode']"));
        element.clear();
        element.sendKeys(CompanyZipPostalCode);
        return this;
    }

    public OnboardingProcess clickSave1(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button is-success']")));
        WebElement element = driver.findElement(By.xpath("//a[@class='button is-success']"));
        element.click();
        return this;
    }

    public OnboardingProcess enterInstitutionNumber(WebDriver driver, String InstitutionNumber) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='bank_institution']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='bank_institution']"));
        element.clear();
        element.sendKeys(InstitutionNumber);
        return this;
    }

    public OnboardingProcess enterTransitNumber(WebDriver driver, String TransitNumber) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='bank_transit']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='bank_transit']"));
        element.clear();
        element.sendKeys(TransitNumber);
        return this;
    }

    public OnboardingProcess enterAccountNumber(WebDriver driver, String AccountNumber) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='bank_account_number']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='bank_account_number']"));
        element.clear();
        element.sendKeys(AccountNumber);
        return this;
    }

    public OnboardingProcess enterAccountHolderName(WebDriver driver, String AccountHolderName) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='bank_holder_name']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='bank_holder_name']"));
        element.clear();
        element.sendKeys(AccountHolderName);
        return this;
    }

    public OnboardingProcess clickAccountTypeCompany(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='bank_account_type']")));
        WebElement element = driver.findElement(By.xpath("//select[@id='bank_account_type']"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='company']")));
        element = driver.findElement(By.xpath("//option[@value='company']"));
        element.click();
        return this;
    }

    public OnboardingProcess clickSave2(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button is-success']")));
        WebElement element = driver.findElement(By.xpath("//a[@class='button is-success']"));
        element.click();
        return this;
    }

    public OnboardingProcess enterFirstName(WebDriver driver, String FirstName) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='legal_first_name']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='legal_first_name']"));
        element.clear();
        element.sendKeys(FirstName);
        return this;
    }

    public OnboardingProcess enterLastName(WebDriver driver, String LastName) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='legal_last_name']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='legal_last_name']"));
        element.clear();
        element.sendKeys(LastName);
        return this;
    }

    public OnboardingProcess enterDateOfBirth(WebDriver driver, String DateOfBirth) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='yyyy-mmm-dd']")));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='yyyy-mmm-dd']"));
        element.click();
        element.sendKeys(DateOfBirth);
        element.sendKeys(Keys.RETURN);
        return this;
    }

    public OnboardingProcess enterAddressLine1(WebDriver driver, String AddressLine1) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='legal_address_one']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='legal_address_one']"));
        element.clear();
        element.sendKeys(AddressLine1);
        return this;
    }

    public OnboardingProcess enterAddressLine2(WebDriver driver, String AddressLine2) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='legal_address_two']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='legal_address_two']"));
        element.clear();
        element.sendKeys(AddressLine2);
        return this;
    }

    public OnboardingProcess enterCity(WebDriver driver, String City) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='legal_city']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='legal_city']"));
        element.clear();
        element.sendKeys(City);
        return this;
    }

    public OnboardingProcess clickCountry(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='legal_country']")));
        WebElement element = driver.findElement(By.xpath("//select[@id='legal_country']"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'Canada')]")));
        element = driver.findElement(By.xpath("//option[contains(text(),'Canada')]"));
        element.click();
        return this;
    }

    public OnboardingProcess clickStateProvinceDDL(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='legal_state']")));
        WebElement element = driver.findElement(By.xpath("//select[@id='legal_state']"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='BC']")));
        element = driver.findElement(By.xpath("//option[@value='BC']"));
        element.click();
        return this;
    }

    public OnboardingProcess enterZipPostalCode(WebDriver driver, String ZipPostalCode) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='legal_postal_code']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='legal_postal_code']"));
        element.clear();
        element.sendKeys(ZipPostalCode);
        return this;
    }

    public OnboardingProcess uploadID(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='legal_identity_image']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='legal_identity_image']"));
        element.sendKeys("/Users/Maksym/IdeaProjects/GaiaWebPanel/GaiaWebPanelChrome/src/Images/Test.png");
        return this;
    }

    public OnboardingProcess clickSave3(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='legal_submit']")));
        WebElement element = driver.findElement(By.xpath("//button[@id='legal_submit']"));
        element.click();
        return this;
    }

    public OnboardingProcess enterCreditCardNumber(WebDriver driver, String CreditCardNumber) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='card_number']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='card_number']"));
        element.clear();
        element.sendKeys(CreditCardNumber);
        return this;
    }

    public OnboardingProcess enterNameOnCard(WebDriver driver, String NameOnCard) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='card_name']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='card_name']"));
        element.clear();
        element.sendKeys(NameOnCard);
        return this;
    }

    public OnboardingProcess clickExpirationMM(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='card_expiration_month']")));
        WebElement element = driver.findElement(By.xpath("//select[@id='card_expiration_month']"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='01']")));
        element = driver.findElement(By.xpath("//option[@value='01']"));
        element.click();
        return this;
    }

    public OnboardingProcess clickExpirationYY(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='card_expiration_year']")));
        WebElement element = driver.findElement(By.xpath("//select[@id='card_expiration_year']"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='29']")));
        element = driver.findElement(By.xpath("//option[@value='29']"));
        element.click();
        return this;
    }

    public OnboardingProcess enterCVV(WebDriver driver, String CVV) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='card_cvv']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='card_cvv']"));
        element.clear();
        element.sendKeys(CVV);
        return this;
    }

    public OnboardingProcess enterCreditCardAddressLine1(WebDriver driver, String CreditCardAddressLine1) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='card_address_one']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='card_address_one']"));
        element.clear();
        element.sendKeys(CreditCardAddressLine1);
        return this;
    }

    public OnboardingProcess enterCreditCardAddressLine2(WebDriver driver, String CreditCardAddressLine2) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='card_address_two']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='card_address_two']"));
        element.clear();
        element.sendKeys(CreditCardAddressLine2);
        return this;
    }

    public OnboardingProcess enterCreditCardCity(WebDriver driver, String CreditCardCity) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='card_city']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='card_city']"));
        element.clear();
        element.sendKeys(CreditCardCity);
        return this;
    }

    public OnboardingProcess clickCreditCardCountry(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='card_country']")));
        WebElement element = driver.findElement(By.xpath("//select[@id='card_country']"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'Canada')]")));
        element = driver.findElement(By.xpath("//option[contains(text(),'Canada')]"));
        element.click();
        return this;
    }

    public OnboardingProcess clickCreditCardStateProvince(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='card_state']")));
        WebElement element = driver.findElement(By.xpath("//select[@id='card_state']"));
        element.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='BC']")));
        element = driver.findElement(By.xpath("//option[@value='BC']"));
        element.click();
        return this;
    }

    public OnboardingProcess enterCreditCardZipPostalCode(WebDriver driver, String CreditCardZipPostalCode) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='card_postal']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='card_postal']"));
        element.clear();
        element.sendKeys(CreditCardZipPostalCode);
        return this;
    }

    public OnboardingProcess enterLicenseNumber(WebDriver driver, String LicenseNumber) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='card_license_limit']")));
        WebElement element = driver.findElement(By.xpath("//input[@id='card_license_limit']"));
        element.click();
        element.clear();
        element.sendKeys(LicenseNumber);
        return this;
    }

    public OnboardingProcess clickUpdate(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button is-success']")));
        WebElement element = driver.findElement(By.xpath("//a[@class='button is-success']"));
        element.click();
        return this;
    }
}
        
