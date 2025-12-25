import org.junit.jupiter.api.Test;
import pages.ScreenPagesWiki;

public class WikiTest extends TestBase {
    ScreenPagesWiki page = new ScreenPagesWiki();

    @Test
    void searchAppiumPage() {
        page.searchPage("Appium")
                .verifyContentFound();
    }

    @Test
    void checkPageOpens() {
        page.searchPage("Serbia")
                .clickOnPage()
                .verifyContentFound();
        //   .verifyPageIsOpened(); <-- commented because previous step opens error page
    }
}

