package ru.gb.lesson2.render;

public class UiButton implements Hoverable {

    private int x;
    private int y;

    public UiButton(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void click() {
        // срабатывает при нажатии на кнопку
    }

    @Override
    public void makeHover() {

    }

    @Override
    public void unmakeHover() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
