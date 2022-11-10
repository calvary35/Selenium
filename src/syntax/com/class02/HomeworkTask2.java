package syntax.com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkTask2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //navigate to fb.com
        driver.navigate().to("https://www.facebook.com");
        //click on create new account
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        //fill in textboxes
        driver.findElement(By.name("firstname")).sendKeys("Kevin");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Brown");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("kbrown101@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kbrown101@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("password");
        Thread.sleep(1000);
        driver.quit();


    }
}
