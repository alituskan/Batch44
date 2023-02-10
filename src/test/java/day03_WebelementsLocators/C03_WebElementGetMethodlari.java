package day03_WebelementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementGetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a. https://automationexercise.com adresine gidiniz.
        driver.get("https://automationexercise.com/");
        WebElement contactUsLinki=driver.findElement(By.linkText("Contact us"));
        System.out.println("size: "+ contactUsLinki.getSize());
        System.out.println("aria role: "+ contactUsLinki.getAriaRole());
        System.out.println("Accessible Name: "+ contactUsLinki.getAccessibleName());
        System.out.println("Link Text Attribute Value: "+ contactUsLinki.getAttribute("linkText"));
        System.out.println("Location: "+ contactUsLinki.getLocation());
        System.out.println("genişlik : "+ contactUsLinki.getRect().width);
        System.out.println("Color: "+ contactUsLinki.getCssValue("color"));
        System.out.println("tag name: "+ contactUsLinki.getTagName());
        System.out.println("Contact Yazısı: "+ contactUsLinki.getText());

        driver.close();




    }
}
