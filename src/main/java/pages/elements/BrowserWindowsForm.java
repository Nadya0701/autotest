package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.util.ArrayList;
import java.util.Set;

public class BrowserWindowsForm extends BasePage {
    public BrowserWindowsForm(WebDriver driver) {
        super(driver);
    }
    private final By newTab = By.xpath("//*[text()='New Tab']");
    private final By newWindow = By.cssSelector("#windowButton");
    private final By newWindowMessage = By.cssSelector("#messageWindowButton");
    public BrowserWindowsForm clickNewTabBtn(){
        WebElement newTabBtn = driver.findElement(newTab);
        waitElementIsVisible(newTabBtn);
        newTabBtn.click();
        return this;
    }
    public BrowserWindowsForm clickNewWindowBtn(){
        WebElement newWindowBtn = driver.findElement(newWindow);
        waitElementIsVisible(newWindowBtn);
        newWindowBtn.click();
        return this;
    }
    public BrowserWindowsForm clickNewWindowMessageBtn(){
        WebElement newWindowMessageBtn = driver.findElement(newWindowMessage);
        waitElementIsVisible(newWindowMessageBtn);
        newWindowMessageBtn.click();
        return this;
    }
    public BrowserWindowsForm closeNewTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.close();
        driver.switchTo().window(tabs.get(0));
        return this;
    }
    public BrowserWindowsForm closeNewWindow() {
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for(String windowHandle : allWindows) {
            if(!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
        return this;
    }
}
