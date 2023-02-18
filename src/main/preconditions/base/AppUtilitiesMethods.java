package base;

import config.DBObject;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.fail;

@Slf4j

//@Deprecated
public class AppUtilitiesMethods extends Base {


    public void click(WebElement element) {
        methodName();
        try {
            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(element));
            el.click();
        } catch (Exception e) {
            fail("the error is: " + e.getMessage());
        }


    }

    public void connectToDB_UserNPass() {
        methodName();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Nmr123456@@!");
            Statement statement = connection.createStatement();
            String sqlQuery = "select * from users";
            ResultSet st = statement.executeQuery(sqlQuery);

            Random r = new Random();
            ArrayList<DBObject> mArrayStringUsers = new ArrayList<>();


            while (st.next()) {

                st.getRow();
                String email = st.getString("email");
                String password = st.getString("passWord");
                DBObject object = new DBObject();

                object.setEmail(email);
                object.setPassWord(password);
                mArrayStringUsers.add(object);

            }

            int o = r.nextInt(mArrayStringUsers.size());
            String y = mArrayStringUsers.get(o).getEmail();
            String w = mArrayStringUsers.get(o).getPassWord();
            waitFor(500);
            sendKey(sharedObjectUtilities.logInPage.emailFiled, y);
            waitFor(500);
            sendKey(sharedObjectUtilities.logInPage.passFiled, w);
            waitFor(500);
            click(sharedObjectUtilities.logInPage.logInBtn);
            System.out.println(y);
            System.out.println(w);

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }


    }


    public boolean isElementPresented(WebElement element) {
        try {
            // wait = new WebDriverWait(driver, 1);
            if (element.isEnabled()) {
                System.out.println("The element is presented: " + element);
                return true;
            } else {
                System.out.println("The element is not presented");
                return false;
            }
        } catch (Exception e) {
            logInfo(Logs.FAIL,"The error of isElementPresented is: " + e.getMessage());
        }
        return false;
    }

    public void sendKey(WebElement element, String name) {

        try {
            if (isElementPresented(element)) {
                click(element);
                WebElement element1 = wait.until(ExpectedConditions.visibilityOf(element));
                clearText(element1);
                element1.sendKeys(name);
                logInfo(Logs.PASS, "The element is set");
            } else {
                logInfo(Logs.FAIL, "The send key is not not working");
            }
        } catch (ElementClickInterceptedException e) {
            logInfo(Logs.FAIL, "The error of sendKeys is: " + e.getMessage());
        } catch (ElementNotSelectableException e) {
            System.out.println("Other EXCEPTION: " + e.getMessage());
        }

    }

    public void waitFor(int timeSet) {
        try {
//            wait.wait(timeSet);
            Thread.sleep(timeSet);
        } catch (Exception e) {
            System.out.println("The time set exception is: " + e.getMessage());
        }
    }

    public void logInfo(Logs logs, String details) {
        switch (logs) {
            case PASS:
                log.info(logs.toString() + " " + "The action completed");
                System.out.println("Actions Success: " + details);
                break;
            case INFO:
                System.out.println();
            case FAIL:
                log.debug(logs.toString() + " " + "The action was not completed");
            case WARNING:
                log.warn(logs.toString() + " " + "Look again over the following steps");


        }

    }

    public void openNewTab(String url) {

//
        waitFor(3000);
        driver.switchTo().newWindow(WindowType.TAB);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        waitFor(5000);
        driver.switchTo().window(tabs.get(1));
        waitFor(1000);
        driver.get(url);


    }

    public void returnToMainTab() {
        waitFor(3000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        waitFor(5000);
        driver.switchTo().window(tabs.get(0));
    }

    public void openNewBrowser() {
        driver.switchTo().newWindow(WindowType.WINDOW);
    }


    public void scorllDownWindow() {

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200)");
    }

    public void getFirstTabInARaw() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        waitFor(5000);
        driver.switchTo().window(tabs.get(1));
    }

    public void rollLogIn(WebElement element, WebElement element1) {
        boolean move = false;
        for (int i = 0; i < 3; i++) {
            if (isElementPresented(element)) {
                connectToDB_UserNPass();
                if (isElementPresented(element1)) {
                    move = true;
                    logInfo(Logs.PASS, "/pass");
                    break;
                }
            }
            else {
                System.out.println("Still not logged in");
            }

        }
        if (!move){
            fail("Please check the user details");

        }
    }


//    public void forList(List<WebElement> elementList, String name1, String name2){
//        elementList.parallelStream().forEach(element ->
//        {if (element.getText().contains(name1))
//        element.click();
//            if (element.getText().contains(name2))});
//
//    }

//    //the list of string mention to mobile type of element such as: "text", "value"
//    public void getTextBy(WebElement element, List<String> elements) {
//        String name = "";
//
//        name = element.getAttribute(elements.get(0));
//
//    }

    /**
     * traceElement is provided option to read the method information like (method name, line, class name),
     * it's used by the object StackTraceElement
     **/
    public void methodName() {

//        Runtime run = Runtime.getRuntime();
            StackTraceElement traceElement = Thread.currentThread().getStackTrace()[5];
            String name = traceElement.getClassName() + " ," + traceElement.getLineNumber() + " ," + traceElement.getMethodName();
            logInfo(Logs.PASS, "The name of the Method and the Class and Line are " + " " + name);


    }

    public void loppingStream(List<WebElement> elements, String name) {
        elements.parallelStream().
                filter(this::isElementPresented).
                filter(element -> element.getText().contains(name)).forEach(WebElement::click);
    }

    public void rangeLetters(WebElement element, String text) {
        int num = 2;
        int num1 = 8;


        if (element.getText().length() >= num && element.getText().length() <= num1) {
            sendKey(element, text);
            System.out.println("Your are ok");
        } else {
            System.out.println("Your not");
        }


    }

    public void clearText(WebElement element){
        element.clear();
    }
}
