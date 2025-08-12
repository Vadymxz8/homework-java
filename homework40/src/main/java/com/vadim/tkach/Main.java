package com.vadim.tkach;

public class Main {
    public static void main(String[] args) {

    System.out.println("Is 7 prime? " + FunctionalInterfaces.IS_PRIME.test(7));

        System.out.print("Numbers up to 5: ");
        FunctionalInterfaces.PRINT_NUMBERS.accept(5);

        System.out.println("Random day: " + FunctionalInterfaces.RANDOM_DAY.get());

        System.out.println("Round 4.6: " + FunctionalInterfaces.ROUND_DOUBLE.apply(4.6));

        System.out.println("Fibonacci(8): " + FunctionalInterfaces.FIBONACCI.apply(8));
}
}