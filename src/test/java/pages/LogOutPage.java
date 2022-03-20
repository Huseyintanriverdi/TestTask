package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LogOutPage {
    public LogOutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(tagName = "h2")
    public WebElement pleaseSignInText;
}
