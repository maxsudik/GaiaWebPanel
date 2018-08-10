package IOS.DataProvider;

import org.testng.annotations.DataProvider;

public class OnboardingDataProvider {

    @DataProvider (name="OnboardingProcess")
    public static Object [][] OnboardingProcess()
    {
        return new Object[][]{
                {"test.manager.first.name.last.name.july.23", "Password11", "Suite 111", "1st St", "Vancouver", "V0V0V0",
                        "000", "11000", "000123456789", "AccountHolderName",
                        "FirstName", "LastName", "Suite 111", "1st ST", "Vancouver", "V0V0V0",
                        "4111111111111111", "1229", "123", "NameOnCard", "Suite 111", "1st ST", "Vancouver", "V0V0V0", }
        };
    }




}
