package pages.elements;

import io.qameta.allure.Step;
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
    @Step("Нажать на кнопку «Click me»  рядом с Click Button to see alert")
    public AlertsForm clickAlertBtn(){
        WebElement alertBtn = driver.findElement(alertButton);
        waitElementIsVisible(alertBtn);
        alertBtn.click();
        return this;
    }
    @Step("Нажать на кнопку «Click me»  рядом с On button click, alert will appear after 5 seconds")
    public AlertsForm clickTimerAlertBtn(){
        WebElement timerAlertBtn = driver.findElement(timerAlertButton);
        waitElementIsVisible(timerAlertBtn);
        timerAlertBtn.click();
        return this;
    }
    @Step("Нажать на кнопку «Click me»  рядом с On button click, confirm box will appear")
    public AlertsForm clickConfirmBtn(){
        WebElement confirmBtn = driver.findElement(confirmButton);
        waitElementIsVisible(confirmBtn);
        confirmBtn.click();
        return this;
    }
    @Step("Нажать на кнопку «Click me»  рядом с On button click, prompt box will appear")
    public AlertsForm clickPromtBtn(){
        WebElement promtBtn = driver.findElement(promtButton);
        waitElementIsVisible(promtBtn);
        promtBtn.click();
        return this;
    }
    @Step("Проверить, что появился текст You selected Ok")
    public AlertsForm checkAcceptAlertText(String expected){
        WebElement acceptAlertText = driver.findElement(confirmResult);
        waitElementIsVisible(acceptAlertText);
        Assert.assertEquals(acceptAlertText.getText(), expected);
        return  this;
    }
    @Step("Проверить, что появился текст в соответствии с тестовыми данными")
    public AlertsForm checkPromptResult(String expected){
        WebElement promptResultText = driver.findElement(promptResult);
        waitElementIsVisible(promptResultText);
        Assert.assertEquals(promptResultText.getText(), expected);
        return  this;
    }
}
