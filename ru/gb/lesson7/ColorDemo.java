package ru.gb.lesson7;

public class ColorDemo {

    public static void main(String[] args) {
        System.out.println(Color.GREEN.coloredText("this is green text"));
        System.out.println("this is simple text");
        System.out.println(Color.RED.coloredText("this is red text"));

        Color red = Color.valueOf("RED");
        System.out.println(Color.GREEN.ordinal());
        System.out.println(Color.RED.ordinal());
        System.out.println(Color.BLUE.ordinal());
        System.out.println(red == Color.RED);
    }

}
