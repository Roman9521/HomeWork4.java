package ru.ers.lesson.algorithms;

import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
        int n = 100;
        long[] memoization = new long[n+1];

        Arrays.fill(memoization, -1);

        System.out.println(fibNaive(n, memoization));
    }
    public static long fibNaive(int n, long[] memoization) {
        if (n<=1)
            return n;
        if (memoization[n] != -1)
            return memoization[n];
        long result = fibNaive(n-1, memoization) + fibNaive(n-2, memoization);
        memoization[n] = result;

        return result;
    }
}
