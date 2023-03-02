package ru.ers.lesson.levelUp.homeWork.lesson7;

import java.util.Random;

public class AutomobileGenerator {
    public static Automobile[] generate() {
        Random random = new Random();
        return new Automobile[]{
                new Car("К245СТ178",
                        random.nextDouble(65) + 55,
                        random.nextDouble(6) + 4,
                        random.nextDouble(1.8) + 1.5,
                        random.nextDouble(4) + 2,
                        random.nextDouble(20) + 1),
                new Car("К543СТ177",
                        random.nextDouble(65) + 55,
                        random.nextDouble(6) + 4,
                        random.nextDouble(1.8) + 1.5,
                        random.nextDouble(4) + 2,
                        random.nextDouble(20) + 1),
                new Car("К546СТ199",
                        random.nextDouble(65) + 55,
                        random.nextDouble(6) + 4,
                        random.nextDouble(1.8) + 1.5,
                        random.nextDouble(4) + 2,
                        random.nextDouble(20) + 1),
                new Car("К786СТ78",
                        random.nextDouble(65) + 55,
                        random.nextDouble(6) + 4,
                        random.nextDouble(1.8) + 1.5,
                        random.nextDouble(4) + 2,
                        random.nextDouble(20) + 1),
                new Car("К354СТ777",
                        random.nextDouble(65) + 55,
                        random.nextDouble(6) + 4,
                        random.nextDouble(1.8) + 1.5,
                        random.nextDouble(4) + 2,
                        random.nextDouble(20) + 1),
                new Truck("К166СТ77",
                        random.nextDouble(65) + 55,
                        random.nextDouble(6) + 4,
                        random.nextDouble(1.8) + 1.5,
                        random.nextDouble(4) + 2,
                        random.nextDouble(20) + 1),
                new Truck("К763СТ20",
                        random.nextDouble(65) + 55,
                        random.nextDouble(6) + 4,
                        random.nextDouble(1.8) + 1.5,
                        random.nextDouble(4) + 2,
                        random.nextDouble(20) + 1),
                new Truck("К798СТ99",
                        random.nextDouble(65) + 55,
                        random.nextDouble(6) + 4,
                        random.nextDouble(1.8) + 1.5,
                        random.nextDouble(4) + 2,
                        random.nextDouble(20) + 1),
                new Car("N546HD777", 70, 6, 2, 3, 4)
        };
    }

}
