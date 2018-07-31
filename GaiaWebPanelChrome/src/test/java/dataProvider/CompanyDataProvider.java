

package dataProvider;

import org.testng.annotations.DataProvider;

public class CompanyDataProvider {
    @DataProvider (name="CreateCompany")
    public static Object [][] CreateCompany()
    {
        return new Object[][]{

                {"Admin", "# .Gaia$"}
        };
    }
}
