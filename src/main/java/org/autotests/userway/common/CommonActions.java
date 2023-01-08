package org.autotests.userway.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import static org.autotests.userway.common.Config.PLATFORM_AND_BROWSER;
import static org.autotests.userway.constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class CommonActions {
    @BeforeTest
    public static WebDriver

    createDriver() {
        WebDriver driver = null;

        switch (PLATFORM_AND_BROWSER) {
            case "win_chrome" -> {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
            }
            case "win_firefox" -> {
                System.setProperty("webdriver.firefox.driver", "src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
            }
            case "win_edge" -> {
                System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
                driver = new EdgeDriver();
            }
            default -> Assert.fail("Incorrect platform or browser name: " + PLATFORM_AND_BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        return driver;
    }
}
