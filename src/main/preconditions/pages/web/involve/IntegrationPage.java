package pages.web.involve;

import driver.PassDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IntegrationPage extends PassDriver {
    public IntegrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[alt='CampaigMonitor']")
    public WebElement campaignOption;

    @FindBy(css = ".text-center > a:nth-child(1)")
    public WebElement integrationBtn;

    @FindBy(css = ".ytp-impression-link")
    public List<WebElement> youTubeOp;

}
