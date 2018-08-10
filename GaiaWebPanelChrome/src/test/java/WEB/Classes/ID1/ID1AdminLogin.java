package WEB.Classes.ID1;

import WEB.PageObjects.LoginPage;
import WEB.DataProvider.LoginAdminDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ID1AdminLogin {

    @Test (dataProvider = "LoginAdmin", dataProviderClass = LoginAdminDataProvider.class)

    public void login (WebDriver driver, String LoginAdminName, String PasswordAdminName){

        LoginPage loginPage = new LoginPage();

        driver.get("https://customerdev7.gaialandscape.com/login");

        loginPage.setName(driver,LoginAdminName);

        loginPage.setPassword(driver, PasswordAdminName);

        loginPage.clickLogin(driver);

        loginPage.clickContinueButton(driver);

    }
}
