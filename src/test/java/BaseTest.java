import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import pages.base.BasePage;
import pages.demoqa_home.ToolsQaHomePage;
import pages.elements.BrowserWindowsForm;
import pages.elements.ButtonForm;
import pages.elements.LeftPanel;
import pages.elements.TextBoxForm;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected ToolsQaHomePage toolsQaHomePage = new ToolsQaHomePage(driver);
    protected LeftPanel leftPanel = new LeftPanel(driver);
    protected TextBoxForm textBoxForm = new TextBoxForm(driver);
    protected ButtonForm buttonForm = new ButtonForm(driver);
    protected BrowserWindowsForm browserWindowsForm = new BrowserWindowsForm(driver);


    @AfterClass(alwaysRun = true)
    public void quitDriver(){
        driver.quit();
    }

}
