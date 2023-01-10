package tests.landing;

import org.testng.annotations.Test;
import tests.base.BaseTest;


public class LandingPageGetFlowG12Tests extends BaseTest {

    @Test (testName = "checkViewLandingG12", priority = 1, groups = {"regression"})
    public void checkViewLandingG12() {
        landingPage.hiTextCheck();
    }
    @Test (testName = "fullNameIsVisible", priority = 2, groups = {"regression"})
    public void fullNameIsVisible() {
        landingPage.fullNameIsVisible();
    }
    @Test (testName = "fullNameIsRequired", priority = 3, groups = {"regression"})
    public void fullNameIsRequired() {
        landingPage.fullNameIsRequired();
    }
    @Test (testName = "checkEmailIsVisible", priority = 4, groups = {"regression"})
    public void checkEmailIsVisible() {
        landingPage.inputFullName("Anton").clickContinue().emailIsVisible();
    }
    @Test (testName = "checkUrlIsVisible", priority = 5, groups = {"regression"})
    public void checkUrlIsVisible() {
        landingPage.inputEmail("anton@gmail.com").urlIsVisible();
    }
    @Test (testName = "checkSecondStepview", priority = 6, groups = {"regression"})
    public void checkSecondStepView() {
        landingPage.inputUrl("cdn.de").checkViewSecondStep();
    }
}
