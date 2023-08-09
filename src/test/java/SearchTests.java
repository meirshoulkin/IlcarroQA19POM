import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;
import pages.SearchResultPage;

public class SearchTests extends AppiumConfig {

    String city = "Tel Aviv";
    int dayFrom = 4;
    int dayTo = 10;
    int quantityNextMonth = 1;

    @Test
    public void testFillSearchForm() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.fillSearchForm(city, quantityNextMonth, dayFrom, dayTo);
        Assert.assertTrue(new SearchResultPage(driver).validateTitleDisplaysCorrect());
    }

}
