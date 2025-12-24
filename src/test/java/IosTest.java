import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;

public class IosTest extends TestBase {
    @Test
    void sendEmail() {
        step("Click on tex button", () ->
                $(accessibilityId("Text Button")).click());
        step("Click on tex button", () ->
                $(accessibilityId("Text Input"))
                        .sendKeys("hello@browserstack.com" + "\n"));
        step("Click on tex button", () ->
                $(accessibilityId("Text Output"))
                        .shouldHave(text("hello@browserstack.com")));
    }
}
