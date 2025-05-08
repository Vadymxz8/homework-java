package com.vadim.tkach.lesson37;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        double sum = NumberUtils.getsum(numbers);
        System.out.println(numbers);
        System.out.println("sum of numbers: " + sum);

        List<Long> multipliedresult = NumberUtils.sumOddNumbers(numbers);
        System.out.println("Multiplied odd numbers: " + multipliedresult);




    }
}