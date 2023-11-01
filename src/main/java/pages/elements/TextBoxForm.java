package pages.elements;

import org.openqa.selenium.By;
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
    private final By currentAddress = By.cssSelector("textarea[placeholder='Current Address']");
    private final By permanentAddress = By.cssSelector("textarea#permanentAddress");
    private final By submit = By.cssSelector("button#submit");
    private final By fullNameSaved = By.cssSelector("p#name");
    private final By emailSaved = By.cssSelector("p#email");
    private final By currentAddressSaved = By.cssSelector("p#currentAddress");
    private final By permanentAddressSaved = By.cssSelector("p#permanentAddress");

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
    public TextBoxForm setCurrentAddress(String string) {
        WebElement currentAddressInp = driver.findElement(currentAddress);
        waitElementIsVisible(currentAddressInp);
        currentAddressInp.sendKeys(string);
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
    public TextBoxForm checkCurrentAddressIsSavedCorrectly(String expected){
        WebElement currentAddressString = driver.findElement(currentAddressSaved);
        Assert.assertEquals(currentAddressString.getText(), "Current Address :" + expected);
        return  this;
    }
    public TextBoxForm checkPermanentAddressIsSavedCorrectly(String expected){
        WebElement permanentAddressString = driver.findElement(permanentAddressSaved );
        Assert.assertEquals(permanentAddressString.getText(), "Permanent Address :" + expected);
        return  this;
    }

}
