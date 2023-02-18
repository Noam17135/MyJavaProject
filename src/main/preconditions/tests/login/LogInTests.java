package tests.login;

import base.AppUtilitiesMethods;
import base.Logs;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

//@SpringBootTest
//@ContextConfiguration(classes = LogInPage.class)
public class LogInTests extends AppUtilitiesMethods {


    @Test
    public void test1() {
        appUtilitiesMethods.sendKey(sharedObjectUtilities.logInPage.emailFiled, "aaalkrgjlkgjlk");

    }

//    @Test
//    public void upLoad() {
//        appUtilitiesMethods.rollLogIn(sharedObjectUtilities.logInPage.logInBtn, sharedObjectUtilities.logInPage.upgradeBtn);
//
////        appUtilitiesMethods.click(sharedObjectUtilities.mainPage.integrationBtn);
////        String firstUrl = driver.getCurrentUrl();
////        logInfo(Logs.PASS, "First: " + firstUrl);
////
////        appUtilitiesMethods.waitFor(1000);
////        appUtilitiesMethods.click(sharedObjectUtilities.integrationPage.campaignOption);
////        appUtilitiesMethods.waitFor(1000);
////        appUtilitiesMethods.getFirstTabInARaw();
////        String newDriver = driver.getCurrentUrl();
////        logInfo(Logs.PASS, "Second: " + newDriver);
////
////        List<WebElement> elements = driver.findElements(By.tagName("a"));
////        String newOne = elements.get(5).getAttribute("href");
////        logInfo(Logs.PASS, "Thread: " + newOne);
////        driver.switchTo().newWindow(WindowType.TAB);
////        driver.get(newOne);
////        appUtilitiesMethods.click(sharedObjectUtilities.browserTabs.tab1);
////
////
////        appUtilitiesMethods.sendKey(sharedObjectUtilities.newTabPage.fullName, "Noam Ofir");
////        appUtilitiesMethods.sendKey(sharedObjectUtilities.newTabPage.companyName, "XXXX");
////        appUtilitiesMethods.sendKey(sharedObjectUtilities.newTabPage.emailTab, "nmr17135@gmail.com");
////        appUtilitiesMethods.sendKey(sharedObjectUtilities.newTabPage.passTab, "@@!123456789");
////        if (isElementPresented(sharedObjectUtilities.newTabPage.clickToCreate))
////            appUtilitiesMethods.click(sharedObjectUtilities.newTabPage.clickToCreate);
////        else System.out.println("The element is a problem");
////
////
////        appUtilitiesMethods.click(sharedObjectUtilities.newTabPage.firstChoose);
////        appUtilitiesMethods.click(sharedObjectUtilities.newTabPage.secondChoose);
////        if (sharedObjectUtilities.newTabPage.continueBtn.isEnabled())
////            appUtilitiesMethods.click(sharedObjectUtilities.newTabPage.continueBtn);
////        else if (!sharedObjectUtilities.newTabPage.continueBtn.isEnabled())
////            System.out.println("You have to choose 2 Options Above");
//
//
//    }
//
//
//    @Test
//    public void cleanWorkSpaces() {
//        appUtilitiesMethods.rollLogIn(sharedObjectUtilities.logInPage.logInBtn, sharedObjectUtilities.logInPage.upgradeBtn);
//        appUtilitiesMethods.waitFor(2000);
//        sharedObjectUtilities.mainPage.workSpaces.stream().forEach(op -> {
//            waitFor(500);
//            appUtilitiesMethods.click(sharedObjectUtilities.mainPage.dropToDlt);
//            waitFor(500);
//            sharedObjectUtilities.mainPage.optionTodlt.forEach(el ->
//            {
//                if (el.getText().contains("Delete Workspace")) {
//                    el.click();
//                    waitFor(1500);
//                    sendKey(sharedObjectUtilities.mainPage.frameSentKey, sharedObjectUtilities.mainPage.nameSpaceTitle.getText());
//                    waitFor(2000);
//                    click(sharedObjectUtilities.mainPage.dlt);
//                } else {
//                    System.out.println(el.getText());
//                }
//            });
//        });
//
//    }
//
//    @Test
//    public void youTubeVidoe() {
//        appUtilitiesMethods.rollLogIn(sharedObjectUtilities.logInPage.logInBtn , sharedObjectUtilities.logInPage.upgradeBtn);
//        appUtilitiesMethods.click(sharedObjectUtilities.mainPage.integrationBtn);
//        String firstUrl = driver.getCurrentUrl();
//        logInfo(Logs.PASS, "First: " + firstUrl);
//
//        appUtilitiesMethods.waitFor(1000);
//        appUtilitiesMethods.click(sharedObjectUtilities.integrationPage.integrationBtn);
//        appUtilitiesMethods.waitFor(1000);
//        // appUtilitiesMethods.getFirstTabInARaw();
//        String newDriver = driver.getCurrentUrl();
//        logInfo(Logs.PASS, "Second: " + newDriver);
//
//
//        for (WebElement element : sharedObjectUtilities.integrationPage.youTubeOp) {
//            element.click();
//            break;
//
//        }
//
//
//    }
//
//    @Test
//    public void dragNdropTest() throws InterruptedException {
//        appUtilitiesMethods.rollLogIn(sharedObjectUtilities.logInPage.logInBtn , sharedObjectUtilities.logInPage.upgradeBtn);
//
//
//        for (WebElement e : sharedObjectUtilities.mainPage.templates) {
//            if (e.getText().contains("Templates")) {
//                e.click();
//                break;
//            }
//        }
//        waitFor(3000);
//        appUtilitiesMethods.click(sharedObjectUtilities.templatesPage.firstTem);
//        waitFor(3000);
//
//        appUtilitiesMethods.sendKey(sharedObjectUtilities.templatesPage.textFiled, "test");
//        waitFor(3000);
//
//        appUtilitiesMethods.click(sharedObjectUtilities.templatesPage.clickToStart);
//        waitFor(5000);
//
//
//    }
//
//    @Test
//    public void deleteAll() {
//        appUtilitiesMethods.rollLogIn(sharedObjectUtilities.logInPage.logInBtn, sharedObjectUtilities.logInPage.upgradeBtn);
//
//        for (WebElement element : sharedObjectUtilities.mainPage.cards) {
//            element.click();
//            waitFor(2000);
//            for (WebElement element1 : sharedObjectUtilities.mainPage.insideCard) {
//                if (element1.getText().contains("Delete Project")) {
//                    waitFor(2000);
//                    element1.click();
//                    break;
//                }
//            }
//            break;
//        }
//
//        if (isElementPresented(sharedObjectUtilities.mainPage.deleteBtn)) {
//            click(sharedObjectUtilities.mainPage.deleteBtn);
//        }
//    }
//
//    @Test
//    public void test() {
//        appUtilitiesMethods.rollLogIn(sharedObjectUtilities.logInPage.logInBtn, sharedObjectUtilities.logInPage.upgradeBtn);
//    }
}
