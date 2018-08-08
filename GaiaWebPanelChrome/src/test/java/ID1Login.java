import Helper.GaiaHelper;
import PageObjects.LoginPage;
import dataProvider.LoginAdminDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ID1Login {

    @Test (dataProvider = "LoginAdmin", dataProviderClass = LoginAdminDataProvider.class)

    public void login (WebDriver driver, String LoginAdminName, String PasswordAdminName){

        LoginPage loginPage = new LoginPage();
        GaiaHelper gaiHelper = new GaiaHelper();

        driver.get("https://customerdev7.gaialandscape.com/login");

        loginPage.setName(driver,LoginAdminName);

        loginPage.setPassword(driver, PasswordAdminName);

        loginPage.clickLogin(driver);

        gaiHelper.Wait3();

        loginPage.clickContinueButton(driver);

    }
}
