package ru.ers.lesson.levelUp.homeWork.lesson6;

import java.io.Serializable;

public class General <T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T arg1;
    private V arg2;
    private K arg3;

    public General(T arg1, V arg2, K arg3) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    public T getArg1() {
        return arg1;
    }

    public V getArg2() {
        return arg2;
    }

    public K getArg3() {
        return arg3;
    }

    public void showInfo() {
        System.out.println("Type T: " + arg1.getClass().getName());
        System.out.println("Type V: " + arg2.getClass().getName());
        System.out.println("Type K: " + arg3.getClass().getName());
    }

    @Override
    public String toString() {
        return "General{" +
                "arg1=" + arg1 +
                ", arg2=" + arg2 +
                ", arg3=" + arg3 +
                '}';
    }
}
