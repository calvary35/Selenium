package syntax.com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        //got to smartbear.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //maximize the window
        driver.manage().window().maximize();
        //enter the username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //find the password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
//click login
        driver.findElement(By.className("button")).click();

        //Make sure that the title is correct i.e. Web Orders
        //get the title of the page
       String title= driver.getTitle();
       System.out.println(title);
       if(title.equalsIgnoreCase("Web Orders")){
           System.out.println("The title is correct : " + title);
       }else {
           System.out.println("The title is incorrect" +title);
       }
    }
}
