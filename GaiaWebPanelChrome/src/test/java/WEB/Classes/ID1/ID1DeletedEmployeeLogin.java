package WEB.Classes.ID1;

import WEB.PageObjects.LoginPage;
import WEB.DataProvider.EmployeeDataProvider;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ID1DeletedEmployeeLogin {

    @Test(dataProvider = "LoginManager2", dataProviderClass = EmployeeDataProvider.class)
    public void loginAsDeletedManager2 (WebDriver driver, String LoginManagerName, String PasswordManagerName) {

        LoginPage loginPage = new LoginPage();

        driver.get("https://customerdev7.gaialandscape.com/login");

        loginPage.setName(driver,LoginManagerName);

        loginPage.setPassword(driver, PasswordManagerName);

        loginPage.clickLogin(driver);

        loginPage.clickOkPopUpErrorInvalidLoginOrPassword(driver);
    }
}
