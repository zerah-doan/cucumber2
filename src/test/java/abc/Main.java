package abc;

import webdriver.WebDriverFactory;
import webdriver.WebDriverManager;

public class Main {
    public static void main(String[] args) {
//        ChromeOptions options1 = new ChromeOptions();
//        options1.addArguments("start-maximized");
//        WebDriverManager.setWebDriver("gc", options1);
//        WebDriverManager.dismissWebDriver();

        WebDriverManager.setWebDriver(WebDriverFactory.createInstance("gc"));
        WebDriverManager.setWebDriver(WebDriverFactory.createInstance("ff"));
        WebDriverManager.dismissWebDriver();


//        FirefoxOptions options2 = new FirefoxOptions();
//        options2.addArguments("start-maximized");
//        WebDriver wd2 = WebDriverFactory.createInstance("ff", options2);
//        wd2.quit();
    }


}
