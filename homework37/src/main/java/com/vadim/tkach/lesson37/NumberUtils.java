package com.vadim.tkach.lesson37;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public static int getsum(List<Number> numbers) {
        int sum = 0;
        for (Number number : numbers) {
                sum += number.intValue();
        }
        return sum;
    }
    public static List<Integer> sumOddNumbers(List<Number> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Number number : numbers) {
            int value = number.intValue();
            if (value % 2 != 0) {
              result.add(value * 2);
            }
        }
        return result;
    }
}
