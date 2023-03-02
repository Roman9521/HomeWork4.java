package ru.ers.lesson.levelUp.homeWork.lesson6;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    @Override
    public void sayHello() {
        System.out.println("I am an object of class Dog and I say \"Hello\"");
    }
}
