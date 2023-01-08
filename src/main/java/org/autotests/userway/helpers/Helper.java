package org.autotests.userway.helpers;

import org.autotests.userway.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import static org.autotests.userway.constants.Constant.TimeoutVariable.IMPLICIT_WAIT;


public class Helper extends BasePage {
    private final Actions actions = new Actions(driver);

    public Helper(WebDriver driver) {
        super(driver);
    }

    public void dragAndDrop(WebElement el1, WebElement el2){
        try{
            actions.moveToElement(el1).pause(Duration.ofSeconds(IMPLICIT_WAIT)).clickAndHold().moveToElement(el2).release().build().perform();
            //or
            actions.dragAndDrop(el1,el2).perform();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
