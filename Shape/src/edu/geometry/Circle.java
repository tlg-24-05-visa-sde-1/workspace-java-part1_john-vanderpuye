package edu.geometry;

public class Circle extends Shape{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * (getRadius() * getRadius());
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}