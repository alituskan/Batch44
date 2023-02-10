package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C09_Homework {
    public static void main(String[] args) throws InterruptedException {

        //1.
        //Yeni bir class olusturalim (Homework)
        //2.
        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        String actualTitle = driver.getTitle();
        String arananKelime = "facebook";

        if (actualTitle.contains(arananKelime)) {
            System.out.println("Title testi PASS");

        } else {
            System.out.println("Title testi FAİLED");
            System.out.println("Sayfanin Title'i :" + actualTitle);

            //3.
            //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
            //yazdirin.

            String actualUrl = driver.getCurrentUrl();
            String arananUrlKelimesi = "facebook";

            if (actualUrl.contains(arananUrlKelimesi)) {
                System.out.println("Url testi PASS");

            } else {
                System.out.println("Url testi FAİLED");
            }

            System.out.println("Sayfanin Url'i :" + actualUrl);
            //4.
            //https://www.walmart.com/ sayfasina gidin.
            driver.get("https://www.walmart.com");
            //5.
            //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
            String actualTitleWalmart = driver.getTitle();
            String arananKelime2 = "Walmart";

            if (actualTitleWalmart.contains(arananKelime2)) {
                System.out.println("WALMART Title testi PASS");

            } else {
                System.out.println("WALMART Title testi FAİLED");}
                System.out.println("WALMART Sayfanin Title'i :" + actualTitleWalmart);
                //6.
                //Tekrar “facebook” sayfasina donun

            driver.navigate().back();
                //7.
                //Sayfayi yenileyin

            driver.navigate().refresh();

            //8.
                //Sayfayi tam sayfa (maximize) yapin

            Thread.sleep(5000);
            driver.manage().window().maximize();
                //9.
                //Browser’i kapatin.
            driver.close();




        }
    }

}


