package syntax.com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {


        //go to FB.com
        //Enter Username
        //Enter password
        //click login
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        //go to Facebook.com
        driver.get("https://www.facebook.com");
        //maximize the window
        driver.manage().window().maximize();
        //Enter Username
        driver.findElement(By.id("email")).sendKeys("abracadbara");
        //Enter the password in the TextBox
        driver.findElement(By.name("pass")).sendKeys("abc123!");
        //click the login
       driver.findElement(By.name("login")).click();

        //task 2
        //click on forgot password
       // driver.findElement(By.linkText("Forgot password?")).click();

       // task3:
        //click on forgot password using Partial linkText locator
   //     driver.findElement(By.partialLinkText("Forgot")).click();
    }
}
