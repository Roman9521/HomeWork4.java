package ru.ers.lesson.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[] {64,23,64,86,34,16,997,453,13,668,324,75,1,225,75,32,23};
        quickSort(array, 0, array.length-1);
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
    private static void quickSort(int[] array, int initialLength, int finalLength) {
        if (initialLength < finalLength) {
            int divideIndex = partition(array, initialLength, finalLength);
            quickSort(array, initialLength, divideIndex-1);
            quickSort(array, divideIndex, finalLength);
        }
    }
    private static int partition(int[] array, int initialLength, int finalLength) {
        int rightIndex = finalLength, leftIndex = initialLength;
        int pivot = array[initialLength];
        while (leftIndex<=rightIndex) {
            while (array[leftIndex] < pivot) {
                leftIndex++;
            }
            while (array[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(array, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;            }
        }
        return leftIndex;
    }
    private static void swap(int[] array, int index1,int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
