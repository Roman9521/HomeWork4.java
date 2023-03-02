package ru.ers.lesson.leetCode;

public class Task35 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] {1,3,5,6}, 5));
    }

    public static int searchInsert(int[] nums, int target) {
        int floor = 0, ceiling = nums.length - 1;
        while (floor <= ceiling) {
            int middle = floor + (ceiling - floor) / 2;
            if (nums[middle] == target)
                return middle;
            else if (nums[middle] < target)
                floor = middle + 1;
            else
                ceiling = middle - 1;
        }
        return floor;
    }
}
