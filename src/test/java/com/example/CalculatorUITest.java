import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorUITest {
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://192.168.138.114:8081/web-calculator");
    }

    @Test
    public void testCalculatorUI() {
        // Add your UI testing code here
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
