import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorUITest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Set up WebDriver (ChromeDriver in this case)
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        // Maximize browser window
        driver.manage().window().maximize();
        // Navigate to the calculator web page
        driver.get("https://192.168.138.114:8081/webapp-2.0/");
    }

    @Test
    public void testCalculatorUI() {
        // Find input elements for calculator
        WebElement num1Input = driver.findElement(By.id("num1"));
        WebElement num2Input = driver.findElement(By.id("num2"));
        WebElement addButton = driver.findElement(By.id("addButton"));
        WebElement resultElement = driver.findElement(By.id("result"));

        // Enter numbers into the input fields
        num1Input.sendKeys("10");
        num2Input.sendKeys("5");

        // Click the add button
        addButton.click();

        // Verify the result
        String result = resultElement.getText();
        assert(result.equals("15")); // Asserting the result to be 15
    }

    @After
    public void tearDown() {
        // Close the WebDriver session
        if (driver != null) {
            driver.quit();
        }
    }
}
