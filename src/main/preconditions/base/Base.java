package base;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;
import java.util.Set;


@SuppressWarnings("rawtypes")
@Slf4j

public abstract class Base {


    /*THOSE ARE THE DRIVER THAT WE WORK WITH TO UPLOAD SESSION OF DIFFERENT PLATFORMS*/
    public static WindowsDriver<WindowsElement> winappdriver;
    public static IOSDriver driverIOS;
    public static AndroidDriver driverAN = null;
    public static WebDriver driver;


    public static AppUtilitiesMethods appUtilitiesMethods;
    public static SharedObjectUtilities sharedObjectUtilities;
    public static WebDriverWait wait;


    @SuppressWarnings("rawtypes")
    public static void UpDriverNUrl(DriverOptions driverOptions) {
        switch (driverOptions) {
            case WEB:
                try {
                    System.setProperty("webdriver.chrome.driver", "C:\\Automation\\drivers\\chromedriver.exe");
                    driver = new ChromeDriver();
                    Set page = driver.manage().getCookies();
                    Set page1 = driver.manage().logs().getAvailableLogTypes();
                    System.out.println("Page is - " + page + "&&" + page1);
                    driver.navigate().to("https://app.involve.me/login/?_ga=2.228173661.1727425457.1635247238-136723805.1635247238");
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                    System.out.println("Page Factory = " + page);
                } catch (Exception e) {
                    System.out.print("the Web CASE message is: " + e.getMessage());
                }
                break;
            case MOBILE_ANDROID:
                DesiredCapabilities capabilities = new DesiredCapabilities();
                try {
                    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                    capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
                    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
                    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3_API_30");
                    capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\nmr17\\IdeaProjects\\com.automation1.com\\src\\main\\resources\\File Manager_v2.7.6_apkpure.com.apk");
                    driverAN = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                } catch (Exception e) {

                    System.out.println("The errors of ANDROID MOBILE IS: " + e.getMessage());
                }
                break;

            case MOBILE_iOS:

                DesiredCapabilities capabilities1 = new DesiredCapabilities();
                try {
                    capabilities1.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
                    capabilities1.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.2");
                    capabilities1.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                    capabilities1.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
                    capabilities1.setCapability(MobileCapabilityType.APP, "C:\\Users\\nmr17\\IdeaProjects\\com.automation1.com\\src\\main\\resources\\File Manager_v2.7.6_apkpure.com.apk");

                    driverIOS = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities1);
                } catch (Exception e) {

                    System.out.println("The error of IOS MOBILE IS: " + e.getMessage());
                }

                break;
            case WINAPP_DRIVER:


                DesiredCapabilities capabilities2 = new DesiredCapabilities();
                try {
                    capabilities2.setCapability("deviceName", "WindowsPC");
                    capabilities2.setCapability("platformName", "Windows");
                    capabilities2.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
                    winappdriver = new WindowsDriver<>(new URL("http://127.0.0.1:4723/"), capabilities2);

                    Thread.sleep(5000);


                } catch (Exception e) {
                    System.out.println("The error of WINAPPDRIVER IS: " + e.getMessage());
                }

        }
    }


    @BeforeAll
    public static void InitAppDriver() {
        UpDriverNUrl(DriverOptions.WEB);
        sharedObjectUtilities = new SharedObjectUtilities(driver);
        appUtilitiesMethods = new AppUtilitiesMethods();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @AfterAll
    public static void endProccess() {
        driver.quit();
    }
}
