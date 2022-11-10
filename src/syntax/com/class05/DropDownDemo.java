package syntax.com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to syntax project/checkbox demo
        driver.manage().window().maximize();
        //maximize
        driver.get("http://syntaxprojects.com/basic-select-dropdown-demo.php");

        //find the WebElement dropdown by looking for select tag
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='select-demo']"));
        //use select class
        Select select= new Select(dropDown);
        //select an option by index
        select.selectByIndex(5);
        Thread.sleep(3000);
        //select by visible text
        select.selectByVisibleText("Saturday");
        //select by value
        Thread.sleep(3000);
        select.selectByValue("Sunday");

        //get all the options available in the dropdown
        List<WebElement> options = select.getOptions();
        //traverse through the options
        for (int i=0;i< options.size();i++){
            WebElement option = options.get(i);
            String text=option.getText();
            if(text.equalsIgnoreCase("Friday")){
                select.selectByIndex(i);
            }

        }
    }
}
