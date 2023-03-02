package ru.ers.lesson.levelUp.homeWork.lesson4.pets;

public class Dog extends Pet {
    private String name;
    private int age;
    private int desireToEat;   // 0 - очень голодный 10 - больше не сможет съесть
    private String type = "Dog";

    public Dog(){
        this.name = "Some dog";
        this.age = 5;
        this.desireToEat = 0;
    }

    public Dog(String name) {
        this.name = name;
        this.age = 5;   // будет значение возраста по умолчанию = 5
        this.desireToEat = 0;   // будет значение голода по умолчанию = 0
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.desireToEat = 0;
    }

    public Dog(String name, int age, int desireToEat){
        this.name = name;
        this.age = age;
        if (desireToEat >= 0 && desireToEat < 11) {
            this.desireToEat = desireToEat;
        } else {
            this.desireToEat = 0;
        }
    }

    public void info() {
        System.out.println("I'm a " + type);
    }
    public void makeNoise() {
        System.out.println("Dog making noise");
    }
    public void eat() {
        System.out.println("Dog is eats");
    }
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
    public void bark() {
        System.out.println("Dog is barking");
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public int getAge() { return age; }
    public int getDesireToEat() { return desireToEat; }
    public void setDesireToEat(int desireToEat) {
        this.desireToEat = desireToEat;
    }
}
