package org.example;

public class Home {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Home(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Home{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
