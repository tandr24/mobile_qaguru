package screens;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;

public class SearchScreen {

    public static final SelenideElement searchField = $(accessibilityId("Search Wikipedia"));
    public static final SelenideElement searchFieldInput = $(id("org.wikipedia:id/search_src_text"));
    public static final ElementsCollection widgetField = $$(className("android.widget.TextView"));
    public static final ElementsCollection clickOnPageField = $$(id("org.wikipedia:id/page_list_item_title"));
    public static final SelenideElement pageObjectField = $(id("pcs"));

    public SearchScreen searchPage(String pageName) {
        step("Type search", () -> {
            searchField.click();
            searchFieldInput.sendKeys(pageName);
        });
        return this;
    }

    public SearchScreen verifyContentFound() {
        step("Verify content found", () ->
                widgetField.shouldHave(sizeGreaterThan(0)));
        return this;
    }

    public SearchScreen clickOnPage() {
        step("Click on correct page", () -> {
            clickOnPageField.get(0).click(); // click is not working. Error page
        });
        return this;
    }

    public SearchScreen verifyPageIsOpened() {
        step("Verify page is opened", () ->
                pageObjectField.shouldHave(text("Serbia")));
        return this;
    }

}
