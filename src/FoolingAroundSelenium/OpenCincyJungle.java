package FoolingAroundSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCincyJungle {
    public static void main(String[] args) throws InterruptedException {
        //linking the driver with my class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //creating an instance of the WebDriver
        WebDriver football = new ChromeDriver();

        //navigating to CincyJungle
        football.get("https://www.cincyjungle.com");

        //get URL of current website
        String url= football.getCurrentUrl();

        System.out.println(url);

        Thread.sleep(20000);

        football.navigate().to("https://www.reddit.com/r/coys/");

    }
}
