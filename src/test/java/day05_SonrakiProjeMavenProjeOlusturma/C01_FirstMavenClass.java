package day05_SonrakiProjeMavenProjeOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_FirstMavenClass {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // C
        //lass W ork A mazon S earch T est
        //1
        //https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com");
        //2
        //arama kutusunu locate edelim
        WebElement amazonAramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        //3
        //--“Samsung headphones” ile arama yapalim

        amazonAramaKutusu.sendKeys("Samsung headphones");
        amazonAramaKutusu.submit();
        //4
        //Bulunan sonuc sayisini yazdiralim
        WebElement headphonesSonucSayisi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(headphonesSonucSayisi.getText());

        //5
        //Ilk urunu tiklayalim

        WebElement ilkUrunHeadphones= driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        ilkUrunHeadphones.click();
        //6
        //Önceki sayfaya dönüp Sayfadaki tum basliklari yazdiralim.
        driver.navigate().back();

        List<WebElement> headphonesTumBasliklarSayisi=driver.findElements(By.xpath("//a[@class='a-link-normal s-navigation-item']"));
        System.out.println("headphonesTumBasliklarSayisi : "+headphonesTumBasliklarSayisi.size() );

        driver.close();


    }



}
