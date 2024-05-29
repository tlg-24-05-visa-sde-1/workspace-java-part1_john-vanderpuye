package com.entertainment;

import java.util.Arrays;

/*
 * Application class to model the workings of a television set.
 * NO main() method here.
 */
public class Television {
    // class ("static") variables - one copy, stored in the class-wide common shared area
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;

    // properties or attributes - called "instance variables" or "fields"
    public static int getInstanceCount() {
        return instanceCount;
    }

    public static final String[] VALID_BRANDS =
            {"Samsung", "LG", "Sony", "Toshiba"};

    private static boolean isValidBrand(String brand) {
        boolean isValid = false;
        for (String validBrand : VALID_BRANDS) {
            if (brand.equals(validBrand)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }


    private String brand;
    private int volume;
    private boolean isMuted;
    private int oldVolume;
    private DisplayType display = DisplayType.LED;

    // Television HAS-A Tuner (for all tasks related to channel-changing)
    private final Tuner tuner = new Tuner(); // instantiated internally, not exposed

    public Television() {
        instanceCount++; // instanceCount = instanceCount + 1
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    public void changeChannel(String channel) {
        tuner.setChannel(channel); // delegate to tuner object for the actual work
    }

    public String getCurrentChannel(){
        return tuner.getChannel(); // delegate to tuner object for the actual work
    }

    // functions or behaviors -called "methods" in java
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + brand + " television to volume " + volume);
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    public void mute() {
        if (!isMuted) {
            oldVolume = getVolume();
            setVolume(0); // Calling the setter means that it automatically unmutes (i.e. isMuted is set to false)
            isMuted = true; // If no setter present, directly set the field (i.e. isMuted = true)
        } else {
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        if (isValidBrand(brand)) {
            this.brand = brand;
        } else {
            System.out.printf("The given brand: %s ,is not a valid brand. Please use %s.\n", brand, Arrays.toString(VALID_BRANDS));
        }

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;
        } else {
            System.out.printf("Invalid volume: %s. Must be between %s and %s.\n", volume, MIN_VOLUME, MAX_VOLUME);
//            System.out.println("Volume: " + volume + " is out of range. Volume must be between "
//                    + MIN_VOLUME + " and " + MAX_VOLUME);

        }
    }

    public boolean isMuted() {
        return isMuted;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return String.format("Television: brand=%s, volume=%s, display=%s, currentChannel=%s\n", getBrand(), volumeString, getDisplay(), getCurrentChannel());
//        return "Television: brand=" + getBrand() + ", volume=" + volumeString + ", display= " + getDisplay();
    }
}