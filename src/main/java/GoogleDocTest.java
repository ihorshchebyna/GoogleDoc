import actions.DriveActions;
import actions.GoogleDocActions;
import actions.InboxActions;
import actions.LoginActions;
import org.junit.jupiter.api.Test;

public class GoogleDocTest extends BaseTest {
    private LoginActions loginActions;
    private InboxActions inboxActions;
    private DriveActions driveActions;
    private GoogleDocActions googleDocActions;


    private final String login = "limeteststoneacc@gmail.com";
    private final String password = "pass123word";

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

        googleDocActions.changeDocName("File Name");
        googleDocActions.checkDocName("File Name");
    }
}
