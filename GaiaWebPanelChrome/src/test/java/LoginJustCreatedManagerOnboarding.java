import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginJustCreatedManagerOnboarding {

    @Test

    public void Create() {

        System.setProperty("webdriver.chrome.driver", "/Users/Maksym/IdeaProjects/GaiaWebPanelChrome/src/chromedriver");

        //Create e new browser window
        WebDriver driver = new ChromeDriver();

        //Navigate to the website
        driver.get("https://customerdev3.gaialandscape.com/login");

        //Find the username field
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Username']"));

        //Enter username
        element.sendKeys("test.manager.first.name.last.name.july.23");

        //Find the password field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Password']");

        //Enter password
        element.sendKeys("Password11");

        //Find Login button
        element = ((ChromeDriver) driver).findElementByXPath("//button[@class='button is-success']");

        //Click Login button
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Continue button
        element = ((ChromeDriver) driver).findElementByXPath("//button[@class='button is-success']");

        //Click Continue button
        element.click();

        //Read the title of the page and put it into results
        System.out.println("Page title is: "+driver.getTitle());

        // Verify the title of the page
        Assert.assertEquals(driver.getTitle(), "Customer Panel | Gaia");

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Institution number
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='bank_institution']");

        //Enter Institution number
        element.sendKeys("000");

        //Find Transit number
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='bank_transit']");

        //Enter Transit number
        element.sendKeys("11000");

        //Find Account number
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='bank_account_number']");

        //Enter Account number
        element.sendKeys("000123456789");

        //Find Account holder name
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='bank_holder_name']");

        //Enter Account holder name
        element.sendKeys("TestHolderName");

        //Find Account type
        element = ((ChromeDriver) driver).findElementByXPath("//select[@id='bank_account_type']");

        //Click Account type
        element.click();

        //Find Company
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='company']");

        //Click Company
        element.click();

        //Find Save button
        element = ((ChromeDriver) driver).findElementByXPath("//a[@class='button is-success']");

        //Click Save button
        element.click();

        //Add delay 5 sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find First Name field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='legal_first_name']");

        //Enter First Name field
        element.sendKeys("FirstNameLegalIdentity");

        //Find Last Name field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='legal_last_name']");

        //Enter Last Name field
        element.sendKeys("LastNameLegalIdentity");

        //Find Date of birth field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='yyyy-mmm-dd']");

        //Enter Date of birth field
        element.sendKeys("1980-Jan-02");

        //Close th Calendar's window
        element.click();
        element.sendKeys(Keys.RETURN);

        //Find Address line 1 field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='legal_address_one']");

        //Enter Address line 1 field
        element.sendKeys("Office 111");

        //Find Address line 2 field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='legal_address_two']");

        //Enter Address line 2 field
        element.sendKeys("1st ST");

        //Find City field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='legal_city']");

        //Enter City field
        element.sendKeys("TestCity");

        //Find Country DDL
        element = ((ChromeDriver) driver).findElementByXPath("//select[@id='legal_country']");

        //Click Country DDL
        element.click();

        //Find Canada country
        element = ((ChromeDriver) driver).findElementByXPath("//option[contains(text(),'Canada')]");

        //Click Canada country
        element.click();

        //Find State/Province DDL
        element = ((ChromeDriver) driver).findElementByXPath("//select[@id='legal_state']");

        //Click State/Province DDL
        element.click();

        //Find British Columbia MI
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='BC']");

        //Click British Columbia MI
        element.click();

        //Find Zip/Postal Code field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='legal_postal_code']");

        //Enter Zip/Postal Code field
        element.sendKeys("V0V0V0");

        //Find Identity verification button
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='legal_identity_image']");

        //Upload image
        element.sendKeys("/Users/Maksym/IdeaProjects/GaiaWebPanelChrome/src/Images/Test.png");

        //Add delay 5 sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Save button
        element = ((ChromeDriver) driver).findElementByXPath("//button[@id='legal_submit']");

        //Click Save button
        element.click();

        //Add delay 5 sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Credit card number field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='card_number']");

        //Enter Credit card number field
        element.sendKeys("4111 1111 1111 1111");

        //Find Name on card field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='card_name']");

        //Enter Name on card field
        element.sendKeys("TestNameCard");

        //Find Expiration (MM) DDL
        element = ((ChromeDriver) driver).findElementByXPath("//select[@id='card_expiration_month']");

        //Click Find Expiration (MM) DDL
        element.click();

        //Find 01
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='01']");

        //Click 01
        element.click();

        //Find Expiration (YY)
        element = ((ChromeDriver) driver).findElementByXPath("//select[@id='card_expiration_year']");

        //Click Expiration (YY)
        element.click();

        //Find 29
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='29']");

        //Click 29
        element.click();

        //Find CVV
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='card_cvv']");

        //Enter CVV
        element.sendKeys("111");

        //Find Address line 1 field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='card_address_one']");

        //Enter Address line 1 field
        element.sendKeys("Office 111");

        //Find Address line 2 field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='card_address_two']");

        //Enter line 2 field
        element.sendKeys("1st ST");

        //Find City field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='card_city']");

        //Enter City field
        element.sendKeys("TestCardCity");

        //Find Country DDL
        element = ((ChromeDriver) driver).findElementByXPath("//select[@id='card_country']");

        //Click Country DDL
        element.click();

        //Find Canada MI
        element = ((ChromeDriver) driver).findElementByXPath("//option[contains(text(),'Canada')]");

        //Click Canada MI
        element.click();

        //Find State/Province DDL
        element = ((ChromeDriver) driver).findElementByXPath("//select[@id='card_state']");

        //Click
        element.click();

        //Find British Columbia MI
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='BC']");

        //Click British Columbia MI
        element.click();

        //Find Zip/Postal Code field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='card_postal']");

        //Enter Zip/Postal Code field
        element.sendKeys("V0V0V0");

        //Find
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='card_license_limit']");

        //Clear the field
        element.click();
        element.clear();

        //Enter
        element.sendKeys("10");

        //Find Update button
        element = ((ChromeDriver) driver).findElementByXPath("//a[@class='button is-success']");

        //Click Update button
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Log Out button
        element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Log Out')]");

        //Click Log Out button
        element.click();

        //Kill the driver
        driver.quit();


    }
}
