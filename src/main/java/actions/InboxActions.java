package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.InboxPage;

public class InboxActions {
    private InboxPage inboxPage;
    private WebDriver driver;

    public InboxActions(WebDriver driver) {
        this.inboxPage = new InboxPage(driver);
        this.driver = driver;
    }

    public void openDrive(WebDriver driver) {
        wait(driver)
                .withMessage("Google Apps button is not clickable")
                .until(ExpectedConditions.elementToBeClickable(inboxPage.googleApps))
                .click();
        wait(driver)
                .withMessage("Drive button is not clickable")
                .until(ExpectedConditions.elementToBeClickable(inboxPage.drive))
                .click();
    }

    private WebDriverWait wait(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        return wait;
    }
}
