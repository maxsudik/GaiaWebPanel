package dataProvider;

import org.testng.annotations.DataProvider;

public class SiteDataProvider {

    @DataProvider(name="AddSite")
    public static Object [][] AddSite()
    {
        return new Object[][]{
                {"TestSite1July23", "50", "SomeNotesSite1", "July23LandscapeEdited", "Office 111 1st ST", "Vancouver", "V0V0V0" }
        };
    }
}
