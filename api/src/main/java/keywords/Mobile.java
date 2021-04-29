package keywords;

import contract.Platform;
import engine.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mobile {
    private AppiumDriver<MobileElement> driver;
    private WebDriverWait wait;
    private AndroidTouchAction action;

    public Mobile(DriverManager driverManager) {
        if (driverManager.getCurrentPlatform().equals(Platform.MOBILE)) {
            driver = driverManager.getMobile();
            wait = new WebDriverWait(driver, 30);
            action = new AndroidTouchAction(driver);
        }
    }

    public void waitForElement(MobileElement element, Integer timeInSeconds) {
        wait = new WebDriverWait(driver, timeInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForText(MobileElement element, String text) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }
    public void waitForText(MobileElement element, String text,Integer timeInSeconds) {
        wait = new WebDriverWait(driver, timeInSeconds);
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public void tap(MobileElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        action.tap(TapOptions.tapOptions()
                .withElement(ElementOption.element(element)))
                .perform();
    }

    public void tapStale(MobileElement element) {
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        action.tap(TapOptions.tapOptions()
                .withElement(ElementOption.element(element)))
                .perform();
    }

    public void enterText(MobileElement element, String testData) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(testData);
    }

    public void verifyElementExist(MobileElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void verifyButtonChecked(MobileElement element, Boolean isChecked) {
        String checked = "checked";
        if (isChecked.equals(true)) {
            wait.until(ExpectedConditions.attributeContains(element, checked, "true"));
            Assert.assertEquals(element.getAttribute(checked), "true");
        } else {
            wait.until(ExpectedConditions.attributeContains(element, checked, "false"));
            Assert.assertEquals(element.getAttribute(checked), "false");
        }
    }

    public void verifyEquals(String expected, String actual) {
        Assert.assertEquals(expected, actual);
    }
    public void verifyEquals(int expected, int actual) {
        Assert.assertEquals(expected, actual);
    }
}
