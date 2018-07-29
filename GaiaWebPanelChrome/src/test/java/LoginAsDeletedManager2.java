import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAsDeletedManager2 {

    @Test

    public void Login() {

        System.setProperty("webdriver.chrome.driver", "/Users/Maksym/IdeaProjects/GaiaWebPanelChrome/src/chromedriver");

        //Create e new browser window
        WebDriver driver = new ChromeDriver();

        //Navigate to the website
        driver.get("https://customerdev3.gaialandscape.com/login");

        //Find the username field
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Username']"));

        //Enter username
        element.sendKeys("test.manager.first.name.2.last.name.2.july.23");

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

        WebElement body = driver.findElement(By.tagName("body"));
        boolean ret = body.getText().contains("Unable to find person in database");
        System.out.println(ret);

        //Find OK button
        element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'OK')]");

        //Click OK button
        element.click();

        //Kill the driver
        driver.quit();
    }

}
