import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.SearchPage;

public class LoginTests extends BaseTest {

    @Test
    public void loginTestPositive() {
        String email = "john215autotest@hotmail.com";
        String password = "123456Aa$";
        SearchPage searchPage = new SearchPage(driver);
        searchPage.switchToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillLoginForm(email, password);
        Assert.assertTrue(searchPage.validatePageTitleCorrect());
    }

}

