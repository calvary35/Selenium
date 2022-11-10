package syntax.com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HWEbay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to syntax project/checkbox demo
        driver.manage().window().maximize();
        //maximize
        //go to ebay
        driver.get("https://www.ebay.com/");
        //select from the drop down
        WebElement categories = driver.findElement(By.name("_sacat"));

        Select select = new Select(categories);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            String category = option.getText();
            System.out.println(category);
        }
        //3.select Computers/Tables & Networking
        select.selectByVisibleText("Computers/Tablets & Networking");
        WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
        //4.click on search
        search.click();

        //5.verify the title

        String realTitle = driver.getTitle();
        if (realTitle.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")) {
            System.out.println("title is verified");
        } else {
            System.out.println("incorrect title");
        }
    }
}



