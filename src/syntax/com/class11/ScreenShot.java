package syntax.com.class11;

import org.apache.bcel.classfile.SourceFile;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShot {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //maximize window
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //Username Text Box
        WebElement username = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        username.sendKeys("Tester", Keys.TAB);


        //password field
        WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test",Keys.ENTER);

        //TakeScreenShot is an Interface
        TakesScreenshot ss= (TakesScreenshot)driver;

        //screenshot is taken at this point
       File sourceFile = ss.getScreenshotAs(OutputType.FILE);

       //save from the file from your variable into the location in your computer
        FileUtils.copyFile(sourceFile,new File("ScreenShots/SmartBear/adminLogin.png"));
    }
}
