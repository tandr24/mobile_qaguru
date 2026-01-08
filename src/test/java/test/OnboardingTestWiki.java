package test;

import org.junit.jupiter.api.Test;
import pages.OnboardingPage;
import pages.SearchPage;

public class OnboardingTestWiki extends TestBase {
    public static OnboardingPage page = new OnboardingPage();
    public static SearchPage searchPage = new SearchPage();

    @Test
    public void onboardingWikiTest() {
        page.verificationBySlogan("The Free Encyclopedia")
                .pressOnNextButton()
                .verificationBySlogan("New ways to explore")
                .pressOnNextButton()
                .verificationBySlogan("Reading lists with sync")
                .pressOnNextButton()
                .verificationBySlogan("Send anonymous data")
                .pressOnDoneButton();

        searchPage.searchPage("Appium")
                .verifyContentFound();
    }
}
