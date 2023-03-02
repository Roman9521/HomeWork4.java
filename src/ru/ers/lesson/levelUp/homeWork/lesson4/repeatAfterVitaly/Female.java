package ru.ers.lesson.levelUp.homeWork.lesson4.repeatAfterVitaly;

public class Female extends Human {
    public Female(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() {
        System.out.println("Девушка с именем " + getName() + " имеет возраст " + getAge());
    }
}
