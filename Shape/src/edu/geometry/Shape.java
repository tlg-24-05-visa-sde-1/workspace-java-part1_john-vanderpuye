package edu.geometry;

public abstract class Shape {

    public Shape(){
    }
    public abstract double getArea();

    @Override
    public String toString() {
        return getClass().getSimpleName()+ " : area= " + getArea();
    }
}