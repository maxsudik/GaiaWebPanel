package IOS.TestCases;

import Helper.GaiaHelper;
import IOS.DataProvider.EmailDataProvider;
import IOS.PageObjects.EmailPage;
import PageObjects.LoginPage;
import dataProvider.LoginAdminDataProvider;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TCiOS1_0B2 {
    private WebDriver driver;

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

    @Parameters({"browser"})
    @BeforeTest

    public void openBrowser(String browser) {

        try {
            if (browser.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/chromedriver");
                driver = new ChromeDriver();
                driver.manage().window().setSize(new Dimension(1280, 720));
                driver.manage().window().setPosition(new Point(0, 0));

            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/geckodriver");
                driver = new FirefoxDriver();
                driver.manage().window().setSize(new Dimension(1280, 720));
                driver.manage().window().setPosition(new Point(1280, 0));
            } else if (browser.equalsIgnoreCase("Safari")) {
                driver = new SafariDriver();
                driver.manage().window().setSize(new Dimension(1280, 720));
                driver.manage().window().setPosition(new Point(0, 1280));
            }

        } catch (WebDriverException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test (dataProvider = "LoginEmail", dataProviderClass = EmailDataProvider.class)

    public void login (String LoginName, String PasswordName, String NewPassword, String ConfirmNewPassword){

        EmailPage emailPage = new EmailPage();
        GaiaHelper gaiaHelper = new GaiaHelper();

        driver.get("https://box.kiextended.com/mail/?_task=logout&_token=MC6UyqFUXuHrRfUDD6xieQO2zImwTQdU");

        emailPage.setName(driver, LoginName);

        emailPage.setPassword(driver, PasswordName);

        emailPage.clickLogin(driver);

        gaiaHelper.Wait3();

        emailPage.clickEmail(driver);

        gaiaHelper.Wait3();

        emailPage.clickResetPassword(driver);

        gaiaHelper.Wait3();

        emailPage.setNewPassword(driver, NewPassword);

        emailPage.confirmNewPassword(driver, ConfirmNewPassword);

        emailPage.clickReset(driver);

        gaiaHelper.Wait3();

        emailPage.clickHereToLogin(driver);

    }
}