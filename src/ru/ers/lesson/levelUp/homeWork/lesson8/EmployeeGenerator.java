package ru.ers.lesson.levelUp.homeWork.lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeGenerator {
    public static List<Employee> generator() {
        String[] arrayName = new String[] {"Irina", "Vladimir", "Roman", "Egor", "Artem", "Anastasia", "Victoria",
                "Elena", "Sergey", "Julia", "Marina", "Harry", "Jacob", "Charley", "Thomas", "George", "Oscar", "Sofia",
                "Katherina", "Alexandra", "Eva", "Elizaveta", "Diana"};
        Random random = new Random();
        List<Employee> list = new ArrayList<>(70);
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        list.add(new Employee(arrayName[random.nextInt(23)], random.nextLong(), random.nextInt(50)));
        return list;
    }
}
