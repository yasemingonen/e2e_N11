import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;

import static java.lang.Thread.sleep;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class n11_Urun_Ekleme {
    private WebDriver driver;

    //her test methodu çalıştırılmadan önce yalnızca bir kez çalışır.Yani her adımdan önce değil, her testin basında bir kez çalışır.
    @BeforeEach
    public void setUp()  {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testN11Scenario() throws InterruptedException {
        // 1. N11 Sitesine git
        driver.get("https://www.n11.com/");

        // Başlığın doğru olduğunu doğrula
        String expectedPageTitle="n11 - 10 Üzerinden 11'lik Alışveriş Deneyimi";
        String actualPageTitle=driver.getTitle();

        assertEquals(expectedPageTitle, actualPageTitle);

        // 2. Arama kutusuna ürün adı gir.
        WebElement aranacakUrun= driver.findElement(By.id("searchData"));
        aranacakUrun.sendKeys("Samsung S23 Ultra", Keys.ENTER);


        // 3. Arama sonuçlarının sayısını kontrol et.
        String aramaSonucu= driver.findElement(By.className("resultText")).getText();
        String expectedResultText= "Samsung S23 Ultra için 4,373 sonuç bulundu.";

        System.out.println("aramaSonucu = " + aramaSonucu + "expectedResultText = "+ expectedResultText);

        assertEquals(expectedResultText, aramaSonucu);

        // 4. Bir önceki sayfaya geri dön
        Thread.sleep(2000);
        driver.navigate().back();

        // 5. Bir sonraki sayfaya git
        Thread.sleep(2000);
        driver.navigate().forward();
    }

    // @AfterEach methodu her test methodu çalıştırılmadan önce yalnızca bir kez çalışır.Yani her adımdan önce değil, her testin sonunda bir kez çalışır.
@AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }



}
