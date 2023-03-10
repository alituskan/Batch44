package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_ManageWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver= new ChromeDriver();


        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Maximize durumda position : "+driver.manage().window().getPosition());
        System.out.println("Minimize durumunda size : "+driver.manage().window().getSize());
        Thread.sleep(3000);
        //7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Full scren durumunda position : "+driver.manage().window().getPosition());
        System.out.println("Full scren durumunda size : "+ driver.manage().window().getSize());
        Thread.sleep(3000);
        //9. Sayfayi kapatin
        driver.quit();


    }
}
