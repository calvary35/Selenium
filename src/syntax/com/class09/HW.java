package syntax.com.class09;
/*





and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)


         */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //go to the URL
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");


        WebElement userBtn = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userBtn.sendKeys("admin");

        WebElement passWordBtn = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        passWordBtn.sendKeys("Hum@nhrm123");

        //click login
        WebElement login = driver.findElement(By.xpath("//input[@name='Submit']"));
        login.click();

        //click on PIM
        WebElement PIM = driver.findElement(By.xpath("//b[text()='PIM']"));
        PIM.click();

        //click on employeeList
        WebElement employeeList = driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeList.click();

        //from the table choose one id (it must be from the first page)
//and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)


        List<WebElement> values = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        //traverse through the page
        for(int i= 0; i<values.size();i++){
            String columnTxt = values.get(i).getText();
          if (columnTxt.equalsIgnoreCase("45036A")){
              int rowNumber= i+1;
              System.out.println("the index of the row is "+rowNumber);

              //click the checkbox for that id
              WebElement clickIDBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+rowNumber+"]/td[1]"));
              clickIDBox.click();
          }

        }

    }

}
