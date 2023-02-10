package day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class C01_TekrarTesti {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //T
        //ekrar T est i
        //1
        //C01_TekrarTesti isimli bir class olusturun
        //2
        //https://www.google.com/ adresine gidin

        driver.get("https://www.google.com");
        //3
        //cookies uyarisini kabul ederek kapatin
        //4
        //Sayfa basliginin “Google” ifadesi icerdigini test edin

        System.out.println(driver.getTitle());

        String expectedGoogleSayfaBasligi = "Google";
        String actualGoogleSayfaBasligi = driver.getTitle();

        if (actualGoogleSayfaBasligi.contains(expectedGoogleSayfaBasligi))
        {
            System.out.println("GOOGLE SAYFA BAŞLIĞI TESTİ PASS");
        } else{
            System.out.println("GOOGLE SAYFA BAŞLIĞI TESTİ FAİLED");
        }
        //5
        //Arama cubuguna “Nutella” yazip aratin

        WebElement googleAramaCubugu=driver.findElement(By.xpath("//input[@title='Ara']"));
                googleAramaCubugu.sendKeys("Nutella" + Keys.ENTER);
        //6
        //Bulunan sonuc sayisini yazdirin

        WebElement nutellaSonucSayisi= driver.findElement(By.id("result-stats"));
        System.out.println(nutellaSonucSayisi.getText());
        //7
        //sonuc sayisinin 10 milyon’dan fazla oldugunu test edin.

        String sonucSayisiString= nutellaSonucSayisi.getText();
        String sonucKelimeleri[]=sonucSayisiString.split(" ");

        // System.out.println(Arrays.toString(sonucKelimeleri));

        String sonucNutellaSayisiString=sonucKelimeleri[1];// 149.000'i verecek
       sonucNutellaSayisiString= sonucNutellaSayisiString.replace(".","");
       // System.out.println(sonucNutellaSayisiString);
        int nutellaAramaSonucu=Integer.parseInt(sonucNutellaSayisiString);

        if (nutellaAramaSonucu>10000000) {
            System.out.println("NUTELLA SONUCU TEST EDİLEN RAKAMDAN ÇOK NUTELLA ARAMA TESTİ PASS");
                    }else {
            System.out.println("NUTELLA SONUCU TEST EDİLEN RAKAMDAN AZ NUTELLA ARAMA TESTİ FAİLED");
        }

        driver.close();













        //8
        //Sayfayi kapatin
    }
}
