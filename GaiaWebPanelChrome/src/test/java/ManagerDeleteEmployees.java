import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManagerDeleteEmployees {

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

        //Find Employees MI
        element = ((ChromeDriver) driver).findElementByXPath("//li[@id='navEmployee']");

        //Click Employees MI
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
        element.sendKeys("DEL");

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement body = driver.findElement(By.tagName("body"));
        boolean employees = body.getText().contains("DEL");
        System.out.println(employees);

        while (employees) {

            //Find Search field
            element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Search']");

            //Clear Search field
            element.click();
            element.clear();

            //Find Search field
            element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='Search']");

            //Enter Search field
            element.sendKeys("DEL");

            //Add delay 3 sec
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Find Edit button
            element = ((ChromeDriver) driver).findElementByXPath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[1]/span[1]");

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
            element.sendKeys("DEL");

            //Add delay 3 sec
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Loop variable update
            body = driver.findElement(By.tagName("body"));
            employees = body.getText().contains("DEL");

            //Print boolean result
            System.out.println(employees);
        }


        //Find log Out button
        element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Log Out')]");

        //Click Log Out button
        element.click();

        //Kill the driver
        driver.quit();
    }
}
