package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class SearchFragment extends BasePage {
    @FindBy(id = "lst-ib")
    private WebElement txtSearch;

    @FindBys(@FindBy(id = ""))
    private WebElement abc;

    @FindBy(xpath = "")
    private List<WebElement> xyz;

    @FindBy(name = "btnK")
    private WebElement btnSearch;

    public void search(String keyword) {
        txtSearch.clear();
        txtSearch.sendKeys(keyword);
        btnSearch.click();
    }
}
