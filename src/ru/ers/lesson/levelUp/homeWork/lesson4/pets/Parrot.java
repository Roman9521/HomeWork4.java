package ru.ers.lesson.levelUp.homeWork.lesson4.pets;

public class Parrot extends Pet {
    private String name;
    private int age;
    private int desireToEat;   // 0 - очень голодный 10 - больше не сможет съесть
    private String type = "Parrot";
    public Parrot(){
        this.name = "Some parrot";
        this.age = 5;
        this.desireToEat = 0;
    }

    public Parrot(String name) {
        this.name = name;
        this.age = 5;   // будет значение возраста по умолчанию = 5
        this.desireToEat = 0;   // будет значение голода по умолчанию = 0
    }
    public Parrot(String name, int age) {
        this.name = name;
        this.age = age;
        this.desireToEat = 0;
    }

    public Parrot(String name, int age, int desireToEat){
        this.name = name;
        this.age = age;
        if (desireToEat >= 0 && desireToEat < 11) {
            this.desireToEat = desireToEat;
        } else {
            this.desireToEat = 0;
        }
    }


    public void makeNoise() {
        System.out.println("Chick chirp .... Chick chirp .... chick chirp");
    }
    public void eat() {
        System.out.println("Parrot is eating");
    }
    public void sleep() {
        System.out.println("Parrot is sleeping");
    }
    public void fly() {
        System.out.println("Parrot flying");
    }
    public void info() {
        System.out.println("I'm a " + getType());
    }


    public String getName() { return name; }
    public String getType() { return type; }
    public int getAge() { return age; }
    public int getDesireToEat() { return desireToEat; }
    public void setDesireToEat(int desireToEat) {
        this.desireToEat = desireToEat;
    }
}
