package UnusedClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManagerDeleteSite {

    @Test

    public void Delete() {

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

        //Check existing sites
        WebElement body = driver.findElement(By.className("el-table"));
        boolean site = body.getText().contains("July23");
        System.out.println(site);

        while (site) {

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
            element = ((ChromeDriver) driver).findElementByXPath("//i[@class='el-icon-edit']");

            //Click Edit button
            element.click();

            //Add delay 3 sec
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Find Delete Site button
            element = ((ChromeDriver) driver).findElementByXPath("//button[@class='button is-danger is-inverted']");

            //Click Delete Site button
            element.click();

            //Find Delete pop up button
            element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Delete')]");

            //Click Delete pop up button
            element.click();

            //Add delay 3 sec
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Find Search field
            element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Search']");

            //Clear Search field
            element.click();
            element.clear();

            //Add delay 3 sec
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Loop variable update
            body = driver.findElement(By.className("el-table"));
            site = body.getText().contains("July23");

            //Print boolean result
            System.out.println(site);
        }

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
