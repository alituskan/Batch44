package day03_WebelementsLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01b_TekrarTestiHocaninki {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Yeni bir class olusturun (TekrarTesti)
        //2.
        //Y outube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

        driver.navigate().to("https://www.youtube.com");

        String youtubeActualTitle = driver.getTitle();
        String youtubeExpectedTitle= "youtube";

        if (youtubeActualTitle.equals(youtubeExpectedTitle)) {
            System.out.println("YouTube Title testi PASS");

        } else {
            System.out.println("YouTube Title testi FAİLED \n  YouTube Actual Sayfa Başlığı :" + youtubeActualTitle);


        }
        //3. Sayfa URL'sinin “youtube” içerip içermediğini
        //(contains) doğrulayın, içermiyorsa doğru
        //URL'yi yazdırın.

        String youtubeSayfaUrl = driver.getCurrentUrl();
        String youtubeSayfaUrlKelimesi= "youtube";

        if (youtubeSayfaUrl.contains(youtubeSayfaUrlKelimesi)) {
            System.out.println("YouTube Url testi PASS");

        } else {
            System.out.println("YouTube Url testi FAİLED");

            System.out.println("Youtube Doğru Sayfa Url'i :" + driver.getCurrentUrl());
        }


        //4. Daha sonra
        //Amazon sayfasina gidin https://www.amazon.com/

        driver.navigate().to("https://www.amazon.com");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6.
        //Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8.
        //Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini
        //(contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.
        String amazonSayfaBasligi = driver.getTitle();
        String amazonSayfaBasligiKelimesi= "Amazon";

        if (amazonSayfaBasligi.contains(amazonSayfaBasligiKelimesi)) {
            System.out.println("Amazon Title Testi PASS");

        } else {
            System.out.println("Amazon Title Testi FAİLED");

            System.out.println("Amazon Doğru Sayfa Başlığı :" + driver.getTitle());
        }

        //10.Sayfa URL'sinin
        //https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın.

        String amazonActualUrl = driver.getCurrentUrl();
        String amazonExpectedUrl= "https://www.amazon.com/";

        if (amazonActualUrl.equals(amazonExpectedUrl)) {
            System.out.println("Amazon Url testi PASS");

        } else {
            System.out.println("Amazon Url testi FAİLED");

            System.out.println("Amazon Doğru Sayfa Url'i :" + driver.getCurrentUrl());
        }


        //11.
        //Sayfayi kapatin

        driver.close();

    }
}
