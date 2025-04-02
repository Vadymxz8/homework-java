package com.vadim.tkach.lesson28;

public abstract class Shape {

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

public void displayInfo() {
    System.out.println("Shape: " + this.getClass().getSimpleName());
}



    }

