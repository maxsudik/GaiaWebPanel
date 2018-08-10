package IOS.Classes;

import Helper.GaiaHelper;
import IOS.DataProvider.LoginManagerDataProvider;
import IOS.PageObjects.LoginPage;

import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;

import java.util.NoSuchElementException;

public class ID1Login {

    @Test(dataProvider = "LoginManager", dataProviderClass = LoginManagerDataProvider.class)
    public void loginPage(IOSDriver mobiledriver, String LoginName, String PasswordName) {

        GaiaHelper gaiaHelper = new GaiaHelper();
        LoginPage loginPage = new LoginPage();

        loginPage.waitForSystemPopUp(mobiledriver);

        loginPage.waitForSystemPopUp2(mobiledriver);

        gaiaHelper.AcceptAlerts(mobiledriver);

        gaiaHelper.Wait3();

        gaiaHelper.AcceptAlerts(mobiledriver);

        loginPage.setName(mobiledriver, LoginName);

        loginPage.setPassword(mobiledriver, PasswordName);

        loginPage.clickRememberMe(mobiledriver);

        loginPage.clickAuthenticate(mobiledriver);

        loginPage.clickGo(mobiledriver);

        gaiaHelper.Wait3();
    }
}
