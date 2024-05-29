package net.aim.client;

import net.aim.ComputerMouse;
import net.aim.Dpi;
import net.aim.Manufacturer;
import net.aim.Size;

import java.util.Arrays;

class ComputerMouseClientArgs {
    public static void main(String[] args) {
        if (args.length < 5) {
            String usage =
                    "Usage: java ComputerMouseClientArgs <manufacturer> <weight> <size> <dpi> <batteryPercentage> " +
                            "Example: java ComputerMouseClientArgs Logitech 35 SMALL DPI_400 50 \n" +
                            "Notes:\n" +
                            "1. Available manufacturers are " + Arrays.toString(Manufacturer.values()) + "\n" +
                            "2. Weight must be between " + ComputerMouse.MIN_WEIGHT + " and " + ComputerMouse.MAX_WEIGHT + " (inclusive) \n" +
                            "3. Valid sizes are " + Arrays.toString(Size.values()) + "\n" +
                            "4. Valid dpi choices are " + Arrays.toString(Dpi.values()) + "\n" +
                            "5. Battery percentage must be between " + ComputerMouse.MIN_BATTERY + " and " + ComputerMouse.MAX_BATTERY + " (inclusive) \n";
            System.out.println(usage);
            return;
        }

        Manufacturer manufacturer = Manufacturer.valueOf(args[0].toUpperCase());
        int weight = Integer.parseInt(args[1]);
        Size size = Size.valueOf(args[2].toUpperCase());
        Dpi dpi = Dpi.valueOf(args[3].toUpperCase());
        int batteryPercentage = Integer.parseInt(args[4]);
        ComputerMouse computerMouse = new ComputerMouse(manufacturer, weight, size, dpi, batteryPercentage);


        System.out.println(computerMouse);


    }
}