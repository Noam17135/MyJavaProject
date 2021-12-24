package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class PassDriver {


    public PassDriver(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,3),this);
    }

}
