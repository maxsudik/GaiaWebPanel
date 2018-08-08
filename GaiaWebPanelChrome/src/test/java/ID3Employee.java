import Helper.GaiaHelper;
import PageObjects.*;
import dataProvider.EmployeeDataProvider;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ID3Employee {

    private WebDriver driver;

    @AfterTest

    public void closeBrowser(){
        driver.quit();
    }

    @Parameters({"browser"})
    @BeforeTest

    public void openBrowser(String browser) {

        try {
            if (browser.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/chromedriver");
                driver = new ChromeDriver();
                driver.manage().window().setSize(new Dimension(1280, 720));
                driver.manage().window().setPosition(new Point(0, 0));

            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/geckodriver");
                driver = new FirefoxDriver();
                driver.manage().window().setSize(new Dimension(1280, 720));
                driver.manage().window().setPosition(new Point(1280, 0));
            } else if (browser.equalsIgnoreCase("Safari")) {
                driver = new SafariDriver();
                driver.manage().window().setSize(new Dimension(1280, 720));
                driver.manage().window().setPosition(new Point(0, 1280));
            }

        } catch (WebDriverException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 1, dataProvider = "CreateManager", dataProviderClass = EmployeeDataProvider.class)
    public void createManager (String LoginAdminName, String PasswordAdminName, String FirstName, String LastName, String Notes, String Email,
                               String Password, String RepeatPassword){

        ID1Login login = new ID1Login();
        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage company = new CompanyPage();
        EmployeesPage employeesPage = new EmployeesPage();
        AddNewEmployeePage addNewEmployeePage = new AddNewEmployeePage();

        login.login(driver, LoginAdminName, PasswordAdminName);

        gaiaHelper.Wait3();

        company.clickCompanyDDL(driver);

        company.clickEmployeesDDMI(driver);

        gaiaHelper.Wait1();

        employeesPage.clickAddNewEmployee(driver);

        addNewEmployeePage.clickCancel(driver);

        employeesPage.clickAddNewEmployee(driver);

        addNewEmployeePage.clickCompanyName(driver);

        addNewEmployeePage.clickRoleManager(driver);

        addNewEmployeePage.enterFirstName(driver, FirstName);

        addNewEmployeePage.enterLastName(driver, LastName);

        addNewEmployeePage.enterNotes(driver, Notes);

        addNewEmployeePage.enterEmail(driver, Email);

        addNewEmployeePage.enterPassword(driver, Password);

        addNewEmployeePage.enterRepeatPassword(driver, RepeatPassword);

        addNewEmployeePage.clickRestrictedAccess(driver);

        addNewEmployeePage.clickLicensedUser(driver);

        addNewEmployeePage.clickAbilityLogininMultipleDevices(driver);

        addNewEmployeePage.clickAdd(driver);

        company.clickLogout(driver);
    }

    @Test(priority = 2, dataProvider = "CreateSupervisor", dataProviderClass = EmployeeDataProvider.class)
    public void createSupervisor (String LoginAdminName, String PasswordAdminName, String FirstName, String LastName, String Notes, String Email,
                               String Password, String RepeatPassword, String LicenseLimit){

        ID1Login login = new ID1Login();
        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage company = new CompanyPage();
        EmployeesPage employeesPage = new EmployeesPage();
        AddNewEmployeePage addNewEmployeePage = new AddNewEmployeePage();

        login.login(driver, LoginAdminName, PasswordAdminName);

        gaiaHelper.Wait3();

        company.clickCompanyDDL(driver);

        company.clickEmployeesDDMI(driver);

        gaiaHelper.Wait1();

        employeesPage.clickAddNewEmployee(driver);

        addNewEmployeePage.clickCancel(driver);

        employeesPage.clickAddNewEmployee(driver);

        addNewEmployeePage.clickCompanyName(driver);

        addNewEmployeePage.clickRoleSupervisor(driver);

        addNewEmployeePage.enterFirstName(driver, FirstName);

        addNewEmployeePage.enterLastName(driver, LastName);

        addNewEmployeePage.enterNotes(driver, Notes);

        addNewEmployeePage.enterEmail(driver, Email);

        addNewEmployeePage.enterPassword(driver, Password);

        addNewEmployeePage.enterRepeatPassword(driver, RepeatPassword);

        addNewEmployeePage.clickRestrictedAccess(driver);

        addNewEmployeePage.clickLicensedUser(driver);

        addNewEmployeePage.clickAbilityLogininMultipleDevices(driver);

        addNewEmployeePage.clickAdd(driver);

        addNewEmployeePage.enterLicenseLimit(driver);

        addNewEmployeePage.clickUpdatePopUp(driver);

        company.clickLogout(driver);
    }

    @Test(priority = 3, dataProvider = "CreateInstaller", dataProviderClass = EmployeeDataProvider.class)
    public void createInstaller (String LoginAdminName, String PasswordAdminName, String FirstName, String LastName, String Notes, String Email,
                                  String Password, String RepeatPassword){

        ID1Login login = new ID1Login();
        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage company = new CompanyPage();
        EmployeesPage employeesPage = new EmployeesPage();
        AddNewEmployeePage addNewEmployeePage = new AddNewEmployeePage();

        login.login(driver, LoginAdminName, PasswordAdminName);

        gaiaHelper.Wait3();

        company.clickCompanyDDL(driver);

        company.clickEmployeesDDMI(driver);

        employeesPage.clickAddNewEmployee(driver);

        addNewEmployeePage.clickCancel(driver);

        employeesPage.clickAddNewEmployee(driver);

        addNewEmployeePage.clickCompanyName(driver);

        addNewEmployeePage.clickRoleInstaller(driver);

        addNewEmployeePage.enterFirstName(driver, FirstName);

        addNewEmployeePage.enterLastName(driver, LastName);

        addNewEmployeePage.enterNotes(driver, Notes);

        addNewEmployeePage.enterEmail(driver, Email);

        addNewEmployeePage.enterPassword(driver, Password);

        addNewEmployeePage.enterRepeatPassword(driver, RepeatPassword);

        addNewEmployeePage.clickRestrictedAccess(driver);

        addNewEmployeePage.clickLicensedUser(driver);

        addNewEmployeePage.clickAbilityLogininMultipleDevices(driver);

        addNewEmployeePage.clickAdd(driver);

        company.clickLogout(driver);
    }

    @Test(priority = 4, dataProvider = "EditEmployee", dataProviderClass = EmployeeDataProvider.class)
    public void editEmployee (String LoginAdminName, String PasswordAdminName, String CreatedEmployeeName, String EditedFirstName,
                              String EditedLastName, String EditedNotes, String EditedEmail, String EditedPassword,
                              String EditedRepeatPassword){

        ID1Login login = new ID1Login();
        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage company = new CompanyPage();
        EmployeesPage employeesPage = new EmployeesPage();
        EditEmployeePage editEmployeePage = new EditEmployeePage();

        login.login(driver, LoginAdminName, PasswordAdminName);

        gaiaHelper.Wait3();

        company.clickCompanyDDL(driver);

        company.clickEmployeesDDMI(driver);

        employeesPage.enterSearchField(driver, CreatedEmployeeName);

        employeesPage.clickEditButton(driver);

        editEmployeePage.enterNotes(driver, EditedNotes);

        editEmployeePage.clickBack(driver);

        editEmployeePage.clickLeavePopUpWarning(driver);

        employeesPage.enterSearchField(driver,CreatedEmployeeName);

        employeesPage.clickEditButton(driver);

        editEmployeePage.enterNotes(driver, EditedNotes);

        editEmployeePage.clickBack(driver);

        editEmployeePage.clickStayPopUpWarning(driver);

        editEmployeePage.clickCompanyName(driver);

        editEmployeePage.clickRoleSalesPerson(driver);

        editEmployeePage.enterFirstName(driver, EditedFirstName);

        editEmployeePage.enterLastName(driver, EditedLastName);

        editEmployeePage.enterNotes(driver, EditedNotes);

        editEmployeePage.enterEmail(driver, EditedEmail);

        editEmployeePage.clickEditPassword(driver);

        editEmployeePage.clickClose(driver);

        editEmployeePage.clickEditPassword(driver);

        editEmployeePage.enterPassword(driver, EditedPassword);

        editEmployeePage.enterRepeatPassword(driver, EditedRepeatPassword);

        editEmployeePage.clickRestrictedAccess(driver);

        editEmployeePage.clickLicensedUser(driver);

        editEmployeePage.clickAbilityLogininMultipleDevices(driver);

        editEmployeePage.clickAbilityLogininMultipleDevices(driver);

        editEmployeePage.clickUpdate(driver);

        editEmployeePage.clickBack(driver);

        employeesPage.enterSearchField(driver, CreatedEmployeeName);

        //Verify Employee Was Updated

        company.clickLogout(driver);
    }

    @Test(priority = 5, dataProvider = "OnboardingProcessManager", dataProviderClass = OnboardingProcess.class)
    public void onboardingProcess (String LoginManagerName, String PasswordManagerName, String InstitutionNumber, String TransitNumber, String AccountNumber,
                                   String AccountHolderName, String FirstName, String LastName, String DateOfBirth,
                                   String AddressLine1, String AddressLine2, String City, String ZipPostalCode, String CreditCardNumber,
                                   String NameOnCard, String CVV, String CreditCardAddressLine1, String CreditCardAddressLine2,
                                   String CreditCardCity, String CreditCardZipPostalCode, String LicenseNumber){

        ID1Login login = new ID1Login();
        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage company = new CompanyPage();
        OnboardingProcess onboardingProcess = new OnboardingProcess();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiaHelper.Wait3();

        onboardingProcess.enterInstitutionNumber(driver, InstitutionNumber);

        onboardingProcess.enterTransitNumber(driver, TransitNumber);

        onboardingProcess.enterAccountNumber(driver, AccountNumber);

        onboardingProcess.enterAccountHolderName(driver, AccountHolderName);

        onboardingProcess.clickAccountTypeCompany(driver);

        onboardingProcess.clickSave1(driver);

        onboardingProcess.enterFirstName(driver, FirstName);

        onboardingProcess.enterLastName(driver, LastName);

        onboardingProcess.enterDateOfBirth(driver, DateOfBirth);

        onboardingProcess.enterAddressLine1(driver, AddressLine1);

        onboardingProcess.enterAddressLine2(driver, AddressLine2);

        onboardingProcess.enterCity(driver,City);

        onboardingProcess.clickCountry(driver);

        onboardingProcess.clickStateProvinceDDL(driver);

        onboardingProcess.enterZipPostalCode(driver, ZipPostalCode);

        onboardingProcess.uploadID(driver);

        onboardingProcess.clickSave2(driver);

        onboardingProcess.enterCreditCardNumber(driver, CreditCardNumber);

        onboardingProcess.enterNameOnCard(driver, NameOnCard);

        onboardingProcess.clickExpirationMM(driver);

        onboardingProcess.clickExpirationYY(driver);

        onboardingProcess.enterCVV(driver, CVV);

        onboardingProcess.enterCreditCardAddressLine1(driver, CreditCardAddressLine1);

        onboardingProcess.enterCreditCardAddressLine2(driver, CreditCardAddressLine2);

        onboardingProcess.enterCreditCardCity(driver, CreditCardCity);

        onboardingProcess.clickCreditCardCountry(driver);

        onboardingProcess.clickCreditCardStateProvince(driver);

        onboardingProcess.enterCreditCardZipPostalCode(driver, CreditCardZipPostalCode);

        onboardingProcess.enterLicenseNumber(driver, LicenseNumber);

        onboardingProcess.clickUpdate(driver);

        company.clickLogout(driver);
    }

    @Test(priority = 6, dataProvider = "CreateManager2", dataProviderClass = EmployeeDataProvider.class)
    public void createManager2 (String LoginManagerName, String PasswordManagerName, String FirstName, String LastName, String Notes, String Email,
                                String Password, String RepeatPassword){

        ID1Login login = new ID1Login();
        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage company = new CompanyPage();
        EmployeesPage employeesPage = new EmployeesPage();
        AddNewEmployeePage addNewEmployeePage = new AddNewEmployeePage();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiaHelper.Wait3();

        company.clickCompanyDDL(driver);

        company.clickEmployeesDDMI(driver);

        employeesPage.clickAddNewEmployee(driver);

        addNewEmployeePage.clickCancel(driver);

        employeesPage.clickAddNewEmployee(driver);

        addNewEmployeePage.clickCompanyName(driver);

        addNewEmployeePage.clickRoleManager(driver);

        addNewEmployeePage.enterFirstName(driver, FirstName);

        addNewEmployeePage.enterLastName(driver, LastName);

        addNewEmployeePage.enterNotes(driver, Notes);

        addNewEmployeePage.enterEmail(driver, Email);

        addNewEmployeePage.enterPassword(driver, Password);

        addNewEmployeePage.enterRepeatPassword(driver, RepeatPassword);

        addNewEmployeePage.clickRestrictedAccess(driver);

        addNewEmployeePage.clickLicensedUser(driver);

        addNewEmployeePage.clickAbilityLogininMultipleDevices(driver);

        addNewEmployeePage.clickAdd(driver);

        company.clickLogout(driver);
    }

    @Test(priority = 7, dataProvider = "LoginManager2", dataProviderClass = EmployeeDataProvider.class)
    public void loginAsManager2 (String LoginManagerName, String PasswordManagerName) {

        ID1Login login = new ID1Login();
        GaiaHelper gaiaHelper = new GaiaHelper();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiaHelper.Wait3();
    }

    @Test(priority = 8, dataProvider = "LoginSupervisor", dataProviderClass = EmployeeDataProvider.class)
    public void loginAsSupervisor (String LoginManagerName, String PasswordManagerName) {

        ID1Login login = new ID1Login();
        GaiaHelper gaiaHelper = new GaiaHelper();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiaHelper.Wait3();
    }

    @Test(priority = 9,dataProvider = "LoginInstaller", dataProviderClass = EmployeeDataProvider.class)
    public void loginAsInstaller (String LoginManagerName, String PasswordManagerName) {

        ID1Login login = new ID1Login();
        GaiaHelper gaiaHelper = new GaiaHelper();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiaHelper.Wait3();
    }

    @Test(priority = 10, dataProvider = "DeleteEmployee", dataProviderClass = EmployeeDataProvider.class)
    public void deleteEmployee (String LoginAdminName, String PasswordAdminName, String FirstName){

        ID1Login login = new ID1Login();
        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage company = new CompanyPage();
        EmployeesPage employeesPage = new EmployeesPage();
        EditEmployeePage editEmployeePage = new EditEmployeePage();

        login.login(driver, LoginAdminName, PasswordAdminName);

        gaiaHelper.Wait3();

        company.clickCompanyDDL(driver);

        company.clickEmployeesDDMI(driver);

        employeesPage.enterSearchField(driver, FirstName);

        employeesPage.clickEditButton(driver);

        editEmployeePage.clickDeleteEmployee(driver);

        editEmployeePage.clickCancelDeletePopUp(driver);

        company.clickLogout(driver);
    }

    @Test(priority = 11, dataProvider = "LoginManager2", dataProviderClass = EmployeeDataProvider.class)
    public void loginAsDeletedManager2 (String LoginManagerName, String PasswordManagerName) {

        ID1Login login = new ID1Login();
        GaiaHelper gaiaHelper = new GaiaHelper();
        LoginPage loginPage = new LoginPage();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiaHelper.Wait3();

        loginPage.clickOkPopUpErrorInvalidLoginOrPassword(driver);
    }
}
