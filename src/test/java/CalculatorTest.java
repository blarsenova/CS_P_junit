import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

class CalculatorTest {

    @Test
        @DisplayName("Add two numbers")
        void add() {
            assertEquals(4, Calculator.add(2, 2));

    }

    @Test
       @DisplayName("Multiply two numbers")
        void multiply() {
            assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                    () -> assertEquals(-4, Calculator.multiply(2, -2)),
                    () -> assertEquals(4, Calculator.multiply(-2, -2)),
                    () -> assertEquals(0, Calculator.multiply(1, 0)));
        }

    @Test
    @DisplayName("Multiply three numbers")
    void multiplyThreeNums() {
        assertEquals(384, Calculator.multiply(12,32,1));
    }

    @Test
    @DisplayName("Stress Test: Handling large integer overflow")
    void testLargeNumbers() {
        // As a test engineer, always check for boundary conditions
        long result = (long) Calculator.add(Integer.MAX_VALUE, 1);
        assertTrue(result > Integer.MAX_VALUE, "Should handle values beyond Integer limits if using long");
    }

    @Test
    @DisplayName("Negative Scenario: Verify division by zero throws exception")
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
                    Calculator.divide(10, 0);
                }
        );
    }

    @Test
    @DisplayName("Divide two numbers")
    void divide() {
        assertEquals(4, Calculator.divide(16,4));

    }



}

