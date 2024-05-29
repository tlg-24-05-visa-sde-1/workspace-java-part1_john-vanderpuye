/*
* Application class to model the workings of a television set.
* NO main() method here.
 */
class Television {
    // class ("static") variables - one copy, stored in the class-wide common shared area
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;

    // properties or attributes - called "instance variables" or "fields"
    public static int getInstanceCount() {
        return instanceCount;
    }

    private String brand;
    private int volume;
    private boolean isMuted;
    private int oldVolume;
    private DisplayType display = DisplayType.LED;
    private VolumeLevel volumeLevel;

    public Television() {
        instanceCount++; // instanceCount = instanceCount + 1
    }

    public Television(String brand){
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume, VolumeLevel volumeLevel) {
        this(brand);
        setVolume(volume);
        setVolumeLevel(volumeLevel);
    }

    public Television(String brand, int volume, VolumeLevel volumeLevel, DisplayType display) {
        this(brand, volume, volumeLevel);
        setDisplay(display);
    }

    // functions or behaviors -called "methods" in java
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + brand + " television to volume " + volume);
    }

    public void turnOff(){
        System.out.println("Shutting down...goodbye");
    }

    public void mute(){
        if (!isMuted){
            oldVolume = getVolume();
            setVolume(0); // Calling the setter means that it automatically unmutes (i.e. isMuted is set to false)
            isMuted = true; // If no setter present, directly set the field (i.e. isMuted = true)
        }
        else{
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        switch (brand) {
            case "Samsung":
            case "Sony":
            case "LG":
            case "Toshiba":
                this.brand = brand;
                break;
            default:
                System.out.println("The given brand: " + brand + " ,is not a valid brand. Please use Samsung, Sony, LG or Toshiba.");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;
        }
        else{
            System.out.println("Volume: " + volume + " is out of range. Volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME);
        }
    }

    public VolumeLevel getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(VolumeLevel volumeLevel) {
        this.volumeLevel = volumeLevel;
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
        return "Television: brand=" + getBrand() + ", volume=" + volumeString + ", display= " + getDisplay() + " volume level= " + getVolumeLevel();
    }
}