package syntax.com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkTask1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //navigate to URL
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        // fill out the form
        driver.findElement(By.id("customer.firstName")).sendKeys("Kevin");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Brown");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.street")).sendKeys("101 Main Street");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.city")).sendKeys("New York");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("01234");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("012-345-6789");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.ssn")).sendKeys("xxx-xx-0123");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.username")).sendKeys("kbrown");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.password")).sendKeys("password");
        Thread.sleep(1000);
        driver.findElement(By.id("repeatedPassword")).sendKeys("password");
        Thread.sleep(1000);
        driver.findElement(By.className("button")).click();

        Thread.sleep(3000);
        driver.close();
    }
}
