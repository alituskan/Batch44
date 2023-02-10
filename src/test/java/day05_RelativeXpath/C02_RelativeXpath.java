package day05_RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C02_RelativeXpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        Thread.sleep(3000);
        //driver.close();


        //https://www.diemol.com/selenium-4-demo/relative-locators-demo.html
        WebElement sailor= driver.findElement(By.id("pid11_thumb"));
        WebElement nyc= driver.findElement(By.id("pid3_thumb"));
        WebElement boston= driver.findElement(By.id("pid6_thumb"));
        WebElement bayArea= driver.findElement(By.id("pid8_thumb"));

        //C
        //lass W ork : R elative L ocators
        //1 )
        //https://www.diemol.com/selenium 4 demo/relative locators demo.html adresine gidin

        //2 ) Berlin’i 3 farkli relative locator ile locate edin

        WebElement berlin1= driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(boston));
        //System.out.println(berlin1.getAttribute("id"));
        WebElement berlin2=driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailor).below(nyc));
        //System.out.println(berlin2.getText());
        WebElement berlin3= driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailor).toLeftOf(bayArea));
        //3 ) Relative locator’larin dogru calistigini test edin

        String expectedBerlinIdDegeri="pid7_thumb";

        String actualBerlinDegeri1= berlin1.getAttribute("id");
        String actualBerlinDegeri2= berlin2.getAttribute("id");
        String actualBerlinDegeri3= berlin3.getAttribute("id");

        if (expectedBerlinIdDegeri.equals(actualBerlinDegeri1)){
            System.out.println("BERLİN1 RELATİVE LOCATOR TESTİ PASS");
        } else {
            System.out.println("BERLİN1 RELATİVE LOCATOR TESTİ FAILED");
        }

        if (expectedBerlinIdDegeri.equals(actualBerlinDegeri2)){
            System.out.println("BERLİN2 RELATİVE LOCATOR TESTİ PASS");
        } else {
            System.out.println("BERLİN2 RELATİVE LOCATOR TESTİ FAILED");
        }

        if (expectedBerlinIdDegeri.equals(actualBerlinDegeri3)){
            System.out.println("BERLİN3 RELATİVE LOCATOR TESTİ PASS");
        } else {
            System.out.println("BERLİN3 RELATİVE LOCATOR TESTİ FAILED");
        }

        driver.close();




    }
}
