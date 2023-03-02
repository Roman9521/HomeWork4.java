package ru.ers.lesson.leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2553 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(separateDigits(new int[]{13, 25, 83, 77})));
    }

    public static int[] separateDigits(int[] nums) {
        if (nums.length == 0)
            return null;
        ArrayList<Integer> list = new ArrayList<>();
        int lengthNum = 0;
        for (int i = 0; i < nums.length; i++) {
            ArrayList <Integer> temporary = new ArrayList<>();
            if (nums[i] < 9) {
                list.add(nums[i]);
            } else {
                while (nums[i] > 0) {
                    temporary.add(nums[i] % 10);
                    nums[i] /= 10;
                }
                for (int i1 = temporary.size() - 1; i1 >= 0; i1--) {
                    list.add(temporary.get(i1));
                }
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

}
