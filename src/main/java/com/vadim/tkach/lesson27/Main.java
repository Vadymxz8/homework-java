package com.vadim.tkach.lesson27;

import com.vadim.tkach.Reptiles.Dragon;
import com.vadim.tkach.lesson27.Reptiles.Type;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dragon dragon1 = new Dragon();
        dragon1.setName("Smaug");
        dragon1.setAge(200);
        dragon1.setWeight(1300.9);
        dragon1.setColor("Grey");


        System.out.println("-----------");

        // Створення об'єкта з параметрами (правильний синтаксис)
        Dragon dragon2 = new Dragon("Balerion", 347, 1535.5, "Black",Type.Dragon);
        Dragon dragon3 = new Dragon("Ancalagon", 347, 1535.5, "Black",Type.Dragon);


        System.out.println(dragon2.equals(dragon3));


        System.out.println("-----------");


    }
}