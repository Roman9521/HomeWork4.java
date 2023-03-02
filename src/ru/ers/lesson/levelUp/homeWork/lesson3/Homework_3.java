package ru.ers.lesson.levelUp.homeWork.lesson3;

import java.util.Arrays;

public class Homework_3 {
    public static void main(String[] args) {
//        HelloWorld hello = new HelloWorld();
//        hello.speak();
        PrimeNumbers numbers = new PrimeNumbers();
        System.out.println(numbers.numberSearch(1000));
//        Sqrt sqrt = new Sqrt();
//        System.out.println(sqrt.searchSqrt());
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.sort();
    }

}
//class HelloWorld {
//    public void speak() {
//        System.out.println("Сколько раз вывести фразу \"Hello World\"?");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.close();
//        for (int i=0; i<n; i++) {
//            System.out.println("Hello World!");
//        }
//    }
//}
class PrimeNumbers {
    public String numberSearch(int n) {
        System.out.println("\nВыводим простые числа до 1000");
        boolean[] numbersPrime = new boolean[n];
        Arrays.fill(numbersPrime, true);
        String answer = "";

        for (int i=2; i*i < n; i++) {
            if (numbersPrime[i]) {
                for (int j=2*i; j<n; j += i) {
                    numbersPrime[j] = false;
                }
            }
        }
        for (int i=2; i<numbersPrime.length; i++) {
            if (numbersPrime[i])
                answer += i + " ";
        }
        return answer;
    }
}
//class Sqrt {
//    public String searchSqrt() {
//        System.out.println("\nИщем квадратный корень из числа 135486435...");
//        int n = 135486435;
//        String answer = "";
//        double m = 0;
//        if (n<=0) {
//            return "Корней не может быть";
//        }
//        while (m*m<=n) {
//            m += 1;
//        }
//        if (m*m > n) {
//            m -= 1;
//        }
//        while (m*m<=n) {
//            m += 0.1;
//        }
//        if (m*m > n) {
//            m -= 0.1;
//        }
//        while (m*m <= n) {
//            m += 0.01;
//        }
//        if (m*m > n) {
//            m -= 0.01;
//        }
//        answer += m;
//        return answer;
//    }
//}
//class BubbleSort{
//    public void sort() {
//        System.out.println("\nСортируем случайный массив");
//        Random random = new Random();
//        int q = random.nextInt(20);
//        q += 10;
//        int[] array = new int[q];
//        for (int x=0; x<array.length; x++) {
//            array[x] = random.nextInt(-299, 300);
//        }
//        System.out.println("Массив до сортировки = ");
//        System.out.println(Arrays.toString(array));
//        boolean isSorted = false;
//        while (!isSorted) {
//            isSorted = true;
//            for (int i=0; i<array.length-1; i++) {
//                if (array[i] > array[i+1]) {
//                    isSorted = false;
//                    int temporary = array[i];
//                    array[i] = array[i+1];
//                    array[i+1] = temporary;
//                }
//            }
//        }
//        System.out.println("Массив после сортировки =");
//        System.out.println(Arrays.toString(array));
//    }
//}