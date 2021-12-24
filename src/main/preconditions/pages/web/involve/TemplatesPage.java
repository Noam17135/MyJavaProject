package pages.web.involve;

import driver.PassDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TemplatesPage extends PassDriver {
    public TemplatesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".c-thumbnail-image-wrapper > a > [alt='Blank']")
    public WebElement firstTem;

    @FindBy(css = "#project-name:nth-child(2)")
    public WebElement textFiled;

    @FindBy(css = "#new-project-form > div.form-group.outcome-selection-wrapper.m-b-0 > div > div:nth-child(1) > label > div > button")
    public WebElement clickToStart;

    @FindBy(css = "#tab1contentitems > div > div:nth-child(1) > div:nth-child(2) > div > div > svg")
    public WebElement tempToDrag;

    @FindBy(css = ".content-item-wrapper.shadow.empty_canvas")
    public WebElement mainDrop;
}
