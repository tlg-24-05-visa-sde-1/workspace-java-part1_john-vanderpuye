package net.aim;

public enum Dpi {
    DPI_400(400),
    DPI_800(800),
    DPI_1600(1600),
    DPI_3200(3200),
    DPI_6400(6400);

    private final int show;

    Dpi(int show) {
        this.show = show;
    }

    public int getShow() {
        return show;
    }

    public String toString() {
        return String.valueOf(getShow());
    }
}