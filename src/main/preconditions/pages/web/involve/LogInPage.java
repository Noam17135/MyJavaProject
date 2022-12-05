package pages.web.involve;

import driver.PassDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LogInPage extends PassDriver {


    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailFiled;

    @FindBy(name = "password")
    public WebElement passFiled;

    @FindBy(css = "#app-layout > div.container-fluid.container-main > div > div.col-lg-4.auth-form-container > div > form > div:nth-child(5) > button > i")
    public WebElement logInBtn;

    @FindBy(css = ".nav-link.upgrade.text-white.text-sm.rounded.bg-blue-500")
    public WebElement upgradeBtn;

    public LogInPage(WebDriver driver) {
        super(driver);
    }
}
