package syntax.com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to syntax project/checkbox demo
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        //find the button click me for the alert and click on it
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();


        //Handling the alert
        Alert simpleAlert1 = driver.switchTo().alert();
        simpleAlert1.accept();

        //find the button for confirmation alert and click on it

        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmationAlert.click();


        Alert confirmationAlert1 = driver.switchTo().alert();
        confirmationAlert1.dismiss();

        //find the prompt alert and some text then accept it

        WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptAlert.click();

      Alert prompt=  driver.switchTo().alert();

      prompt.sendKeys("Hello Friend");
      prompt.accept();


    }
}
