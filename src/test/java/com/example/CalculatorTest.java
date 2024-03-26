import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(10, Calculator.add(5, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, Calculator.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(25, Calculator.multiply(5, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2, Calculator.divide(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Calculator.divide(10, 0);
    }
}
