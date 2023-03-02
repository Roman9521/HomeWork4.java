package ru.ers.lesson.levelUp.homeWork.lesson7;

public class TestRunner {
    public static void main(String[] args) {
        Automobile[] automobile = AutomobileGenerator.generate();
        for (Automobile auto : automobile) {
            try {
                if (auto.getWeight() > 8 || auto.getWidth() > 2.5 || auto.getHeight() > 4) {
                    throw new DimensionException();
                } else if (auto.getSpeed() > 100) {
                    throw new SpeedException1();
                } else if (auto.getSpeed() > 80) {
                    throw new SpeedException2();
                }
                System.out.println("The car passed");
            }
            catch (DimensionException e) {
                System.out.println("DimensionException: " + e + " number auto: " + auto.getCarNumber() +
                        "type auto: " + auto.getClass().getName());
            }
            catch (SpeedException1 e) {
                System.out.println("SpeedException: " + e + ", the police catch the car: " +
                        auto.getCarNumber());
            }
            catch (SpeedException2 e) {
                System.out.println("SpeedException: " + e);
            }

        }
    }
}
