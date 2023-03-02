package ru.ers.lesson.levelUp.homeWork.lesson4.pets;

public class Pet {
    private String name;
    private int age;
    private int desireToEat;   // 0 - очень голодный 10 - больше не сможет съесть

    public Pet(){
        this.name = "Some pets";
        this.age = 5;
        this.desireToEat = 0;
    }

    public Pet(String name) {
        this.name = name;
        this.age = 5;   // будет значение возраста по умолчанию = 5
        this.desireToEat = 0;   // будет значение голода по умолчанию = 0
    }
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
        this.desireToEat = 0;
    }

    public Pet(String name, int age, int desireToEat){
        this.name = name;
        this.age = age;
        if (desireToEat >= 0 && desireToEat < 11) {
            this.desireToEat = desireToEat;
        } else {
            this.desireToEat = 0;
        }
    }

    public void info() {
//        System.out.println("I'm a " + getType());
    }

    public void makeNoise() {
        System.out.println("Pet making noise");
    }
    public void eat() {
        System.out.println("Pet eats");
    }
    public void sleep() {
        System.out.println("Pet sleeping");
    }
    public void feed(int n) {
        if (getDesireToEat()+n <= 10) {
            setDesireToEat(getDesireToEat() + n);
        } else {
            int maxFood = 10 - getDesireToEat();
            setDesireToEat(10);
            System.out.println("Lots of food, the " + name + " will eat the maximum " + maxFood);
        }
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDesireToEat() {
        return desireToEat;
    }

    public void setDesireToEat(int desireToEat) {
        this.desireToEat = desireToEat;
    }
}
