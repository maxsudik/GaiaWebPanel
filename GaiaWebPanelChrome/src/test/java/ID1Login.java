import Helper.GaiaHelper;
import PageObjects.LoginPage;
import dataProvider.AdminDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ID1Login {

    @Test (dataProvider = "LoginAdmin", dataProviderClass = AdminDataProvider.class)

    public void LoginAsAdmin (WebDriver driver, String LoginAdminName, String PasswordAdminName){

        //Create Objects required for this test
        LoginPage loginPage = new LoginPage();
        GaiaHelper gaiHelper = new GaiaHelper();

        //Navigate to the website
        driver.get("https://customerdev3.gaialandscape.com/login");

        //Enter username
        loginPage.setAdminName(driver,LoginAdminName);

        //Enter password
        loginPage.setAdminPassword(driver, PasswordAdminName);

        //Click Login button
        loginPage.clickLoginButton(driver);

        gaiHelper.Wait3();

        //Click Continue button
        loginPage.clickContinueButton(driver);

    }
}
