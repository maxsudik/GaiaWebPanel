package WEB.DataProvider;

import org.testng.annotations.DataProvider;

public class CompanyDataProvider {

    @DataProvider(name="CreateLandscapeCompany")
    public static Object [][] CreateLandscapeCompany()
    {
        return new Object[][]{
                {"Admin", "# .Gaia$", "July23Landscape", "maksym.sudik+July23.1@fortify.pro", "00000", "30", "Company Description"}
        };
    }

    @DataProvider(name="CreateSupplierCompany")
    public static Object [][] CreateSupplierCompany()
    {
        return new Object[][]{
                {"Admin", "# .Gaia$", "July23Supplier", "maksym.sudik+July23.2@fortify.pro", "00000", "15", "Company Supplier Description" }
        };
    }

    @DataProvider(name="EditCompany")
    public static Object [][] EditCompany()
    {
        return new Object[][]{

                {"Admin", "# .Gaia$", "July23Supplier", "July23SupplierEdited", "maksym.sudik+July23.1.Edited@fortify.pro", "http://editedcompanywebsite.com", "11111",
                        "20", "35", "Office 111", "1st ST", "Vancouver", "TTT 111", "Edited Company description",  }
        };
    }

    @DataProvider(name="DeleteCompany")
    public static Object [][] DeleteCompany()
    {
        return new Object[][]{

                {"Admin", "# .Gaia$", "July23Landscape"},
                {"Admin", "# .Gaia$", "July23SupplierEdited"},
        };
    }
}

