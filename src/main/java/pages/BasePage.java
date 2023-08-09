package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    AppiumDriver<MobileElement> driver;

    public BasePage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String getText(MobileElement element) {
        return element.getText().trim().toUpperCase();
    }

    public void typeText(String text, MobileElement element) {
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public void click(MobileElement element) {
        element.click();
    }

    public void wait(MobileElement element) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(element));
    }

}
