package edu.geometry;

public class Triangle extends Shape{
    private final double sideA;
    private final double sideB;
    private final double angle;

    public Triangle(double sideA, double sideB, double angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getAngle() {
        return angle;
    }

    @Override
    public double getArea() {
        return (getSideA() * getSideB()) /2 * Math.sin(Math.toRadians(getAngle()));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}