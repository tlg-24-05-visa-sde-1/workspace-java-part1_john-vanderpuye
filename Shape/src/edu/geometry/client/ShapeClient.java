package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;


import java.awt.*;

class ShapeClient {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle (5),
                new Rectangle(5, 5),
                new Triangle(6,9,50)
        };
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}