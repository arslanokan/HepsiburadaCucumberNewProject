package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TrendyolLoginPages {

    static WebDriver driver;
    static ElementHelper elementHelper;

    WebDriverWait wait;

    static By accept = By.id("onetrust-accept-btn-handler");

    static By loginTab = By.xpath("//p[.='Giriş Yap']");

    static By loginField = By.id("login-email");

    static By passwordField = By.id("login-password-input");

    static By loginButton = By.xpath("//button[@class='q-primary q-fluid q-button-medium q-button submit']/span[.='Giriş Yap']");

    static By checkLogin = By.xpath("//div[@class='link account-user']");

    public TrendyolLoginPages (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20000));
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() {
    }

    public static void acceptCookies() {
        elementHelper.click(accept);
    }

    public static void clickLoginTab() {
        elementHelper.click(loginTab);
    }

    public static void clickLoginField() {
        elementHelper.click(loginField);
    }

    public static void writeEmail() {
        elementHelper.sendKey(loginField,"arslanokan1985@gmail.com");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void clickPasswordField() {
        elementHelper.click(passwordField);
    }

    public static void writePassword() {
        elementHelper.sendKey(passwordField, "Okan2306");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void clickLoginButton() {
        elementHelper.click(loginButton);

    }

    public static void checkLogin() {
        elementHelper.checkVisible(checkLogin);
    }
}
