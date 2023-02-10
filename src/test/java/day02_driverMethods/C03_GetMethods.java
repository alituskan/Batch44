package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class C03_GetMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();





        //
      //  1. Yeni bir package olusturalim:
        //day01
//2. Yeni bir class olusturalim : C03_GetMethods
//3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");


//  4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
//5. Sayfa basliginin “Amazon” icerdigini test edin.
      String actualTitle=driver.getTitle();
      String arananKelime="Amazon";
      if(actualTitle.contains(arananKelime)) {
          System.out.println("Title testi PASS");
      }else {
          System.out.println("Title testi FAİLED");

      }
        System.out.println("Sayfanin title'i: " +actualTitle);
//6. Sayfa adresini(url) yazdirin.
        System.out.println(driver.getCurrentUrl());
//7. Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        String urlAranankelime="amazon";
        if (actualUrl.contains(urlAranankelime)) {
            System.out.println("Url testi PASS");
        } else {
            System.out.println("Url testi FAİLED");
            System.out.println("actual url: " +actualUrl);
        }
//8. Sayfa handle degerini yazdirin.

        System.out.println( driver.getWindowHandle());
//9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin

        String actualPageSource= driver.getPageSource();
        String pageAranankelime="alisveris";
        if (actualPageSource.contains(pageAranankelime)) {
            System.out.println("Page source testi PASS");
        } else {
            System.out.println("Page source testi FAİLED");
            System.out.println("actual PageSource: " +actualPageSource);
        }


//10 . Sayfayi kapatin.
        driver.close();






    }

}
