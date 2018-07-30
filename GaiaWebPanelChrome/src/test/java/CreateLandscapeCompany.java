import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateLandscapeCompany {

    private WebDriver driver;

    @Parameters({ "browser" })
    @BeforeTest

    public void openBrowser (String browser) {

    try {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().setSize(new Dimension(1280,720));
            driver.manage().window().setPosition(new Point(0,0));

        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().window().setSize(new Dimension(1280,720));
            driver.manage().window().setPosition(new Point(1280,0));
        }

        else if (browser.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
            driver.manage().window().setSize(new Dimension(1280,720));
            driver.manage().window().setPosition(new Point(100,100));
        }

    } catch (WebDriverException e) {
        System.out.println(e.getMessage());
    }
}
    @Test

    public void Create () {

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
        WebElement element = driver.findElement(By.xpath("//div[@class='web-style is-tab is-hidden-mobile web-style-active']"));

        //Click Company button
        element.click();

        //Find Company DDL menu item
        element = driver.findElement(By.id("navCompany"));

        //Click Company DDL menu item
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Add a new company
        element = driver.findElement(By.xpath("//a[@class='button is-success is-pulled-right']"));

        //Click Add a new company
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Company name field
        element =driver.findElement(By.xpath("//input[@id='company_name']"));

        //Enter valid name
        element.sendKeys("July23Landscape");

        //Find Company email field
        element = driver.findElement(By.xpath("//input[@id='company_email']"));

        //Enter valid email
        element.sendKeys("maksym.sudik+July23.1@fortify.pro");

        //Find Company tax number field
        element = driver.findElement(By.xpath("//input[@id='tax_number']"));

        //Enter Tax number
        element.sendKeys("00000");

        //Find Company type
        element = driver.findElement(By.xpath("//div[@class='card-content']//div[4]//p[1]//span[1]//select[1]"));

        //Click Company type DDL
        element.click();

        //Add delay 3 sec
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Landscape DDL menu item
        element = driver.findElement(By.xpath("//option[@value='landscape']"));

        //Click Landscape DDL
        element.click();

        //Find Currency DDL
        element = driver.findElement(By.xpath("//div[@class='card-content']//div[5]//p[1]//span[1]//select[1]"));

        //Click Currency DDL
        element.click();

        //Find Currency DDL menu item
        element = driver.findElement(By.xpath("//option[@value='CAD']"));

        //Click Currency DDL menu item
        element.click();

        //Find Company description
        element = driver.findElement(By.xpath("//textarea[@id='description']"));

        //Enter Company description
        element.sendKeys("Company Description");

        //Find button Add
        element = driver.findElement(By.xpath("//button[@class='button is-success']"));

        //Click button Add
        element.click();

        //Find Log Out button
        element = driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"));

        //Click Log Out button
        element.click();

        //Kill the driver
        driver.quit();

    }
}


