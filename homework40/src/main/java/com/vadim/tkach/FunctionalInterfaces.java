package com.vadim.tkach;

import java.util.function.*;

public interface FunctionalInterfaces {
    Predicate<Integer> IS_PRIME = number -> {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    };

    Consumer<Integer> PRINT_NUMBERS = limit -> {
        for (int i = 0; i <= limit; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    };

    Supplier<String> RANDOM_DAY = () -> {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return days[(int) (Math.random() * days.length)];
    };

    Function<Double, Long> ROUND_DOUBLE = num -> Math.round(num);

    UnaryOperator<Integer> FIBONACCI = n -> {
        if (n <= 1) return n;
        int a = 0, b = 1, temp;
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    };

}
