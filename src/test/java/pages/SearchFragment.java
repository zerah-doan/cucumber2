package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFragment extends BasePage {
    @FindBy(id = "lst-ib")
    private WebElement txtSearch;

    @FindBy(name = "btnK")
    private WebElement btnSearch;

    public void search(String keyword) {
        txtSearch.clear();
        txtSearch.sendKeys(keyword);
        btnSearch.click();
    }
}
