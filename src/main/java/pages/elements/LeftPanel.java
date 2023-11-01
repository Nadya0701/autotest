package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class LeftPanel extends BasePage {
    public LeftPanel(WebDriver driver) {
        super(driver);
    }
    private final By textBox = By.xpath("//ul[@class='menu-list']/li[1]");
    private final By button = By.xpath("//ul[@class='menu-list']/li[5]");
    private final By alertsFrameWindows = By.xpath("//div[text()='Alerts, Frame & Windows']/../..");
    private final By browserWindows = By.xpath("//*[text()='Browser Windows']/..");
    private final By alerts = By.xpath("//span[text()='Alerts']/..");


    public LeftPanel clickTextBoxBtn(){
        WebElement textBoxBtn = driver.findElement(textBox);
        waitElementIsVisible(textBoxBtn);
        textBoxBtn.click();
        return this;
    }
    public LeftPanel clickButtonBtn(){
        WebElement buttonBtn = driver.findElement(button);
        waitElementIsVisible(buttonBtn);
        buttonBtn.click();
        return this;
    }
    public LeftPanel clickAlertsFrameWindowsBtn(){
        WebElement alertsFrameWindowsBtn = driver.findElement(alertsFrameWindows);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alertsFrameWindowsBtn);
        waitElementIsVisible(alertsFrameWindowsBtn);
        alertsFrameWindowsBtn.click();
        return this;
    }
    public LeftPanel clickBrowserWindowsBtn(){
        WebElement browserWindowsBtn = driver.findElement(browserWindows);
        waitElementIsVisible(browserWindowsBtn);
        browserWindowsBtn.click();
        return this;
    }
    public LeftPanel clickAlertsBtn(){
        WebElement alertsBtn = driver.findElement(alerts);
        waitElementIsVisible(alertsBtn);
        alertsBtn.click();
        return this;
    }

}
