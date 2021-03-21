import org.testng.annotations.Test;

public class SearchResultsTest extends BaseTest {
    @Test
    public void checkSearchProduct() {
        HomePage homePage = new HomePage(driver);
        homePage.searchProductByCriteria("Телефони");
    }
}
