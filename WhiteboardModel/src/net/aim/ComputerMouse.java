package net.aim;

public class ComputerMouse {
    public static final int MIN_WEIGHT = 25;
    public static final int MAX_WEIGHT = 100;
    public static final int MIN_BATTERY = 0;
    public static final int MAX_BATTERY = 100;
    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    // properties or fields
    private Manufacturer manufacturer;
    private int weight;
    private Size size = Size.MEDIUM;
    private Dpi dpi = Dpi.DPI_400;
    private int batteryPercentage;

    public ComputerMouse() {
        instanceCount++;
    }

    public ComputerMouse(Manufacturer manufacturer) {
        this();
        setManufacturer(manufacturer);
    }

    public ComputerMouse(Manufacturer manufacturer, int weight) {
        this(manufacturer);
        setWeight(weight);
    }

    public ComputerMouse(Manufacturer manufacturer, int weight, Size size, Dpi dpi, int batteryPercentage) {
        this(manufacturer, weight);
        setSize(size);
        setDpi(dpi);
        setBatteryPercentage(batteryPercentage);
    }

    // functions or methods
    public void turnOn() {
        System.out.println("Turning on " + manufacturer + " " + ".");
    }

    public void turnOff() {
        System.out.println("Turning off " + manufacturer + " " + ".");
    }

    public void charge() {
        System.out.println("Charging " + manufacturer + " " + ".");
        while (batteryPercentage < 100) {
            batteryPercentage++;
            System.out.println("Battery percentage: " + batteryPercentage);
        }
        System.out.println("Charging complete.");
    }

    public void measure() {
        System.out.println("Measuring " + manufacturer + " " + ". It weighs " + weight + "g. It is a " + size + " sized mouse.");
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= MIN_WEIGHT && weight <= MAX_WEIGHT) {
            this.weight = weight;
        } else {
            System.out.printf("Invalid weight: %s. Weight must be between %s and %s.\n", weight, MIN_WEIGHT, MAX_WEIGHT);
        }
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Dpi getDpi() {
        return dpi;
    }

    public void setDpi(Dpi dpi) {
        this.dpi = dpi;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        if (batteryPercentage >= MIN_BATTERY && batteryPercentage <= MAX_WEIGHT) {
            this.batteryPercentage = batteryPercentage;
        } else {
            System.out.printf("Invalid batteryPercentage: %s. batteryPercentage must be between %s and %s.\n", batteryPercentage, MIN_BATTERY, MAX_BATTERY);
        }
    }

    public String toString() {
        return String.format("Mouse: manufacturer=%s, weight=%s, size=%s, dpi=%s, batteryPercentage=%s\n",
                getManufacturer(), getWeight(), getSize(), getDpi(), getBatteryPercentage());
    }
}
