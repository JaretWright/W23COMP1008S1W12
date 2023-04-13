package com.example.w23comp1008s1w12;

import java.util.ArrayList;

public class InterfaceExample {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(20);
        Rectangle rectangle1 = new Rectangle(10,20);
        Rectangle rectangle2 = new Rectangle(20,20);

        ArrayList<TwoDimensionalShape> shapes = new ArrayList<>();
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(rectangle1);

        for (TwoDimensionalShape shape : shapes)
            System.out.println("Area = " + shape.getArea());
    }
}
