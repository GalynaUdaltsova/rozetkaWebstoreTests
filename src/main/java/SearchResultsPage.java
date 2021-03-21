import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchResultsPage {
    WebDriver driver;

    private String searchResults = "//span[contains(text(),'%s')]";

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkSearchResults(String criteriaValue) {
        Assert.assertNotEquals(criteriaValue, null);
        List<WebElement> webElements = driver.findElements(By.xpath(String.format(searchResults, criteriaValue)));
        Assert.assertFalse(webElements.isEmpty());
    }
}

