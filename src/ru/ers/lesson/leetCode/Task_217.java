package ru.ers.lesson.leetCode;

import java.util.Arrays;

public class Task_217 {
    public static void main(String[] args) {
        int[] nums = new int[100000];
        for (int i=0; i< nums.length; i++) {
            nums[i] = i;
        }
        System.out.println(containsDuplicate(nums));
    }


    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++) {
            if (quickSort(nums, i) == i) {
                return true;
            }

        }
        return false;
    }
    public static int quickSort(int[] nums, int i) {

        return i;
    }
}
