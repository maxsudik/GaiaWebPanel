import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManagerEditEmployees {

    @Test

    public void Edit() {

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

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
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

        //Find Search field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Search']");

        //Enter Search field
        element.sendKeys("TestManagerFirstName2");

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

        //Find Select a role
        element = ((ChromeDriver) driver).findElementByXPath("//span[@class='select']//select");

        //Click Select a role
        element.click();

        //Find Installer MI
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='installer']");

        //Click Installer MI
        element.click();

        //Find First Name field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='First Name']");

        //Enter First Name field
        element.sendKeys("DEL");

        //Find Last Name field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Last Name']");

        //Enter Last Name field
        element.sendKeys("Q");

        //Find Notes field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Notes']");

        //Enter Notes field
        element.sendKeys("Q");

        //Find Email field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Email']");

        //Enter Email field
        element.sendKeys("Q");

        //Find Edit Password button
        element = ((ChromeDriver) driver).findElementByXPath("//span[@class='tag is-info']");

        //Click Edit Password button
        element.click();

        //Find Password field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Password']");

        //Enter Password
        element.sendKeys("Password22");

        //Find Repeat Password field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Repeat Password']");

        //Enter Repeat Password
        element.sendKeys("Password22");

        //Find Update button
        element = ((ChromeDriver) driver).findElementByXPath("//button[@class='button is-success']");

        //Click Update button
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Check Manager was created
        WebElement body = driver.findElement(By.tagName("body"));
        boolean ret = body.getText().contains("Success!");
        System.out.println(ret);
        ret = body.getText().contains("Updated successfully");
        System.out.println(ret);

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

        //Find Search field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Search']");

        //Enter Search field
        element.sendKeys("TestSupervisorFirstName2");

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
        element.sendKeys("DEL");

        //Find Last Name field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Last Name']");

        //Enter Last Name field
        element.sendKeys("Q");

        //Find Notes field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Notes']");

        //Enter Notes field
        element.sendKeys("Q");

        //Find Email field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Email']");

        //Enter Email field
        element.sendKeys("Q");

        //Find Edit Password button
        element = ((ChromeDriver) driver).findElementByXPath("//span[@class='tag is-info']");

        //Click Edit Password button
        element.click();

        //Find Password field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Password']");

        //Enter Password
        element.sendKeys("Password22");

        //Find Repeat Password field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Repeat Password']");

        //Enter Repeat Password
        element.sendKeys("Password22");

        //Find Update button
        element = ((ChromeDriver) driver).findElementByXPath("//button[@class='button is-success']");

        //Click Update button
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Check Manager was created
        body = driver.findElement(By.tagName("body"));
        ret = body.getText().contains("Success!");
        System.out.println(ret);
        ret = body.getText().contains("Updated successfully");
        System.out.println(ret);

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

        //Find Search field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Search']");

        //Enter Search field
        element.sendKeys("TestInstallerFirstName2");

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
        element.sendKeys("DEL");

        //Find Last Name field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Last Name']");

        //Enter Last Name field
        element.sendKeys("Q");

        //Find Notes field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Notes']");

        //Enter Notes field
        element.sendKeys("Q");

        //Find Email field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Email']");

        //Enter Email field
        element.sendKeys("Q");

        //Find Edit Password button
        element = ((ChromeDriver) driver).findElementByXPath("//span[@class='tag is-info']");

        //Click Edit Password button
        element.click();

        //Find Password field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Password']");

        //Enter Password
        element.sendKeys("Password22");

        //Find Repeat Password field
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Repeat Password']");

        //Enter Repeat Password
        element.sendKeys("Password22");

        //Find Update button
        element = ((ChromeDriver) driver).findElementByXPath("//button[@class='button is-success']");

        //Click Update button
        element.click();

        //Check Manager was created
        body = driver.findElement(By.tagName("body"));
        ret = body.getText().contains("Success!");
        System.out.println(ret);
        ret = body.getText().contains("Added successfully");
        System.out.println(ret);

        //Find Back button
        element = ((ChromeDriver) driver).findElementByXPath("//button[@class='button']");

        //Click Back button
        element.click();

        //Find log Out button
        element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Log Out')]");

        //Click Log Out button
        element.click();

        //Kill the driver
        driver.quit();
    }
}
