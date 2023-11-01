
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
                .setCurrentAddress("Автозаводская ул., 23, Москва")
                .setPermanentAddress("Автозаводская ул., 23, Москва")
                .clickSubmitBtn()
                .checkFullNameIsSavedCorrectly("Иванов Иван Иванович")
                .checkEmailIsSavedCorrectly("ivanov@mail.ru")
                .checkCurrentAddressIsSavedCorrectly("Автозаводская ул., 23, Москва");
               // .checkPermanentAddressIsSavedCorrectly("Автозаводская ул., 23, Москва");
        leftPanel.clickButtonBtn();
        buttonForm
                .clickClickMeBtn()
                .checkClickMeText("You have done a dynamic click")
                .clickRightClickMeBtn()
                //.checkRightClickMeText("You have done a right click")
                .clickDoubleClickMeBtn();
                //.checkDoubleClickMeText("You have done a double click");
        leftPanel
                .clickAlertsFrameWindowsBtn()
                .clickBrowserWindowsBtn();
        browserWindowsForm
                .clickNewTabBtn()
                .closeNewTab()
                .clickNewWindowBtn()
                .closeNewWindow();
        leftPanel.clickAlertsBtn();
        alertsForm
                .clickAlertBtn()
                .closeAlert();
        alertsForm
                .clickTimerAlertBtn()
                .closeAlert();
        alertsForm
                .clickConfirmBtn()
                .acceptAlert();
        alertsForm
                .checkAcceptAlertText("You selected Ok")
                .clickPromtBtn();
        alertsForm.addTextAlert("Test name");
        alertsForm.acceptAlert();
        alertsForm.checkPromptResult("You entered Test name");
    }
}
