package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.DrivePage;

public class DriveActions {
    private DrivePage drivePage;
    private WebDriver driver;

    public DriveActions(WebDriver driver) {
        this.drivePage = new DrivePage(driver);
        this.driver = driver;
    }

    public void createDoc() {
        clickNewButton();
        clickGoogleDocButton();
    }

    private void clickGoogleDocButton() {
        wait(driver)
                .withMessage("Google Doc Button is not clickable")
                .until(ExpectedConditions.elementToBeClickable(drivePage.googleDocsButton))
                .click();
    }

    private void clickNewButton() {
        wait(driver)
                .withMessage("New Button is not clickable")
                .until(ExpectedConditions.elementToBeClickable(drivePage.newButton))
                .click();
    }

    private WebDriverWait wait(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        return wait;
    }
}
