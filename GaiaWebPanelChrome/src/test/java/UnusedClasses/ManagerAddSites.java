package UnusedClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManagerAddSites {

    @Test

    public void Add() {

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

        //Add delay 5 sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Read the title of the page and put it into results
        System.out.println("Page title is: " + driver.getTitle());

        // Verify the title of the page
        Assert.assertEquals(driver.getTitle(), "Customer Panel | Gaia");

        //Find Company button
        element = ((ChromeDriver) driver).findElementByXPath("//div[@class='nav-center']//div[1]//div[1]");

        //Click Company button
        element.click();

        //Find Sites MI
        element = ((ChromeDriver) driver).findElementByXPath("//li[@id='navSite']");

        //Click Sites MI
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Add a new site button
        element = ((ChromeDriver) driver).findElementByXPath("//a[@class='button is-success is-pulled-right']");

        //Click Add a new site button
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Back button
        element = ((ChromeDriver) driver).findElementByXPath("//button[@class='button']");

        //Click Back button
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Add a new site button
        element = ((ChromeDriver) driver).findElementByXPath("//a[@class='button is-success is-pulled-right']");

        //Click Add a new site button
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Site Name field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Name']");

        //Enter Site Name field
        element.sendKeys("TestSite1July23");

        //Find
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Detect radius']");

        //Clear the field
        element.click();
        element.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        element.sendKeys(Keys.DELETE);

        //Enter
        element.sendKeys("50");

        //Find Notes field
        element = ((ChromeDriver) driver).findElementByXPath("//textarea[@placeholder='Add your notes for this site.']");

        //Enter Notes field
        element.sendKeys("SomeNotesSite1");

        //Find Address field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Address']");

        //Enter Address field
        element.sendKeys("Office 111 1st ST");

        //Find City field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='City']");

        //Enter City field
        element.sendKeys("Vancouver");

        //Find State/Province DDL
        element = ((ChromeDriver) driver).findElementByXPath("//select[@name='state']");

        //Click State/Province DDL
        element.click();

        //Find Manitoba MI
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='MB']");

        //Click Manitoba MI
        element.click();

        //Find Zip/Postal Code field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Zip/Postal']");

        //Enter Zip/Postal Code field
        element.sendKeys("V0V0V0");

        //Find Country DDL
        element = ((ChromeDriver) driver).findElementByXPath("//select[@name='country']");

        //Click Country DDL
        element.click();

        //Find Canada MI
        element = ((ChromeDriver) driver).findElementByXPath("//option[contains(text(),'Canada')]");

        //Click Canada MI
        element.click();

        //Find Fetch GPS coordinates
        element = ((ChromeDriver) driver).findElementByXPath("//button[@name='button']");

        //Click Fetch GPS coordinates
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Add button
        element = ((ChromeDriver) driver).findElementByXPath("//button[contains(text(),'Add')]");

        //Click Add button
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //Check Site was created
        WebElement body = driver.findElement(By.tagName("body"));
        boolean ret = body.getText().contains("Success!");
        System.out.println(ret);
        ret = body.getText().contains("Site added successfully");
        System.out.println(ret);

        //Find Back button
        element = ((ChromeDriver) driver).findElementByXPath("//button[@class='button']");

        //Click Back button
        element.click();

        //Find Log Out button
        element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Log Out')]");

        //Click Log Out button
        element.click();

        //Kill the driver
        driver.quit();
    }
}