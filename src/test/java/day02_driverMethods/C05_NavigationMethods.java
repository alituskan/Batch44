package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //1. Yeni bir Class olusturalim.C05_NavigationMethods
        //2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        //3. Amazon soyfasina gidelim. https://www.amazon.com/
        //4. Tekrar YouTube’sayfasina donelim
        //5. Yeniden Amazon sayfasina gidelim
        //6. Sayfayi Refresh(yenile) yapalim
        //7. Sayfayi kapatalim / Tum sayfalari kapatalim.

        driver.navigate().to("https://www.youtube.com");
        driver.navigate().to("https:www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.quit();



    }
}
