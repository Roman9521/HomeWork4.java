package ru.ers.lesson.levelUp.homeWork.lesson7;

public abstract class Automobile {
    private String carNumber;
    private double speed;
    private double weight;
    private double width;
    private double height;
    private double length;

    public Automobile(String carNumber, double speed, double weight, double width, double height, double length) {
        this.carNumber = carNumber;
        this.speed = speed;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public double getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "carNumber='" + carNumber + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
