import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmozonTest {
    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testAddToCard1() {
        // Amozon sitesine git
        driver.get("https://www.amazon.com/");

        // Test senartosu 1: Ürün arama
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iPhone 14 Pro Max", Keys.ENTER);

        //İlk ürünü seç
        WebElement firstProduct = driver.findElement(By.xpath("//div[@data-component-type='s-search-result'][1]//h2//a"));
        firstProduct.click();

        //Ürün sayfasında add to card butonunu bul ve tıkla
        WebElement addToCardButton = driver.findElement(By.id("add-to-card-button"));
        addToCardButton.click();
    }

    @Test

    public void testAddToCard2()  {
        /* Amozon sitesine git */
        driver.get("https://www.amazon.com/");

        // Test senartosu 1: Ürün arama
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Samsung Galaxy S21 Ultra", Keys.ENTER);

        //İlk ürünü seç
        WebElement firstProduct = driver.findElement(By.xpath("//div[@data-component-type='s-search-result'][1]//h2//a"));
        firstProduct.click();

        //Ürün sayfasında add to card butonunu bul ve tıkla
        WebElement addToCardButton = driver.findElement(By.id("add-to-card-button"));
        addToCardButton.click();

    }

    @Test
    public void testAddToCard3() {
        // Amozon sitesine git
        driver.get("https://www.amazon.com/");

        // Test senartosu 1: Ürün arama
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Apple Airpods Pro", Keys.ENTER);

        //İlk ürünü seç
        WebElement firstProduct = driver.findElement(By.xpath("//div[@data-component-type='s-search-result'][1]//h2//a"));
        firstProduct.click();

        //Ürün sayfasında add to card butonunu bul ve tıkla
        WebElement addToCardButton = driver.findElement(By.id("add-to-card-button"));
        addToCardButton.click();
    }

  //  @AfterAll
    public static void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
