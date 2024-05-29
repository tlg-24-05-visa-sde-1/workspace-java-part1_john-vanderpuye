package net.aim.test;

import net.aim.ComputerMouse;

class ComputerMouseValidationTest {
    public static void main(String[] args) {
        ComputerMouse c1 = new ComputerMouse();
        c1.setWeight(25);
        System.out.println(c1.getWeight());
        c1.setWeight(100);
        System.out.println(c1.getWeight());
        c1.setWeight(24);
        System.out.println(c1.getWeight());
        c1.setWeight(101);
        System.out.println(c1.getWeight());
        c1.setBatteryPercentage(0);
        System.out.println(c1.getBatteryPercentage());
        c1.setBatteryPercentage(100);
        System.out.println(c1.getBatteryPercentage());
        c1.setBatteryPercentage(-1);
        System.out.println(c1.getBatteryPercentage());
        c1.setBatteryPercentage(101);
        System.out.println(c1.getBatteryPercentage());
    }
}