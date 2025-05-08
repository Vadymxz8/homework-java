package com.vadim.tkach.lesson37;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {
    @Test
    void shouldCountSumOfNumbers()  {
//      given
        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
//      when
        double sum = NumberUtils.getsum(numbers);
//      then
        assertEquals(10.0,sum);
    }
    @Test
    void shouldMultiplyOddNumbersBy2()  {
//      given
        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
//      when
        List<Long> multipliedresult = NumberUtils.sumOddNumbers(numbers);
//      then
        assertEquals(List.of(2L,6L),multipliedresult);
    }
}
