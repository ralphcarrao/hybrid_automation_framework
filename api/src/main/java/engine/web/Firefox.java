package engine.web;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.CapabilityType;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;


public class Firefox extends FirefoxOptions {

    Firefox() {
        super(getCaps());
    }

    private static FirefoxOptions getCaps() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("-foreground");
        options.addArguments("start-maximized");
        options.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
        options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        options.setCapability("ignoreZoomSetting", true);
        options.setCapability("requireWindowFocus", false);
        options.setCapability("enablePersistentHover", false);
        System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY, getExecutable());
        return options;
    }

    private static String getExecutable() {
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("drivers/geckodriver.exe");
        File exe = null;
        try {
            exe = File.createTempFile("geckodriver", ".exe");
            FileUtils.copyInputStreamToFile(is, exe);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(exe).getAbsolutePath();
    }
}
