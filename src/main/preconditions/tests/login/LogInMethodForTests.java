package tests.login;

import base.AppUtilitiesMethods;
import jdk.jfr.Description;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

//@Deprecated
@Log4j2
@Component
public class LogInMethodForTests extends AppUtilitiesMethods {


    @Description("Sanity - Log in Test")
    public void logInTest() {
        appUtilitiesMethods.rollLogIn(sharedObjectUtilities.logInPage.upgradeBtn);


    }
}
