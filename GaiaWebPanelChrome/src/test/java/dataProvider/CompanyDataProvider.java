package dataProvider;

import org.testng.annotations.DataProvider;

public class CompanyDataProvider {
    @DataProvider(name="CreateLandscapeCompany")
    public static Object [][] CreateLandscapeCompany()
{
    return new Object[][]{

            {"July23Landscape", "maksym.sudik+July23.1@fortify.pro", "00000", "30", "Company Description" }
    };
    }

    @DataProvider(name="CreateSupplierCompany")
    public static Object [][] CreateSupplierCompany()
    {
        return new Object[][]{

                {"July23Supplier", "maksym.sudik+July23.2@fortify.pro", "00000", "15", "Company Supplier Description" }
        };
    }

    @DataProvider(name="EditCompany")
    public static Object [][] EditCompany()
    {
        return new Object[][]{

                {"July23Landscape", "July23LandscapeEdited", "maksym.sudik+July23.1.Edited@fortify.pro", "http://editedcompanywebsite.com", "11111"}
        };
    }
}

