package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.security.util.Password;
import utilities.Driver;

public class crystalkeyhotels {
    public crystalkeyhotels(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "UserName")
    public WebElement usernameBox;
    @FindBy(id = "Password")
    public WebElement passwordBox;
    @FindBy(id = "btnSubmit")
    public WebElement submitButton;
    @FindBy(xpath = "//*[contains(text(),'Try again please')]")
    public  WebElement errorMessage;

}
