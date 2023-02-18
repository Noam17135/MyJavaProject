package pages.web.involve;

import driver.PassDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class LogInPage extends PassDriver {



    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailFiled;

    @FindBy( xpath= "//input[@type='password']")
    public WebElement passFiled;

    @FindBy(xpath = "//*[@data-icon='arrow-right-to-bracket']")
    public WebElement logInBtn;

    @FindBy(css= "#app > div.bg-primary-900.px-2.sm\\:px-4 > nav > div.w-full.hidden.flex-grow.md\\:flex.md\\:items-center.md\\:w-auto.space-x-2 > div.flex.items-center.md\\:flex-grow.text-sm.font-medium.space-x-1\\.5 > span > a")
    public WebElement upgradeBtn;

    public LogInPage(WebDriver driver) {
        super(driver);
    }
}
