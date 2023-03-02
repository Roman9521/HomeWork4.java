package ru.ers.lesson.levelUp.homeWork.lesson5.task1;

public abstract class Automobile {
    private double distance;

    public Automobile(double distance) {
         this.distance = distance;
    }

    public abstract int numberOfGasStations();

    public double getDistance() {
        return distance;
    }
}
