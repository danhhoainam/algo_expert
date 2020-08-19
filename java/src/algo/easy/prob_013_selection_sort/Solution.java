package algo.easy.prob_013_selection_sort;

import common.Printer;

/**
 * Idea: iterate through each elements, find min for the rest of the list
 *       swap min element with the current element
 *
 * O(n^2) time; O(1) space
 */
public class Solution {
    public static void main(String[] args) {
        Printer.printIntArr(selectionSort(new int[] { 3, 5, 11, 1, 2, 512, 44 }));
    }

    private static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }
        return array;
    }
}
