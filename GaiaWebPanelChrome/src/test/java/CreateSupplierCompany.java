import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class CreateSupplierCompany {

    @Test

    public void Create (String LoginName, String PasswordName) {

        System.setProperty("webdriver.chrome.driver", "/Users/Maksym/IdeaProjects/GaiaWebPanelChrome/src/chromedriver");

        //Create e new browser window
        WebDriver driver = new ChromeDriver();

        //Invoke Login method
        LoginGaia login = new LoginGaia();

        //Run the method
        login.Login(driver, LoginName, PasswordName);

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Company button
        WebElement element = ((ChromeDriver) driver).findElementByXPath("//div[@class='web-style is-tab is-hidden-mobile web-style-active']");

        //Click Company button
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Add a new company
        element = ((ChromeDriver) driver).findElementByXPath("//a[@class='button is-success is-pulled-right']");

        //Click Add a new company
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Company name field
        element =((ChromeDriver) driver).findElementByXPath("//input[@id='company_name']");

        //Enter valid name
        element.sendKeys("July23Supplier");

        //Find Company email field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='company_email']");

        //Enter valid email
        element.sendKeys("maksym.sudik+July23.1@fortify.pro");

        //Find Company tax number field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='tax_number']");

        //Enter Tax number
        element.sendKeys("00000");

        //Find Company type
        element = ((ChromeDriver) driver).findElementByXPath("//div[@class='card-content']//div[4]//p[1]//span[1]//select[1]");

        //Click Company type DDL
        element.click();

        //Find Supplier DDL menu item
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='supplier']");

        //Click Supplier DDL
        element.click();

        //Find Currency DDL
        element = ((ChromeDriver) driver).findElementByXPath("//div[@class='card-content']//div[5]//p[1]//span[1]//select[1]");

        //Click Currency DDL
        element.click();

        //Find Currency DDL menu item
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='CAD']");

        //Click Currency DDL menu item
        element.click();

        //Find Company description
        element = ((ChromeDriver) driver).findElementByXPath("//textarea[@id='description']");

        //Enter Company description
        element.sendKeys("Company Description");

        //Find button Add
        element = ((ChromeDriver) driver).findElementByXPath("//button[@class='button is-success']");

        //Click button Add
        element.click();

        //Find Log Out button
        element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Log Out')]");

        //Click Log Out button
        element.click();

        //Kill the driver
        driver.quit();

    }
}
