package dataProvider;

import org.testng.annotations.DataProvider;

public class EmployeeDataProvider {

    @DataProvider(name="CreateManager")
    public static Object [][] CreateManager()
    {
        return new Object[][]{
                {"TestManagerFirstName","LastNameJuly23", "SomeNotesJuly23", "maksym.sudik+July23.2@fortify.pro", "Password11", "Password11", }
        };
    }

    @DataProvider(name="CreateManager2")
    public static Object [][] CreateManager2()
    {
        return new Object[][]{
                {"TestManagerFirstName2","LastName2July23", "SomeNotesJuly23", "maksym.sudik+July23.5@fortify.pro", "Password11", "Password11", }
        };
    }

    @DataProvider(name="CreateSupervisor")
    public static Object [][] CreateSupervisor()
    {
        return new Object[][]{
                {"TestSupervisorFirstName","LastName2July23", "SomeNotes2July23", "maksym.sudik+July23.3@fortify.pro", "Password11", "Password11", }
        };
    }

    @DataProvider(name="CreateInstaller")
    public static Object [][] CreateInstaller()
    {
        return new Object[][]{
                {"TestInstallerFirstName","LastName3July23", "SomeNotes3July23", "maksym.sudik+July23.4@fortify.pro", "Password11", "Password11", }
        };
    }

    @DataProvider(name="EditEmployee")
    public static Object [][] EditEmployee()
    {
        return new Object[][]{
                {"TestManagerFirstName2", "EditedFirstName","EditedLastNameJuly23", "EditedNotes", "maksym.sudik+July23Edited@fortify.pro", "Password11", "Password11", }
        };
    }

    @DataProvider(name="DeleteEmployee")
    public static Object [][] DeleteEmployee()
    {
        return new Object[][]{
                {"TestManagerFirstName2"},
                {"TestSupervisorFirstName"},
                {"TestInstallerFirstName"}
        };
    }
}
