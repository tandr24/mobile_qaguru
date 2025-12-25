package pages;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;

public class ScreenPagesWiki {

    public ScreenPagesWiki searchPage(String pageName) {
        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys(pageName);
        });
        return this;
    }

    public ScreenPagesWiki verifyContentFound() {
        step("Verify content found", () ->
                $$(className("android.widget.TextView"))
                        .shouldHave(sizeGreaterThan(0)));
        return this;
    }

    public ScreenPagesWiki clickOnPage() {
        step("Click on correct page", () -> {
            $$(id("org.wikipedia.alpha:id/page_list_item_title")).get(0).click(); // click is not working. Error page
        });
        return this;
    }

    public ScreenPagesWiki verifyPageIsOpened() {
        step("Verify page is opened", () ->
                $(id("pcs")).shouldHave(text("Serbia")));
        return this;
    }

}
