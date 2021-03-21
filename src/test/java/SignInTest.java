import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

    @Test
    public void checkLoginToSite() {
        HomePage homePage = new HomePage(driver);
        homePage.login("gudalcova@ukr.net", "Password1");
    }
}
