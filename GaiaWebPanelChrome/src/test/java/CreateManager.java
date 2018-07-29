import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class CreateManager {

    @Test

    public void Create (){

        System.setProperty("webdriver.chrome.driver", "/Users/Maksym/IdeaProjects/GaiaWebPanelChrome/src/chromedriver");

        //Create e new browser window
        WebDriver driver = new ChromeDriver();

        //Invoke Login method
        LoginGaia login = new LoginGaia();

        //Run the method
        login.Login(driver);

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

        //Find Employees DDL menu item
        element = ((ChromeDriver) driver).findElementByXPath("//li[contains(text(),'Employees')]");

        //Click Employees DDL menu item
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Add a new employee button
        element = ((ChromeDriver) driver).findElementByXPath("//a[@class='button is-success is-pulled-right']");

        //Click Add a new employee button
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Cancel button
        element = ((ChromeDriver) driver).findElementByXPath("//p[contains(text(),'Cancel')]");

        //Click
        element.click();

        //Find Add a new employee button
        element = ((ChromeDriver) driver).findElementByXPath("//a[@class='button is-success is-pulled-right']");

        //Click Add a new employee button
        element.click();

        //Find Company DDL
        element = ((ChromeDriver) driver).findElementByXPath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/p[1]/span[1]/select[1]");

        //Click Company DDL button
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Just created Company
        element = ((ChromeDriver) driver).findElementByXPath("//option[contains(text(),'July23LandscapeEdited')]");

        //Click Just Created Company button
        element.click();

        //Find Role DDL
        element = ((ChromeDriver) driver).findElementByXPath("//form//div[2]//p[1]//span[1]//select[1]");

        //Click Role DDL
        element.click();

        //Find Manager MI
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='manager']");

        //Click Manager MI
        element.click();

        //Find First Name field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='First Name']");

        //Enter First Name field
        element.sendKeys("TestManagerFirstName");

        //Find Last Name field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Last Name']");

        //Enter Last Name
        element.sendKeys("LastNameJuly23");

        //Find Notes field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Notes']");

        //Enter Notes
        element.sendKeys("SomeNotesJuly23");

        //Find Email field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Email']");

        //Enter email
        element.sendKeys("maksym.sudik+July23.2@fortify.pro");

        //Find Password field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Password']");

        //Enter Password
        element.sendKeys("Password11");

        //Find Repeat Password field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Repeat Password']");

        //Enter Repeat Password
        element.sendKeys("Password11");

        //Find Restricted Access button
        element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Restricted Access')]");

        //Click Restricted Access button
        element.click();

        //Find Licensed User button
        element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Licensed User')]");

        //Click Licensed User button
        element.click();

        //Find Ability to login in multiple devices
        element = ((ChromeDriver) driver).findElementByXPath("//span[@class='el-checkbox__label']");

        //Click Ability to login in multiple devices
        element.click();

        //Find Add button
        element = ((ChromeDriver) driver).findElementByXPath("//button[@class='button is-success']");

        //Click Add button
        element.click();

        //Check Manager was created
        WebElement body = driver.findElement(By.tagName("body"));
        boolean ret = body.getText().contains("Success!");
        System.out.println(ret);
        ret = body.getText().contains("Added successfully");
        System.out.println(ret);

        //Find Log Out button
        element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Log Out')]");

        //Click Log Out button
        element.click();

        //Kill the driver
        driver.quit();












    }
}
