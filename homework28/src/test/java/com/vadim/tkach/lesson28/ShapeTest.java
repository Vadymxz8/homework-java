package com.vadim.tkach.lesson28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ShapeTest {
    @Test
    void circleCalculateArea() {
        Circle circle = new Circle(5);

        double calculateArea = circle.calculateArea();

        assertEquals(78.53981633974483, calculateArea);
    }

    @Test
    void circlePerimeter() {

        Circle circle = new Circle(5);

        double perimeter = circle.calculatePerimeter();

        assertEquals(31.41592653589793, perimeter);


        }
@Test
void squareCalculateArea() {
    Square square = new Square(5);

    double calculateArea = square.calculateArea();

    assertEquals(25.0,calculateArea);
}

    @Test
    void squarePerimeter() {

        Square square = new Square(5);

        double perimeter = square.calculatePerimeter();

        assertEquals(20.0, perimeter);
    }

    @Test
    void rectangleCalculateArea() {
        Rectangle rectangle = new Rectangle(5,4);

        double calculateArea = rectangle.calculateArea();

        assertEquals(20.0,calculateArea);
    }

    @Test
    void rectanglePerimeter() {

        Rectangle rectangle = new Rectangle(5,4);

        double perimeter = rectangle.calculatePerimeter();

        assertEquals(18.0, perimeter);
    }
    }
