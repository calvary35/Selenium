package syntax.com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    public static void main(String[] args) {

        //go to syntax HRMS

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");


        WebElement username = driver.findElement(By.xpath("//input[ @type ='text']"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.xpath("//input[ @type ='password']"));
        password.sendKeys("Hum@nhrm123");

        WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();

        //go to the recruitment tab
        WebElement recruitmentTab = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recruitmentTab.click();

        //from date
        WebElement fromDate = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        fromDate.click();

        WebElement selectMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

        //Select month
        Select select= new Select(selectMonth);
        select.selectByVisibleText("Aug");

        //select year
        WebElement selectYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectY= new Select(selectYear);
        selectY.selectByVisibleText("2023");

        //pick a date
       List< WebElement> dateTable = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement date:dateTable){
            String value = date.getText();
            if(value.equalsIgnoreCase("8")){
                date.click();
            }
        }
    }
}
