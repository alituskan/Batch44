package day05_SonrakiProjeMavenProjeOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // 1.
        //http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        //2. Signin button
        //una tiklayin
        WebElement zeroSiteSignInButon= driver.findElement(By.id("signin_button"));
        zeroSiteSignInButon.click();
        //3.
        //L ogin alanine "username“ yazdirin
        WebElement logInAlani= driver.findElement(By.xpath("//input[@id='user_login']"));
        logInAlani.sendKeys("username" );

        //4.
        //P assword alanine  "password"“ yazdirin

        WebElement passwordAlani= driver.findElement(By.xpath("//input[@id='user_password']"));
        passwordAlani.sendKeys("password");

        //5. Sign in button
        //una tiklayin

        WebElement signInButonu= driver.findElement(By.xpath("//input[@value='Sign in']"));
        signInButonu.click();

        // SİTE galiba "http"yi desteklemediği için daha ileriye gidilemedi.

        //6. Pay Bills
        //sayfasina gidin
        //7.
        //amount kismina yatirmak istediginiz herhangi bir miktari yazin
        //8.
        //tarih kismina “2020 0 9 10 yazdirin
        //9. Pay button
        //una tiklayin
        //10. “The payment was successfully submitted.”
        //mesajinin ciktigini control edin

    }


}
