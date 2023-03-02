package ru.ers.lesson.sort;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[] {-132,-124,-13,0, 3, 5, 36, 65, 675,3452,13454};
        int key = 0;
        int index = binarySearch(array, 0, array.length-1, key);
        System.out.println(index);
    }
    public static int binarySearch(int[] array, int from, int to, int key) {
        int middle = from + (to - from) / 2;
        if (from > to) {
            return -1;
        }
        if (array[middle] == key) {
            return middle;
        } else if (array[middle] > key) {
            return binarySearch(array, from, middle-1, key);
        } else {
            return binarySearch(array, middle+1, to, key);
        }
    }

}
