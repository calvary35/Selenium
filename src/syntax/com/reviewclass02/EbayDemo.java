package syntax.com.reviewclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to syntax project/checkbox demo
        driver.manage().window().maximize();
        //maximize
        driver.get("https://www.ebay.com");
        //select from the drop down
     WebElement dropDwn=  driver.findElement(By.xpath("//select[@id='gh-cat']"));

     Select sel = new Select(dropDwn);
     sel.selectByValue("58058");

     driver.findElement(By.xpath("//input[@type='submit']")).click();

     //verify the title
       // WebElement title = driver.findElement(By.xpath("//title"));
        //String titleText=title.getText();
        String title=driver.getTitle();
        if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println("The title is verified");
        }else{
            System.out.println("The title is incorrect");
        }
    }
}
