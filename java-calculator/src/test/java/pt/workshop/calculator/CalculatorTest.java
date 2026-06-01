package pt.workshop.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Tests")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // --- add ---

    @Test
    void shouldReturnSum_WhenAddingTwoPositiveNumbers() {
        assertEquals(5.0, calculator.add(2.0, 3.0));
    }

    @Test
    void shouldReturnNegativeSum_WhenAddingPositiveAndNegativeNumber() {
        assertEquals(-1.0, calculator.add(2.0, -3.0));
    }

    @Test
    void shouldReturnNegativeSum_WhenAddingTwoNegativeNumbers() {
        assertEquals(-5.0, calculator.add(-2.0, -3.0));
    }

    @Test
    void shouldReturnSameNumber_WhenAddingZero() {
        assertEquals(7.0, calculator.add(7.0, 0.0));
    }

    // --- subtract ---

    @Test
    void shouldReturnDifference_WhenSubtractingTwoPositiveNumbers() {
        assertEquals(1.0, calculator.subtract(3.0, 2.0));
    }

    @Test
    void shouldReturnNegativeDifference_WhenSubtractingLargerFromSmaller() {
        assertEquals(-1.0, calculator.subtract(2.0, 3.0));
    }

    @Test
    void shouldReturnSameNumber_WhenSubtractingZero() {
        assertEquals(5.0, calculator.subtract(5.0, 0.0));
    }

    @Test
    void shouldReturnZero_WhenSubtractingSameNumbers() {
        assertEquals(0.0, calculator.subtract(4.0, 4.0));
    }

    // --- multiply ---

    @Test
    void shouldReturnProduct_WhenMultiplyingTwoPositiveNumbers() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0));
    }

    @Test
    void shouldReturnNegativeProduct_WhenMultiplyingPositiveAndNegativeNumber() {
        assertEquals(-6.0, calculator.multiply(2.0, -3.0));
    }

    @Test
    void shouldReturnPositiveProduct_WhenMultiplyingTwoNegativeNumbers() {
        assertEquals(6.0, calculator.multiply(-2.0, -3.0));
    }

    @Test
    void shouldReturnZero_WhenMultiplyingByZero() {
        assertEquals(0.0, calculator.multiply(5.0, 0.0));
    }

    // --- divide (not yet implemented) ---
    // TODO: add tests for divide once the method is implemented
}
