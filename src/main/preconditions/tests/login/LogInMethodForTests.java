package tests.login;

import base.AppUtilitiesMethods;
import jdk.jfr.Description;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.springframework.stereotype.Component;
//import org.springframework.context.annotation.Description;

import java.util.List;

@Log4j2
@Component
public class    LogInMethodForTests extends AppUtilitiesMethods {


    @Description("Sanity - Log in Test")
    public void logInTest() {
        appUtilitiesMethods.rollLogIn(sharedObjectUtilities.logInPage.upgradeBtn);


    }
}
