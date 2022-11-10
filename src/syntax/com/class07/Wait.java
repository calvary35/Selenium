package syntax.com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

       driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

       //click on the start button
        WebElement startBtn = driver.findElement(By.id("startButton"));
        startBtn.click();

        //Find the text
        WebElement welcomeText = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text =welcomeText.getText();
        System.out.println("the text is :"+text);

        //Implicit wait is going to wait until the element is found

    }
}
