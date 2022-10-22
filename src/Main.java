import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // for windows add extension .exe
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.espn.com/");
    }
}