package syntax.com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {
    public static void main(String[] args) {

        //        set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // maximize
        driver.manage().window().maximize();

        driver.get(" https://jqueryui.com/droppable/");

        //switch the focus to Iframe

        driver.switchTo().frame(0);
        //draggable element
        WebElement draggableElement = driver.findElement(By.xpath("//div[@id='draggable']"));

        //drop location
        WebElement droppableElement = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action = new Actions(driver);
        //drag and drop element into appropriate location

        //action.dragAndDrop(draggableElement,droppableElement).perform();

        //we can also use this to
        action.clickAndHold(draggableElement).moveToElement(droppableElement).release().build().perform();

    }


}
