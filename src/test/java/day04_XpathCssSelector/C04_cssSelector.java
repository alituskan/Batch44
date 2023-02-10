package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_cssSelector
{

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //H
        //ome W ork : L og i n T est U sing C ss
        //1 ) Bir class oluşturun : Locators_css
        //2
        //Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a. Verilen web sayfasına gidin. https://www.utest.com/
        //d. Locate signin button

        driver.get("https://www.utest.com/");
        WebElement logInButonu= driver.findElement(By.cssSelector("a[target='_self']"));
        logInButonu.click();

        //b. Locate email textbox
        //c. Locate password textbox

        WebElement eMailTextBox= driver.findElement(By.cssSelector("input#username"));
        Thread.sleep(3000);
        WebElement passwordTextBox= driver.findElement(By.cssSelector("input#password"));
        Thread.sleep(3000);
        WebElement signInButonu=driver.findElement(By.cssSelector(".btn"));

                //e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini
        //tıklayın
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!

        eMailTextBox.sendKeys("alituskan555@gmail.com");
        passwordTextBox.sendKeys("UTqawsedrftg555");

        Thread.sleep(3000);
        signInButonu.click();




        //NOT: cssSelector kullanarak elementleri locate ediniz.


    }
}
