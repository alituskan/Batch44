package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();


        driver.navigate().to("https://www.amazon.com");

        // WebDriver driver2= new ChromeDriver(); AYRI BROWSER AÇIYOR.

        driver.navigate().to("https://www.techproeducation.com");

        driver.navigate().back();
        driver.navigate().forward();

        driver.navigate().refresh();




    }
}
