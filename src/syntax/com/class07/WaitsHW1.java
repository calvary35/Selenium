package syntax.com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WaitsHW1 {
    public static void main(String[] args) {
//
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //go to
        driver.get("http://accounts.google.com/signup");

        //click on help button
        WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));
        help.click();
//click on privacy button
        WebElement privacy = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacy.click();

        //title of page we are looking for: Google Account Help
        Set<String> allHandles = driver.getWindowHandles();
    String homeWindow= driver.getWindowHandle();

        for (String handle : allHandles) {
            //switching the focus to the current handle from list
            driver.switchTo().window(handle);
            // get the title of the window to which the driver has switched
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")) {

                break;
            }
        }
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();

        driver.switchTo().window(homeWindow);
        WebElement userName = driver.findElement(By.xpath("//input[@type='email']"));

        userName.sendKeys("kbrown123");
    }
}
