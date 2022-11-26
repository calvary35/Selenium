package syntax.com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class multipleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to syntax project/checkbox demo
        driver.manage().window().maximize();
        //maximize
        driver.get("http://syntaxprojects.com/basic-select-dropdown-demo.php");
        //find the WebElement that contains the select class
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

        //using select class
        Select select = new Select(DD);

        //By index
        select.selectByIndex(3);
        //By visible text
        select.selectByVisibleText("Texas");
        //By value
        select.selectByValue("Pennsylvania");


        Thread.sleep(3000);
        //deselect by index
        select.deselectByIndex(3);
        //write down the code to select all the options in the Drop Down
        List<WebElement> options = select.getOptions();

        for (int i = 0; i < options.size(); i++) {
            select.selectByIndex(i);

        }
        Thread.sleep(3000);
        select.deselectAll();

        //how can you check if the drop down is multi select or not using selenium?
        boolean multiSelect = select.isMultiple();
        System.out.println(multiSelect);

    }
}
