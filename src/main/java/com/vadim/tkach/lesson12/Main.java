package com.vadim.tkach.lesson12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter your array elements");
        for (int i=0; i<n; i++){

            array[i] = scanner.nextInt();
        }


        while(true) {
            System.out.println("menu");
            System.out.println("1 - count sum of elements");
            System.out.println("2 - show all paired elements");
            System.out.println("3 - find the biggest element");
            System.out.println("4 - Exit");
            System.out.println("Make your choice");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int sum = 0;
                    for (int num : array){
                        sum += num;
                    }

                    System.out.println("sum of elements" + sum);
                    break;
                case 2:
                    System.out.println("paired elements: ");
                    for (int num : array){
                        if (num % 2 == 0) {
                            System.out.println(num + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 3: int max = array[0];
                    for(int num : array){
                        if (num<max){
                            max = num;
                        }
                    }
                    System.out.println("biggest element: " + max);
                    break;
                case 4:
                    System.out.println("Game Over");
                    scanner.close();
                    return;
                default:
                    System.out.println("undefined, try one more time");
            }
        }
    }
}
