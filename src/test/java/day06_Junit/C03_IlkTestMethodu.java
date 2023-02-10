package day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_IlkTestMethodu {

    WebDriver driver;


    @Test
    public void test01 () {
       // System.out.println("1. test metodu çalıştı");

        // amazon a git ve title ın amazon içerdiğini test et.
        driver.get("https://www.amazon.com");
        String actualTitle = driver.getTitle();
        String arananKelime= "amazon";

       /* if (actualTitle.contains(arananKelime)) {
            System.out.println("Amazon testi PASS");
        } else {
            System.out.println("Amazon testi FAİLED");
        }*/

        Assert.assertTrue(actualTitle.contains(arananKelime));




    }

    @Test
    public void test02 () {
       // System.out.println("2. test metodu çalıştı");

        // google a git ve başlığın google içerdiğini test edelim.

    }

    @Before
    public void ayarlariDuzenle() {

        // System.out.println("Ayar metodu çalıştı");

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



    }

    @After
    public void ortaligiTopla (){
       //  System.out.println("Ortalığı topla metodu çalıştı");

        driver.close();
    }
}
