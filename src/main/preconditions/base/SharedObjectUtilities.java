package base;

import org.openqa.selenium.WebDriver;
import pages.mobile.FirstPage;
import pages.web.BrowserTabs;
import pages.web.involve.*;

public class SharedObjectUtilities {

    //////////////////////WEB////////////////
    public LogInPage logInPage;
    public MainPage mainPage;
    public IntegrationPage integrationPage;
    public BrowserTabs browserTabs;
    public TemplatesPage templatesPage;
    public NewTabPage newTabPage;


    ///////////////////MOBILE////////////////////

    public FirstPage firstPage;

    //////////////////DESKTOP////////////////

    public SharedObjectUtilities(WebDriver driver) {
        logInPage = new LogInPage(driver);
        integrationPage = new IntegrationPage(driver);
        mainPage = new MainPage(driver);
        browserTabs = new BrowserTabs(driver);
        templatesPage = new TemplatesPage(driver);
        newTabPage = new NewTabPage(driver);



        ////////////////////////////////////
        firstPage = new FirstPage(driver);
    }

}
