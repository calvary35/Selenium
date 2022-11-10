package syntax.com.class04;

import com.google.common.base.Verify;
import org.eclipse.jetty.util.security.Password;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        //Enter valid username
        driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
        //Leave password field empty
        //Click on login button
        driver.findElement(By.cssSelector("input[id*='btnL']")).click();

        //Verify error message with text “Password cannot be empty” is displayed.
        WebElement invalidPassword = driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
        String displayMessage = invalidPassword.getText();
        boolean isDisplayed = invalidPassword.isDisplayed();

        if (!isDisplayed) {
            System.out.println("The message is not displayed");
        } else {
            System.out.println(displayMessage + " is displayed");
        }
    }
}
