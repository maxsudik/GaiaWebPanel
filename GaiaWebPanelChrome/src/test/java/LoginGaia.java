import dataProvider.CompanyDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginGaia {

    @Test (dataProvider = "CreateCompany", dataProviderClass = CompanyDataProvider.class)

    public void Login (WebDriver driver, String LoginName, String PasswordName){

        //Navigate to the website
        driver.get("https://customerdev3.gaialandscape.com/login");

        //Read the title of the page and put it into results
        System.out.println("Page title is: "+driver.getTitle());

        // Verify the title of the page
        Assert.assertEquals(driver.getTitle(), "Customer Panel | Gaia");

        //Find the username field
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Username']"));

        //Enter username
        element.sendKeys(LoginName);

        //Find the password field
        element = driver.findElement(By.xpath("//input[@placeholder='Password']"));

        //Enter password
        element.sendKeys(PasswordName);

        //Find Login button
        element = driver.findElement(By.xpath("//button[@class='button is-success']"));

        //Click Login button
        element.click();

        //Read the title of the page and put it into results
        System.out.println("Page title is: "+driver.getTitle());

        // Verify the title of the page
        Assert.assertEquals(driver.getTitle(), "Customer Panel | Gaia");

        //Add delay 5 sec
        try {
            Thread.sleep(5000);
            } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Continue button
        element = driver.findElement(By.xpath("//button[@class='button is-success']"));

        //Click Continue button
        element.click();

        //Read the title of the page and put it into results
        System.out.println("Page title is: "+driver.getTitle());

        // Verify the title of the page
        Assert.assertEquals(driver.getTitle(), "Customer Panel | Gaia");

    }
}
