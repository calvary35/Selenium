package syntax.com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        //find all the checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement checkbox : checkboxes) {
            //get the attribute value to check if this is the right option to select
            String optionName = checkbox.getAttribute("value");
            //if condition to make sure it is the right decision
            if (optionName.equalsIgnoreCase("Option-3")) {
                //if passed click on it
                checkbox.click();

            }
        }

    }
}
