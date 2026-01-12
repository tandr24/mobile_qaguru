package test;

import org.junit.jupiter.api.Test;
import screens.OnboardingScreen;
import screens.SearchScreen;

public class OnboardingTestWiki extends TestBase {
    public static OnboardingScreen page = new OnboardingScreen();
    public static SearchScreen searchPage = new SearchScreen();

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
