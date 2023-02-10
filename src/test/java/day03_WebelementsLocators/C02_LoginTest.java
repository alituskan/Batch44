package day03_WebelementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class

C02_LoginTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //C
        //lass W ork : L ogin T est
        //1. Bir class oluşturun: LoginTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a. https://automationexercise.com adresine gidiniz.
        driver.get("https://automationexercise.com/");
        //b. Sign in butonuna basin
        WebElement signInLinki=driver.findElement(By.linkText("Signup / Login"));
        signInLinki.click();
        //. email textbox,password textbox, and signin button elementlerini locate
        // . Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign i n)buttonunu tıklayın:
        WebElement eMailTextBox = driver.findElement(By.name("email"));
        eMailTextBox.sendKeys("alituskan555@gmail.com"+ Keys.ENTER);

        WebElement passwordTextBox=driver.findElement(By.name("password"));
        //Thread.sleep(3000);
        passwordTextBox.sendKeys("AEqawsedrftg555"+Keys.ENTER);

        //e. Expected user id nin
        // ali oldugunu dogrulayin(verify).
      WebElement apiTestingYazisiElementi=driver.findElement(By.linkText("API Testing"));
      System.out.println(apiTestingYazisiElementi.getText());

      String actualApiTestingYazisi=apiTestingYazisiElementi.
              getText();
      String expectedApiTestingYazisi="API Testing";

      if (actualApiTestingYazisi.equals(expectedApiTestingYazisi)) {
          System.out.println("Sayfaya giriş testi PASS");
      } else {
          System.out.println("Sayfaya giriş testi FAILED");
      }
        //. “Video Tutorials” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement videoTutorialsWebElementi= driver.findElement(By.linkText("Video Tutorials"));
        WebElement signOutWebElementi=driver.findElement(By.linkText("Contact us"));
        System.out.println(videoTutorialsWebElementi.isDisplayed()); // true false döndürür.
        System.out.println(signOutWebElementi.isDisplayed()); // true false döndürür.

        if (videoTutorialsWebElementi.isDisplayed()) {
            System.out.println("Video Tutorials Web Elementi Görüntüleme Testi PASS");
        } else {
            System.out.println("Video Tutorials Web Elementi Görüntüleme Testi FAILED");

    }
        if (signOutWebElementi.isDisplayed()) {
            System.out.println("Sign Out Web Elementi Görüntüleme Testi PASS");
        } else {
            System.out.println("Sign Out Web Elementi Görüntüleme Testi FAILED");

        }

        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));

        System.out.println("sayfada " + linklerListesi.size() + " adet link bulunmaktadır");
        driver.close();
    }
}
