import Helper.GaiaHelper;
import PageObjects.AddANewCompanyPage;
import PageObjects.CompanyPage;
import PageObjects.EditCompanyPage;
import dataProvider.AdminDataProvider;
import dataProvider.CompanyDataProvider;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ID2Company {

    private WebDriver driver;

    @Parameters({ "browser" })
    @BeforeTest

    public void openBrowser (String browser) {

    try {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().setSize(new Dimension(1280,720));
            driver.manage().window().setPosition(new Point(0,0));

        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().window().setSize(new Dimension(1280,720));
            driver.manage().window().setPosition(new Point(1280,0));
        }

        else if (browser.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
            driver.manage().window().setSize(new Dimension(1280,720));
            driver.manage().window().setPosition(new Point(0,1280));
        }

    } catch (WebDriverException e) {
        System.out.println(e.getMessage());
    }
}

    //SHOULD BE STARTED BEFORE EACH METHOD
    @Test(dataProvider = "LoginAdmin", dataProviderClass = AdminDataProvider.class)
    public void loginAsAdmin (WebDriver driver, String LoginAdminName, String PasswordAdminName) {

        //Create Objects required for this test
        ID1Login login = new ID1Login();
        GaiaHelper gaiHelper = new GaiaHelper();

        //Run the method
        login.LoginAsAdmin(driver, LoginAdminName, PasswordAdminName);

        //Add delay 3 sec
        gaiHelper.Wait3();
    }

    @Test(dataProvider = "CreateLandscapeCompany", dataProviderClass = CompanyDataProvider.class)
    public void CreateLandscapeCompany (WebDriver driver, String CompanyName, String CompanyEmail, String CompanyTaxNumber, String ProductSpread, String CompanyDescription) {

        //Create Objects required for this test
        CompanyPage companyPage = new CompanyPage();
        GaiaHelper gaiHelper = new GaiaHelper();
        AddANewCompanyPage addANewCompanyPage = new AddANewCompanyPage();

        //Click Company button
        companyPage.clickCompanyDDL(driver);

        //Click Company DDL menu item
        companyPage.clickCompanyDDMI(driver);

        //Add delay 3 sec
        gaiHelper.Wait3();

        //Click Add a new company
        companyPage.clickAddANewCompanyButton(driver);

        //Add delay 3 sec
        gaiHelper.Wait3();

        //Enter valid name
        addANewCompanyPage.enterCompanyName(driver, CompanyName);

        //Enter valid email
        addANewCompanyPage.enterCompanyEmail(driver, CompanyEmail);

        //Enter Tax number
        addANewCompanyPage.enterCompanyTaxNumber(driver, CompanyTaxNumber);

        //Click Company type DDL
        addANewCompanyPage.clickCompanyTypeLandscape(driver);

        //Click Currency DDL
        addANewCompanyPage.clickCompanyCurrencyCAD(driver);

        //Enter Company Product Spread Reduction Percentage
        addANewCompanyPage.enterCompanyProductSpread(driver, ProductSpread);

        //Enter Company description
        addANewCompanyPage.enterCompanyDescription(driver, CompanyDescription);

        //Click button Add
        addANewCompanyPage.clickButtonAdd(driver);

        //Click Log Out button
        companyPage.clickLogoutButton(driver);

        //Kill the driver
        driver.quit();

    }

    @Test(dataProvider = "CreateSupplierCompany", dataProviderClass = CompanyDataProvider.class)
    public void CreateSupplierCompany (WebDriver driver, String CompanyName, String CompanyEmail, String CompanyTaxNumber, String ProductSpread, String CompanyDescription) {

        //Create Objects required for this test
        CompanyPage companyPage = new CompanyPage();
        GaiaHelper gaiHelper = new GaiaHelper();
        AddANewCompanyPage addANewCompanyPage = new AddANewCompanyPage();

        //Click Company button
        companyPage.clickCompanyDDL(driver);

        //Click Company DDL menu item
        companyPage.clickCompanyDDMI(driver);

        //Add delay 3 sec
        gaiHelper.Wait3();

        //Click Add a new company
        companyPage.clickAddANewCompanyButton(driver);

        //Add delay 3 sec
        gaiHelper.Wait3();

        //Enter valid name
        addANewCompanyPage.enterCompanyName(driver, CompanyName);

        //Enter valid email
        addANewCompanyPage.enterCompanyEmail(driver, CompanyEmail);

        //Enter Tax number
        addANewCompanyPage.enterCompanyTaxNumber(driver, CompanyTaxNumber);

        //Click Company type DDL
        addANewCompanyPage.clickCompanyTypeSupplier(driver);

        //Click Currency DDL
        addANewCompanyPage.clickCompanyCurrencyCAD(driver);

        //Enter Company Product Spread Reduction Percentage
        addANewCompanyPage.enterCompanyProductSpread(driver, ProductSpread);

        //Enter Company description
        addANewCompanyPage.enterCompanyDescription(driver, CompanyDescription);

        //Click button Add
        addANewCompanyPage.clickButtonAdd(driver);

        //Click Log Out button
        companyPage.clickLogoutButton(driver);

        //Kill the driver
        driver.quit();
    }

    @Test(dataProvider = "EditCompany", dataProviderClass = CompanyDataProvider.class)
    public void EditCompany (WebDriver driver, String CreatedCompanyName, String EditedCompanyName, String EditedCompanyEmail, String EditedCompanyWebSite, String EditedCompanyTaxNumber,   ) {

        //Create Objects required for this test
        CompanyPage companyPage = new CompanyPage();
        GaiaHelper gaiHelper = new GaiaHelper();
        AddANewCompanyPage addANewCompanyPage = new AddANewCompanyPage();
        EditCompanyPage editCompanyPage = new EditCompanyPage();

        //Click Company button
        companyPage.clickCompanyDDL(driver);

        //Enter the name of just created company
        companyPage.enterSearchField(driver, CreatedCompanyName);

        //Click button Edit
        companyPage.clickButtonEdit(driver);

        //Add delay 5 sec
        gaiHelper.Wait5();

        //Click Edit button
        editCompanyPage.clickEditButton(driver);

        //Click button Cancel
        editCompanyPage.clickCancelButton(driver);

        //Click Edit button
        editCompanyPage.clickEditButton(driver);

        //Upload the new picture
        editCompanyPage.uploadNewLogo(driver);

        //Enter updated Company name
        editCompanyPage.editComanyName(driver, EditedCompanyName);

        //Enter updated company email
        editCompanyPage.editComanyEmail(driver,EditedCompanyEmail);

        //Enter updated website
        editCompanyPage.editComanyWebSite(driver, EditedCompanyWebSite);

        //Enter updated company tax number
        editCompanyPage.editComanyTaxNumber(driver, EditedCompanyTaxNumber);

        //Find Company type
        element = ((ChromeDriver) driver).findElementByXPath("//body/div[@id='app']/div/div/div/div[@class='card']/div[@class='card-content']/div[contains(@class,'columns')]/div[@class='column is-half']/div[@class='field']/p[1]/span[1]/select[1]");

        //Click Company Type
        element.click();

        //Find Supplier
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='supplier']");

        //Click Supplier
        element.click();

        //Find Company type
        element = ((ChromeDriver) driver).findElementByXPath("//body/div[@id='app']/div/div/div/div[@class='card']/div[@class='card-content']/div[contains(@class,'columns')]/div[@class='column is-half']/div[@class='field']/p[1]/span[1]/select[1]");

        //Click Company Type
        element.click();

        //Find Type
        element = ((ChromeDriver) driver).findElementByXPath("//option[contains(text(),'Type')]");

        //Click Type
        element.click();

        //Find Company type
        element = ((ChromeDriver) driver).findElementByXPath("//body/div[@id='app']/div/div/div/div[@class='card']/div[@class='card-content']/div[contains(@class,'columns')]/div[@class='column is-half']/div[@class='field']/p[1]/span[1]/select[1]");

        //Click Company Type
        element.click();

        //Find Landscape
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='landscape']");

        //Click Landscape
        element.click();

        //Find Currency
        element = ((ChromeDriver) driver).findElementByXPath("//div[@class='field']//p[2]//span[1]//select[1]");

        //Click Currency
        element.click();

        //Find USD
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='USD']");

        //Click USD
        element.click();

        //Find Currency
        element = ((ChromeDriver) driver).findElementByXPath("//div[@class='field']//p[2]//span[1]//select[1]");

        //Click Currency
        element.click();

        //Find MXN
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='MXN']");

        //Click MXN
        element.click();

        //Find Currency
        element = ((ChromeDriver) driver).findElementByXPath("//div[@class='field']//p[2]//span[1]//select[1]");

        //Click Currency
        element.click();

        //Find Currency
        element = ((ChromeDriver) driver).findElementByXPath("//option[contains(text(),'Currency')]");

        //Click Currency
        element.click();

        //Find Currency
        element = ((ChromeDriver) driver).findElementByXPath("//div[@class='field']//p[2]//span[1]//select[1]");

        //Click Currency
        element.click();

        //Find CAD
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='CAD']");

        //Click CAD
        element.click();

        //Find License limit
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='admin_card_license_limit']");

        //Clear the field
        element.click();
        element.clear();

        //Enter update Licence limit
        element.sendKeys("20");

        //Find Product Spread Reduction Percentage
        element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='20']");

        //Clear the field
        element.click();
        element.clear();

        //Enter updated Product Spread Reduction Percentage
        element.sendKeys("35");

        //Find Address line 1
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='address_one']");

        //Clear the field
        element.click();
        element.clear();

        //Enter updated Address line 1
        element.sendKeys("Office 111");

        //Find Address line 2
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='address_two']");

        //Clear the field
        element.click();
        element.clear();

        //Enter updated Address line 2
        element.sendKeys("1st ST");

        //Find City
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='address_city']");

        //Clear the field
        element.click();
        element.clear();

        //Enter updated City
        element.sendKeys("Vancouver");

        //Find Country
        element = ((ChromeDriver) driver).findElementByXPath("//select[@id='address_country']");

        //Click Country
        element.click();

        //Find United States
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='US']");

        //Click United States
        element.click();

        //Find Country
        element = ((ChromeDriver) driver).findElementByXPath("//select[@id='address_country']");

        //Click Country
        element.click();

        //Find Mexico
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='MX']");

        //Click Mexico
        element.click();

        //Find Country
        element = ((ChromeDriver) driver).findElementByXPath("//select[@id='address_country']");

        //Click Country
        element.click();

        //Find a Country
        element = ((ChromeDriver) driver).findElementByXPath("//option[contains(text(),'Select a country')]");

        //Click a Country
        element.click();

        //Find Country
        element = ((ChromeDriver) driver).findElementByXPath("//select[@id='address_country']");

        //Click Country
        element.click();

        //Find Canada
        element = ((ChromeDriver) driver).findElementByXPath("//option[contains(text(),'Canada')]");

        //Click Canada
        element.click();

        //Find State/Province
        element = ((ChromeDriver) driver).findElementByXPath("//select[@id='address_state']");

        //Click State/Province
        element.click();

        //Find Yukon
        element = ((ChromeDriver) driver).findElementByXPath("//option[@value='YT']");

        //Click Yukon
        element.click();

        //Find Zip/Postal Code
        element = ((ChromeDriver) driver).findElementByXPath("//input[@id='address_postalcode']");

        //Clear the field
        element.click();
        element.clear();

        //Enter Zip/Postal Code
        element.sendKeys("TTT 111");

        //Find Company description
        element = ((ChromeDriver) driver).findElementByXPath("//textarea[@id='description']");

        //Clear the field
        element.click();
        element.clear();

        //Enter updated company description
        element.sendKeys("Edited Company description");

        //Find Save
        element = ((ChromeDriver) driver).findElementByXPath("//button[@id='address_submit']");

        //Click Save
        element.click();

        //Find Log Out button
        element = ((ChromeDriver) driver).findElementByXPath("//span[contains(text(),'Log Out')]");

        //Click Log Out button
        element.click();

        //Kill the driver
        driver.quit();

    }
}



