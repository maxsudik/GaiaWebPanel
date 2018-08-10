package IOS.DataProvider;

import org.testng.annotations.DataProvider;

public class LoginManagerDataProvider {

    @DataProvider (name="LoginManager")
    public static Object [][] LoginManager()
    {
        return new Object[][]{
                {"test.manager.first.name.last.name.july.23", "Password11",}
        };
    }

    @DataProvider (name="ResetPassword")
    public static Object [][] ResetPassword()
    {
        return new Object[][]{
                {"maksym.sudik+July23.2@fortify.pro"}
        };
    }
}
