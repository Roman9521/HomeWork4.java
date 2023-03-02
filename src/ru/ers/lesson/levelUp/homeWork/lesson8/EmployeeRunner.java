package ru.ers.lesson.levelUp.homeWork.lesson8;

import java.util.List;
import java.util.Random;

public class EmployeeRunner {
    public static void main(String[] args) {
        List<Employee> generator = EmployeeGenerator.generator();
        Random random = new Random();
        Employee.printName(generator, random.nextDouble(50));
        System.out.println("----------------------------------------");
        List<Employee> deleteEmployee = Employee.deleteEmployee(generator);
    }
}
