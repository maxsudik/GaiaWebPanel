package IOS.DataProvider;

import org.testng.annotations.DataProvider;

public class EmailDataProvider {

    @DataProvider (name="LoginEmail")
    public static Object [][] LoginManager()
    {
        return new Object[][]{
                {"maksym.sudik@fortify.pro", "Mak7783205720", "Password11", "Password11"}
        };
    }




}
