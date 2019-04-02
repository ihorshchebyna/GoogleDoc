package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleDocPage {

    @FindBy(css = ".docs-title-input")
    public WebElement fileName;

    public GoogleDocPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}