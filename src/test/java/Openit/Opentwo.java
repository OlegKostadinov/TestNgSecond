package Openit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Opentwo  {
    WebDriver driver;

    @BeforeMethod
    public  void launch () throws InterruptedException {



        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.python.org/");
        driver.manage().window().maximize();
        Thread.sleep(1000);


    }
    @Test

    public void wwwget () throws InterruptedException {

        String h = driver.getTitle();
        System.out.println(h);
        Thread.sleep(1000);

    }
    @Test

    public void urlget  () throws InterruptedException{

       String a = driver.getCurrentUrl();
        System.out.println(a);
        Thread.sleep(1500);

    }
    @Test

    public void field() throws InterruptedException {
       driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
       Thread.sleep(1500);

    }
    @Test
    public void fieldtest(){

      driver.findElement(By.xpath("//*[@id=\"downloads\"]/a")).click();
}
@AfterMethod
    public void stop(){
        driver.close();
}

}

