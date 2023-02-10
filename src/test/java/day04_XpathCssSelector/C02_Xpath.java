package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //C
        //lass W ork : A dd R emove E lement
        //Asagidaki testi text’leri kullanarak locate edin
        //1
        //https://the internet.herokuapp.com/add_remove_elements/ adresine gidin
        //2

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //Add Element butonuna basin
        WebElement addElementButonu= driver.findElement(By.xpath("//*[.='Add Element']"));
        addElementButonu.click();
        //3
        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu= driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));

        if (deleteButonu.isDisplayed()) {
            System.out.println("DELETE BUTONU GÖRÜNÜYOR TESTİ PASS");
        } else {

            System.out.println("DELETE BUTONU GÖRÜNÜYOR TESTİ FAİLED");
        }
        //4
        //Delete tusuna basin

        Thread.sleep(3000);
        deleteButonu.click();


        //5
        //Add/Remove Elements ” yazisinin gorunur oldugunu test edin

        WebElement addRemoveYazisiElements1= driver.findElement(By.tagName("h3"));
        WebElement addRemoveYazisiElements2= driver.findElement(By.xpath("//h3"));

        if (addRemoveYazisiElements1.isDisplayed()) {
            System.out.println("ADD/REMOVE ELEMENT BUTONU GÖRÜNÜYOR TESTİ PASS");
        } else {

            System.out.println("ADD/REMOVE ELEMENT BUTONU GÖRÜNÜYOR  TESTİ FAİLED");
        }

    }
}
