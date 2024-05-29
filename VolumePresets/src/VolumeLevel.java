enum VolumeLevel {
    OFF("Off"),
    SOFT("Soft"),
    MEDIUM("Medium"),
    LOUD("Loud"),
    MAX("Max");

    private final String value;

    VolumeLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return getValue();
    }
}