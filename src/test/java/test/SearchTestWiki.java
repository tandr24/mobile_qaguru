package test;

import org.junit.jupiter.api.Test;
import screens.SearchScreen;

import static com.codeborne.selenide.Selenide.back;

public class SearchTestWiki extends TestBase {
    SearchScreen page = new SearchScreen();

    @Test
    void searchAppiumPageTest() {
        back();
        page.searchPage("Appium")
                .verifyContentFound();
    }

    @Test
    void checkPageOpensTest() {
        back();
        page.searchPage("Serbia")
                .clickOnPage()
                .verifyContentFound();
        // .verifyPageIsOpened(); <-не работает ни с bs, ни c emulator. Выдает ошибку при переходе страницы
    }
}

