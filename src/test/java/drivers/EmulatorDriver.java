package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.EmulatorConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EmulatorDriver implements WebDriverProvider {
    private final EmulatorConfig config =
            ConfigFactory.create(EmulatorConfig.class, System.getProperties());

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {

        Path appPath = Paths.get(System.getProperty("user.dir"))
                .resolve("src/test/resources/apk/wikipedia.apk")
                .toAbsolutePath()
                .normalize();

        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName(config.platformName())
                .setAutomationName("UiAutomator2")
                .setDeviceName(config.deviceName())
                .setAvd(config.deviceAvd())
                .setApp(appPath.toString())
                .setAppWaitActivity("*")
                .setNoReset(false);

        return new AndroidDriver(getAppiumServerUrl(), options);
    }

    private URL getAppiumServerUrl() {
        try {
            return new URL("http://localhost:4723/");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
