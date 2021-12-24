package pages.web;

import driver.PassDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserTabs extends PassDriver {


    @FindBy (css = ".primary-nav-link.cmbtn.secondary")
    public WebElement tab1;

    public BrowserTabs(WebDriver driver) {
        super(driver);
    }
}
