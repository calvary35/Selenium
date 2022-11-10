package syntax.com.reviewclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        //find the checkboxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@name='color']"));

        //What does this list contain?
        //It contains all the 6 WebElements
        for (WebElement checkBox : checkBoxes) {

            String color = checkBox.getAttribute("value");

            if(color.equalsIgnoreCase("orange")){
                checkBox.click();
                break;
            }
        }
    }
}
