package org.autotests.userway.pages.landing;

import org.autotests.userway.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LandingPageGetFlowG12 extends BasePage {

    public LandingPageGetFlowG12(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='getflow-wizard-assistant__message__i']")
    private WebElement hiText;

    @FindBy(xpath = "//input[@class='uw-form-control']")
    private WebElement fullName;
    @FindBy(xpath = "//input[@class='uw-form-control']")
    private WebElement fullNameRequiredTxt;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='url']")
    private WebElement websiteUrl;

    @FindBy(xpath = "//button[@class='button']")
    private WebElement continueBtn;

    public LandingPageGetFlowG12 hiTextCheck() {
        waitElementIsVisible(hiText);
        hiText.isDisplayed();
        return this;
    }

    public LandingPageGetFlowG12 fullNameIsVisible() {
        fullName.isDisplayed();
        return this;
    }

    public void fullNameIsRequired() {
        waitElementIsVisible(fullNameRequiredTxt);
        Assert.assertEquals(fullNameRequiredTxt.getAttribute("placeholder"), "Full Name (required)");

    }

    public LandingPageGetFlowG12 inputFullName(String name) {
        waitElementIsVisible(fullName);
        fullName.sendKeys(name);
        //Assert.assertEquals(name, fullName.getText());
        return this;
    }

    public String getFullNameText() {
        waitElementIsVisible(fullName);
        return fullName.getText();
    }

    public LandingPageGetFlowG12 clickContinue() {
        waitElementIsVisible(continueBtn);
        continueBtn.click();
        return this;
    }

    public void emailIsVisible() {
        email.isDisplayed();
    }

    public LandingPageGetFlowG12 inputEmail(String mail) {
        waitElementIsVisible(email);
        email.sendKeys(mail);
        clickContinue();
        return this;
    }

    public void urlIsVisible() {
        websiteUrl.isDisplayed();
    }

    public SecondStep inputUrl(String url) {
        waitElementIsVisible(websiteUrl);
        websiteUrl.sendKeys(url);
        clickContinue();
        return new SecondStep(driver);
    }

}
