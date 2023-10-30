package pages.elements;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

public class TextBoxForm extends BasePage {
    public TextBoxForm(WebDriver driver) {
        super(driver);
    }

    private final By fullName = By.cssSelector("input[placeholder='Full Name']");
    private final By email = By.cssSelector("input[placeholder='name@example.com']");
    private final By currentAdress = By.cssSelector("textarea[placeholder='Current Address']");
    private final By permanentAddress = By.cssSelector("textarea#permanentAddress");
    private final By submit = By.cssSelector("button#submit");
    private final By fullNameSaved = By.cssSelector("p#name");
    private final By emailSaved = By.cssSelector("p#email");
    private final By currentAdressSaved = By.cssSelector("p#currentAddress");
    private final By permanentAdressSaved = By.cssSelector("p#permanentAddress");

    public TextBoxForm setFullName(String string) {
        WebElement fullNameInp = driver.findElement(fullName);
        waitElementIsVisible(fullNameInp);
        fullNameInp.sendKeys(string);
        return  this;
    }
    public TextBoxForm setEmail(String string) {
        WebElement emailInp = driver.findElement(email);
        waitElementIsVisible(emailInp);
        emailInp.sendKeys(string);
        return  this;
    }
    public TextBoxForm setCurrentAdress(String string) {
        WebElement currentAdressInp = driver.findElement(currentAdress);
        waitElementIsVisible(currentAdressInp);
        currentAdressInp.sendKeys(string);
        return this;
    }
    public TextBoxForm setPermanentAddress(String string) {
        WebElement permanentAddressInp = driver.findElement(permanentAddress);
        waitElementIsVisible(permanentAddressInp);
        permanentAddressInp.sendKeys(string);
        return this;
    }
    public TextBoxForm clickSubmitBtn(){
        WebElement submitBtn = driver.findElement(submit);
        waitElementIsVisible(submitBtn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        submitBtn.click();
        return this;
    }
    public TextBoxForm checkFullNameIsSavedCorrectly(String expected){
        WebElement nameString = driver.findElement(fullNameSaved);
        Assert.assertEquals(nameString.getText(), "Name:" + expected);
        return  this;
    }
    public TextBoxForm checkEmailIsSavedCorrectly(String expected){
        WebElement emailString = driver.findElement(emailSaved);
        Assert.assertEquals(emailString.getText(), "Email:" + expected);
        return  this;
    }
    public TextBoxForm checkCurrentAdressIsSavedCorrectly(String expected){
        WebElement currentAdressString = driver.findElement(currentAdressSaved);
        Assert.assertEquals(currentAdressString.getText(), "Current Address :" + expected);
        return  this;
    }
    public TextBoxForm checkePermanentAddressIsSavedCorrectly(String expected){
        WebElement permanentAddressString = driver.findElement(permanentAdressSaved );
        Assert.assertEquals(permanentAddressString.getText(), "Permananet Address :" + expected);
        return  this;
    }

}
