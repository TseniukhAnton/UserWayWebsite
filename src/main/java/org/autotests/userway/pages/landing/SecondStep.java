package org.autotests.userway.pages.landing;

import org.autotests.userway.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class SecondStep extends BasePage {
    public SecondStep(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='getflow-wizard-assistant__message__i']")
    private WebElement howCanIHelp;

    @FindBy(xpath = "//span[@class='key-checkbox__label']")
    private List<WebElement> helpOptions;

    public SecondStep checkViewSecondStep() {
        waitElementIsVisible(helpOptions.get(4));
        Assert.assertEquals(5, helpOptions.size());
        return this;
    }

}
