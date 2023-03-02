package ru.ers.lesson.levelUp.homeWork.lesson4;

public class HomeWork4 {
    public static void main(String[] args) {
        Calculator <Integer> calculator = new Calculator<>(4, 5);

    }

}

class Calculator <T> {
    T number1, number2;
    public Calculator (T number1, T number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

//    public void <T> addition() {
//        if (number1  Double) {
//
//        }
//    }
}