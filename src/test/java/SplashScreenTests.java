import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SplashPage;

public class SplashScreenTests extends AppiumConfig {

    @Test
    public void textVersionText() {
        SplashPage splashPage = new SplashPage(driver);
        Assert.assertTrue(splashPage.validateVersionDisplaysCorrect());
    }

}


