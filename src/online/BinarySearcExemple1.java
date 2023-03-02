//package online;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class BinarySearcExemple1 {
//    public static void main(String[] args) {
////        ArrayList<Integer> arrayList = new ArrayList();
////        arrayList.add(5);
////        arrayList.add(35);
////        arrayList.add(554);
////        arrayList.add(-2345);
////        arrayList.add(-45);
////        arrayList.add(264);
////        arrayList.add(-483);
////        arrayList.add(82);
////        arrayList.add(342);
////        arrayList.add(-3);
////        arrayList.add(-343);
////        arrayList.add(234);
////        arrayList.add(94);
////        arrayList.add(12);
////        arrayList.add(43);
////        Collections.sort(arrayList);
////        int index1 = Collections.binarySearch(arrayList, -343);
////        System.out.println(index1);
//
//        Employee employee1 = new Employee(100, "Roman", 12345);
//        Employee employee2 = new Employee(15, "Ivan", 12345);
//        Employee employee3 = new Employee(123, "Petr", 12345);
//        Employee employee4 = new Employee(15, "Mariya", 12345);
//        Employee employee5 = new Employee(182, "Kolya", 12345);
//        Employee employee6 = new Employee(15, "Sasha", 12345);
//        Employee employee7 = new Employee(250, "Elena", 12345);
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(employee1);
//        employeeList.add(employee2);
//        employeeList.add(employee3);
//        employeeList.add(employee4);
//        employeeList.add(employee5);
//        employeeList.add(employee6);
//        employeeList.add(employee7);
//        System.out.println(employeeList);
//        Collections.sort(employeeList);
//        System.out.println(employeeList9);
//    }
//}
//class Employee implements Comparable<Employee> {
//    int id;
//    String name;
//    int salary;
//
//    public Employee(int id, String name, int salary) {
//        this.id=id;
//        this.name = name;
//        this.salary = salary;
//    }
//    public String toString() {
//        return "Employee{" +
//                "is = " + id +
//                ", name = '" + name + '\'' +
//                '}';
//    }
//
//    @Override
//    public int compareTo(Employee anotherEmp) {
//        int result = this.id - anotherEmp.id;
//        if (result == 0) {
//            result = this.name.compareTo(anotherEmp.name);
//        }
//        return result;
//    }
//}
