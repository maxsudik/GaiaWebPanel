package dataProvider;

import org.testng.annotations.DataProvider;

public class AdminDataProvider {
    @DataProvider (name="LoginAdmin")
    public static Object [][] CreateCompany()
    {
        return new Object[][]{

                {"Admin", "# .Gaia$"}
        };
    }
}
