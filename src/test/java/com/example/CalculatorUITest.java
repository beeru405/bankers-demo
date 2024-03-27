import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorUITest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Set the path to GeckoDriver executable
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/");
        
        // Initialize FirefoxDriver
        driver = new FirefoxDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
    }

    @Test
    public void testCalculatorUI() {
        // Your test logic here
    }

    @After
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
