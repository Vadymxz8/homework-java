package com.vadim.tkach.lesson28;

class Rectangle extends Shape{
    private double width;
    private double height;
public Rectangle(double width, double height){
this.width = width;
this.height = height;
}

    @Override
    public double calculateArea() {
        return width * height;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Width: " + width + ", Height: " + height);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
