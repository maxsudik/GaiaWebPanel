
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLandscapeCompany {

    @Test

    public void Edit (String LoginName, String PasswordName) {

        System.setProperty("webdriver.chrome.driver", "/Users/Maksym/IdeaProjects/GaiaWebPanelChrome/src/chromedriver");

        //Create e new browser window
        WebDriver driver = new ChromeDriver();

        //Invoke Login method
        LoginGaia login = new LoginGaia();

        //Run the method
        login.Login(driver, LoginName, PasswordName);

        //Add delay 5 sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Company button
        WebElement element = ((ChromeDriver) driver).findElementByXPath("//div[@class='web-style is-tab is-hidden-mobile web-style-active']");

        //Click Company button
        element.click();

        //Find Search field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Search']");

        //Enter the name of just created company
        element.sendKeys("July23Landscape");

        //Find button Edit
        element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Edit')]");

        //Click button Edit
        element.click();

        //Add delay 5 sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Edit button
        element = ((ChromeDriver) driver).findElementByXPath("//span[@class='tag is-info']");

        //Click Edit button
        element.click();

        //Find button Cancel
        element = ((ChromeDriver) driver).findElementByXPath("//button[@class='button']");

        //Click button Cancel
        element.click();

        //Find Edit button
        element = ((ChromeDriver) driver).findElementByXPath("//span[@class='tag is-info']");

        //Click Edit button
        element.click();

        //Find Company picture button
        element = ((ChromeDriver) driver).findElementByXPath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");

        //Upload the new picture
        element.sendKeys("/Users/Maksym/IdeaProjects/GaiaWebPanelChrome/src/Images/Test.png");

        //Find Company name field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='company_name']");

        //Clear the field
        element.click();
        element.clear();

        //Enter updated Company name
        element.sendKeys("July23LandscapeEdited");

        //Find Company email
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='company_email']");

        //Clear the field
        element.click();
        element.clear();

        //Enter updated company email
        element.sendKeys("maksym.sudik+July23.1.Edited@fortify.pro");

        //Find Website field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='website']");

        //Clear the field
        element.click();
        element.clear();

        //Enter updated website
        element.sendKeys("http://editedcompanywebsite.com");

        //Find Company tax number
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='tax_number']");

        //Clear the field
        element.click();
        element.clear();

        //Enter updated company tax number
        element.sendKeys("11111");

        //Find Company type
        element = ((ChromeDriver) driver).findElementByXPath("//body/div[@id='app']/div/div/div/div[@class='card']/div[@class='card-content']/div[contains(@class,'columns')]/div[@class='column is-half']/div[@class='field']/p[1]/span[1]/select[1]");

        //Click Company Type
        element.click();

        //Find Supplier
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='supplier']");

        //Click Supplier
        element.click();

        //Find Company type
        element = ((ChromeDriver) driver).findElementByXPath("//body/div[@id='app']/div/div/div/div[@class='card']/div[@class='card-content']/div[contains(@class,'columns')]/div[@class='column is-half']/div[@class='field']/p[1]/span[1]/select[1]");

        //Click Company Type
        element.click();

        //Find Type
        element = ((ChromeDriver) driver).findElementByXPath("//option[contains(text(),'Type')]");

        //Click Type
        element.click();

        //Find Company type
        element = ((ChromeDriver) driver).findElementByXPath("//body/div[@id='app']/div/div/div/div[@class='card']/div[@class='card-content']/div[contains(@class,'columns')]/div[@class='column is-half']/div[@class='field']/p[1]/span[1]/select[1]");

        //Click Company Type
        element.click();

        //Find Landscape
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='landscape']");

        //Click Landscape
        element.click();

        //Find Currency
        element = ((ChromeDriver) driver).findElementByXPath("//div[@class='field']//p[2]//span[1]//select[1]");

        //Click Currency
        element.click();

        //Find USD
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='USD']");

        //Click USD
        element.click();

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

        //Find Log Out button
        element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Log Out')]");

        //Click Log Out button
        element.click();

        //Kill the driver
        driver.quit();

    }
}
