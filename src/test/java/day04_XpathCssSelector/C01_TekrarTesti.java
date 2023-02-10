package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1. Bir class oluşturun :
        //AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a
        //.Amazon web sayfasına gidin. https:// amazon .
        driver.get("https://www.amazon.com");
        //b. Search(ara) “city bike
       WebElement amazonAramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
       amazonAramaKutusu.sendKeys("city bike"+ Keys.ENTER);
       // amazonAramaKutusu.submit();
        //c.
        //Amazon 'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement sonucSayisiElementi=driver.findElement(By.className("sg-col-inner"));

       // WebElement sonucSayisiElementi= driver.findElement(By.xpath("//div[@class='sg-col-14-of-20 sg-col-18-of-24 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']"));
        System.out.println(sonucSayisiElementi.getText());

               //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        WebElement ilkSonucCityBike=driver.findElement(By.className("s-image"));
        ilkSonucCityBike.click();

        WebElement giftCardButonu= driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gc']"));
        System.out.println(giftCardButonu.getText());
        giftCardButonu.click();

        WebElement amazonAnaSayfaLogosuSolUstte=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        amazonAnaSayfaLogosuSolUstte.click();

        driver.close();





    }
}
