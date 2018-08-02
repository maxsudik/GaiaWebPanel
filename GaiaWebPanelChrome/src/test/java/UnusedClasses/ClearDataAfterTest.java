package UnusedClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ClearDataAfterTest {
    private WebDriver driver;

    @Test

    public void Delete (String LoginName, String PasswordName) {

        System.setProperty("webdriver.chrome.driver", "src/chromedriver");

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

        //Find Company DDL menu item
        element = ((ChromeDriver) driver).findElementByXPath("//li[@class='router-link-active']");

        //Click Company DDL menu item
        element.click();

        //Check existing companies
        WebElement body = driver.findElement(By.tagName("body"));
        boolean company = body.getText().contains("July23");
        System.out.println(company);

        while (company) {

            //Find Search field
            element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Search']");

            //Enter Search field
            element.sendKeys("July23");

            //Add delay 3 sec
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Find Delete button
            element = ((ChromeDriver) driver).findElementByXPath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/button[2]");

            //Click Delete button
            element.click();

            //Find Delete button pop up
            element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Delete')]");

            //Click Delete button pop up
            element.click();

            //Find Search field
            element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Search']");
            //Add delay 3 sec
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Clear the field
            element.clear();

            //Loop variable update
            body = driver.findElement(By.tagName("body"));
            company = body.getText().contains("July23");

            //Print boolean result
            System.out.println(company);
        }

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Company button
        element = ((ChromeDriver) driver).findElementByXPath("//div[@class='web-style is-tab is-hidden-mobile web-style-active']");

        //Click Company button
        element.click();

        //Find Employee MI
        element = ((ChromeDriver) driver).findElementByXPath("//li[@id='navEmployee']");

        //Click Employee MI
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Search field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Search']");

        //Enter Search field
        element.sendKeys("July23");

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        boolean employee = body.getText().contains("July23");
        System.out.println(employee);

        while (employee) {

            //Find Search field
            element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Search']");

            //Clear Search field
            element.clear();

            //Find Search field
            element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Search']");

            //Enter Search field
            element.sendKeys("July23");

            //Add delay 3 sec
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Find Edit button
            element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Edit')]");

            //Click Edit button
            element.click();

            //Add delay 3 sec
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Find Delete Employee button
            element = ((ChromeDriver) driver).findElementByXPath("//button[@class='button is-danger is-inverted']");

            //Click Delete Employee button
            element.click();

            //Find Delete button pop up
            element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Delete')]");

            //Click Delete button pop up
            element.click();

            //Add delay 3 sec
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Find Search field
            element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Search']");

            //Enter Search field
            element.sendKeys("July23");

            //Add delay 3 sec
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Loop variable update
            body = driver.findElement(By.tagName("body"));
            employee = body.getText().contains("July23");

            //Print boolean result
            System.out.println(employee);
        }

        //Find log Out button
        element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Log Out')]");

        //Click Log Out button
        element.click();

        //Kill the driver
        driver.quit();

    }
}
