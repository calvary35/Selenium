package syntax.com.review.class03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        //open the demoqa Alerts
        driver.get("https://demoqa.com/alerts");

        //click on the button
        WebElement arterBtn1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
        arterBtn1.click();

        //alert interface
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        //alert button3
        WebElement alertBtn3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
        alertBtn3.click();

        //using the alert already declared
        alert1.sendKeys("abracadabra");
        alert1.accept();



    }
}
