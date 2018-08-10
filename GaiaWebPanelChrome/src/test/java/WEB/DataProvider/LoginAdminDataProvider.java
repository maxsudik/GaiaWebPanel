package WEB.DataProvider;

import org.testng.annotations.DataProvider;

public class LoginAdminDataProvider {

    @DataProvider (name="LoginAdmin")
    public static Object [][] LoginAdmin()
    {
        return new Object[][]{
                {"Admin", "# .Gaia$"}
        };
    }




}
