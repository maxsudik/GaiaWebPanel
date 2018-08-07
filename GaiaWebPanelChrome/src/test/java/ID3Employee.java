import Helper.GaiaHelper;
import PageObjects.*;
import dataProvider.EmployeeDataProvider;
import dataProvider.LoginDataProvider;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ID3Employee {

    private WebDriver driver;

    @Parameters({ "browser" })
    @BeforeTest

    public void openBrowser (String browser) {

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

    //SHOULD BE STARTED BEFORE EACH METHOD FOR ADMIN
    @Test(dataProvider = "LoginAdmin", dataProviderClass = LoginDataProvider.class)
    public void loginAsAdmin (WebDriver driver, String LoginAdminName, String PasswordAdminName) {

        ID1Login login = new ID1Login();
        GaiaHelper gaiHelper = new GaiaHelper();

        login.login(driver, LoginAdminName, PasswordAdminName);

        gaiHelper.Wait3();
    }

    //SHOULD BE STARTED BEFORE EACH METHOD FOR MANAGER
    @Test(dataProvider = "LoginManager", dataProviderClass = LoginDataProvider.class)
    public void loginAsManager (WebDriver driver, String LoginManagerName, String PasswordManagerName) {

        ID1Login login = new ID1Login();
        GaiaHelper gaiHelper = new GaiaHelper();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiHelper.Wait3();
    }

    //SHOULD BE STARTED ONCE FOR ONBOARDING PROCESS
    @Test(dataProvider = "LoginManager", dataProviderClass = LoginDataProvider.class)
    public void loginAsManagerOnboarding (WebDriver driver, String LoginManagerName, String PasswordManagerName) {

        ID1Login login = new ID1Login();
        GaiaHelper gaiHelper = new GaiaHelper();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiHelper.Wait3();
    }

    @Test(dataProvider = "CreateManager", dataProviderClass = EmployeeDataProvider.class)
    public void createManager (WebDriver driver, String FirstName, String LastName, String Notes, String Email,
                               String Password, String RepeatPassword){

        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage company = new CompanyPage();
        EmployeesPage employeesPage = new EmployeesPage();
        AddNewEmployeePage addNewEmployeePage = new AddNewEmployeePage();

        company.clickCompanyDDL(driver);

        company.clickEmployeeDDMI(driver);

        gaiaHelper.Wait3();

        employeesPage.clickAddNewEmployee(driver);

        gaiaHelper.Wait3();

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

        company.clickLogoutButton(driver);

        driver.quit();
    }

    @Test(dataProvider = "CreateSupervisor", dataProviderClass = EmployeeDataProvider.class)
    public void createSupervisor (WebDriver driver, String FirstName, String LastName, String Notes, String Email,
                               String Password, String RepeatPassword){

        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage company = new CompanyPage();
        EmployeesPage employeesPage = new EmployeesPage();
        AddNewEmployeePage addNewEmployeePage = new AddNewEmployeePage();

        company.clickCompanyDDL(driver);

        company.clickEmployeeDDMI(driver);

        gaiaHelper.Wait3();

        employeesPage.clickAddNewEmployee(driver);

        gaiaHelper.Wait3();

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

        company.clickLogoutButton(driver);

        driver.quit();
    }

    @Test(dataProvider = "CreateInstaller", dataProviderClass = EmployeeDataProvider.class)
    public void createInstaller (WebDriver driver, String FirstName, String LastName, String Notes, String Email,
                                  String Password, String RepeatPassword){

        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage company = new CompanyPage();
        EmployeesPage employeesPage = new EmployeesPage();
        AddNewEmployeePage addNewEmployeePage = new AddNewEmployeePage();

        company.clickCompanyDDL(driver);

        company.clickEmployeeDDMI(driver);

        gaiaHelper.Wait3();

        employeesPage.clickAddNewEmployee(driver);

        gaiaHelper.Wait3();

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

        company.clickLogoutButton(driver);

        driver.quit();
    }

    @Test(dataProvider = "CreateManager2", dataProviderClass = EmployeeDataProvider.class)
    public void createManager2 (WebDriver driver, String FirstName, String LastName, String Notes, String Email,
                                 String Password, String RepeatPassword){

        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage company = new CompanyPage();
        EmployeesPage employeesPage = new EmployeesPage();
        AddNewEmployeePage addNewEmployeePage = new AddNewEmployeePage();

        company.clickCompanyDDL(driver);

        company.clickEmployeeDDMI(driver);

        gaiaHelper.Wait3();

        employeesPage.clickAddNewEmployee(driver);

        gaiaHelper.Wait3();

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

        company.clickLogoutButton(driver);

        driver.quit();
    }

    @Test(dataProvider = "EditEmployee", dataProviderClass = EmployeeDataProvider.class)
    public void editEmployee (WebDriver driver, String CreatedEmployeeName, String EditedFirstName,
                              String EditedLastName, String EditedNotes, String EditedEmail, String EditedPassword,
                              String EditedRepeatPassword){

        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage company = new CompanyPage();
        EmployeesPage employeesPage = new EmployeesPage();
        EditEmployeePage editEmployeePage = new EditEmployeePage();

        company.clickCompanyDDL(driver);

        company.clickEmployeeDDMI(driver);

        gaiaHelper.Wait3();

        employeesPage.enterSearchField(driver, CreatedEmployeeName);

        employeesPage.clickEditButton(driver);

        editEmployeePage.enterNotes(driver, EditedNotes);

        editEmployeePage.clickBack(driver);

        editEmployeePage.clickLeavePopUpWarning(driver);

        gaiaHelper.Wait3();

        employeesPage.enterSearchField(driver,CreatedEmployeeName);

        employeesPage.clickEditButton(driver);

        editEmployeePage.enterNotes(driver, EditedNotes);

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

        company.clickLogoutButton(driver);

        driver.quit();
    }

    @Test
    public void onboardingProcess (WebDriver driver, String InstitutionNumber, String TransitNumber, String AccountNumber,
                                   String AccountHolderName, String FirstName, String LastName, String DateOfBirth,
                                   String AddressLine1, String AddressLine2, String City, String ZipPostalCode, String CreditCardNumber,
                                   String NameOnCard, String CVV, String CreditCardAddressLine1, String CreditCardAddressLine2,
                                   String CreditCardCity, String CreditCardZipPostalCode, String LicenseNumber){

        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage company = new CompanyPage();
        OnboardingProcess onboardingProcess = new OnboardingProcess();

        onboardingProcess.enterInstitutionNumber(driver, InstitutionNumber);

        onboardingProcess.enterTransitNumber(driver, TransitNumber);

        onboardingProcess.enterAccountNumber(driver, AccountNumber);

        onboardingProcess.enterAccountHolderName(driver, AccountHolderName);

        onboardingProcess.clickAccountTypeCompany(driver);

        onboardingProcess.clickSave1(driver);

        gaiaHelper.Wait3();

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

        gaiaHelper.Wait3();

        onboardingProcess.clickSave2(driver);

        gaiaHelper.Wait3();

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

        gaiaHelper.Wait3();

        company.clickLogoutButton(driver);

        driver.quit();


    }

    @Test(dataProvider = "LoginManager2", dataProviderClass = LoginDataProvider.class)
    public void loginAsManager2 (WebDriver driver, String LoginManagerName, String PasswordManagerName) {

        ID1Login login = new ID1Login();
        GaiaHelper gaiHelper = new GaiaHelper();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiHelper.Wait3();

        driver.quit();
    }

    @Test(dataProvider = "LoginSupervisor", dataProviderClass = LoginDataProvider.class)
    public void loginAsSupervisor (WebDriver driver, String LoginManagerName, String PasswordManagerName) {

        ID1Login login = new ID1Login();
        GaiaHelper gaiHelper = new GaiaHelper();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiHelper.Wait3();

        driver.quit();
    }

    @Test(dataProvider = "LoginInstaller", dataProviderClass = LoginDataProvider.class)
    public void loginAsInstaller (WebDriver driver, String LoginManagerName, String PasswordManagerName) {

        ID1Login login = new ID1Login();
        GaiaHelper gaiHelper = new GaiaHelper();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiHelper.Wait3();

        driver.quit();
    }

    @Test(dataProvider = "DeleteEmployee", dataProviderClass = EmployeeDataProvider.class)
    public void deleteEmployee (WebDriver driver, String FirstName){

        GaiaHelper gaiaHelper = new GaiaHelper();
        CompanyPage company = new CompanyPage();
        EmployeesPage employeesPage = new EmployeesPage();
        EditEmployeePage editEmployeePage = new EditEmployeePage();

        company.clickCompanyDDL(driver);

        company.clickEmployeeDDMI(driver);

        gaiaHelper.Wait3();

        employeesPage.enterSearchField(driver, FirstName);

        employeesPage.clickEditButton(driver);

        editEmployeePage.clickDeleteEmployee(driver);

        editEmployeePage.clickCancelDeletePopUp(driver);

        editEmployeePage.clickDeleteEmployee(driver);

        editEmployeePage.clickDeletePopUp(driver);

        company.clickLogoutButton(driver);

        driver.quit();
    }

    @Test(dataProvider = "LoginManager2", dataProviderClass = LoginDataProvider.class)
    public void loginAsDeletedManager2 (WebDriver driver, String LoginManagerName, String PasswordManagerName) {

        ID1Login login = new ID1Login();
        GaiaHelper gaiHelper = new GaiaHelper();
        LoginPage loginPage = new LoginPage();

        login.login(driver, LoginManagerName, PasswordManagerName);

        gaiHelper.Wait3();

        loginPage.clickOkPopUpErrorInvalidLoginOrPassword(driver);

        driver.quit();
    }
}
