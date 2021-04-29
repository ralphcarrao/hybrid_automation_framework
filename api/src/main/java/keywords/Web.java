package keywords;

import contract.Platform;
import engine.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web {
    private  WebDriver driver;
    private WebDriverWait wait;

    public Web(DriverManager driverManager) {
        if (driverManager.getCurrentPlatform().equals(Platform.WEB)) {
            driver = driverManager.getWeb();
            wait = new WebDriverWait(driver, 20);
        }
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void waitForElement(WebElement element, Integer timeInSeconds) {
        wait = new WebDriverWait(driver, timeInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void click(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void enterText(WebElement element, String testData) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(testData);
    }

    public TakesScreenshot takeScreenshot() {
        return ((TakesScreenshot) driver);
    }
}
