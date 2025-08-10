package com.vadim.tkach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FunctionalInterfacesTest {
    @Test
    void shouldReturnTrueWhenNumberIsPrime() {
        boolean result = FunctionalInterfaces.IS_PRIME.test(7);

        assertTrue(result, "Expected 7 to be prime");
    }

    @Test
    void shouldExecuteConsumer() {
        FunctionalInterfaces.PRINT_NUMBERS.accept(3);
    }

    @Test
    void shouldReturnValidDayOfWeek() {
        String day = FunctionalInterfaces.RANDOM_DAY.get();

        assertTrue(
                day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday") ||
                        day.equals("Saturday") || day.equals("Sunday"),
                "Expected valid day of the week but got: " + day
        );
    }

    @Test
    void shouldRoundDoubleToNearestLong() {
        long result = FunctionalInterfaces.ROUND_DOUBLE.apply(4.6);

        assertEquals(5L, result, "Expected 4.6 to round to 5");
    }

    @Test
    void shouldReturnCorrectFibonacciNumber() {
        int result = FunctionalInterfaces.FIBONACCI.apply(8);

        assertEquals(21, result, "Expected Fibonacci(8) to be 21");
    }
}