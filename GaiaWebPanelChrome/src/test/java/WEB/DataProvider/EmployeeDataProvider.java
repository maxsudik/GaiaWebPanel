package WEB.DataProvider;

import org.testng.annotations.DataProvider;

public class EmployeeDataProvider {

    @DataProvider(name="CreateManager")
    public static Object [][] CreateManager()
    {
        return new Object[][]{
                {"Admin", "# .Gaia$", "TestManagerFirstName","LastNameJuly23", "SomeNotesJuly23", "maksym.sudik+July23.2@fortify.pro", "Password11", "Password11", }
        };
    }

    @DataProvider(name="CreateSupervisor")
    public static Object [][] CreateSupervisor()
    {
        return new Object[][]{
                {"Admin", "# .Gaia$", "TestSupervisorFirstName","LastName2July23", "SomeNotes2July23", "maksym.sudik+July23.3@fortify.pro", "Password11", "Password11"}
        };
    }

    @DataProvider(name="CreateInstaller")
    public static Object [][] CreateInstaller()
    {
        return new Object[][]{
                {"Admin", "# .Gaia$", "TestInstallerFirstName","LastName3July23", "SomeNotes3July23", "maksym.sudik+July23.4@fortify.pro", "Password11", "Password11", }
        };
    }

    @DataProvider(name="EditEmployee")
    public static Object [][] EditEmployee()
    {
        return new Object[][]{
                {"Admin", "# .Gaia$", "TestInstallerFirstName", "EditedFirstName","EditedLastNameJuly23", "EditedNotes", "maksym.sudik+July23Edited@fortify.pro", "Password11", "Password11", }
        };
    }

    @DataProvider(name="CreateManager2")
    public static Object [][] CreateManager2()
    {
        return new Object[][]{
                {"test.manager.first.name.last.name.july.23", "Password11", "TestManagerFirstName2","LastName2July23", "SomeNotesJuly23", "maksym.sudik+July23.5@fortify.pro", "Password11", "Password11", }
        };
    }

    @DataProvider (name="LoginEmployee")
    public static Object [][] LoginEmployee()
    {
        return new Object[][]{
                {"test.manager.first.name.2.last.name.2.july.23", "Password11"},
                {"test.supervisor.first.name.last.name.2.july.23", "Password11"},
                {"test.installer.first.name.last.name.3.july.23", "Password11"}
        };
    }

    @DataProvider(name="DeleteEmployee")
    public static Object [][] DeleteEmployee()
    {
        return new Object[][]{

                {"Admin", "# .Gaia$", "TestManagerFirstName"},
                {"Admin", "# .Gaia$", "TestManagerFirstName2"},
                {"Admin", "# .Gaia$", "TestSupervisorFirstName"},
                {"Admin", "# .Gaia$", "EditedFirstName"}
        };
    }
}
