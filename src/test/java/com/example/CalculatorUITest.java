import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class CalculatorUITest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Specify the path to the GeckoDriver executable
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");

        // Optional: Specify any additional options for GeckoDriver
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless"); // Example: Run Firefox in headless mode
        // Add any other desired options...

        // Initialize FirefoxDriver with options
        driver = new FirefoxDriver(options);
    }

    @After
    public void tearDown() {
        // Close the WebDriver instance after the test completes
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testCalculatorUI() {
        // Your test code here
        // Example:
        driver.get("https://www.google.com");
        // Perform UI interactions and assertions
    }
}
