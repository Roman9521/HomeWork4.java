package ru.ers.lesson.levelUp.homeWork.lesson5.task1;

public class Test {
    public static void main(String[] args) {
        Automobile auto1 = new Car((int) (Math.random() * 2001));
        Automobile auto2 = new Truck((int) (Math.random() * 2001));
        Automobile auto3 = new Car((int) (Math.random() * 2001));
        Automobile auto4 = new Truck((int) (Math.random() * 2001));
        Automobile auto5 = new Car((int) (Math.random() * 2001));
        Automobile auto6 = new Truck((int) (Math.random() * 2001));
        Automobile auto7 = new Car((int) (Math.random() * 2001));
        Automobile auto8 = new Truck((int) (Math.random() * 2001));
        Automobile auto9 = new Car((int) (Math.random() * 2001));
        Automobile auto10 = new Truck((int) (Math.random() * 2001));

        for (Automobile auto : new Automobile[]  {auto1, auto2, auto3, auto4, auto5,
                auto6, auto7, auto8, auto9, auto10}) {
            System.out.println("Для того, чтобы проехать случайный киллометраж автомобилю" +
                    " необхидимо: " + auto.numberOfGasStations() + " раза заправиться. \n");
        }
    }
}
