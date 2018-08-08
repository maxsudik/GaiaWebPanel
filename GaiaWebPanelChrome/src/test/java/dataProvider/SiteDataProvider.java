package dataProvider;

import org.testng.annotations.DataProvider;

public class SiteDataProvider {

    @DataProvider(name="AddSite")
    public static Object [][] AddSite()
    {
        return new Object[][]{
                {"TestSite1July23", "50", "SomeNotesSite1", "July23LandscapeEdited", "Office 111 1st ST", "Vancouver", "V0V0V0"}
        };
    }

    @DataProvider(name="EditSite")
    public static Object [][] EditSite()
    {
        return new Object[][]{
                {"TestSite1July23Edited", "30", "SomeNotesSite1Edited", "July23LandscapeEdited", "Office 111 1st ST Edited", "VancouverEdited", "V1V1V1"}
        };
    }

    @DataProvider(name="DeleteEmployee")
    public static Object [][] DeleteEmployee()
    {
        return new Object[][]{
                {"TestSite1July23Edited"}
        };
    }
}
