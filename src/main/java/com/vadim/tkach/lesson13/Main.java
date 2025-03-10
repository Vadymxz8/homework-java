package com.vadim.tkach;

import com.vadim.tkach.Reptiles.Dragon;

public class Main {
    public static void main(String[] args) {

        Dragon dragon1 = new Dragon();
        dragon1.setName("Smaug");
        dragon1.setAge(200);
        dragon1.setWeight(1300.9);
        dragon1.setColor("Grey");

        System.out.println(dragon1.getName());
        System.out.println(dragon1.getAge());
        System.out.println(dragon1.getWeight());
        System.out.println(dragon1.getColor());

        System.out.println("-----------");

        // Створення об'єкта з параметрами (правильний синтаксис)
        Dragon dragon2 = new Dragon("Balerion", 347, 1535.5, "Black");

        System.out.println(dragon2.getName());
        System.out.println(dragon2.getAge());
        System.out.println(dragon2.getWeight());
        System.out.println(dragon2.getColor());
    }
}