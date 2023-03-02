package online.collection.map_interface;

import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Student, Double> treeMap = new TreeMap<>();
        Student student1 = new Student("Roman", "Efremov", 3);
        Student student2 = new Student("Mariya", "Ivanova", 1);
        Student student3 = new Student("Alexey", "Petrov", 4);
        Student student4 = new Student("Alex", "Sisun", 5);
        Student student5 = new Student("Viktor", "Terentev", 2);
        Student student6 = new Student("Konstantin", "Maximenko", 0);
        Student student7 = new Student("Sergey", "Gusev", 1);
        treeMap.put(student6, 8.2);
        treeMap.put(student2, 6.4);
        treeMap.put(student5, 7.9);
        treeMap.put(student7, 9.1);
        treeMap.put(student3, 7.2);
        treeMap.put(student1, 5.8);
        treeMap.put(student4, 7.5);
        System.out.println(treeMap.descendingMap());
    }
}
