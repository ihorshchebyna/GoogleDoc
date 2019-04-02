package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.LoginPage;

public class LoginActions {
    private LoginPage loginPage;
    private WebDriver driver;

    public LoginActions(WebDriver driver) {
        this.loginPage = new LoginPage(driver);
        this.driver = driver;
    }

    public void enterLogin(String login, WebDriver driver) {
        wait(driver)
                .withMessage("Login field is not visible")
                .until(ExpectedConditions.visibilityOf(loginPage.login));
        loginPage.login.sendKeys(login);
        loginPage.nextButton.click();
    }

    public void enterPassword(String password, WebDriver driver) {
        wait(driver)
                .withMessage("Password field is not visible")
                .until(ExpectedConditions.invisibilityOf(loginPage.progressBar));
        loginPage.password.sendKeys(password);
        Actions actions = new Actions(driver);
        actions.moveToElement(loginPage.nextButton).click().perform();
    }

    private WebDriverWait wait(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        return wait;
    }
}
