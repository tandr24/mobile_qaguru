import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;

public class AndroidTest extends TestBase{
    @Test
    void searchAppiumPage() {
        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });
        step("Verify content found", () ->
                $$(className("android.widget.TextView")).shouldHave(sizeGreaterThan(0)));
    }

    @Test
    void checkPageOpens() {
        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Serbia");
        });
        step("Click on correct page", () -> {
            $$(id("org.wikipedia.alpha:id/page_list_item_title")).get(0).click();
        });
        step("Verify page is opened", () ->
                $(id("pcs")).shouldHave(text("Serbia")));

    }
}

