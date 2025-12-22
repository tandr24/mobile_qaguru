import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IosTest extends TestBase {
    @Test
    void searchAppiumPage() {
//
//        $(accessibilityId("Text Button")).click();
//        $(accessibilityId("Text Button")).sendKeys("hello@browserstack.com"+"\n");
//        $(accessibilityId("Text Button")).shouldHave(text("hello@browserstack.com"));
//        step("Type search", () -> {
//            $(accessibilityId("Search Wikipedia")).click();
//            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
//        });
//        step("Verify content found", () ->
//                $$(className("android.widget.TextView")).shouldHave(sizeGreaterThan(0)));
    }
}
