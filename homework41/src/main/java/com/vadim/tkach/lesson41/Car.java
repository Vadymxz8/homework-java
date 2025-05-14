package com.vadim.tkach.lesson41;

import java.util.Comparator;

public class Car implements Comparable<Car> {

    public static final Comparator<Car> ENGINE_CAPACITY_COMPARATOR =
            Comparator.comparingDouble(Car::getEngineCapacity);

    private final int yearOfManufacture;
    private final double engineCapacity;

    public Car(int yearOfManufacture, double engineCapacity) {
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public int compareTo(Car otherCar) {
        int x = getYearOfManufacture();
        int y = otherCar.yearOfManufacture;
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

    @Override
    public String toString() {
        return getYearOfManufacture() + "-" + getEngineCapacity();
    }
}
