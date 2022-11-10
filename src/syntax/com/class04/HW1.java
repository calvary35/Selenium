package syntax.com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        //Enter valid username and password (username - Admin, password - Hum@nhrm123)
        driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");

        //Click on login button
        driver.findElement(By.cssSelector("input[id*='btnL']")).click();

        // Then verify the message "Welcome Admin " is there on the top right corner
        WebElement welcomeAdmin = driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
        String welcome = welcomeAdmin.getText();
        System.out.println("The message verified in the top right corner of the screen is " + welcome);

    }
}
