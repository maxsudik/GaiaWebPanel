package WEB.DataProvider;

import org.testng.annotations.DataProvider;

public class OnboardingDataProvider {

    @DataProvider(name="onboardingEnterCompanyAddress")
    public static Object [][] onboardingEnterCompanyAddress()
    {

            return new Object[][]{
                    {"test.manager.first.name.last.name.july.23", "Password11", "Office 222", "2st ST", "CompanyTestCity",
                            "V1V1V1", "000", "11000", "000123456789", "TestHolderName", "FirstNameLegalIdentity",
                            "LastNameLegalIdentity", "1980-Jan-02",  "Office 111", "1st ST", "TestCity", "V0V0V0",
                            "4111 1111 1111 1111", "TestNameCard",  "111", "Office 222", "2nd ST", "TestCardCity", "B1B1B1", "10"}
            };
        }
}
