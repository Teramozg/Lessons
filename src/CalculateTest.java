import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {
    Calculate calculate = new Calculate();

    @Test
    @DisplayName("тест факториала от 5.")
    void factorial() {
        int factorial = calculate.factorial(5);
        assertEquals(120, factorial);
    }

    @Test
    @DisplayName("тест факториала от 0.")
    void factorial0() {
        int factorial = calculate.factorial(0);
        assertEquals(1, factorial);
    }

    @Test
    @DisplayName("тест факториала от 1.")
    void factorial1() {
        int factorial = calculate.factorial(1);
        assertEquals(1, factorial);
    }
    @Test
    @DisplayName("тест факториала от 1.")
    void factorialMax() {
        int factorial = calculate.factorial(16);
        assertEquals(1, factorial);
    }


}