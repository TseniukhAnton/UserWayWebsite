package tests.base;

import org.autotests.userway.common.CommonActions;
import org.autotests.userway.pages.base.BasePage;
import org.autotests.userway.pages.landing.LandingPageGetFlowG12;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import static org.autotests.userway.common.Config.HOLD_BROWSER_OPEN;
import static org.autotests.userway.constants.Constant.Urls.HOME_PAGE;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LandingPageGetFlowG12 landingPage = new LandingPageGetFlowG12(driver);

    @BeforeTest(alwaysRun = true)
    public void checkBrowser() {
        if (HOLD_BROWSER_OPEN) {

        } else {
            basePage.open(HOME_PAGE);
        }
    }

    @BeforeClass(alwaysRun = true)
    public void openBrowser() {
        basePage.open(HOME_PAGE);

    }

    @AfterClass(alwaysRun = true)
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
