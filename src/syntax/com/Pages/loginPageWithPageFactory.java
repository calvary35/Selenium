package syntax.com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import syntax.com.utils.CommonMethods;

public class loginPageWithPageFactory extends CommonMethods {

    @FindBy(id = "txtUsername")
    public WebElement userName;

    @FindBy (id ="txtPassword")
    public WebElement passwordField;

    @FindBy (id= "btnLogin")
    public WebElement loginButton;

    //call the constructor to initialize all elements

    public loginPageWithPageFactory(){
        PageFactory.initElements(driver,this);

    }

}
