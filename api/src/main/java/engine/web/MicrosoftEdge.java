package engine.web;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;


public class MicrosoftEdge extends EdgeDriver {

    public MicrosoftEdge() {
        super(getCaps());
    }

    private static EdgeOptions getCaps() {
        EdgeOptions options = new EdgeOptions();
        options.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
        options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        options.setCapability("ignoreZoomSetting", true);
        options.setCapability("requireWindowFocus", false);
        options.setCapability("enablePersistentHover", false);
        System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, getExecutable());
        return options;
    }

    private static String getExecutable() {
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("drivers/msedgedriver.exe");
        File exe = null;
        try {
            exe = File.createTempFile("msedgedriver", ".exe");
            FileUtils.copyInputStreamToFile(is, exe);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(exe).getAbsolutePath();
    }
}
