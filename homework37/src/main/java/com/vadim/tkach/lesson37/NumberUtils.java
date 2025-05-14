package com.vadim.tkach.lesson37;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public static double getsum(List<Number> numbers) {
        int sum = 0;
        for (Number number : numbers) {
                sum += number.doubleValue();
        }
        return sum;
    }
    public static List<Long> sumOddNumbers(List<Number> numbers) {
        List<Long> result = new ArrayList<>();
        for (Number number : numbers) {
            long value = number.longValue();
            if (value % 2 != 0) {
              result.add(value * 2);
            }
        }
        return result;
    }
}
