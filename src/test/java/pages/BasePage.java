package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import webdriver.WebDriverManager;

public class BasePage {
    protected WebDriver wd;

    public BasePage() {
        this.wd = WebDriverManager.getDriver();
        PageFactory.initElements(this.wd, this);
    }
}
