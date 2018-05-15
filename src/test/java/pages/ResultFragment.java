package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultFragment extends BasePage {
    @FindBy(css = "div.g")
    private List<WebElement> results;


    public void clickResult(int resultNo){
        results.get(resultNo).click();
    }
}
