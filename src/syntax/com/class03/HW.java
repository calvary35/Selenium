package syntax.com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Navigate to http://syntaxprojects.com/
        Click on start practicing
        click on simple form demo
        enter any text on first text box
        click on show message
        quit the browser
        */
public class HW {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initialize driver
        WebDriver driver = new ChromeDriver();
        //navigate to website
        driver.navigate().to("http://www.syntaxprojects.com");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        //click on start practicing
        driver.findElement(By.xpath("//a[contains(@id,'btn_basic')]")).click();
        Thread.sleep(3000);
        //click on simple form demo
        driver.findElement(By.xpath("//a[contains(@class,'list-group')]")).click();
        Thread.sleep(3000);
        //enter any text on first text box
        driver.findElement(By.xpath("//input[(@id='user-message')]")).sendKeys("Syntax Tech");
        Thread.sleep(3000);
        //click on show message
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
