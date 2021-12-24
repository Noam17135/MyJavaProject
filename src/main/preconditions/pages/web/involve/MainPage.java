package pages.web.involve;

import driver.PassDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MainPage extends PassDriver {



    @FindBy(css = "#app > div:nth-child(2) > nav > div.w-full.hidden.md\\:block.flex-grow.md\\:flex.md\\:items-center.md\\:w-auto > div.text-sm.flex.items-start.md\\:flex-grow > a:nth-child(4)")
    public WebElement integrationBtn;

    @FindBy(css = ".mr-3.truncate")
    public List<WebElement> workSpaces;

    @FindBy(css = ".block.text-gray-700:nth-child(1)")
    public WebElement dropToDlt;

    @FindBy(css = "#app > div.max-w-full.sm\\:px-12.md\\:px-0.md\\:max-w-3xl.lg\\:max-w-6xl.mx-auto.relative.pb-24 > div > div.mt-4.md\\:mt-0.w-full.max-w-4xl > div.px-4.md\\:flex.justify-between.md\\:px-0.md\\:ml-6.lg\\:ml-8.xl\\:ml-12.items-center > div > div.dropdown.relative.mr-3 > ul")
    public List<WebElement> optionTodlt;

    @FindBy(css = ".text-gray-900.text-xl")
    public WebElement nameSpaceTitle;

    @FindBy(id = "confirm-create-button")
    public WebElement dlt;

    @FindBy(css = ".h-12.w-full.px-2.placeholder-gray-400")
    public WebElement frameSentKey;

    @FindBy(css = ".text-sm.flex.items-start > a")
    public List<WebElement> templates;

    @FindBy(css = ".dropdown.relative > [href='#'] > svg")
    public List<WebElement> cards;

    @FindBy(css = "#app > div.max-w-full.sm\\:px-12.md\\:px-0.md\\:max-w-3xl.lg\\:max-w-6xl.mx-auto.relative.pb-24 > div > div.mt-4.md\\:mt-0.w-full.max-w-4xl > div.md\\:ml-6.lg\\:ml-8.xl\\:ml-12.mt-8.grid.row-gap-4.md\\:row-gap-8.md\\:col-gap-8.md\\:grid-cols-2.lg\\:grid-cols-3 > div:nth-child(1) > div.absolute.right-0.left-0.mt-8.mx-3.z-100.flex-1 > div.flex.items-center.justify-between.mb-2 > div.flex.justify-right.items-center > div > ul > li")
    public List<WebElement> insideCard;

    @FindBy(id = "confirm-delete-button")
    public WebElement deleteBtn;

    public MainPage(WebDriver driver) {
        super(driver);
    }
}
