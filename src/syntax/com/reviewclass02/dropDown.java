package syntax.com.reviewclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        //find the button create account and click on it
        WebElement createAccountBtn= driver.findElement(By.cssSelector("a[data-testid*='open-registration']"));
        createAccountBtn.click();
        //sleep for 3 seconds to wait for the window to open up
        Thread.sleep(3000);

        //Select the date from the drop-down approach to use the select
        //1. Find the WebElement that contains the select Tag
        //2.Use Select class Select sel=new Select(WebElement)

        //1.Find the WebElement that contains the select Tag
        WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
        //2. Use select class Select sel =new Select(WebElement)
        Select sel=new Select(day);

        //We not have three methods
        //1. Select by Index
        sel.selectByIndex(4);
        Thread.sleep(2000);
        //2. Select by Visible Text
        sel.selectByVisibleText("31");
        Thread.sleep(2000);
        //3. Select by Value
        sel.selectByValue("16");
        Thread.sleep(2000);

        //1.Find the WebElement
        //2.Use the select class to initiate an instance

        //1.find the WebElement
        WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
        //2.Use the select class to initiate an instance
        Select selectMonth=new Select(month);
        selectMonth.selectByVisibleText("Aug");

        //print all the available months in the console
        //gets you all the available options in the dropdown
        List<WebElement> Options = selectMonth.getOptions();
        //traverse through the loop and print each WebElement
        for(int i=0;i<Options.size();i++){

            String months=Options.get(i).getText();
            System.out.println(months);
        }


    }
}
