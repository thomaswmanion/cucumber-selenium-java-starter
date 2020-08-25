package starter.support;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class SeleniumUtil {
    protected static WebDriver driver;
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
        driver = new ChromeDriver();
    }
    public static void closeBrowser() {
        driver.close();
    }
    public static void navigateTo(String url) {
        driver.get(url);
    }
    public static void verifyUserSees(String elementName) throws Exception {
        // TODO - Create lookup for name translation to element selector
        String selector = "input.gsfi"; // Hardcoded to the Google Search Bar selector for now
        List<WebElement> elements = driver.findElements(By.cssSelector(selector));
        if (elements.size() < 1) {
            throw new Exception("Could not find element " + elementName);
        }
    }
}
