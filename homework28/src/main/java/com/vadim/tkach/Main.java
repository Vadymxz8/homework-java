package com.vadim.tkach;

//import com.vadim.tkach.lesson28.Rectangle;
import com.vadim.tkach.lesson28.Shape;
import com.vadim.tkach.lesson28.Square;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(5);
       System.out.println("Area of Square: " + square.calculateArea());

        System.out.println("Perimeter: " + square.calculatePerimeter());

        System.out.println("____________________________");

        square.displayInfo();
//        circle.displayInfo();
//        System.out.println();
//        Rectangle.displayInfo();
//        System.out.println();
//        square.displayInfo();
    }

}