package engine;

import engine.mobile.Android;
import engine.mobile.Ios;
import engine.web.GoogleChrome;
import engine.web.MicrosoftEdge;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.Property;

import java.net.URL;


public class DriverManager {
    private static final String BROWSER = "browser";

    private String currentPlatform;
    private WebDriver webDriver;
    private AppiumDriver<MobileElement> mobileDriver;


    public void startWeb() {
        Property properties = new Property();
        properties.load("config.properties");

        switch (properties.getProperty(BROWSER)) {
            case "chrome":
                webDriver = new GoogleChrome();
                webDriver.manage().deleteAllCookies();
                break;
            case "edge":
                webDriver = new MicrosoftEdge();
                webDriver.manage().deleteAllCookies();
                break;
            case "firefox":
                webDriver = new FirefoxDriver();
                webDriver.manage().deleteAllCookies();
                break;
            default:
                throw new IllegalArgumentException("Browser not found!");
        }
    }

    public void startMobile() {
        Android driver = new Android();
        URL url = driver.getRemoteUrl();
        DesiredCapabilities desiredCapabilities = driver.getCapabilities();
        mobileDriver = new AppiumDriver<>(url, desiredCapabilities);

//        Ios driver = new Ios();
//        URL url = driver.getRemoteUrl();
//        DesiredCapabilities desiredCapabilities = driver.getCapabilities();
//        mobileDriver = new AppiumDriver<>(url, desiredCapabilities);
    }

    public WebDriver getWeb() {
        return this.webDriver;
    }

    public AppiumDriver<MobileElement> getMobile() {
        return this.mobileDriver;
    }

    public void closeWeb() {
        this.webDriver.quit();
    }

    public void closeMobile() {
        this.mobileDriver.quit();
    }

    public String getCurrentPlatform() {
        return currentPlatform;
    }

    public void setCurrentPlatform(String currentPlatform) {
        this.currentPlatform = currentPlatform;
    }
}
