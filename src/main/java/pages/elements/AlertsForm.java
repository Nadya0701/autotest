package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

public class AlertsForm extends BasePage {
    public AlertsForm(WebDriver driver) {
        super(driver);
    }
    private final By alertButton = By.cssSelector("#alertButton");
    private final By timerAlertButton = By.cssSelector("#timerAlertButton");
    private final By confirmButton = By.cssSelector("#confirmButton");
    private final By confirmResult = By.cssSelector("#confirmResult");
    private final By promtButton = By.cssSelector("#promtButton");
    private final By promptResult = By.cssSelector("#promptResult");
    public AlertsForm clickAlertBtn(){
        WebElement alertBtn = driver.findElement(alertButton);
        waitElementIsVisible(alertBtn);
        alertBtn.click();
        return this;
    }
    public AlertsForm clickTimerAlertBtn(){
        WebElement timerAlertBtn = driver.findElement(timerAlertButton);
        waitElementIsVisible(timerAlertBtn);
        timerAlertBtn.click();
        return this;
    }
    public AlertsForm clickConfirmBtn(){
        WebElement confirmBtn = driver.findElement(confirmButton);
        waitElementIsVisible(confirmBtn);
        confirmBtn.click();
        return this;
    }
    public AlertsForm clickPromtBtn(){
        WebElement promtBtn = driver.findElement(promtButton);
        waitElementIsVisible(promtBtn);
        promtBtn.click();
        return this;
    }
    public AlertsForm checkAcceptAlertText(String expected){
        WebElement acceptAlertText = driver.findElement(confirmResult);
        waitElementIsVisible(acceptAlertText);
        Assert.assertEquals(acceptAlertText.getText(), expected);
        return  this;
    }
    public AlertsForm checkPromptResult(String expected){
        WebElement promptResultText = driver.findElement(promptResult);
        waitElementIsVisible(promptResultText);
        Assert.assertEquals(promptResultText.getText(), expected);
        return  this;
    }
}
