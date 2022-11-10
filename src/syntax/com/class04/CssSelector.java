package syntax.com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        //go to syntaxproject.com simple-form-demo

        driver.get("http://www.syntaxprojects.com/basic-first-form-demo.php");

        driver.manage().window().maximize();

        //get the webElement text box
      //  driver.findElement(By.cssSelector("input[placeholder*='Please enter']")).sendKeys("Abracadabra");

        //another method of doing the above operation
        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder*='Please enter']"));
        textBox.sendKeys("Kevin B");

       WebElement showMessage= driver.findElement(By.cssSelector("button[onclick^='showIn']"));
       showMessage.click();


    }
}
