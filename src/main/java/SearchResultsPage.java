import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchResultsPage {
    protected WebDriver driver;

    private String searchResults = "//span[contains(text(),'%s')]";
    private By item = By.xpath("//span[@class='goods-tile__title'][1]");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchResultsPage checkSearchResults(String criteriaValue) {
        Assert.assertNotEquals(criteriaValue, null);
        List<WebElement> webElements = driver.findElements(By.xpath(String.format(searchResults, criteriaValue)));
        Assert.assertFalse(webElements.isEmpty());
        return new SearchResultsPage(driver);
    }

    public ProductPage openToProductCard() {
        driver.findElement(item).click();
        return new ProductPage(driver);
    }
}

