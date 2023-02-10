package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {

    //Normalşde selenium un kendi idesi de var ama daha kullanışlı olduğu için intelliJ i kullanıyoruz.
    // İntelliJ 'de yeni bir proje açtığımızda öncel,klşer selenium kütüphaneelrini projeuye eklemmeiz gerekir
    //biz en ilkel haliyle ptrojemize kütüphaneleri yani jar dosyaları olarak yükledik.
    // Bu eklediğimiz dosyalarla artık driver ayaralarını yapa biliriz.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https:/sahibinden.com");
        Thread.sleep(3000);

        // driver.close();

        driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

    }


}
