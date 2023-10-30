
import org.testng.annotations.Test;


import static constants.Constant.Urls.TOOLSQA_HOME_PAGE;

public class ToolsQaTest extends BaseTest{

    @Test
    public void commonTest () {

        basePage.open(TOOLSQA_HOME_PAGE);

        toolsQaHomePage.clickElementsBtn();

        leftPanel.clickTextBoxBtn();
        textBoxForm
                .setFullName("Иванов Иван Иванович")
                .setEmail("ivanov@mail.ru")
                .setCurrentAdress("Автозаводская ул., 23, Москва")
                .setPermanentAddress("Автозаводская ул., 23, Москва")
                .clickSubmitBtn()
                .checkFullNameIsSavedCorrectly("Иванов Иван Иванович")
                .checkEmailIsSavedCorrectly("ivanov@mail.ru")
                .checkCurrentAdressIsSavedCorrectly("Автозаводская ул., 23, Москва")
                .checkePermanentAddressIsSavedCorrectly("Автозаводская ул., 23, Москва");
        leftPanel.clickButtonBtn();
        buttonForm
                .clickClickMeBtn()
                .checkClickMeText("You have done a dynamic click")
                .clickRightClickMeBtn()
                .checkRightClickMeText("You have done a right click")
                .clickDoubleClickMeBtn()
                .checkDoubleClickMeText("You have done a double click");
        leftPanel
                .clickAFrameWindowsBtn()
                .clickbrowserWindowsBtn();
        browserWindowsForm
                .clickNewTabBtn()
                .closeNewTab()
                .clickNewWindowBtn()
                .closeNewWindow()
                .clickNewWindowMessageBtn()
                .closeNewWindow();

    }
}
