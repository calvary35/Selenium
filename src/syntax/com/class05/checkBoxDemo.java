package syntax.com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");

        //maximize window
        driver.manage().window().maximize();

        //find the checkbox
        WebElement checkbox = driver.findElement(By.id("isAgeSelected"));

        //click on checkbox
        checkbox.click();


    }
}
