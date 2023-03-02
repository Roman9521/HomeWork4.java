package ru.ers.lesson.levelUp.homeWork.lesson5.task1;

public final class Truck extends Automobile{
    public static double distanceOnOneTank = 1200;

    public Truck(double distance) {
        super(distance);
    }

    @Override
    public int numberOfGasStations() {
        return (int) (Math.ceil(getDistance() / distanceOnOneTank));
    }
}
