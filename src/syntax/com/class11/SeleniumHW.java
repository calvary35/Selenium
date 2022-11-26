package syntax.com.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SeleniumHW {
    public static void main(String[] args) {

        /*


         and handle the alert
         */


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //maximize window
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement rightclickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));

        //creating Actions class
        Actions actions = new Actions(driver);

        //right click on button
        actions.contextClick(rightclickBtn).perform();

        //select edit
        WebElement editBtn = driver.findElement(By.xpath("//span[text()='Edit']"));
        editBtn.click();

        //accept alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //double click on the button
        WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        actions.doubleClick(doubleClickBtn).perform();

        alert.accept();




    }
}
