import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManagerAddManager2 {

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
        System.out.println("Page title is: " + driver.getTitle());

        // Verify the title of the page
        Assert.assertEquals(driver.getTitle(), "Customer Panel | Gaia");

        //Add delay 5 sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Company button
        element = ((ChromeDriver) driver).findElementByXPath("//div[@class='nav-center']//div[1]//div[1]");

        //Click Company button
        element.click();

        //Find Employees MI
        element = ((ChromeDriver) driver).findElementByXPath("//li[@id='navEmployee']");

        //Click Employees MI
        element.click();

        //Add delay 5 sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Add new employee button
        element = ((ChromeDriver) driver).findElementByXPath("//a[@class='button is-success is-pulled-right']");

        //Click Add new employee button
        element.click();

        //Add delay 5 sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Cancel button
        element = ((ChromeDriver) driver).findElementByXPath("//p[contains(text(),'Cancel')]");

        //Click Cancel button
        element.click();

        //Find Add new employee button
        element = ((ChromeDriver) driver).findElementByXPath("//a[@class='button is-success is-pulled-right']");

        //Click Add new employee button
        element.click();

        //Find Select a role
        element = ((ChromeDriver) driver).findElementByXPath("//span[@class='select']//select");

        //Click Select a role
        element.click();

        //Find Manager MI
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='manager']");

        //Click Manager MI
        element.click();

        //Find First Name field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='First Name']");

        //Enter First Name field
        element.sendKeys("TestManagerFirstName2");

        //Find Last Name field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Last Name']");

        //Enter Last Name field
        element.sendKeys("LastName2July23");

        //Find Notes field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Notes']");

        //Enter Notes field
        element.sendKeys("SomeNotes2July23");

        //Find Email field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Email']");

        //Enter Email field
        element.sendKeys("maksym.sudik+July23.3@fortify.pro");

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

        //Find Back to list button
        element = ((ChromeDriver) driver).findElementByXPath("//p[contains(text(),'Back to list')]");

        //Click Back to list button
        element.click();

        //Find Log Out button
        element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Log Out')]");

        //Click Log Out button
        element.click();

        //Kill the driver
        driver.quit();

    }
}

