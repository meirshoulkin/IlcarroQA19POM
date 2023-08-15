import config.AppiumConfig;
import dto.UserDTO;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RegistrationPage;
import pages.SearchPage;
import utils.RandomUtils;

public class RegistrationTests extends BaseTest {

    @Test
    public void registrationPositiveTest() {
        RandomUtils randomUtils = new RandomUtils();
        String email = randomUtils.generateRandomEmail();
        System.out.println("email: ----------------- " + email);
        UserDTO userDto = UserDTO.builder()
                .name("autotest")
                .lastName("nfdgkini")
                .email(email)
                .password("123456Aa$")
                .build();
        SearchPage searchPage = new SearchPage(driver);
        searchPage.switchToRegistrationPage();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.fillRegistrationForm(userDto);
        Assert.assertTrue(searchPage.validatePageTitleCorrect());
    }

}
