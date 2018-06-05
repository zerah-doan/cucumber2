package webdriver;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverFactory {
    public static <T extends MutableCapabilities> WebDriver createInstance(BrowserType browserType, T options) {
        WebDriver driver = null;
        switch (browserType) {
            case CHROME:
            default:
                io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
                driver = (options instanceof ChromeOptions) ? new ChromeDriver((ChromeOptions) options) : new ChromeDriver();
                break;
            case FIREFOX:
                io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();
                driver = (options instanceof FirefoxOptions) ? new FirefoxDriver((FirefoxOptions) options) : new FirefoxDriver();
                break;
            case IE:
                break;
            case EDGE:
                break;
            case OPERA:
                break;
            case REMOTE:
                try {
                    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
        }
        return driver;
    }

    public static WebDriver createInstance(BrowserType browserType) {
        return createInstance(browserType, null);
    }

    public static <T extends MutableCapabilities> WebDriver createInstance(String browserName, T options) {
        BrowserType type = BrowserType.getBrowserType(browserName);
        return createInstance(type, options);
    }

    public static WebDriver createInstance(String browserName) {
        return createInstance(browserName, null);
    }


}
