package dataProvider;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider (name="LoginAdmin")
    public static Object [][] CreateCompany()
    {
        return new Object[][]{
                {"Admin", "# .Gaia$"}
        };
    }

    @DataProvider (name="LoginManagerOnboarding")
    public static Object [][] LoginManagerOnboarding()
    {
        return new Object[][]{
                {"test.manager.first.name.last.name.july.23", "Password11"}
        };
    }

    @DataProvider (name="LoginManager")
    public static Object [][] LoginManager()
    {
        return new Object[][]{
                {"test.manager.first.name.last.name.july.23", "Password11"}
        };
    }

    @DataProvider (name="LoginManager2")
    public static Object [][] LoginManager2()
    {
        return new Object[][]{
                {"test.manager.first.name.2.last.name.2.july.23", "Password11"}
        };
    }

    @DataProvider (name="LoginSupervisor")
    public static Object [][] LoginSupervisor()
    {
        return new Object[][]{
                {"test.supervisor.first.name.last.name.2.july.23", "Password11"}
        };
    }

    @DataProvider (name="LoginInstaller")
    public static Object [][] LoginInstaller()
    {
        return new Object[][]{
                {"test.installer.first.name.last.name.3.july.23", "Password11"}
        };
    }
}
