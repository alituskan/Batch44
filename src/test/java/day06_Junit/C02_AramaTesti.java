package day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class C02_AramaTesti {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. “https://www.saucedemo.com” Adresine gidin

        driver.get("https://www.saucedemo.com");
        //2. Username kutusuna “standard_user” yazdirin
       WebElement userNameKutusu= driver.findElement(By.xpath("//input[@id='user-name']"));
       userNameKutusu.sendKeys("standard_user");
        //3. Password kutusuna “secret_sauce” yazdirin
        WebElement passwordKutusu= driver.findElement(By.xpath("//input [@id='password']"));
        passwordKutusu.sendKeys("secret_sauce");
        //4. Login tusuna basin
        WebElement logInTusu= driver.findElement(By.id("login-button"));
        logInTusu.click();
        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin

        WebElement ilkUrunElementi= driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
        String ilkUrunIsmi= ilkUrunElementi.getText();
        ilkUrunElementi.click();

        //6. Add to Cart butonuna basin

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        //7. Alisveris sepetine tiklayin
        driver.findElement(By.className("shopping_cart_link")).click();
    //8. Sectiginiz urunun basarili olarak sepete eklendigini kontrol edin
        WebElement sepettekiUrunElementi=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        String sepettekiUrunIsmi= sepettekiUrunElementi.getText();

        if (sepettekiUrunIsmi.equals(ilkUrunIsmi)) {
            System.out.println("SEPETE ÜRÜN EKLENME TESTİ PASS");
        } else {
            System.out.println("SEPETE ÜRÜN EKLENME TESTİ FAILED");
        }

        //9. Sayfayi kapatin

        driver.close();
    }
}
