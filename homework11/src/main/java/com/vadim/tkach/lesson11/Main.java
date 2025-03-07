
package com.vadim.tkach.lesson11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new
                Scanner(System.in);
        System.out.println("Enter number (1-7)");
        int day = scanner.nextInt();
        String daysOfWeek = switch (day) {

            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Weekend";
            default -> "Unexpected";
        };
        System.out.println(daysOfWeek);
    }
}
