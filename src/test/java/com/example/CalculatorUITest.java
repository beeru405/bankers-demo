import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class CalculatorUITest {

    @Test
    public void testAddition() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/calculator");

        // Perform addition operation on UI
        driver.findElement(By.id("num1")).sendKeys("5");
        driver.findElement(By.id("num2")).sendKeys("5");
        driver.findElement(By.id("operator")).sendKeys("add");
        driver.findElement(By.id("calculate")).click();

        // Check if result is displayed correctly
        String result = driver.findElement(By.id("result")).getText();
        assertEquals("10", result);

        driver.quit();
    }
}
