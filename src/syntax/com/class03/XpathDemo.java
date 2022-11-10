package syntax.com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        // goto fb.com
        driver.get("https://www.facebook.com");
        // enter the username
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abracadabra");

        // click on forgot password
        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();


    }
}
