package syntax.com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HWFB {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to syntax project/checkbox demo
        driver.manage().window().maximize();
        //maximize
        //go to facebook
        driver.get("https://www.facebook.com");
        //2.click on create New Account
        driver.findElement(By.cssSelector("a[data-testid*='open-registration']")).click();
        Thread.sleep(2000);
        //3.Fill out the whole form
        WebElement first = driver.findElement(By.name("firstname"));
        first.sendKeys("Kevin");
        //last name
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Brown");
        //email
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("Johnjacobjingleheimerschmidt@gmail.com");
        //password
        WebElement password = driver.findElement(By.xpath("//input[contains(@name,'reg_pass')]"));
        password.sendKeys("abc543");
        //month
        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        //select class
        Select select = new Select(month);
        select.selectByVisibleText("Apr");
        //day
        WebElement day = driver.findElement(By.name("birthday_day"));

        Select birthDay = new Select(day);

        birthDay.selectByIndex(3);

        WebElement year = driver.findElement(By.name("birthday_year"));
        Select birthYear= new Select(year);
        birthYear.selectByValue("1990");

        WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
        gender.click();
        //4.Take screen shot of filled out form manually and share in HW channel along with code

    }
}
