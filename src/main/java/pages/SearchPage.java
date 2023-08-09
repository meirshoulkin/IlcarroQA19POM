package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchPage extends BasePage {

    public SearchPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id = 'com.telran.ilcarro:id/editLocation']")
    MobileElement location;
    @FindBy(xpath = "//*[@resource-id = 'com.telran.ilcarro:id/editFrom']")
    MobileElement dateFrom;
    @FindBy(xpath = "//*[@resource-id = 'com.telran.ilcarro:id/editTo']")
    MobileElement dateTo;
    @FindBy(xpath = "//*[@resource-id = 'com.telran.ilcarro:id/searchBtn']")
    MobileElement btnYalla;
    @FindBy(xpath = "//*[@resource-id = 'android:id/next']")
    MobileElement btnNextMonthCalendar;
    @FindBy(xpath = "//*[@resource-id = 'android:id/month_view']//*")
    List<MobileElement> days;
    @FindBy(xpath = "//*[@resource-id = 'android:id/button1']")
    MobileElement btnOkCalendar;

    public void fillSearchForm(String city, int counter, int dayFrom, int dayTo) {
        wait(location);
        typeText(city, location);
        click(dateFrom);
        for(int i = 0; i < counter; i++) {
            click(btnNextMonthCalendar);
        }
        click(days.get(dayFrom-1));
        click(btnOkCalendar);
        click(dateTo);
        for(int i = 0; i < counter; i++) {
            click(btnNextMonthCalendar);
        }
        click(days.get(dayTo-1));
        click(btnOkCalendar);
        driver.hideKeyboard();
        click(btnYalla);
    }

}
