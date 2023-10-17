package Util;
;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    static WebDriver driver;
    static Properties properties;

    public static WebDriver initialize_Driver(String browser) {
        properties = ConfigReader.getProperties();
        if (browser.equals("Chrome")) {
            driver = new ChromeDriver();

            JavascriptExecutor jsx = (JavascriptExecutor)driver; // Selenium sayfayı aşağı kaydırma
            jsx.executeScript("window.scrollBy(0,250)","");

        } else if (browser.equals("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equals("Safari")) {
            driver = new SafariDriver();
        } else {
            driver = new EdgeDriver();
        }
        String url = properties.getProperty("url");
        int pageWait = Integer.parseInt(properties.getProperty("pageLoadTimeout"));
        int impWait = Integer.parseInt(properties.getProperty("implicitlyWait"));
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);
        return getDriver();
    }
    public static WebDriver getDriver() {
        return driver;
    }
}
