package com.vadim.tkach.lesson28;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("This is a square.");
    }
}
