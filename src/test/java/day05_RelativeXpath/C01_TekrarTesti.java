package day05_RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome","src/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //T
        //ekrar T est i
        //1
        //C01_TekrarTesti isimli bir class olusturun
        //2
        //https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");
        //3
        //Browseri tam sayfa yapin
        driver.manage().window().fullscreen();
        //4
        //Sayfayi “refresh” yapin

        driver.navigate().refresh();
        //5
        //Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        System.out.println( driver.getTitle());

        String actualPageTitle=driver.getTitle();
        String expectedPageTitle= "Spend less";

        if (actualPageTitle.contains(expectedPageTitle))
        {
            System.out.println("AMAZON title testi PASS");
        } else {
            System.out.println("AMAZON title testi FAİLED");
        }

        //6
        //Gift Cards sekmesine basin
        WebElement giftCardSekmesi= driver.findElement(By.xpath("(// a[@tabindex='0'])[8]"));
        giftCardSekmesi.click();
        //7
        //Birthday butonuna basin
        WebElement birthDayButonu= driver.findElement(By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png']"));
        birthDayButonu.click();
                //8
        //Best Seller bolumunden ilk urunu tiklayin
        WebElement bestSellerBolumuIlkUrun = driver.findElement(By.xpath("//img[@data-a-hires='https://images-na.ssl-images-amazon.com/images/I/51Y9OrtJemL._AC_SX368_.jpg']"));
            bestSellerBolumuIlkUrun.click();
        //9
        //Gift card details’den 25 $’i secin

        WebElement giftCard25$= driver.findElement(By.xpath("//button[@value='25']"));
        giftCard25$.click();

        //10
        //Urun ucretinin 25$ oldugunu test edin

        WebElement UrunFiyatiElementi= driver.findElement(By.xpath("//span[@id='gc-live-preview-amount']"));
        String expectedUrunFiyati="$25.00";
        String actualFiyat=UrunFiyatiElementi.getText();

        if (expectedUrunFiyati.equals(actualFiyat)){
            System.out.println("FİYAT TESTİ PASS");
                    } else {
            System.out.println("FİYAT TESTİ FAİLED");
        }
        //10
        //Sayfayi kapatin
        driver.close();

       //driver.close();
    }
}
