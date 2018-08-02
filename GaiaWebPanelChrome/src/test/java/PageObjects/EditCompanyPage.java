package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditCompanyPage {

    public EditCompanyPage clickEditButton(WebDriver driver) {

        //Find Edit button
        WebElement element = driver.findElement(By.xpath("//span[@class='tag is-info']"));
        //Click Edit button
        element.click();
        return this;
    }

    public EditCompanyPage clickCancelButton(WebDriver driver) {

        //Find button Cancel
        WebElement element =driver.findElement(By.xpath("//button[@class='button']"));
        //Click button Cancel
        element.click();
        return this;
    }

    public EditCompanyPage uploadNewLogo(WebDriver driver) {

        //Find Company picture button
        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        //Upload the new picture
        element.sendKeys("/Users/Maksym/IdeaProjects/GaiaWebPanelChrome/src/Images/Test.png");
        return this;
    }

    public EditCompanyPage editComanyName(WebDriver driver, String EditedCompanyName) {

        //Find Company name field
        WebElement element = driver.findElement(By.xpath("//input[@id='company_name']"));
        //Clear the field
        element.click();
        element.clear();
        //Enter updated Company name
        element.sendKeys(EditedCompanyName);
        return this;
    }

    public EditCompanyPage editComanyEmail(WebDriver driver, String EditedCompanyEmail) {

        //Find Company email
        WebElement element = driver.findElement(By.xpath("//input[@id='company_email']"));
        //Clear the field
        element.click();
        element.clear();
        //Enter updated company email
        element.sendKeys(EditedCompanyEmail);
        return this;
    }

    public EditCompanyPage editComanyWebSite(WebDriver driver, String EditedCompanyWebSite) {

        //Find Website field
        WebElement element = driver.findElement(By.xpath("//input[@id='website']"));
        //Clear the field
        element.click();
        element.clear();
        //Enter updated website
        element.sendKeys(EditedCompanyWebSite);
        return this;
    }

    public EditCompanyPage editComanyTaxNumber(WebDriver driver, String EditedCompanyTaxNumber) {

        //Find Company tax number
        WebElement element = driver.findElement(By.xpath("//input[@id='tax_number']"));
        //Clear the field
        element.click();
        element.clear();
        //Enter updated company tax number
        element.sendKeys(EditedCompanyTaxNumber);
        return this;
    }

    public EditCompanyPage clickCompanyTypeSupplier(WebDriver driver) {

        //Find Company type
        WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div[@class='card']/div[@class='card-content']/div[contains(@class,'columns')]/div[@class='column is-half']/div[@class='field']/p[1]/span[1]/select[1]"));
        //Click Company Type
        element.click();
        //Find Supplier
        element = driver.findElement(By.xpath("//option[@value='supplier']"));
        //Click Supplier
        element.click();
        return this;
    }
    public EditCompanyPage clickCompanyTypeLandscape(WebDriver driver) {

        //Find Company type
        WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div[@class='card']/div[@class='card-content']/div[contains(@class,'columns')]/div[@class='column is-half']/div[@class='field']/p[1]/span[1]/select[1]"));
        //Click Company Type
        element.click();
        //Find Landscape
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='landscape']");
        //Click Landscape
        element.click();
        return this;
    }
    public EditCompanyPage clickCurrencyUSD(WebDriver driver) {

        //Find Currency
        WebElement element = driver.findElement(By.xpath("//div[@class='field']//p[2]//span[1]//select[1]"));
        //Click Currency
        element.click();
        //Find USD
        element = driver.findElement(By.xpath("//option[@value='USD']");
        //Click USD
        element.click();
        return this;
    }

    //Find Currency
    element = ((ChromeDriver) driver).findElementByXPath("//div[@class='field']//p[2]//span[1]//select[1]");

    //Click Currency
        element.click();

    //Find MXN
    element = ((ChromeDriver) driver).findElementByXPath("//option[@value='MXN']");

    //Click MXN
        element.click();

    //Find Currency
    element = ((ChromeDriver) driver).findElementByXPath("//div[@class='field']//p[2]//span[1]//select[1]");

    //Click Currency
        element.click();

    //Find Currency
    element = ((ChromeDriver) driver).findElementByXPath("//option[contains(text(),'Currency')]");

    //Click Currency
        element.click();

    //Find Currency
    element = ((ChromeDriver) driver).findElementByXPath("//div[@class='field']//p[2]//span[1]//select[1]");

    //Click Currency
        element.click();

    //Find CAD
    element = ((ChromeDriver) driver).findElementByXPath("//option[@value='CAD']");

    //Click CAD
        element.click();

    //Find License limit
    element = ((ChromeDriver) driver).findElementByXPath("//input[@id='admin_card_license_limit']");

    //Clear the field
        element.click();
        element.clear();

    //Enter update Licence limit
        element.sendKeys("20");

    //Find Product Spread Reduction Percentage
    element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='20']");

    //Clear the field
        element.click();
        element.clear();

    //Enter updated Product Spread Reduction Percentage
        element.sendKeys("35");

    //Find Address line 1
    element = ((ChromeDriver) driver).findElementByXPath("//input[@id='address_one']");

    //Clear the field
        element.click();
        element.clear();

    //Enter updated Address line 1
        element.sendKeys("Office 111");

    //Find Address line 2
    element = ((ChromeDriver) driver).findElementByXPath("//input[@id='address_two']");

    //Clear the field
        element.click();
        element.clear();

    //Enter updated Address line 2
        element.sendKeys("1st ST");

    //Find City
    element = ((ChromeDriver) driver).findElementByXPath("//input[@id='address_city']");

    //Clear the field
        element.click();
        element.clear();

    //Enter updated City
        element.sendKeys("Vancouver");

    //Find Country
    element = ((ChromeDriver) driver).findElementByXPath("//select[@id='address_country']");

    //Click Country
        element.click();

    //Find United States
    element = ((ChromeDriver) driver).findElementByXPath("//option[@value='US']");

    //Click United States
        element.click();

    //Find Country
    element = ((ChromeDriver) driver).findElementByXPath("//select[@id='address_country']");

    //Click Country
        element.click();

    //Find Mexico
    element = ((ChromeDriver) driver).findElementByXPath("//option[@value='MX']");

    //Click Mexico
        element.click();

    //Find Country
    element = ((ChromeDriver) driver).findElementByXPath("//select[@id='address_country']");

    //Click Country
        element.click();

    //Find a Country
    element = ((ChromeDriver) driver).findElementByXPath("//option[contains(text(),'Select a country')]");

    //Click a Country
        element.click();

    //Find Country
    element = ((ChromeDriver) driver).findElementByXPath("//select[@id='address_country']");

    //Click Country
        element.click();

    //Find Canada
    element = ((ChromeDriver) driver).findElementByXPath("//option[contains(text(),'Canada')]");

    //Click Canada
        element.click();

    //Find State/Province
    element = ((ChromeDriver) driver).findElementByXPath("//select[@id='address_state']");

    //Click State/Province
        element.click();

    //Find Yukon
    element = ((ChromeDriver) driver).findElementByXPath("//option[@value='YT']");

    //Click Yukon
        element.click();

    //Find Zip/Postal Code
    element = ((ChromeDriver) driver).findElementByXPath("//input[@id='address_postalcode']");

    //Clear the field
        element.click();
        element.clear();

    //Enter Zip/Postal Code
        element.sendKeys("TTT 111");

    //Find Company description
    element = ((ChromeDriver) driver).findElementByXPath("//textarea[@id='description']");

    //Clear the field
        element.click();
        element.clear();

    //Enter updated company description
        element.sendKeys("Edited Company description");

    //Find Save
    element = ((ChromeDriver) driver).findElementByXPath("//button[@id='address_submit']");

    //Click Save
        element.click();
}
