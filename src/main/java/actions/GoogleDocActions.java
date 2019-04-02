package actions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.GoogleDocPage;

import java.util.ArrayList;

public class GoogleDocActions {
    private GoogleDocPage googleDocPage;
    private WebDriver driver;

    public GoogleDocActions(WebDriver driver) {
        this.googleDocPage = new GoogleDocPage(driver);
        this.driver = driver;
    }

    public void changeDocName(String docName) {
        switchToDocWindow();
        wait(driver)
                .withMessage("Document name field is not visible")
                .until(ExpectedConditions.elementToBeClickable(googleDocPage.fileName))
                .sendKeys(docName);
        googleDocPage.fileName.sendKeys(Keys.RETURN);
    }

    public void checkDocName(String docName) {
        wait(driver)
                .withMessage("Document name field is not visible")
                .until(ExpectedConditions.elementToBeClickable(googleDocPage.fileName));
        Assertions.assertTrue(googleDocPage.fileName.getAttribute("value").equalsIgnoreCase(docName),
                "Document name is not correct");

    }

    private WebDriverWait wait(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        return wait;
    }

    private void switchToDocWindow() {
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles()) ;
        driver.switchTo().window(windows.get(1));
    }


}
