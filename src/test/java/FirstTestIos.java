import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTestIos{
    @Test
    void successfulSearchTestComplete() throws MalformedURLException, InterruptedException {

        // ========== 1. НАСТРОЙКА КАПАБИЛИТИ ==========
        XCUITestOptions options = new XCUITestOptions();

        // Настройки BrowserStack (все в bstack:options)
        Map<String, Object> bstackOptions = new HashMap<>();
        bstackOptions.put("userName", "tatianaandreeva_25V8m1");
        bstackOptions.put("accessKey", "UzbgY9ixkqdnBN8xxQxG");
        // Используем устройство из примера BrowserStack, которое точно поддерживается
        bstackOptions.put("deviceName", "iPhone 14 Pro Max");
        bstackOptions.put("osVersion", "16");
        bstackOptions.put("projectName", "Run tests on" );
        bstackOptions.put("buildName", "build-for-" );
        bstackOptions.put("sessionName", "tests");

        // Ключевые capabilities БЕЗ префикса appium:
        options.setCapability("platformName", "ios");
        options.setCapability("app", "bs://sample.app"); // Оставляем демо-приложение

        // Appium-специфичные настройки
        options.setCapability("appium:automationName", "XCUITest");

        // Присоединяем настройки BrowserStack
        options.setCapability("bstack:options", bstackOptions);

        // ========== 2. ИНИЦИАЛИЗАЦИЯ ДРАЙВЕРА ==========
        IOSDriver driver = new IOSDriver(new URL("https://hub.browserstack.com/wd/hub"), options);

        // ========== 3. ВЫПОЛНЕНИЕ ТЕСТОВОГО СЦЕНАРИЯ ==========
        WebElement textButton = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
                ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Text Button")));
        textButton.click();
        WebElement textInput = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
                ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Text Input")));
        textInput.sendKeys("hello@browserstack.com"+"\n");

        Thread.sleep(5000);

        WebElement textOutput = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
                ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Text Output")));

        assertEquals(textOutput.getText(),"hello@browserstack.com");

        driver.quit();

    }
}
