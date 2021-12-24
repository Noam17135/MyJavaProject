package driver;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MobileDriver {

    public MobileDriver(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
