package syntax.com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {
    public static void main(String[] args) {
        /*
        2. click on get New User
        3. get the firstname  of user and print it on console
         */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //1. goto https://syntaxprojects.com/dynamic-data-loading-demo.php
        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");

        //  2. click on get New User
        WebElement newUser = driver.findElement(By.xpath("//button[text()='Get New User']"));
        newUser.click();
        //3. get the firstname  of user and print it on console
        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        String fName = firstName.getText();
        System.out.println(fName);

    }
}
