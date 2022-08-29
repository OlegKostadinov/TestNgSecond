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
    public  void launch (){



        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.python.org/");
        driver.manage().window().maximize();


    }
    @Test

    public void wwwget (){

        String h = driver.getTitle();
        System.out.println(h);

    }
    @Test

    public void urlget  (){

       String a = driver.getCurrentUrl();
        System.out.println(a);

    }
    @Test

    public void field(){
       driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

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

