package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InboxPage {

    @FindBy(xpath = "//a[@aria-label = 'Google apps']")
    public WebElement googleApps;

    @FindBy(xpath = "//*[contains(text(), 'Drive')]/..")
    public WebElement drive;

    public InboxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
