package syntax.com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //go to the website
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //click on checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();

        //and click on remove
        WebElement removeBtn = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeBtn.click();

        //verify the text
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        WebElement visibleBtn = driver.findElement(By.xpath("//p[@id='message']"));
       String visibleText= visibleBtn.getText();
        System.out.println(visibleText);

        //click on enable verify the textbox is enabled

        WebElement enableBtn = driver.findElement(By.xpath("//button[text()='Enable']"));
        enableBtn.click();

        //enter text
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
        WebElement textBtn = driver.findElement(By.xpath("//input[@type='text']"));
        textBtn.click();
        textBtn.sendKeys("Hello my friends");

        //click disable
        WebElement disableBtn= driver.findElement(By.xpath("//button[text()='Disable']"));
        disableBtn.click();

        //verify the textbox is disabled
        WebElement disabledMessage = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(disabledMessage.getText());

    }
}
