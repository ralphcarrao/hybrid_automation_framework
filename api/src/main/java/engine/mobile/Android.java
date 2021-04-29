package engine.mobile;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class Android {

    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(PLATFORM_NAME, "android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3a API 29");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        desiredCapabilities.setCapability("simpleIsVisibleCheck", true);
        desiredCapabilities.setCapability("useJSONSource", true);
        desiredCapabilities.setCapability("appPackage", "com.cloudbacko.app");
        desiredCapabilities.setCapability("appActivity", "com.kintips.ahsayauthenticator.MainActivity");

        return desiredCapabilities;
    }

    public URL getRemoteUrl() {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }
}
