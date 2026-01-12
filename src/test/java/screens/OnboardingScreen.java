package screens;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static io.appium.java_client.AppiumBy.*;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class OnboardingScreen {
    public static SelenideElement sloganField = $(id("org.wikipedia:id/view_onboarding_page_primary_text"));
    public static SelenideElement forwardButton = $(id("org.wikipedia:id/fragment_onboarding_forward_button"));
    public static SelenideElement doneButton = $(id("org.wikipedia:id/fragment_onboarding_done_button"));

    public OnboardingScreen verificationBySlogan(String slogan) {
        step("Slogan should same as expected", () -> {
            sloganField.shouldHave(text(slogan));
        });
        return this;
    }

    public OnboardingScreen pressOnNextButton() {
        step("Click on button NEXT", () -> {
            forwardButton.click();
        });
        return this;
    }

    public OnboardingScreen pressOnDoneButton() {
        step("Click on button GET STARTED", () -> {
            doneButton.click();
        });
        return this;
    }
}
