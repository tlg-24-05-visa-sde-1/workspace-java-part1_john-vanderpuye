package net.flix;

public enum Genre {
    ROMANCE("Romance"),
    COMEDY("Comedy :)"),
    HORROR("Horror!!!"),
    ACTION("Action!"),
    SCI_FI("Sci-Fi"),
    DRAMA("Drama"),
    SPORTS("Sports"),
    WESTERN("Western - howdy partner!");
    // everything under here is regular class definition stuff, i.e., fields, ctors, methods

    private final String display;
    Genre(String display) {
//        System.out.println("Genre ctor called");
        this.display = display;
    }

    // we provide a getter only - no setter
    public String getDisplay() {
        return display;
    }

    public String toString() {
        return getDisplay();
    }
}