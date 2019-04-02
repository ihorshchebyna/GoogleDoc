package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(css = ".whsOnd.zHQkBf")
    public WebElement login;

    @FindBy(css = ".whsOnd.zHQkBf")
    public WebElement password;

    @FindBy(css = ".RveJvd.snByac")
    public WebElement nextButton;

    @FindBy(xpath = "//*[@role='progressbar']")
    public WebElement progressBar;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
