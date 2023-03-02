package ru.ers.lesson.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] {9})));
    }

    public static int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
    }
    int[] arr = new int[digits.length + 1];
    System.arraycopy(digits, 0, arr, 1, digits.length);
    arr[0] = 1;
    return arr;
    }
}

