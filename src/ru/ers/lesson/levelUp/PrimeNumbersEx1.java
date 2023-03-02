package ru.ers.lesson.levelUp;

import java.util.Arrays;

public class PrimeNumbersEx1 {
    public static void main(String[] args) {
        int n = 999;
        System.out.println("\nВыводим простые числа до "+n);
        boolean[] numbersPrime = new boolean[n];
        Arrays.fill(numbersPrime, true);
        String answer = "";

        for (int i = 2; i < n; i++) {
            if (numbersPrime[i]) {
                for (int j = 2 * i; j < n; j += i) {
                    numbersPrime[j] = false;
                }
            }
        }
        for (int i = 2; i < numbersPrime.length; i++) {
            if (numbersPrime[i])
                answer += i + " ";
        }
        System.out.println(answer);
    }
}
