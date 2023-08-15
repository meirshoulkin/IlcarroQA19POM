package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage{

    public SearchResultPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id = 'com.telran.ilcarro:id/resultTitle']")
    MobileElement title;

    public boolean validateTitleDisplaysCorrect() {
        wait(title);
        String actualResult = getText(title);
        String expectedResult = "Search result".toUpperCase();
        if(actualResult.equals(expectedResult)) {
            return true;
        } else {
            System.out.println("Expected result: " + expectedResult +
                    " Actual result: " + actualResult);
            return false;
        }
    }

}
