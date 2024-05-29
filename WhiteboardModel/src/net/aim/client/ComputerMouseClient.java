package net.aim.client;

import net.aim.ComputerMouse;
import net.aim.Dpi;
import net.aim.Manufacturer;
import net.aim.Size;

class ComputerMouseClient {
    public static void main(String[] args) {
        ComputerMouse computerMouse1 = new ComputerMouse();
        computerMouse1.setManufacturer(Manufacturer.FINALMOUSE);
        computerMouse1.setWeight(39);
        computerMouse1.setSize(Size.MEDIUM);
        computerMouse1.setBatteryPercentage(95);
        System.out.println(computerMouse1);
        computerMouse1.charge();
        System.out.println(computerMouse1);
        computerMouse1.turnOn();
        computerMouse1.turnOff();
        computerMouse1.measure();
        computerMouse1.charge();
        ComputerMouse computerMouse2 = new ComputerMouse(Manufacturer.RAZER, 50, Size.MEDIUM, Dpi.DPI_800, 96);
        System.out.println(computerMouse2);
    }
}
