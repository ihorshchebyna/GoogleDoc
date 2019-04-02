package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrivePage {

    @FindBy(css = ".uw8t2")
    public WebElement newButton;

    @FindBy(css = ".h-v.h-ug.a-S8Cb5b")
    public WebElement googleDocsButton;

    public DrivePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
