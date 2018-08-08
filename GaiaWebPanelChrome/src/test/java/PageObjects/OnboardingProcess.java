package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnboardingProcess {
    
    public OnboardingProcess enterInstitutionNumber (WebDriver driver, String InstitutionNumber) {

        WebElement element = driver.findElement(By.xpath("//input[@id='bank_institution']"));
        element.clear();
        element.sendKeys(InstitutionNumber);
        return this;
    }

    public OnboardingProcess enterTransitNumber (WebDriver driver, String TransitNumber) {
        WebElement element = driver.findElement(By.xpath("//input[@id='bank_transit']"));
        element.clear();
        element.sendKeys(TransitNumber);
        return this;
    }

    public OnboardingProcess enterAccountNumber (WebDriver driver, String AccountNumber) {

        WebElement element = driver.findElement(By.xpath("//input[@id='bank_account_number']"));
        element.clear();
        element.sendKeys(AccountNumber);
        return this;
    }

    public OnboardingProcess enterAccountHolderName (WebDriver driver, String AccountHolderName) {

        WebElement element = driver.findElement(By.xpath("//input[@id='bank_holder_name']"));
        element.clear();
        element.sendKeys(AccountHolderName);
        return this;
    }

    public OnboardingProcess clickAccountTypeCompany (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//select[@id='bank_account_type']"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='company']"));
        element.click();
        return this;
    }

    public OnboardingProcess clickSave1 (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//a[@class='button is-success']"));
        element.click();
        return this;
    }

    public OnboardingProcess enterFirstName (WebDriver driver, String FirstName) {

        WebElement element = driver.findElement(By.xpath("//input[@id='legal_first_name']"));
        element.clear();
        element.sendKeys(FirstName);
        return this;
    }

    public OnboardingProcess enterLastName (WebDriver driver, String LastName) {

        WebElement element = driver.findElement(By.xpath("//input[@id='legal_last_name']"));
        element.clear();
        element.sendKeys(LastName);
        return this;
    }

    public OnboardingProcess enterDateOfBirth (WebDriver driver, String DateOfBirth) {

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='yyyy-mmm-dd']"));
        element.sendKeys(DateOfBirth);
        element.click();
        element.sendKeys(Keys.RETURN);
        return this;
    }

    public OnboardingProcess enterAddressLine1 (WebDriver driver, String AddressLine1) {

        WebElement element = driver.findElement(By.xpath("//input[@id='legal_address_one']"));
        element.clear();
        element.sendKeys(AddressLine1);
        return this;
    }

    public OnboardingProcess enterAddressLine2 (WebDriver driver, String AddressLine2) {

        WebElement element = driver.findElement(By.xpath("//input[@id='legal_address_two']"));
        element.clear();
        element.sendKeys(AddressLine2);
        return this;
    }

    public OnboardingProcess enterCity (WebDriver driver, String City) {

        WebElement element = driver.findElement(By.xpath("//input[@id='legal_city']"));
        element.clear();
        element.sendKeys(City);
        return this;
    }

    public OnboardingProcess clickCountry (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//select[@id='legal_country']"));
        element.click();
        element = driver.findElement(By.xpath("//option[contains(text(),'Canada')]"));
        element.click();
        return this;
    }

    public OnboardingProcess clickStateProvinceDDL (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//select[@id='legal_state']"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='BC']"));
        element.click();
        return this;
    }

    public OnboardingProcess enterZipPostalCode (WebDriver driver, String ZipPostalCode) {

        WebElement element = driver.findElement(By.xpath("//input[@id='legal_postal_code']"));
        element.clear();
        element.sendKeys(ZipPostalCode);
        return this;
    }

    public OnboardingProcess uploadID (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//input[@id='legal_identity_image']"));
        element.sendKeys("/Users/Maksym/IdeaProjects/GaiaWebPanel/GaiaWebPanelChrome/src/Images/Test.png");
        return this;
    }

    public OnboardingProcess clickSave2(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//button[@id='legal_submit']"));
        element.click();
        return this;
    }

    public OnboardingProcess enterCreditCardNumber (WebDriver driver, String CreditCardNumber) {

        WebElement element = driver.findElement(By.xpath("//input[@id='card_number']"));
        element.clear();
        element.sendKeys(CreditCardNumber);
        return this;
    }

    public OnboardingProcess enterNameOnCard(WebDriver driver, String NameOnCard) {

        WebElement element = driver.findElement(By.xpath("//input[@id='card_name']"));
        element.clear();
        element.sendKeys(NameOnCard);
        return this;
    }

    public OnboardingProcess clickExpirationMM (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//select[@id='card_expiration_month']"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='01']"));
        element.click();
        return this;
    }

    public OnboardingProcess clickExpirationYY (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//select[@id='card_expiration_year']"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='29']"));
        element.click();
        return this;
    }

    public OnboardingProcess enterCVV (WebDriver driver, String CVV) {

        WebElement element = driver.findElement(By.xpath("//input[@id='card_cvv']"));
        element.clear();
        element.sendKeys(CVV);
        return this;
    }

    public OnboardingProcess enterCreditCardAddressLine1(WebDriver driver, String CreditCardAddressLine1) {

        WebElement element = driver.findElement(By.xpath("//input[@id='card_address_one']"));
        element.clear();
        element.sendKeys(CreditCardAddressLine1);
        return this;
    }

    public OnboardingProcess enterCreditCardAddressLine2 (WebDriver driver, String CreditCardAddressLine2) {

        WebElement element = driver.findElement(By.xpath("//input[@id='card_address_two']"));
        element.clear();
        element.sendKeys(CreditCardAddressLine2);
        return this;
    }

    public OnboardingProcess enterCreditCardCity (WebDriver driver, String CreditCardCity) {

        WebElement element = driver.findElement(By.xpath("//input[@id='card_city']"));
        element.clear();
        element.sendKeys(CreditCardCity);
        return this;
    }

    public OnboardingProcess clickCreditCardCountry (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//select[@id='card_country']"));
        element.click();
        element = driver.findElement(By.xpath("//option[contains(text(),'Canada')]"));
        element.click();
        return this;
    }

    public OnboardingProcess clickCreditCardStateProvince (WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//select[@id='card_state']"));
        element.click();
        element = driver.findElement(By.xpath("//option[@value='BC']"));
        element.click();
        return this;
    }

    public OnboardingProcess enterCreditCardZipPostalCode (WebDriver driver, String CreditCardZipPostalCode) {

        WebElement element = driver.findElement(By.xpath("//input[@id='card_postal']"));
        element.clear();
        element.sendKeys(CreditCardZipPostalCode);
        return this;
    }

    public OnboardingProcess enterLicenseNumber (WebDriver driver, String LicenseNumber) {

        WebElement element = driver.findElement(By.xpath("//input[@id='card_license_limit']"));
        element.click();
        element.clear();
        element.sendKeys(LicenseNumber);
        return this;
    }

    public OnboardingProcess clickUpdate(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//a[@class='button is-success']"));
        element.click();
        return this;
    }
}
        
