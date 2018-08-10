package WEB.DataProvider;

import org.testng.annotations.DataProvider;

public class SiteDataProvider {

    @DataProvider(name="AddSite")
    public static Object [][] AddSite()
    {
        return new Object[][]{
                {"test.manager.first.name.last.name.july.23", "Password11", "TestSite1July23", "50", "SomeNotesSite1", "Office 111 1st ST", "Vancouver", "British Columbia", "V0V0V0"}
        };
    }

    @DataProvider(name="EditSite")
    public static Object [][] EditSite()
    {
        return new Object[][]{
                {"test.manager.first.name.last.name.july.23", "Password11", "TestSite1July23", "TestSite1July23Edited", "30", "SomeNotesSite1Edited", "Office 111 1st ST Edited", "VancouverEdited", "Alberta", "V1V1V1"}
        };
    }

    @DataProvider(name="DeleteSite")
    public static Object [][] DeleteSite()
    {
        return new Object[][]{
                {"test.manager.first.name.last.name.july.23", "Password11", "TestSite1July23Edited"}
        };
    }
}
