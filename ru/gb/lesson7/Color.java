package ru.gb.lesson7;

public enum Color {

    // public static Color RED = new Color("[31m");
    // public static Color GREEN = new Color("[31m");
    // public static Color BLUE = new Color("[31m");

    GREEN("\u001B[32m"),
    RED("\u001B[31m"),
    BLUE("\u001B[34m");

//    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_BLACK = "\u001B[30m";
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
//    public static final String ANSI_YELLOW = "\u001B[33m";
//    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String ANSI_PURPLE = "\u001B[35m";
//    public static final String ANSI_CYAN = "\u001B[36m";
//    public static final String ANSI_WHITE = "\u001B[37m";
//

    private final String code;

    Color(String code) {
        this.code = code;
    }

    public String coloredText(String text) {
        return code + text + "\u001B[0m";
    }

}
