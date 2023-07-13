package ru.gb.lesson2.intro;

public abstract class MyAbstractClass1 {

    private String myStringField;

    public MyAbstractClass1(String myStringField) {
        this.myStringField = myStringField;
    }

    protected MyAbstractClass1() {
        this("default");
    }

    protected abstract void foo();

}
