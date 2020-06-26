package algo.easy.prob_012_insertion_sort;

import common.Printer;

/**
 * Idea: loop through each elements in array, compare to previous values
 *       if current element is smaller than previous, shift right
 * Time:
 *   best: O(n) the array is already sorted
 *   average: O(n^2) the first loop from begin to end, second loop back to insert
 *   worst: O(n^2) when the array sorted desc
 * Space:
 *   O(1): we dont store anything
 */
public class Solution {
    public static void main(String[] args) {
        Printer.printIntArr(insertionSort(new int[] { 4, 2, 4, 5, 66, 212, 13 }));
    }

    private static int[] insertionSort(int[] array) {
        if (array.length == 0) {
            return new int[] {};
        }

        for (int i = 1; i < array.length; i++) {
            int valueToInsert = array[i];
            int currentIndex = i;
            while (currentIndex > 0 && valueToInsert < array[currentIndex - 1]) {
                array[currentIndex] = array[currentIndex - 1];
                currentIndex--;
            }
            array[currentIndex] = valueToInsert;
        }

        return array;
    }
}
