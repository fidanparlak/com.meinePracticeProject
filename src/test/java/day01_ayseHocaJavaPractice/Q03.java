package day01_ayseHocaJavaPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03 {

    @BeforeClass
    public static void setup(){
        System.out.println("Before Class");
    }
    @AfterClass
    public static void teardown(){
        System.out.println("After Class");
    }
    @Before
    public void before(){

    }
    @Test
    public void ahmet(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        System.out.println("Ahmet");

    }
    @Test
    public void bekir(){
        System.out.println("Bekir");

    }
    @Test
    public void cengiz(){
        System.out.println("Cengiz");

    }
}
