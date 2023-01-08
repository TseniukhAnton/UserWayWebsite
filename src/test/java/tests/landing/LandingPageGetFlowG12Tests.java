package tests.landing;

import org.testng.annotations.Test;
import tests.base.BaseTest;


public class LandingPageGetFlowG12Tests extends BaseTest {

    @Test
    public void checkViewLandingG12() {
        landingPage.hiTextCheck();
    }

    @Test
    public void fullNameIsVisible() {
        landingPage.fullNameIsVisible();
    }

    @Test
    public void fullNameIsRequired() {
        landingPage.fullNameIsRequired();
    }

    @Test
    public void putFullName() {
        landingPage.inputFullName("Anton");
    }
}
