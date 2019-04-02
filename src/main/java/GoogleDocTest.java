import actions.DriveActions;
import actions.GoogleDocActions;
import actions.InboxActions;
import actions.LoginActions;
import org.junit.gen5.api.Test;

public class GoogleDocTest extends BaseTest {
    private LoginActions loginActions;
    private InboxActions inboxActions;
    private DriveActions driveActions;
    private GoogleDocActions googleDocActions;


    private final String login = "limeteststoneacc@gmail.com";
    private final String password = "pass123word";
    private final String fileName = "File Name";

    @Test
    void createGoogleDocAndRename() {
        loginActions = new LoginActions(driver);
        inboxActions = new InboxActions(driver);
        driveActions = new DriveActions(driver);
        googleDocActions = new GoogleDocActions(driver);


        loginActions.enterLogin(login, driver);
        loginActions.enterPassword(password, driver);

        inboxActions.openDrive(driver);

        driveActions.createDoc();

        googleDocActions.changeDocName(fileName);
        googleDocActions.checkDocName(fileName);
    }
}
