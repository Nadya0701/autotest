package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

public class ButtonForm extends BasePage {
    public ButtonForm(WebDriver driver) {
        super(driver);
    }
    private final By clickMe = By.xpath("//button[text()='Click Me']");
    private final By rightClickMe = By.xpath("//button[text()='Right Click Me']");
    private final By doubleClickMe = By.xpath("//button[text()='Double Click Me']");
    private final By textAfterClick = By.cssSelector("p#dynamicClickMessage");

    public ButtonForm clickClickMeBtn(){
        WebElement clickMeBtn = driver.findElement(clickMe);
        waitElementIsVisible(clickMeBtn);
        clickMeBtn.click();
        return this;
    }
    public ButtonForm clickRightClickMeBtn(){
        WebElement rightClickMeBtn = driver.findElement(rightClickMe);
        waitElementIsVisible(rightClickMeBtn);
        rightClickMeBtn.click();
        return this;
    }
    public ButtonForm clickDoubleClickMeBtn(){
        WebElement doubleClickMeBtn = driver.findElement(doubleClickMe);
        waitElementIsVisible(doubleClickMeBtn);
        doubleClickMeBtn.click();
        return this;
    }
    public ButtonForm checkClickMeText(String expected){
        WebElement clickMeText = driver.findElement(textAfterClick);
        Assert.assertEquals(clickMeText.getText(), expected);
        return this;
    }
    public ButtonForm checkRightClickMeText(String expected){
        WebElement RightClickMeText = driver.findElement(textAfterClick);
        Assert.assertEquals(RightClickMeText.getText(), expected);
        return this;
    }
    public ButtonForm checkDoubleClickMeText(String expected){
        WebElement doubleClickMeText = driver.findElement(textAfterClick);
        Assert.assertEquals(doubleClickMeText.getText(), expected);
        return this;
    }
}
