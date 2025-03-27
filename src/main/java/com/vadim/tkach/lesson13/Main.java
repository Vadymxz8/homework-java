package com.vadim.tkach.lesson13;

import com.vadim.tkach.Reptiles.Dragon;
import com.vadim.tkach.lesson13.Reptiles.Type;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Dragon dragon1 = new Dragon();
        dragon1.setName("Smaug");
        dragon1.setAge(200);
        dragon1.setWeight(1300.9);
        dragon1.setColor("Grey");

        System.out.println(dragon1.getName());
        System.out.println(dragon1.getAge());
        System.out.println(dragon1.getWeight());
        System.out.println(dragon1.getColor());


        dragon1.doVoice();
        dragon1.doVoice("Dracarys");
        dragon1.doFire();


        System.out.println("-----------");

        // Створення об'єкта з параметрами (правильний синтаксис)
        Dragon dragon2 = new Dragon("Balerion", 347, 1535.5, "Black",Type.Dragon);

        System.out.println(dragon2.getName());
        System.out.println(dragon2.getAge());
        System.out.println(dragon2.getWeight());
        System.out.println(dragon2.getColor());

        dragon1.doVoice("Dracarys");
        dragon1.doFire();

        System.out.println("-----------");


        System.out.println("Lets make new dragon!");
        System.out.print("Enter dragon name: ");
        String name = scanner.nextLine();

        System.out.print("Enter dragon age: ");
        int age = scanner.nextInt();

        System.out.print("Enter dragon weight: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter dragon color: ");
        String color = scanner.nextLine();

        System.out.println("Enter the type of dragon");
        String typeString = scanner.next();
        Type type = Type.valueOf(typeString);

        Dragon userDragon = new Dragon(name, age, weight, color, type);

        System.out.println("You build new dragon:");
        System.out.println(userDragon);


        scanner.close();
    }
}