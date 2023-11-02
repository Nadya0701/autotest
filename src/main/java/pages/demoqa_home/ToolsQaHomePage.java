package pages.demoqa_home;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class ToolsQaHomePage extends BasePage {
    public ToolsQaHomePage(WebDriver driver) {
        super(driver);
    }
    private final By elements = By.xpath("//div[@class='category-cards']/div[1]");
    @Step("Нажать на «Elements»")
    public ToolsQaHomePage clickElementsBtn(){
        WebElement elementsBtn = driver.findElement(elements);
        waitElementIsVisible(elementsBtn);
        elementsBtn.click();
        return this;
    }
}
