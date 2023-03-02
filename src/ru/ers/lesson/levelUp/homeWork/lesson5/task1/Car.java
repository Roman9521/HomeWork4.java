package ru.ers.lesson.levelUp.homeWork.lesson5.task1;

public final class Car extends Automobile{
    public static double distanceOnOneTank = 600;

    public Car(double distance) {
        super(distance);
    }

    @Override
    public int numberOfGasStations() {
        return (int) (Math.ceil(getDistance() / distanceOnOneTank));
    }

}
