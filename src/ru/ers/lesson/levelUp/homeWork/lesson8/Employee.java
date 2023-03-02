package ru.ers.lesson.levelUp.homeWork.lesson8;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Employee {
    private String fullName;
    private long personnelNumber;
    private double workAge;

    public Employee(String fullName, long personnelNumber, double workAge) {
        this.fullName = fullName;
        this.personnelNumber = personnelNumber;
        this.workAge = workAge;
    }

    public String getFullName() {
        return fullName;
    }

    public long getPersonnelNumber() {
        return personnelNumber;
    }

    public double getWorkAge() {
        return workAge;
    }

    public static void printName(List<Employee> employees, double workAge) {
        Iterator<Employee> iter = employees.iterator();
        while (iter.hasNext()) {
            Employee employee = iter.next();
            if (employee.getWorkAge() <= workAge) {
                System.out.println("The name of the employee with less seniority: " + employee.getFullName() +
                        ", personnel number: " + employee.getPersonnelNumber());
            }
        }
    }
    public static List<Employee> deleteEmployee(List<Employee> employees) {
        ListIterator<Employee> listEmployee = employees.listIterator(employees.size());
        while (listEmployee.hasPrevious()) {
            int temp = listEmployee.previousIndex();
            Employee employee = listEmployee.previous();
            if (temp % 2 == 1) {
                System.out.println("I remove the employee with the name: " + employee.getFullName());
                listEmployee.remove();
            }
        }
        return employees;
    }
}
