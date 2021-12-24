package pages.web.involve;

import driver.PassDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTabPage extends PassDriver {

    public NewTabPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[name='contactName']")
    public WebElement fullName;

    @FindBy(css = "[name='companyName']")
    public WebElement companyName;

    @FindBy(name = "email")
    public WebElement emailTab;

    @FindBy(name = "password")
    public WebElement passTab;

    @FindBy(css = "[type='submit']")
    public WebElement clickToCreate;

    @FindBy(css = "#root > div > div.c-survey > div > div > form > div > fieldset.qa-account-type.c-step-form-fieldset > div:nth-child(2) > label > h2")
    public WebElement firstChoose;

    @FindBy(css = "#root > div > div.c-survey > div > div > form > div > fieldset.qa-employee-count.c-step-form-fieldset > div:nth-child(2) > label > h2")
    public WebElement secondChoose;

    @FindBy(id = "btn-about-you-continue-action")
    public WebElement continueBtn;
}
