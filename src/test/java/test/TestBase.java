package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverProvider;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserstackDriver;
import drivers.EmulatorDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
    public static String deviceHost = System.getProperty("deviceHost", "emulation");

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = getMode().getClass().getName();
        Configuration.browserSize = null;
        Configuration.timeout = 30000;
    }

    @BeforeEach
    void setUp() {
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide()
                        .screenshots(true)
                        .savePageSource(false));
        open();
    }

    @AfterEach
    void tearDown() {
        String sessionId = Selenide.sessionId().toString();
        System.out.println(sessionId);

        Attach.pageSource();
        Attach.screenshotAs("last screen");
        closeWebDriver();
        if (deviceHost.equals("browserstack")) {
            Attach.addVideo(sessionId);
        }
    }

    static WebDriverProvider getMode() {
        return switch (deviceHost) {
            case "browserstack" -> new BrowserstackDriver();
            case "emulation" -> new EmulatorDriver();
            default -> throw new IllegalArgumentException("Unknown device: ");
        };
    }
}
