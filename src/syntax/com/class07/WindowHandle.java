package syntax.com.class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
      
        
        //task: go to gmail signup page and get the window handle
        // go to gmail signup page
        driver.get("http://accounts.google.com/signup");
        
        //get the window handle for the current page
        String gmailHandle = driver.getWindowHandle();

        //print
        System.out.println("The handle of the current page is: "+gmailHandle);
    }
}
