package driver;

import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WinAppDriver {


    public WinAppDriver(WebDriver driver){

            PageFactory.initElements(new AppiumFieldDecorator(driver),15);

    }
}
