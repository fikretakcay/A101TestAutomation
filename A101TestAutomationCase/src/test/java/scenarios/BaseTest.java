package scenarios;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {
    static WebDriver driver;
    @BeforeAll
    public static void start(){
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(opt);
        driver.get("https://www.a101.com.tr/list/?search_text=giyim&personaclick_search_query=giyim&personaclick_input_query=giyim");
        driver.manage().window().maximize();

    }
    /*@After
    public void stop() throws InterruptedException {
    Thread.sleep(3000);
    driver.quit();
    }*/
    public WebDriver getDriver(){
    return driver;
    }
}
