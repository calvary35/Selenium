package syntax.com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        /*
        goto https://chercher.tech/practice/frames
        1.check the checkBox
        2.Select BabyCat from drop dwon
        3. Send text in text box "DONE"
         */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames");
        //1.check the checkBox
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        WebElement clickBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        clickBox.click();
        // 2.Select BabyCat from drop down
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement babyCat = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select=new Select(babyCat);
        List<WebElement> options = select.getOptions();
        for(WebElement option:options){
                select.selectByVisibleText("Baby Cat");
            }

        driver.switchTo().defaultContent();
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);
        WebElement enterText = driver.findElement(By.xpath("//input"));
        enterText.sendKeys("DONE");

    }

}





