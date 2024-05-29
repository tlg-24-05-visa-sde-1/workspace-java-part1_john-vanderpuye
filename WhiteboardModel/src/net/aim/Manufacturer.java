package net.aim;

public enum Manufacturer {
    FINALMOUSE("Finalmouse"),
    RAZER("Razer"),
    LOGITECH("Logitech"),
    ZOWIE("Zowie");

    private final String type;

    Manufacturer(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return String.valueOf(getType());
    }
}