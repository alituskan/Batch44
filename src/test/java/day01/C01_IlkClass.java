package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // biz bir driver objeesi oluşturduğumuzda boş bir browser açılır.

       driver.get("https://www.amazon.com");
       //driver.get metodu dirivera gideceği web adresini girmemizi sağlar.

        Thread.sleep(1000);
        driver.close();
        // driver i kapatır.





    }
}
