package engine.mobile;


import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class Ios {

    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(PLATFORM_NAME, "ios");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad14.3");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "00008020-000335063A03002E");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        desiredCapabilities.setCapability("autoAcceptAlerts", true);
        desiredCapabilities.setCapability("platformVersion", "14.3");
        desiredCapabilities.setCapability("simpleIsVisibleCheck", true);
        desiredCapabilities.setCapability("useJSONSource", true);
        desiredCapabilities.setCapability("app", "com.cloudbacko.app");
        desiredCapabilities.setCapability("snapshotMaxDepth", "200");

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
