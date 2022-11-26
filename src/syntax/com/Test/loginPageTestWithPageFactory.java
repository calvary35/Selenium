package syntax.com.Test;

import syntax.com.Pages.loginPageWithPageFactory;
import syntax.com.utils.CommonMethods;

public class loginPageTestWithPageFactory {

    public static void main(String[] args) {

        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        loginPageWithPageFactory login = new loginPageWithPageFactory();

        login.userName.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginButton.click();
    }
}
