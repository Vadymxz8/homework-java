package com.vadim.tkach.lesson41;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> carFactory = new ArrayList<>();

        Car car1 = new Car(2020, 2.0);
        Car car2 = new Car(2015, 1.6);
        Car car3 = new Car(2006, 1.9);
        Car car4 = new Car(2023, 3.0);
        Car car5 = new Car(2024, 3.5);
        carFactory.add(car1);
        carFactory.add(car2);
        carFactory.add(car3);
        carFactory.add(car4);
        carFactory.add(car5);
        System.out.println("Before :" + carFactory);
        Collections.sort(carFactory);
        System.out.println("After ;" + carFactory);
        Set<Car> sortedByEngine = new TreeSet<>(Car.ENGINE_CAPACITY_COMPARATOR);

        sortedByEngine.add(car1);
        sortedByEngine.add(car2);
        sortedByEngine.add(car3);
        sortedByEngine.add(car4);
        sortedByEngine.add(car5);

        System.out.println("Sorted by engine capacity: " + sortedByEngine);
    }
}